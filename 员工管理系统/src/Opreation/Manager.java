package Opreation; /**
 * @author yd
 * @version 1.0
 * @date 2021/1/15 16:44
 */

import Entity.Salary;
import Entity.User;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Manager {
    Scanner input = new Scanner(System.in);//引入Scanner类
    //保存测试账号

    static User[] users = new User[4];
    int No = 3;//测试人员编号
    int size = 4;//数组小标

    public static User[] getUsers() {
        return users;
    }

    public static void setUsers(User[] users) {
        Manager.users = users;
    }

    //初始化测试账号
    public Manager() {
        //密码至少为8位数  手机号码为11位数
        users[0] = new User(0, "张三", "12345678", "15017539321", "研发部", "技术开发");
        users[1] = new User(1, "李四", "12345678", "15017539321", "市场部", "市场采购");
        users[2] = new User(2, "王五", "12345678", "15017539321", "销售部", "运营销售");
        users[3] = new User(3, "root", "12345678", "15017539321", "经理部", "管理公司");
    }

    //欢迎界面--
    public void showMenu() {
        System.out.println("-------亲爱的管理员您好-------");
        System.out.println("您可以进行如下操作(选择编号即可):");
        System.out.println("---      1.登录    2.注册    0.退出     ---");
        System.out.println("请选择您的操作:");
        int chose = input.nextInt();
        if (chose == 1 || chose == 2 || chose == 0) {
            switch (chose) {
                case 1:
                    this.login();//登陆系统
                    break;
                case 2:
                    this.register();//注册系统
                    this.showMenu();//注册成功之后 进行递归
                    break;
                case 0:
                    this.exit();
                    break;
                default:
                    System.out.println("输入有误");
                    this.showMenu();
            }
        }
    }

    /**
     * @author 莫志鹏
     * @date ${DATE} ${TIME}
     * @version 1.0
     */
    //登陆功能
    private void login() {
        System.out.println("请输入管理员用户名:");
        String managerName = input.next();
        System.out.println("请输入用户名密码:");
        String pw = input.next();
        //对账号和密码进行检索
        User check = loginCheck(managerName, pw);
        //如果loginCheck返回的账号密码数组不为空，则跳转到员工管理系统。
        if (check != null) {
            this.empManSys(check);
        } else {
            System.out.println("账号或者密码错误.......");
            //递归
            this.login();
        }
    }

    //菜单
    private void empManSys(User user) { //参数列表为对象
        System.out.println("|----------欢迎来到员工管理系统----------|");
        System.out.println("您可以进行如下的操作:(选择编号即可)");
        System.out.println("1.员工身份信息管理       2.员工工资信息管理      0.退出系统");
        int choose = input.nextInt();
        switch (choose) {
            case 1:
                this.empIdenMan(user);
                this.empManSys(user);
                break;
            case 2:
                this.salaryManage(user);
                this.empManSys(user);
                break;
            case 0:
                System.out.println("系统正在退出.......");
                try {
                    Thread.sleep(2000);
                    exit();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            default:
                System.out.println("输入有误,请重新输入.....");
                this.empManSys(user);
        }
    }


    //员工工资信息管理
    private void salaryManage(User user) {
        System.out.println("|----------员工身份管理系统----------|");
        System.out.println("您可以进行如下操作:(选择编号即可)");
        System.out.println("1.查看工资   2.增加工资信息  3.修改工资信息   4.查看工资列表   5.删除工资信息  0.返回上级菜单");
        int choose = input.nextInt();
        if (choose == 1 || choose == 2 || choose == 3 || choose == 4 || choose == 5 || choose == 0) {
            switch (choose) {
                case 1:
                    showSalary();
                    this.salaryManage(user);
                    break;
                case 2:
                    User user1 = addSalary(user, users);
                    this.salaryManage(user1);
                    break;
                case 3:
                    User user2 = modifySalary(user);
                    this.salaryManage(user2);
                    break;
                case 4:
                    lookSalary();
                    this.salaryManage(user);
                    break;
                case 5:
                    deleteSalary(user, users);
                    this.salaryManage(user);
                    break;
                case 0:
                    empManSys(user);
                    break;
                default:
                    System.out.println("输入有误");
                    this.salaryManage(user);
            }
        }
    }

    private User deleteSalary(User user, User[] users) {
        User[] newUser = new User[size - 1];
        System.out.println("请输入要删除的员工ID:");
        int manID = input.nextInt();
        if (!exsits(manID)) {
            System.out.println("Id不存在");
        } else {
            int index = 0;
            for (User user1 : users) {
                if (user1.getId() != manID || manID > user1.getId()) {
                    newUser[index++] = users[user1.getId()];
                }
            }
            try {
                Thread.sleep(1500);
                System.out.println("删除" + manID + "成功");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < newUser.length; i++) {
                user.setId(newUser[i].getId());
                user.setName(newUser[i].getName());
                user.setDepartment(newUser[i].getDepartment());
                user.setPost(newUser[i].getPost());
                user.setTime(newUser[i].getTime());
                user.setDanjia(newUser[i].getDanjia());
                user.setDate(newUser[i].getDate());
            }
            System.out.println("删除后数组长度为:" + newUser.length);
        }
        //返回修改好的 user
        return user;
    }

    //查看工资
    private void lookSalary() {
        String s = showDate();
        System.out.println("请输入姓名,查看该工资列表");
        String next = input.next();
        if (!exsits(next)) {
            System.out.println("该员工不存在，请重新输入......");
            next = input.next();
        } else {
            for (User user : users) {
                if (next.equals(user.getName())) {
                    System.out.println("ID为:" + user.getId() + "  姓名:" + user.getName() + "  工作时长:" + user.getTime() + "  工资总额为:" + user.getSalary() + "   操作日期为:" + s);
                }
            }
        }
    }

    //修改工资
    private User modifySalary(User user) {
        System.out.println("请输入员工的ID:");
        int manID = input.nextInt();
        if (!exsits(manID)) {
            System.out.println("Id不存在,请重新输入");
            manID = input.nextInt();
        } else {
            String time;
            Double price;
            Double prize;
            for (User user1 : users) {
                if (user1.getId() == manID) {
                    System.out.println("姓名为:" + user1.getName() + "  ID为:" + user1.getId() + "   职务:" + user1.getPost() + " 部门为:" + user1.getDepartment() + "  电话为:" + user1.getPhoneNumber());
                }
            }
            System.out.println("员工的信息是否正确?(正确/不正确):");
            String isTrue = input.next();
            if (isTrue.equals("正确")) {
                for (User user1 : users) {
                    if (user1.getId() == manID) {
                        System.out.println("请输入员工的工作时长");
                        double v = input.nextDouble();
                        System.out.println("请输入工时单价:");
                        double v1 = input.nextDouble();
                        System.out.println("请输入出勤的奖金:");
                        double v2 = input.nextDouble();
                        user1.setTime(v);
                        user1.setDanjia(v1);
                        user1.setCqMoney(v2);
                        double v3 = countSalar(v, v1, v2);
                        user1.setSalary(v3);
                    }
                }
            }else {
                this.modifySalary(user);
            }
        }
        return user;
    }

    //增加工资信息
    private User addSalary(User user, User[] users) {
        Salary salary = new Salary();
        System.out.println("请输入职务ID");
        int i = input.nextInt();
        if (!exsits(i)) {
            System.out.println("员工不存在");
        } else {
            for (User user1 : users) {
                if (user1.getId() == i) {
                    System.out.println("请输入员工工作时长:");
                    double v1 = input.nextDouble();
                    user1.setTime(v1);
                    System.out.println("请输入单价:");
                    double v2 = input.nextDouble();
                    user1.setPrize(v2);
                    System.out.println("请输入员工出勤工资:");
                    double v = input.nextDouble();
                    user1.setCqMoney(v);
                    String s = showDate();
                    user1.setDate(s);
                    double v3 = countSalar(v1, v2, v); //接收返回值 v3 工资
                    user1.setSalary(v3);
                    System.out.println("员工id:" + user1.getId() + "  工作时长为:" + user1.getTime() + " 工时单价为:" + user1.getPrize() + " 工资总额为:" + (v3) + "  操作日期为: " + user1.getDate());
                }
            }
        }
        return user;
    }

    /**
     * @param v1 工作时长
     * @param v2 工时单价
     * @param v  出勤
     * @return
     */
    private double countSalar(double v1, double v2, double v) {
        double empSalary;
        if (v1 > 0 && v1 <= 10) {
            empSalary = v1 * 30 * 30 + v;
        } else {
            empSalary = (v1 * 30 + (v1 - 10) * 35) * 30 + v;  //加班补贴
        }
        return empSalary;
    }

    //显示操作时间
    public String showDate() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str = simpleDateFormat.format(date);
        return str;
    }

    //展示工资
    private void showSalary() {
        System.out.println("-------------------------------------------------------------------------全部工资信息----------------------------------------------------------------------------------------------------");
        System.out.println("ID                       姓名                   部门                      职务                        工作时长                   工时单价                工资总额                操作日期");
        for (User user1 : users) {
//            System.out.println("您的ID为:"+user1.getId()+"    姓名为:"+user1.getName()+"    密码为:"+user1.getPassword()+"    手机号码为:"+user1.getPhoneNumber()+"  部门:"+ user1.getDepartment()+"  职务:"+user1.getPost());
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String str = simpleDateFormat.format(date);
            System.out.println("您的ID为:" + user1.getId() + "            姓名为:" + user1.getName() + "             部门:" + user1.getDepartment() + "              职务:" + user1.getPost() + "              工作时长为:" + user1.getTime() + "             工时单价:" + user1.getDanjia() + "                     工资:" + user1.getSalary() + "             操作时间为:" + str);
        }

    }

    //员工身份信息管理
    private void empIdenMan(User user) {
        System.out.println("|----------员工身份管理系统----------|");
        System.out.println("您可以进行如下操作:(选择编号即可)");
        System.out.println("1.增加员工信息   2.删除员工信息  3.修改员工信息  4.查询员工信息  5.显示员工列表   0.返回上级菜单");
        int choose = input.nextInt();
        switch (choose) {
            case 1:
//                final User add = add(user);
                User add = add(user, users);
                this.empIdenMan(add);
                break;
            case 2:
                User delete1 = delete(user, users);
//                this.showMenu();
                this.empIdenMan(delete1);
                break;
            case 3:
                modify(user);
                this.empIdenMan(user);
                break;
            case 4:
                query(user);
                this.empIdenMan(user);
                break;
            case 5:
                show(user);
                this.empIdenMan(user);
                break;
            case 0:
                this.empManSys(user);
                break;
            default:
                System.out.println("输入有误");
        }
    }


//增加当前员工的信息

    //    private User add(User user) {
//        System.out.println("请输入需要修改员工的信息:");
//         int i = input.nextInt();
//        if(!exsits(i)){
//            System.out.println("请重新输入:");
//            i=input.nextInt();
//        }else {
//             System.out.println("请输入工作时长:");
//             int time = input.nextInt();
//             int count = count(time);
//             user.setSalary(count);
//             user.setPrize(1000.00);
//            System.out.println("您的ID为:"+user.getId()+"    姓名为:"+user.getName()+"    密码为:"+user.getPassword()+"    手机号码为:"+user.getPhoneNumber()+"  部门:"+ user.getDepartment()+"  职务:"+user.getPost()+"  工资:"+user.getSalary());
//        }
//        return user;
//    }
    //员工计算薪资
    private User add(User user, User[] users) {
        System.out.println("请输入需要修改员工的ID:");
        int i = input.nextInt();
        if (!exsits(i)) {
            System.out.println("请重新输入:");
            i = input.nextInt();
        } else {
            System.out.println("请输入工作时长:");
            Double time = input.nextDouble();
            Double count = count(time);
            System.out.println(count);
            for (User user1 : users) {
                if (user1.getId() == i) {
                    user1.setSalary(count);
                    user1.setTime(time);
                }
            }
        }
        return user;
    }

    //计算工资
    private Double count(Double time) {
        Double salary;
        if (time > 0 && time <= 10) {
            salary = time * 30 * 30;
        } else {
            salary = (time * 30 + (time - 10) * 35) * 30;  //加班补贴
        }
        return salary;
    }

    //删除
    private User delete(User user, User[] users) {
//        User[] newUser = new User[size - 1];
        User[] newUser = new User[size - 1];
        System.out.println("请输入要删除的员工ID:");
        int manID = input.nextInt();
        if (!exsits(manID)) {
            System.out.println("Id不存在");
        } else {
            int index = 0;
            for (User user1 : users) {
                if (user1.getId() != manID) {
                    newUser[index++] = users[user1.getId()];
                    System.out.println(user1);
                }
            }
            System.out.println("已删除ID为" + manID + "的员工");
            System.out.println("删除成功后的数组对象为:"+Arrays.toString(newUser));
            System.out.println("删除后的数组长度为:"+newUser.length);
//
             //将删除好的数组 遍历出来 重新设置回集合
            for (int i = 0; i <=newUser.length-1; i++) {
                user.setId(newUser[i].getId());
                user.setName(newUser[i].getName());
                user.setPassword(newUser[i].getPassword());
                user.setPhoneNumber(newUser[i].getPhoneNumber());
                user.setPost(newUser[i].getPost());
                user.setSalary(newUser[i].getSalary());
            }
        }
        //返回修改好的 user
        return user;
    }

    // 删除


//            int index = size + 1;
//            for (int i = 0; i < size; i++) {
//                if (users[i] == user) {
//                    index = i;
//                    break;
//                }
//            }
//            //移动该元素之后的每个元素
//            for (int i = index; i < size - 1; i++) {
//                users[i] = users[i + 1];
//            }
//            size--;
//            System.out.println(Arrays.toString(users)+"注销成功！");
//        }
//    }


    //判断输入的id是否存在
    private boolean exsits(int i) {
        for (User user : users) {
            if (i == user.getId()) {
                return true;
            }
        }
        return false;
    }

    //修改
    private User[] modify(User user) {
        String name;
        String password;
        String phoneNumber;
        String department;
        String post;
        System.out.println("请输入管理员用户名:");
        name = input.next();
        System.out.println("请填写6-20位数的密码：");
        password = input.next();
        while (!checkPwd(password)) {
            System.out.println("密码不合法，请重新输入：");
            password = input.next();
        }
        System.out.println("密码格式正确，请输入手机号码");
        phoneNumber = input.next();

        System.out.println("请输入部门:");
        department = input.next();
        System.out.println("请输入职务:");
        post = input.next();
        user.setName(name);
        user.setPassword(password);
        user.setPhoneNumber(phoneNumber);
        user.setDepartment(department);
        user.setPost(post);
        return users;
    }

    //展示员工列表
    private void show(User user) {
        System.out.println("----------------------------------------------------查看全部员工信息----------------------------------------------------------------------------------");
        System.out.println("ID            姓名              密码              手机号码                部门                      职务              工资");
        for (User user1 : users) {
//            System.out.println("您的ID为:"+user1.getId()+"    姓名为:"+user1.getName()+"    密码为:"+user1.getPassword()+"    手机号码为:"+user1.getPhoneNumber()+"  部门:"+ user1.getDepartment()+"  职务:"+user1.getPost());
            System.out.println("" + user1.getId() + "             " + user1.getName() + "             " + user1.getPassword() + "          " + user1.getPhoneNumber() + "             " + user1.getDepartment() + "                   " + user1.getPost() + "             " + user1.getSalary());
        }
    }
//    //显示工资
//    public void s(){
//        for (User user : users) {
//
//        }
//    }


    //查询
    private void query(User user) {
        System.out.println("请输入要查询的姓名:");
        String string;
        string = input.next();
        //判断改姓名是否在列表中
        if (!exsits(string)) {
            System.out.println("不存在该员工请重新输入:");
            string = input.next();
        } else {
            for (User user1 : users) {
                if (user1.getName().equals(string)) {
                    System.out.println(user1.toString());
                }
            }
        }
    }

    //输入字符串 检索是否存在该员工
    private boolean exsits(String string) {
        for (User user : users) {
            if (string.equals(user.getName())) {
                return true;
            }
        }
        return false;
    }


    private User loginCheck(String managerName, String pw) {
        //对传入的账号密码进行检索，如果账号和密码跟保存好的账号密码一直则登陆成功
        for (int i = 0; i < size; i++) {
            //非空判断
            if (users[i] != null) {
                //账号与密码必须  与初始化的账号密码一样
                if (managerName.equals(users[i].getName()) && pw.equals(users[i].getPassword())) {
                    return users[i];
                }
            }
        }
        return null;
    }

    private void register() {
        String name;
        String password;
        String phoneNumber;
        String department;
        String post;
        System.out.println("请输入管理员用户名:");
        name = input.next();
        System.out.println("请填写6-20位数的密码：");
        password = input.next();
        while (!checkPwd(password)) {
            System.out.println("密码不合法，请重新输入：");
            password = input.next();
        }
        System.out.println("密码格式正确，请输入手机号码");
        phoneNumber = input.next();

        System.out.println("请输入部门:");
        department = input.next();

        System.out.println("请输入职务:");
        post = input.next();
        //进行扩容
        User user = new User();
        No++;
        user.setId(No);
        user.setName(name);
        user.setPassword(password);
        user.setPhoneNumber(phoneNumber);
        user.setDepartment(department);
        user.setPost(post);

        System.out.println("注册成功..........你的id为:" + No);
        if (size > (users.length - 1)) {
            User[] newUers = Arrays.copyOf(users, size + 1);
            users = newUers;
            users[size] = user;
        }
        size++;
    }

    //检测密码功能
    public static boolean checkPwd(String pwd) {
        String regExp = "^[\\w_]{6,20}$";   //至少是6位数的功能
        if (pwd.matches(regExp)) {
            return true;
        }
        return false;
    }

    //退出功能
    private void exit() {
        System.out.println("系统已退出.....");
        System.exit(0);
    }
}

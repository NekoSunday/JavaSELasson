package Entity;

public class User {
    private int No;
    private String name;//设置管理员的姓名
    private String password;//设置密码
    private String phoneNumber;//设置管理员电话
    private String department;//部门
    private String  post;    //职务
    private double salary; //工资
    private double prize;//奖金
    private double time;//时间
//薪资管理
    private int  zwID;
    private double  cqMoney;
    private double  danjia;
    private String date;
    //薪资管理构造方法
    public User(int no, String name, String password, String phoneNumber, String department, String post, double salary, double prize, double time, int zwID, double cqMoney, double danjia, String date) {
        No = no;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.post = post;
        this.salary = salary;
        this.prize = prize;
        this.time = time;
        this.zwID = zwID;
        this.cqMoney = cqMoney;
        this.danjia = danjia;
        this.date = date;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int no) {
        No = no;
    }

    public int getZwID() {
        return zwID;
    }

    public void setZwID(int zwID) {
        this.zwID = zwID;
    }

    public double getCqMoney() {
        return cqMoney;
    }

    public void setCqMoney(double cqMoney) {
        this.cqMoney = cqMoney;
    }

    public double getDanjia() {
        return danjia;
    }

    public void setDanjia(double danjia) {
        this.danjia = danjia;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public User(int no, String name, String password, String phoneNumber, String department, String post, double salary, double prize, double time) {
        No = no;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.post = post;
        this.salary = salary;
        this.prize = prize;
        this.time = time;
    }

    public User(int no, String name, double salary, double prize, double time) {
        this.No=no;
        this.name=name;
        this.salary=salary;
        this.prize=prize;
        this.time=time;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public User() {
    }
    public User(int No, String name, String password, String phoneNumber, String department, String post, double salary, double prize) {
        this.No = No;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.post = post;
        this.salary=salary;
        this.prize=prize;
    }

    public User(int No, String name, String password, String phoneNumber, String department, String post) {
        this.No = No;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.post = post;
    }

    public int getId() {
        return No;
    }

    public void setId(int id) {
        this.No = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + No +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", department='" + department + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}

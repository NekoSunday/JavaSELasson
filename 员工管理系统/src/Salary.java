import java.util.Date;

/**
 * @author yd
 * @version 1.0
 * @date 2021/1/16 9:32
 */
public class Salary extends User {
    private int  zwID;
    private double  cqMoney;
    private double  danjia;
    private String date;

    public double getDanjia() {
        return danjia;
    }

    public void setDanjia(double danjia) {
        this.danjia = danjia;
    }

    public Salary() {
    }

    public Salary(int No, String name, String password, String phoneNumber, String department, String post, double salary, double prize, int zwID, double cqMoney, String date,double  danjia) {
        super(No, name, password, phoneNumber, department, post, salary, prize);
        this.zwID = zwID;
        this.cqMoney = cqMoney;
        this.date = date;
        this.danjia=danjia;
    }

    public Salary(int no, String name, double salary, double prize, double time, int zwID, double cqMoney, String date) {
        super(no,name,salary,prize,time);
        this.zwID = zwID;
        this.cqMoney = cqMoney;
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "zwID=" + zwID +
                ", cqMoney=" + cqMoney +
                ", date=" + date +
                '}';
    }
}

package com.utilpackage;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.sunday.MainSystem;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class sqlUtils {
    private static DataSource ds;

    static {
        try {
            Properties connectInfo = new Properties();
            InputStream is = sqlUtils.class.getResourceAsStream("/druid.properties");
            connectInfo.load(is);
            ds = DruidDataSourceFactory.createDataSource(connectInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDataSource() {
        return ds;
    }

    public static Connection getConnection() {
        try {
            return ds.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Connection conn, Statement stmt, ResultSet rs) {
        //关闭结果集
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //关闭语句对象
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //关闭连接对象
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Connection conn, Statement stmt) {
        //关闭语句对象
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //关闭连接对象
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static String insertValue(String tableName, int valuesNum, String... enterValues) {
        try {
            StringBuilder sql = new StringBuilder("insert into " + tableName + " values\n");
            sql.append("(");
            for (int i = 0; i < valuesNum; i++) {
                if (enterValues[i].equals("null")) {
                    sql.append(enterValues[i]).append(",");
                    i++;
                }
                if (i == (valuesNum - 1)) {
                    sql.append("'").append(enterValues[i]).append("'");
                } else {
                    sql.append("'").append(enterValues[i]).append("',");
                }

            }
            sql.append(");");
            System.out.println(sql);
            return sql.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void printIdentityValues(String sql) {
        try {
            MainSystem.rs = MainSystem.stmt.executeQuery(sql);
            while (MainSystem.rs.next()) {
                int id = MainSystem.rs.getInt("id");
                String ename = MainSystem.rs.getString("ename");
                String job = MainSystem.rs.getString("job");
                String dept = MainSystem.rs.getString("dept");
                String phone_number = MainSystem.rs.getString("phone_number");
                if (sql.contains("where")) {
                    util.flushBw("ID：" + id + "，姓名：" + ename + "，职务：" + job + "，部门：" + dept + "，电话：" + phone_number);
                } else {
                    util.flushBw(id + "        " + ename + "        " + job + "        " + dept + "        " + phone_number);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String updateIdentityValue(String tableName, Integer id, String... enterValues) {
        try {
            String sql = "update " + tableName + " set ename='" + enterValues[0] + "',job='" + enterValues[1] + "',dept='" + enterValues[2] + "',phone_number='" + enterValues[3] + "' where id='" + id + "';";
            return sql;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String deleteIdentityValue(String tableName, Integer id) {
        try {
            String sql = "delete from " + tableName + " where id='" + id + "';";
            return sql;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static int checkIdentityValue(String... checkValues) {
        try {
            String sql = "select * from employee_identity where ename='" + checkValues[0] + "' and job='" + checkValues[1] + "'and dept='" + checkValues[2] + "'and phone_number='" + checkValues[3] + "';";
            MainSystem.rs = MainSystem.stmt.executeQuery(sql);
            if (!MainSystem.rs.next()) {
                return -1;
            } else {
                return MainSystem.rs.getInt("id");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static int checkJob(int id) {
        try {
            String sql = "select job from employee_identity where id='" + id + "';";
            MainSystem.rs = MainSystem.stmt.executeQuery(sql);
            MainSystem.rs.next();
            if (MainSystem.rs.getString("job").equals("经理")) {
                return 2000;
            } else {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static String updateSalaryValue(String tableName, Integer id, String... enterValues) {
        try {
            String sql = "update " + tableName + " set workTime='" + enterValues[0] + "',s_per_hour='" + enterValues[1] + "',bonus_money='" + enterValues[2] + "',s_sum='" + enterValues[3] + "',e_name='" + enterValues[4] +"' where e_id='" + id + "';";
            return sql;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void printSalaryValues(String sql) {
        try {
            MainSystem.rs = MainSystem.stmt.executeQuery(sql);
            while (MainSystem.rs.next()) {
                int id = MainSystem.rs.getInt("e_id");
                String name = MainSystem.rs.getString("e_name");
                double workTime = MainSystem.rs.getDouble("workTime");
                double s_per_hour = MainSystem.rs.getDouble("s_per_hour");
                double bonus_money = MainSystem.rs.getDouble("bonus_money");
                double s_sum = MainSystem.rs.getDouble("s_sum");
                Timestamp ts = MainSystem.rs.getTimestamp("getdate");
                if (sql.contains("where")) {
                    util.flushBw("ID：" + id +"，姓名："+name+ "，工作时长：" + workTime + "，工作单价：" + s_per_hour + "，出勤奖金：" + bonus_money + "，工资总额：" + s_sum + "，操作日期：" + ts);
                } else {
                    util.flushBw(id + "        " +name+"        "+ workTime + "        " + s_per_hour + "        " + s_sum + "        " + ts);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



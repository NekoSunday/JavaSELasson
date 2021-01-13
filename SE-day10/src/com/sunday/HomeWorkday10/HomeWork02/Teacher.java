package com.sunday.HomeWorkday10.HomeWork02;

public class Teacher {
    private String name;
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void dianMing(Student student){
//        for (int i = 0; i < list.size(); i++) {
////            if (list.get(i).getOnStudy().equals("未出勤")){
////                System.out.print("旷课：");
////            }else{
////                System.out.print("上课：");
////            }
////        }

        if (student.getOnStudy().equals("未出勤")){
                System.out.print("旷课：");
            }else{
                System.out.print("上课：");
            }

    }
}

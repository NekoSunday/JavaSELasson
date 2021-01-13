package com.sunday.HomeWork.HomeWork05;

public class test {
    public static void main(String[] args) {
        Student student = new Student("李小乐", 18, 90);
        Teacher teacher = new Teacher("王小平", 40, "Java");

        teacher.teach();
        student.Exam();
    }
}

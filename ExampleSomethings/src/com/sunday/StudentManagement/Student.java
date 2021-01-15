package com.sunday.StudentManagement;

public class Student {
    private String studentId;
    private String studentName;
    private double mathScore;
    private double chineseScore;
    private double englishScore;

    public Student(String studentId, String studentName, double mathScore, double chineseScore, double englishScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mathScore = mathScore;
        this.chineseScore = chineseScore;
        this.englishScore = englishScore;
    }

    public Student() {
    }

}

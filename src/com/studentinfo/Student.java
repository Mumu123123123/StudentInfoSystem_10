package com.studentinfo;

/**
 * 学生类 - 只包含最基本信息
 */
public class Student {
    private String name;
    private String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    // 简单的getter方法
    public String getName() { return name; }
    public String getStudentId() { return studentId; }

    @Override
    public String toString() {
        return "学号:" + studentId + " 姓名:" + name;
    }
}

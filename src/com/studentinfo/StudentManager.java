package com.studentinfo;

import java.util.ArrayList;
import java.util.List;

/**
 * 学生管理类 - 只实现添加和显示功能
 */
public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
        // 添加一些示例学生
        students.add(new Student("张三", "20241001"));
        students.add(new Student("李四", "20241002"));
    }

    // 添加学生
    public void addStudent(String name, String studentId) {
        Student student = new Student(name, studentId);
        students.add(student);
        System.out.println("添加成功: " + student);
    }

    // 显示所有学生
    public void displayAllStudents() {
        System.out.println("=== 所有学生 ===");
        if (students.isEmpty()) {
            System.out.println("暂无学生信息");
        } else {
            for (int i = 0; i < students.size(); i++) {
                System.out.println((i + 1) + ". " + students.get(i));
            }
        }
        System.out.println("==============");
    }

    // 获取学生数量
    public int getStudentCount() {
        return students.size();
    }
    // 在学生管理类中添加搜索功能
    public void searchStudent(String keyword) {
        System.out.println("=== 搜索结果 ===");
        boolean found = false;
        for (Student student : students) {
            if (student.getName().contains(keyword) ||
                    student.getStudentId().contains(keyword)) {
                System.out.println("找到: " + student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("未找到匹配的学生");
        }
    }
}

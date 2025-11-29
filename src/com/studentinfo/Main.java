package com.studentinfo;

import java.util.Scanner;

/**
 * 主程序 - 简单的控制台菜单
 */
public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 简单学生信息管理系统 ===");

        while (true) {
            // 简单菜单
            System.out.println("\n1. 添加学生");
            System.out.println("2. 显示所有学生");
            System.out.println("3. 退出系统");
            System.out.print("请选择: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("输入学生姓名: ");
                    String name = scanner.nextLine();
                    System.out.print("输入学号: ");
                    String id = scanner.nextLine();
                    manager.addStudent(name, id);
                    break;

                case "2":
                    manager.displayAllStudents();
                    break;

                case "3":
                    System.out.println("谢谢使用！");
                    scanner.close();
                    return;

                default:
                    System.out.println("请输入1-3的数字！");
            }
        }
    }
}

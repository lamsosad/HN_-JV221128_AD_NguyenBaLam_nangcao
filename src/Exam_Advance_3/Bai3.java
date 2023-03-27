package Exam_Advance_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        while (true) {
            System.out.println("*******************JAVA-HACKATHON-05-ADVANCE-1-MENU******************");
            System.out.print("1. Nhập tên phụ huynh nộp hồ sơ    ");
            System.out.print("2. Phụ huynh tiếp theo    ");
            System.out.print("3. Thoát  \n");
            System.out.println("*********************************************************************");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Bạn muốn thêm bao nhiêu phụ huynh");
                    int count = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < count; i++) {
                        System.out.println("Nhập phụ huynh thứ: " + (i + 1));
                        System.out.println("Nhập tên phụ huynh: ");
                        String name = scanner.nextLine();
                        queue.add(name);
                        System.out.println("Đã thêm phụ huynh thành công!");
                    }
                    System.out.println("Danh sách phụ huynh đã đăng kí: "+queue);
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        System.out.println("Phụ huynh tiếp theo: ");
                        System.out.println(queue.poll());
                        break;
                    } else {
                        System.out.println("Không còn phụ huynh");
                    }
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.err.println("err");
                    break;
            }
        }
    }
}

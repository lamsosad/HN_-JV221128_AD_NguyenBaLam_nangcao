package Exam_Advance_2;

import java.util.Scanner;
import java.util.Stack;

public class Bai2 {
    private static String text = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<String> stack = new Stack<>();
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.print("1. Nhập câu   ");
            System.out.print("2. Đảo ngược câu   ");
            System.out.print("3. Thoát   \n");
            System.out.println("***************************************************************");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addString(scanner, stack);
                    break;
                case 2:
                    System.out.println(text);


                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.err.println("err");
                    break;
            }
        }
    }

    private static void addString(Scanner scanner, Stack<String> stack) {
        System.out.println("Nhập vào chuỗi: ");
        text = scanner.nextLine();
        System.out.println(text);
        String[] words = text.split(" ");
        for (String word : words) {
            stack.push(word);
        }
        String addString = "";
        while (!stack.empty()) {
            addString += stack.pop() + " ";
        }
        text = addString;
    }
}

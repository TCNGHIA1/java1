package lab1;

import java.util.Scanner;
import java.lang.Math;

public class Lab1 {
        public static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
                // Bài 1: hiện thị tên và điểm TB
                System.out.println("-------------Bài 1----------------------");
                // Khai báo biến
                System.out.print("Ho va ten: ");
                String hoTen = sc.nextLine();
                System.out.print("Diem TB: ");
                double Diem = sc.nextDouble();
                // In thông báo ra màn hình
                System.out.println(hoTen + " " + Diem + " diem");
                System.out.println("\n--------------------------------------------\n");

                // Bài 2: tính diện tích, chu vi và tìm chiều rộng
                System.out.println("-------------Bài 2----------------------");
                // Khai báo biến
                System.out.println("Nhap canh thu nhat: ");
                int a1 = sc.nextInt();
                System.out.println("Nhap canh thu hai: ");
                int b1 = sc.nextInt();
                // In diện tích, chu vi của hình chữ nhật
                System.out.println("Dien tich: " + a1 * b1);
                System.out.println("Chu vi:" + 2 * (a1 + b1));
                // Tìm chiều rộng của hình
                System.out.println("Canh nho(chieu rong): " + Math.min(a1, b1));
                System.out.println("\n--------------------------------------------\n");

                // Bài 3: Tính thể tích của khối lập phương
                System.out.println("-------------Bài 3----------------------");
                // Khai báo biến cạnh của lập phương
                System.out.println("Canh: ");
                int canh = sc.nextInt();
                // In thông báo
                System.out.println("The tich khoi lap phuong: " + Math.pow(canh, 3));
                System.out.println("\n--------------------------------------------\n");

                // Bài 4: tính delta của phương trình bậc 2
                System.out.println("-------------Bài 4----------------------");
                System.out.println("Nhap he so cua phuong trinh: ");
                System.out.print("So thu nhat: ");
                int a = sc.nextInt();
                System.out.print("So thu hai: ");
                int b = sc.nextInt();
                System.out.print("So thu ba: ");
                int c = sc.nextInt();
                // Tính giá trị delta
                int delta = b * b - 4 * a * c;
                System.out.printf("Gia tri cua delta: %.2f", Math.sqrt(delta));
                System.out.println("\n--------------------------------------------\n");

        }
}

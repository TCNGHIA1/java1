package lab2;

import java.util.Scanner;

public class lab2 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        System.out.println("+-------------------------------+");
        System.out.println("+ 1.Phuong trinh bac 1          +");
        System.out.println("+ 2.Phuong trinh bac 2          +");
        System.out.println("+ 3.Tinh so dien                +");
        System.out.println("+ 0.Thoat                       +");
        System.out.println("+-------------------------------+\n");
        System.out.print("Lua chon cua ban la: ");
        int c = sc.nextInt();
        switch (c) {
            //Phương trình bậc 1
            case 1: {
                System.out.println("Nhap gia tri 2 so: ");
                float a = sc.nextFloat();
                float b = sc.nextFloat();
                simpleEquation(a, b);
                break;
            }
            //Phương trình bậc 2
            case 2: {
                System.out.println("Nhap gia tri 3 so:");
                float a = sc.nextFloat();
                float b = sc.nextFloat();
                float d = sc.nextFloat();
                doubleEquation(a, b, d);
                break;
            }
            //Phương trình bậc 3
            case 3: {
                System.out.print("So dien ban da dung:");
                float a = sc.nextFloat();
                electricityBill(a);
                break;
            }
            //Thoát menu
            case 0: {
                System.out.println("Ban chon thoat menu!");
                break;
            }
            default: {
                System.out.println("Ban lua chon sai!");
                break;
            }
        }
    }
//Tính phương trình bậc 1
    public static void simpleEquation(float a, float b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("phuong trinh co vo so nghiem!");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            System.out.printf("Phuong trinh co nghiem: %.2f", (-b / a));
        }
    }
//Tính phương trình bậc 2
    public static void doubleEquation(float a, float b, float c) {

        if ((int) a == 0) {
            simpleEquation(b, c); //Gọi hàm phương trình bâc 1 - simpleEquation
        } else {
            float delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem!");
            } else if (delta == 0) {
                System.out.printf("Phuong trinh co nghiem kep: %.2f", -b / (2 * a));
            } else {
                System.out.printf("Phuong trinh co 2 nghiem: %.2f va %.2f", (-b + Math.sqrt(delta)) / (2 * a),
                        (-b - Math.sqrt(delta)) / (2 * a));
            }
        }
    }
//Tính tiền điện
    public static void electricityBill(float a) {

        float bill = 0;
        if (a < 0) {
            System.out.println("Du lieu sai!!!!");
        } else if (a <= 50) {
            bill = a * 1000;
        } else {
            bill = 50 * 1000 + (a - 50) * 1200;
        }
        System.out.printf("So tien ban can tra: %.2f",bill);
    }
}

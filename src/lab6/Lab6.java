package lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab6 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        kiemTraTen();
        nhapSanPham();
        inptSinhVien();
    }

    // Tách chuỗi họ tên
    public static void kiemTraTen() {
        System.out.print("Họ và tên cần tách: ");
        int count = 0;
        String fullName = scanner.nextLine();

        System.out.println("Họ: " + fullName.substring(0, fullName.indexOf(" ")).toUpperCase());
        System.out.println("Tên: " + fullName.substring(fullName.lastIndexOf(" "), fullName.length()).toUpperCase());
        System.out.println("Tên đệm: " + fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" ")));
    }

    // Kiểm tra sản phẩm
    public static void nhapSanPham() {
        ArrayList<SanPham> ds = new ArrayList<>();
        // Danh sách nhập sẵn
        ds.add(new SanPham("SamSung", 3333, "SamSung"));
        ds.add(new SanPham("SamSung", 9000, "Nokia"));
        ds.add(new SanPham("SamSung", 3333, "SamSung"));
        ds.add(new SanPham("SamSung", 3333, "Asus"));
        ds.add(new SanPham("SamSung", 3333, "Nokia"));
        /*
         * //Nhập sản phẩm từ bàn phím
         * for(int i =0;i<5;i++){
         * SanPham sp1 = new SanPham();
         * sp1.nhap();
         * ds.add(sp1);
         * }
         */
        // In ra sản phẩm có hãng là Nokia
        for (SanPham sp : ds) {
            if (sp.hang.equalsIgnoreCase("Nokia")) {
                sp.xuat();
            }
        }
    }

    public static void inptSinhVien() {

        String regexPhone = "0\\d{9,10}";
        String regexEmail = "^\\w+\\w*@\\w+(\\.\\w+)$";
        String regexCmnd = "\\d{10,12}";
        do {
            System.out.print("Nhập họ và tên: ");
            String name = scanner.nextLine();
            System.out.print("Nhập số điện thoại: ");
            String phone = scanner.nextLine();
            System.out.print("Nhập email: ");
            String email = scanner.nextLine();
            System.out.print("Nhập cmnd: ");
            String cmnd = scanner.nextLine();
            SinhVien h = new SinhVien(name, email, phone, cmnd);
            System.out.println(h);

            if ((phone.matches(regexPhone)) && (email.matches(regexEmail)) && (cmnd.matches(regexCmnd))) {
                System.out.println("Đúng định dạng!");
                break;
            } else {
                System.out.println("Sai định dạng vui lòng nhập lại");
            }
        } while (true);

    }
}

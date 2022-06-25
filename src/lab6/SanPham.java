package lab6;

import java.util.Scanner;

public class SanPham {
    String tenSP;
        double donGia;
        String hang;

        public SanPham(String tenSp, double donGia, String hang) {
            this.tenSP = tenSp;
            this.donGia = donGia;
            this.hang = hang;
        }
        public SanPham() {
        }
        public void nhap(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Tên sản phẩm: ");
            tenSP = scanner.nextLine();
            System.out.print("Đơn giá: ");
            donGia = scanner.nextDouble();
            System.out.println("Nhãn hàng: ");
            hang = scanner.nextLine();
        }
        public void xuat(){
            System.out.println("Sản phẩm: "+tenSP +"  , Đơn giá: "+donGia+" , Nhãn hàng: "+ hang);
        }
}

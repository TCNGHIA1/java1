package lab4.project;

import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }

    public SanPham() {
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    private double getThueNhapKhau() {

        return donGia * 0.1;
    }

    public void xuat() {

        System.out.println("\nThông tin sản phẩm: ");
        System.out.println("Tên sản phẩm:" + tenSp);
        System.out.printf("Đơn giá: %.2f\n", donGia);
        System.out.printf("Giảm giá: %.2f\n", giamGia);
        System.out.printf("Thuế nhập khẩu: %.2f\n", getThueNhapKhau());
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tên sản phẩm:");
        tenSp = sc.nextLine();
        System.out.print("Đơn giá: ");
        donGia = sc.nextDouble();
        System.out.print("Giảm giá: ");
        giamGia = sc.nextDouble();
    }
}

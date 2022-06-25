package lab4;

import java.util.Scanner;
import lab4.project.SanPham;

public class Product {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        // Nhập từ bàn phím
        SanPham sanPham1 = new SanPham();
        SanPham sanPham2 = new SanPham();
        sanPham1.nhap();
        sanPham2.nhap();
        sanPham1.xuat();
        sanPham2.xuat();
        System.out.println();
        // Nhập thông qua phương thức
        SanPham sanpham3 = new SanPham("Bánh", 3.2, 5.0);
        SanPham sanpham4 = new SanPham("Kẹo", 5);
        sanpham3.xuat();
        sanpham4.xuat();
        // Thông qua setter and getter
        sanPham1.setTenSp("kẹo");
        sanPham1.setDonGia(5.0);
        sanPham1.setGiamGia(3);
        output(sanPham1);
    }

    public static void output(SanPham sp){
        System.out.println("\nThông tin sản phẩm đã nhập:");
        System.out.println("Tên sản phẩm: " + sp.getTenSp());
        System.out.println("Giá: "+sp.getDonGia());
        System.out.println("Giảm giá: "+sp.getGiamGia());
        System.out.println("Thuế nhập khẩu: "+sp.getDonGia()*0.1); //method getThueThapKhau() private nên không thể gọi
    }

} 


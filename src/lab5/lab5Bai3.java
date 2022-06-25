package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;
import java.util.List;

public class lab5Bai3 {
	public static Scanner sc = new Scanner(System.in);
	public static List<sanPham> list = new ArrayList<>();

	public static void main(String[] args) {

		int chon;
		while (true) {
			System.out.println(
					"\n++------------------------------MENU--------------------++");
			System.out.printf("+|%-54s|+\n",
					" 1.Nhập danh sách sản phẩm.");
			System.out.printf("+|%-54s|+\n",
					" 2.Xuất danh sách sản phẩm.");
			System.out.printf("+|%-54s|+\n", " 3.tìm và xóa sản phẩm theo tên.");
			System.out.printf("+|%-54s|+\n",
					" 4.Giá trung bình tất cả sản phẩm.");
			System.out.printf("+|%-54s|+\n", " 0.Thoát menu.");
			System.out.printf(
					"++------------------------------------------------------++\n");
			System.out.printf("+| Lựa chọn của bạn: : ");
			chon = sc.nextInt();
			System.out.printf(
					"++------------------------------------------------------++\n");

			switch (chon) {
				case 1 : {
					System.out.println("1.1.Nhập danh sách sản phẩm:");
					nhapThongTin();
					break;
				}
				case 2 : {
					System.out.println("2.Xuất danh sách sản phẩm:");
					xuatThongTin();
					break;
				}
				case 3 : {
					System.out.println("3.tìm và xóa sản phẩm theo tên:");
					timSanPham();
					break;
				}
				case 4 : {
					System.out.println(
							"4.Giá trung bình tất cả sản phẩm:");
					tongSanPham();
					break;
				}
				case 0 : {
					System.out.println("Thoát chương trình!");
					System.exit(0);
					break;
				}
				default : {
					System.out.println("Chọn sai! mời chọn lại");
					break;
				}
			}
		}
	}
// Nhập thông tin sản phẩm
	public static void nhapThongTin() {
list.add(new sanPham("bánh", 32));
		list.add(new sanPham("kẹo", 42));
		list.add(new sanPham("sách", 2));
		list.add(new sanPham("mật ong", 9));
		list.add(new sanPham("chuối", 78));
/*
		while(true) {
		sanPham sanPham1 = new sanPham();
		sanPham1.nhap();
		list.add(sanPham1);
		System.out.println("Bạn có muốn nhập thoát ko (Y/N)?");
		sc.nextLine();
		if(sc.nextLine().equals("N")) break;
		}
		*/
		System.out.println("Thông tin sản phẩm đã được thêm!!!");
	}

	public static void xuatThongTin() {
		Collections.sort(list, (a, b) -> (a.getGia().compareTo(b.getGia())));
		for (sanPham sp : list) {
			System.out.println(sp.toString());
		}
		System.out.println("---");
	}

	public static void timSanPham() {
		System.out.print("Tên sản phẩm bạn muốn xóa: ");
		String n = sc.nextLine();
		int i = Collections.binarySearch(list, new sanPham(n, 0),
				new Comparator<sanPham>() {
					public int compare(sanPham u1, sanPham u2) {
						return u1.getName().compareTo(u2.getName());
					}
				});
		System.out.println(i);
		list.remove(i);
	}

	public static void tongSanPham() {
		double t =0;
		for(sanPham sp: list) {
			t += sp.getGia();
		}
		System.out.println("Trung bình giá sản phẩm: "+ t/list.size());
	}
}

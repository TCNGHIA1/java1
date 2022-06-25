package lab5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lab5Bai2 {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        int chon;
        while (true) {
            System.out.println("\n++------------------------------MENU--------------------++");
            System.out.printf("+|%-54s|+\n", " 1.Nhập danh sách Họ và tên.");
            System.out.printf("+|%-54s|+\n", " 2.Xuất danh sách đã nhập.");
            System.out.printf("+|%-54s|+\n", " 3.Xuất danh sách ngẫu nhiên.");
            System.out.printf("+|%-54s|+\n", " 4.Sắp xếp giảm dần và xuất danh sách.");
            System.out.printf("+|%-54s|+\n", " 5.Tìm kiếm và xóa họ tên.");
            System.out.printf("+|%-54s|+\n", " 0.Thoát menu.");
            System.out.printf("++------------------------------------------------------++\n");
            System.out.printf("+| Lựa chọn của bạn: ");
            chon = Integer.parseInt(sc.nextLine());
            System.out.printf("++------------------------------------------------------++\n");

            switch (chon) {
                case 1: {
                    System.out.println("1.Nhập danh sách Họ và tên:");
                    nhapThongTin();
                    break;
                }
                case 2: {
                    System.out.println("2.Xuất danh sách đã nhập:");
                    xuatThongTin();
                    break;
                }
                case 3: {
                    System.out.println("3.Xuất danh sách ngẫu nhiên:");
                    xuatRdNhanVien();
                    break;
                }
                case 4: {
                    System.out.println("4.Sắp xếp giảm dần và xuất danh sách:");
                    sxNhapNhanVien();
                    break;
                }
                case 5: {
                    System.out.println("5.Tìm kiếm và xóa họ tên:");
                    timNhanVien();
                    break;
                }
                case 0: {
                    System.out.println("Thoát chương trình!");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Chọn sai! mời chọn lại");
                    break;
                }
            }
        }
    }

    public static void nhapThongTin() {
        while (true) {
            System.out.print("\nTên bạn muốn nhập:");
            String x = sc.nextLine();
            list.add(x);
            System.out.println("Bạn có muốn nhập tiếp ko (Y/N)?");
            if (sc.nextLine().equals("N"))
                break;
        }
    }

    public static void xuatThongTin() {

        for (String i : list) {
            System.out.println(i);
        }
    }

    public static void xuatRdNhanVien() {
        Collections.shuffle(list);
        xuatThongTin();
    }

    public static void sxNhapNhanVien() {
        Collections.sort(list); // Sắp xếp theo thứ tự tăng dàn
        Collections.reverse(list);// Đảo ngược
        xuatThongTin();
    }

    public static void timNhanVien() {
        for (;;) {
            System.out.print("\nHọ tên bạn muốn xóa: ");
            String k = sc.nextLine();
            if (list.contains(k) == false) {
                System.out.println("Tên không tồn tại");
            } else {
                list.remove(k);
                System.out.println("Đã xóa tên bạn muốn!");
            }
            System.out.print("Bạn có muốn thoát chức năng (Y/N)?   ");
            if (sc.nextLine().equals("Y"))
                break;
        }
    }
}

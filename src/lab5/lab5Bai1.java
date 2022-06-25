package lab5;
import java.util.ArrayList;
import java.util.Scanner;

public class lab5Bai1 {
    public static ArrayList<Double> list = new ArrayList<>(); 
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            System.out.print("\nGiá trị bạn muốn thêm vào danh sách:");
            Double x = sc.nextDouble();
            list.add(x);
            System.out.println("Bạn có muốn nhập tiếp ko (Y/N)?");
            sc.nextLine();
            if(sc.nextLine().equals("n")||sc.nextLine().equals("N")) break;
        }
        System.out.print("Danh sách số đã nhập:  ");
        for(Double i: list ){
            System.out.print(i+" ");
        }
    }
}

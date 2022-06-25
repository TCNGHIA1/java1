package lab3;
import java.util.Arrays;
import java.util.Scanner;

public class lab3 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("+----------------------------------+");
        System.out.println("+ 1.Kiem tra so nguyen to          +");
        System.out.println("+ 2.Bang cuu chuong                +");
        System.out.println("+ 3.Nhap xuat mang                 +");
        System.out.println("+ 4.Diem sinh vien                 +");
        System.out.println("+ 0.Thoat                          +");
        System.out.println("+----------------------------------+\n");
        System.out.print("Lua chon cua ban la: ");
        int c = sc.nextInt();
        switch(c){
            case 1:{        
                System.out.println("Nhap so can kiem tra: ");
                int n = sc.nextInt();
                check(n);
                break;
            }
            case 2:{
                show();
                break;
            }
            case 3:{
                mang();break;
            }
            case 4:{
                sinhVien();break;
            }
            case 0: break;
            default:
                System.out.println("Chon sai!");
                break;
        }

        
    }
    public static void check(int n) {
        boolean ok = true;
        if (n == 1 || n == 2)
            ok = true;
        for (int i = 2; i < (int) (n / 2); i++) {
            if (n % i == 0) {
                ok = false;
                break;
            }
        }
        System.out.println("So nguyen to: "+ ok);

    }
    public static void show(){
        for(int i = 1;i<=9;i++){
            for(int j =1;j<=10;j++){
                System.out.print(j+" * "+i+" = "+(i*j)+"     ");
                if(j%4==0) System.out.println();
            }
            System.out.println("\n");
        }
    }
    public static void mang(){
        System.out.print("So phan tu mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int i;
        for( i=0;i<n;i++){
            System.out.print("Phan tu thu "+i+" : ");
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.print("Sau khi sap xep: ");
        for(int x:a){
            System.out.print(x+"  ");
        }

        System.out.println("\n Phan tu nho nhat trong mang: "+a[0]);//Mảng đã được sắp xếp tăng dần
        /* int min =a[0];
        for( i =1;i<n;i++){
            if(a[i]<min) min = a[i];
        } 
        System.out.println("Phan tu nho nhat trong mang: "+ min);*/
        int count =0;
        double sum = 0;
        for(i=0;i<n;i++){
            if(a[i]%3==0){
                sum+= a[i];
                count++;
            }
        }
        System.out.println("TBC cac phan tu chia het cho 3: "+(sum/(double)count));
    }
    public static void sinhVien(){
        System.out.print("So sinh vien da nhap: "); int n =sc.nextInt();
        float[] a= new float[n]; //điểm 
        String[] b = new String[n]; //mảng họ tên sinh viên
        int i;
        for(i=0;i<n;i++){
            System.out.println("Sinh vien thu "+(i+1)+" : ");
            System.out.print("Ho va ten: ");
            sc.nextLine();
            b[i] = sc.nextLine();
            System.out.print("Diem: ");
            a[i] = sc.nextFloat();
        }
        for(i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    float temp;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    String t = b[i];
                    b[i] = b[j];
                    b[j] = t;
                }
            }
        }
        System.out.println("\ndanh sach sinh vien sau khi sap xep:");
        for(i=0;i<n;i++){
            System.out.println("Ho va ten: "+b[i]);
            System.out.println("Diem: "+a[i]);
            System.out.print("Hoc luc: ");
            if(a[i]>=9){
                System.out.println("Xuat sac");
            } else if(a[i]>=7.5){
                System.out.println("Gioi");
            } else if(a[i]>=6.5){
                System.out.println("Kha");
            } else if(a[i]>=5){
                System.out.println("Trung binh");
            } else {
                System.out.println("Yeu");
            }
            System.out.println();
        }
    }
}

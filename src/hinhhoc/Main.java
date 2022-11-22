
package hinhhoc;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        DanhSach hinhHoc = new DanhSach();
        int choise;
        menu();
        do {
            System.out.print("Moi Nhap lua chon 1...3: ");
            Scanner sc = new Scanner(System.in);
            choise = sc.nextInt();
            switch (choise) {
                case 1: hinhHoc.Nhap();break;
                case 2: hinhHoc.Xuat(); break;
                case 3: System.out.println("Thoat.");
                default: System.out.println("Nhap sai!!!!");
            }
        } while (choise != 3);
    }
    public static void menu() {
        System.out.println("===== Hinh Hoc ====");
        System.out.println("1. Nhap hinh hoc.");
        System.out.println("2. Xuat danh sach.");
        System.out.println("3. Thoat.");
        System.out.println("===================");
    }
}

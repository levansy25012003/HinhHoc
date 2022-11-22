
package hinhhoc;

import java.util.Scanner;

public class ChuNhat extends Hinh{ 
    private double a;
    private double b;

    public ChuNhat() {
    }

    public ChuNhat(double a, double b, String tenHinh) {
        super(tenHinh);
        this.a = a;
        this.b = b;
    }
    
    public void Nhap() {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a = ");
        this.a = sc.nextDouble();
        System.out.print("Nhap b = ");
        this.b = sc.nextDouble();
    }
    public void Xuat() {
        super.Xuat();
        System.out.print("\na = " + this.a);
        System.out.print("\nb = " + this.b);
        System.out.print("\nChu vi = " + tinhChuVi());
        System.out.print("\nDien tich = " + tinhDienTich());
        System.out.println("\n==============================");
    }
    public double tinhChuVi() {
        double p = (a + b) /2;
        return p;
    }
    public double  tinhDienTich() {
        double dt = a * b;
        return dt;
    }
}

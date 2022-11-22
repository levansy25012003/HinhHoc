
package hinhhoc;

import java.util.Scanner;


public class TamGiac extends Hinh{
    private int a;
    private int b;
    private int c;

    public TamGiac(int a, int b, int c, String tenHinh) {
        super(tenHinh);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public TamGiac() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        System.out.print("Nhap a = ");
        this.a = sc.nextInt();
        System.out.print("Nhap b = ");
        this.b = sc.nextInt();
        System.out.print("Nhap c = ");
        this.c = sc.nextInt();
    }
    public void Xuat() {
        super.Xuat();
        System.out.print("\na = " + this.a);
        System.out.print("\nb = " + this.b);
        System.out.print("\nc = " + this.c);
        System.out.print("\nChu vi = " + tinhChuVi());
        System.out.print("\nDien tich = " + tinhDienTich());
        System.out.println("\n==============================");
    }
    
    public double tinhDienTich() {
        double p = (a+b+c) / 2;
        double dt = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return dt;
    }
    
    public  double tinhChuVi() {
        double p = a + b + c;
        return p;
    }
}

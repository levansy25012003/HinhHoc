
package hinhhoc;

import java.util.Scanner;


public class HinhTron extends Hinh{
    private double r;

    public HinhTron() {
    }

    public HinhTron(double r, String tenHinh) {
        super(tenHinh);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public void Nhap() {
        super.Nhap();
        System.out.print("Nhap r = " );
        Scanner sc = new Scanner(System.in);
        this.r = sc.nextDouble();
    }
    
    public void Xuat() {
        super.Xuat();
        System.out.print("\nBan kinh = " + this.r);
        System.out.print("\nChu vi = " + tinhChuVi());
        System.out.print("\nDien tich = " + tinhDienTich());
        System.out.println("\n==============================");
    }
    
    public double tinhChuVi() {
        double p = 2 * 3.14 * r;
        return r;
    }
    public double  tinhDienTich() {
        double dt = 3.14 * r * r;
        return dt;
    }
    
    
}

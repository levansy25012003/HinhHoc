
package hinhhoc;

import java.util.Scanner;

public abstract class Hinh {
    protected String tenHinh;

    public Hinh() {
    }

    public Hinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public String getTenHinh() {
        return tenHinh;
    }

    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }
    
    public  void Nhap() {
        System.out.print("Nhap ten hinh: ");
        Scanner sc = new Scanner(System.in);
        this.tenHinh = sc.nextLine();
    }
    
    public  void Xuat() {
        System.out.print("\nTen hinh: " + this.tenHinh);
    }
     public abstract double tinhChuVi();
     public abstract double tinhDienTich();
       
}

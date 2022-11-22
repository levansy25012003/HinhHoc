
package hinhhoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSach {
    List<Hinh> HINH = new ArrayList<>();
    
    Scanner sc = new Scanner(System.in);
    public DanhSach() {
    }
    public void Nhap() {
        System.out.print("Moi nhap G or T or N: ");
        char choise = sc.nextLine().charAt(0);
        Hinh hinh = null;
        if (choise == 'G' || choise == 'g') 
            hinh = new TamGiac();
        else if (choise == 'T' || choise == 't')
            hinh = new HinhTron();
        else if (choise == 'N' || choise == 'n')
            hinh = new ChuNhat();
        
        hinh.Nhap();
        HINH.add(hinh);
    }
    
    public void Xuat() {
        for (int i = 0; i < HINH.size(); i++) {
            HINH.get(i).Xuat();
        }
    }
}

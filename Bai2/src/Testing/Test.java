package Testing;

import java.util.Scanner;
import Class.QLCB;

public class Test {

    public static void main(String[] args) {
        // đặt biến kèm 3 số cuối của MSV
        Scanner sc_127 = new Scanner(System.in);

        QLCB qlcb_127 = new QLCB();

        qlcb_127.nhapDanhSach(sc_127);

        System.out.print("Nhap vao ho ten can tim kiem: ");
        String name_127 = sc_127.nextLine();

        qlcb_127.timKiemCanBo(name_127);

        // huy sc
        sc_127.close();
    }
}

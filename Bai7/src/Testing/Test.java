package Testing;

import java.util.Scanner;
import Class.QLHS;

public class Test {

    public static void main(String[] args) {
        Scanner sc_127 = new Scanner(System.in);

        QLHS list_127 = new QLHS();

        // Nhập danh sách học sinh
        list_127.nhapDanhSach(sc_127);

        // Tìm theo năm sinh và quê quán
        System.out.println("\nNhung hoc sinh sinh nam 1985 va que Thai Nguyen la:");
        list_127.timKiemThongTin(1985, "Thai Nguyen");

        // Tìm theo lớp
        System.out.println("\nNhung hoc sinh hoc lop 10A1 la:");
        list_127.timKiemThongTin("10A1");

        sc_127.close();
    }
}

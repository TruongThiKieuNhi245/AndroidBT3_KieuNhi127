package Class;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class QLHS {
    private ArrayList<HocSinh> dshs_127;

    public QLHS() {
        dshs_127 = new ArrayList<HocSinh>(10);
    }

    // them 1 hoc sinh
    public void themHS(HocSinh hs_127) {
        dshs_127.add(hs_127);
    }

    // nhap danh sach hoc sinh
    public void nhapDanhSach(Scanner sc_127) {
        HocSinh hs_127;

        System.out.print("Nhap vao so hoc sinh: ");
        int soHS_127 = sc_127.nextInt();
        sc_127.nextLine();

        System.out.println("Nhap vao thong tin cho tung hoc sinh:");
        for (int i_127 = 0; i_127 < soHS_127; i_127++) {
            System.out.println("Hoc sinh thu " + (i_127 + 1) + " la:");
            hs_127 = new HocSinh();
            hs_127.nhapThongTin(sc_127);
            themHS(hs_127);
        }
    }

    // hien thi danh sach
    public void hienThiDanhSach() {
        int n_127 = dshs_127.size();

        for (int i_127 = 0; i_127 < n_127; i_127++) {
            System.out.println("Hoc sinh thu " + (i_127 + 1) + " la:");
            dshs_127.get(i_127).hienThiThongTin();
        }
    }

    // ham tim kiem thong tin theo nam va que
    public void timKiemThongTin(int nam_127, String que_127) {
        Calendar cal_127 = Calendar.getInstance();

        for (HocSinh hs_127 : dshs_127) {
            Date ngSinh_127 = hs_127.getNgaySinh();
            if (ngSinh_127 == null) continue;
            cal_127.setTime(ngSinh_127);
            int namSinh_127 = cal_127.get(Calendar.YEAR);

            if (namSinh_127 == nam_127 && que_127.equals(hs_127.getQueQuan())) {
                hs_127.hienThiThongTin();
            }
        }
    }

    // ham tim kiem thong tin theo lop
    public void timKiemThongTin(String lop_127) {
        for (HocSinh hs_127 : dshs_127) {
            if (lop_127.equals(hs_127.getLop())) {
                hs_127.hienThiThongTin();
            }
        }
    }
}

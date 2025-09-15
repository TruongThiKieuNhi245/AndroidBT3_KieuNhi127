package Class;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class QuanLy {
	// thuoc tinh
	private ArrayList<TheMuon> ds_127;

	// phuong thuc
	// ham khoi tao khong doi so
	public QuanLy() {
		ds_127 = new ArrayList<TheMuon>(10);
	}

	// ham them the muon vao danh sach
	public void themTheMuon(TheMuon theMuon_127) {
		ds_127.add(theMuon_127);
	}

	// ham nhap vao danh sach
	public void nhapDanhSach(Scanner sc_127) {
		TheMuon theMuon_127;

		System.out.print("Nhap vao so luong the muon: ");
		int n_127 = sc_127.nextInt();
		sc_127.nextLine();

		System.out.println("Nhap vao danh sach:");
		for (int i_127 = 0; i_127 < n_127; i_127++) {
			System.out.println("The muon thu " + (i_127 + 1) + " la:");
			theMuon_127 = new TheMuon();
			theMuon_127.nhapThongTin(sc_127);
			themTheMuon(theMuon_127);
		}
	}

	// ham hien thi danh sach
	public void hienThiDanhSachTraCuoiThang() {
		Calendar cal_127 = Calendar.getInstance();

		for (TheMuon the_127 : ds_127) {
			Date hanTra_127 = the_127.getHanTra();
			if (hanTra_127 == null) continue;
			cal_127.setTime(hanTra_127);
			int day_127 = cal_127.get(Calendar.DAY_OF_MONTH);
			if (day_127 == 31 || day_127 == 30) {
				the_127.hienThiThongTin();
			}
		}
	}
}

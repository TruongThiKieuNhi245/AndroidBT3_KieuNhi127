package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	// thuoc tinh
	private ArrayList<CBGV> ds_127;

	// phuong thuc
	// ham khoi tao
	public QuanLy() {
		ds_127 = new ArrayList<CBGV>(10);
	}

	// ham them can bo vao danh sach
	public void themCBGV(CBGV canBo_127) {
		ds_127.add(canBo_127);
	}

	// ham nhap vao danh sach
	public void nhapDanhSach(Scanner sc_127) {
		CBGV canBo_127;

		System.out.print("Nhap vao so luong can bo: ");
		int n_127 = sc_127.nextInt();
		sc_127.nextLine();

		System.out.println("Nhap vao danh sach:");
		for (int i_127 = 0; i_127 < n_127; i_127++) {
			System.out.println("Can bo thu " + (i_127 + 1) + " la:");
			canBo_127 = new CBGV();
			canBo_127.nhapThongTin(sc_127);
			themCBGV(canBo_127);
		}
	}

	// ham hien thi danh sach
	public void hienThiDanhSach() {
		for (CBGV cb_127 : ds_127) {
			cb_127.hienThiThongTin();
		}
	}

	// ham tim kiem
	public void timKiem(double luong_127) {
		for (CBGV cb_127 : ds_127) {
			if (cb_127.getLuongThucLinh() >= luong_127) {
				cb_127.hienThiThongTin();
			}
		}
	}
}

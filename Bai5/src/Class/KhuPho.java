package Class;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class KhuPho {
	// thuoc tinh
	private ArrayList<HoDan> dshd_127;

	// phuong thuc
	// ham khoi tao
	public KhuPho() {
		dshd_127 = new ArrayList<HoDan>(10);
	}

	// ham them 1 ho dan
	public void themHoDan(HoDan hoDan_127) {
		dshd_127.add(hoDan_127);
	}

	// ham nhap vao danh sach ho dan
	public void nhapDanhSach(Scanner sc_127) {
		HoDan hoDan_127;

		System.out.print("Nhap vao so ho dan: ");
		int soHoDan_127 = sc_127.nextInt();
		sc_127.nextLine();

		System.out.println("Nhap vao thong tin cho tung ho dan:");
		for (int i_127 = 0; i_127 < soHoDan_127; i_127++) {
			System.out.println("Ho dan thu " + (i_127 + 1) + " la:");
			hoDan_127 = new HoDan();
			hoDan_127.nhapThongTin(sc_127);
			themHoDan(hoDan_127);
		}
	}

	// ham hien thi danh sach
	public void hienThiDanhSach() {
		int n_127 = dshd_127.size();

		for (int i_127 = 0; i_127 < n_127; i_127++) {
			System.out.println("Ho dan thu " + (i_127 + 1) + " la:");
			dshd_127.get(i_127).hienThiThongTin();
		}
	}

	// ham tim kiem thong tin
	public void timKiemThongTin() {
		// lay ra duoc nam hien tai
		Calendar now_127 = Calendar.getInstance();
		int namHienTai_127 = now_127.get(Calendar.YEAR);

		Nguoi[] dstv_127 = null;
		Calendar cal_127 = Calendar.getInstance();

		for (HoDan hoDan_127 : dshd_127) {
			dstv_127 = hoDan_127.getList();
			for (int i_127 = 0; i_127 < hoDan_127.getSoNguoi(); i_127++) {
				Date ns_127 = dstv_127[i_127].getNgaySinh();
				if (ns_127 == null) continue; // neu ko co ngay sinh thi bo qua
				cal_127.setTime(ns_127);
				int namSinh_127 = cal_127.get(Calendar.YEAR);
				if (namHienTai_127 - namSinh_127 == 80) {
					hoDan_127.hienThiThongTin();
				}
			}
		}
	}
}

package Class;

import java.util.Scanner;

public class TapChi extends TaiLieu {
	// thuoc tinh
	private int soPhatHanh_127;
	private int thangPhatHanh_127;

	// phuong thuc
	// ham khoi tao khong doi so
	public TapChi() {

	}

	// ham khoi tao co doi so
	public TapChi(String maTaiLieu_127, String tenNXB_127, int soBanPhatHanh_127, int soPhatHanh_127, int thangPhatHanh_127) {
		super(maTaiLieu_127, tenNXB_127, soBanPhatHanh_127);
		this.soPhatHanh_127 = soPhatHanh_127;
		this.thangPhatHanh_127 = thangPhatHanh_127;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_127) {
		super.nhapThongTin(sc_127);
		System.out.print("\tNhap so phat hanh: ");
		soPhatHanh_127 = sc_127.nextInt();
		System.out.print("\tNhap thang phat hanh: ");
		thangPhatHanh_127 = sc_127.nextInt();
		sc_127.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo phat hanh: " + soPhatHanh_127);
		System.out.println("\tThang phat hanh: " + thangPhatHanh_127);
	}
}

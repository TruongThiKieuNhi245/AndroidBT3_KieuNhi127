package Class;

import java.util.Scanner;

public class TaiLieu {
	// thuoc tinh
	private String maTaiLieu_127;
	private String tenNXB_127;
	private int soBanPhatHanh_127;

	// phuong thuc
	// ham khoi tao khong doi so
	public TaiLieu() {

	}

	// ham khoi tao co doi so
	public TaiLieu(String maTaiLieu_127, String tenNXB_127, int soBanPhatHanh_127) {
		this.maTaiLieu_127 = maTaiLieu_127;
		this.tenNXB_127 = tenNXB_127;
		this.soBanPhatHanh_127 = soBanPhatHanh_127;
	}

	// nhap
	public void nhapThongTin(Scanner sc_127) {
		System.out.print("\tNhap ma tai lieu: ");
		maTaiLieu_127 = sc_127.nextLine();
		System.out.print("\tNhap ten nha xuat ban: ");
		tenNXB_127 = sc_127.nextLine();
		System.out.print("\tNhap so ban phat hanh: ");
		soBanPhatHanh_127 = sc_127.nextInt();
		sc_127.nextLine();
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tMa tai lieu: " + maTaiLieu_127);
		System.out.println("\tTen nha xuat ban: " + tenNXB_127);
		System.out.println("\tSo ban phat hanh: " + soBanPhatHanh_127);
	}

	// ham lay ra ma tai lieu
	public String getMaTaiLieu() {
		return maTaiLieu_127;
	}
}

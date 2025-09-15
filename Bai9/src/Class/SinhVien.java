package Class;

import java.util.Scanner;

public class SinhVien {
	// thuoc tinh
	protected String hoTen_127;
	protected String maSV_127;
	protected String ngaySinh_127;
	protected String lop_127;

	// phuong thuc
	// ham khoi tao khong doi so
	public SinhVien() {

	}

	// ham khoi tao co doi so
	public SinhVien(String hoTen_127, String maSV_127, String ngaySinh_127, String lop_127) {
		this.hoTen_127 = hoTen_127;
		this.maSV_127 = maSV_127;
		this.ngaySinh_127 = ngaySinh_127;
		this.lop_127 = lop_127;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_127) {
		System.out.print("\tNhap ho ten: ");
		hoTen_127 = sc_127.nextLine();

		System.out.print("\tNhap ma sinh vien: ");
		maSV_127 = sc_127.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		ngaySinh_127 = sc_127.nextLine();

		System.out.print("\tNhap lop: ");
		lop_127 = sc_127.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_127);
		System.out.println("\tNgay sinh: " + ngaySinh_127);
		System.out.println("\tMa sinh vien: " + maSV_127);
		System.out.println("\tLop: " + lop_127);
	}
}

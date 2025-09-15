package Class;

import java.util.Scanner;

public class HocSinh extends Nguoi {
	// thuoc tinh
	private String lop_127;
	private String khoHoc_127;
	private String kyHoc_127;

	// phuong thuc
	// ham khoi tao khong doi so
	public HocSinh() {

	}

	// ham khoi tao co doi so
	public HocSinh(String hoTen_127, String lop_127, String khoaHoc_127, String kyHoc_127) {
		this.hoTen_127 = hoTen_127;
		this.lop_127 = lop_127;
		this.khoHoc_127 = khoaHoc_127;
		this.kyHoc_127 = kyHoc_127;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_127) {
		super.nhapThongTin(sc_127);

		System.out.print("\tNhap lop: ");
		lop_127 = sc_127.nextLine();

		System.out.print("\tNhap khoa hoc: ");
		khoHoc_127 = sc_127.nextLine();

		System.out.print("\tNhap ky hoc: ");
		kyHoc_127 = sc_127.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLop: " + lop_127);
		System.out.println("\tKhoa hoc: " + khoHoc_127);
		System.out.println("\tKy hoc: " + kyHoc_127);
	}

	// ham lay ra thong tin ve lop
	public String getLop() {
		return lop_127;
	}
}

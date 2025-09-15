package Class;

import java.util.Scanner;

public class CBGV extends Nguoi {
	// thuoc tinh
	private double luongCung_127;
	private double thuong_127;
	private double phat_127;
	private double luongThucLinh_127;

	// phuong thuc
	// ham khoi tao khong doi so
	public CBGV() {

	}

	// ham nhap
	public void nhapThongTin(Scanner sc_127) {
		super.nhapThongTin(sc_127);

		System.out.print("\tNhap luong cung: ");
		luongCung_127 = sc_127.nextDouble();
		sc_127.nextLine();

		System.out.print("\tNhap thuong: ");
		thuong_127 = sc_127.nextDouble();
		sc_127.nextLine();

		System.out.print("\tNhap phat: ");
		phat_127 = sc_127.nextDouble();
		sc_127.nextLine();

		// tinh luong
		luongThucLinh_127 = luongCung_127 + thuong_127 - phat_127;
	}

	// ham hien thi thong tin
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLuong cung: " + luongCung_127);
		System.out.println("\tThuong: " + thuong_127);
		System.out.println("\tPhat: " + phat_127);
		System.out.println("\tLuong thuc linh: " + luongThucLinh_127);
	}

	// ham lay ra thong tin ve luong thuc linh
	public double getLuongThucLinh() {
		return luongThucLinh_127;
	}
}

package BuildClass;

import java.util.Scanner;

public class KhachHang {
	// Thuoc tinh
	protected String tenChuHo_127;
	protected int soNha_127;
	protected String maCongTo_127;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public KhachHang() {

	}

	// Ham khoi tao co doi so
	public KhachHang(String tenChuHo_127, int soNha_127, String maCongTo_127) {
		this.tenChuHo_127 = tenChuHo_127;
		this.soNha_127 = soNha_127;
		this.maCongTo_127 = maCongTo_127;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc_127) {
		System.out.print("\tNhap ten chu ho: ");
		tenChuHo_127 = sc_127.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha_127 = sc_127.nextInt();
		sc_127.nextLine();
		System.out.print("\tNhap ma cong to: ");
		maCongTo_127 = sc_127.nextLine();
	}

	// Ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tTen chu ho: " + tenChuHo_127);
		System.out.println("\tSo nha: " + soNha_127);
		System.out.println("\tMa cong to: " + maCongTo_127);
	}
}

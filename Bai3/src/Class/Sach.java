package Class;

import java.util.Scanner;

public class Sach extends TaiLieu {
	// thuoc tinh
	private String tacGia_127;
	private int soTrang_127;

	// phuong thuc
	// ham khoi tao khong doi so
	public Sach() {

	}

	// ham khoi tao co doi so
	public Sach(String maTaiLieu_127, String tenNXB_127, int soBanPhatHanh_127, String tacGia_127, int soTrang_127) {
		super(maTaiLieu_127, tenNXB_127, soBanPhatHanh_127);
		this.tacGia_127 = tacGia_127;
		this.soTrang_127 = soTrang_127;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_127) {
		super.nhapThongTin(sc_127);
		System.out.print("\tNhap tac gia: ");
		tacGia_127 = sc_127.nextLine();
		System.out.print("\tNhap so trang: ");
		soTrang_127 = sc_127.nextInt();
		sc_127.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\ttac gia: " + tacGia_127);
		System.out.println("\tSo trang: " + soTrang_127);
	}
}

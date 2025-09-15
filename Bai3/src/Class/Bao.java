package Class;

import java.util.Scanner;

public class Bao extends TaiLieu {
	// thuoc tinh
	private String ngayPhatHanh_127;

	// phuong thuc
	// ham khoi tao khong doi so
	public Bao() {

	}

	// ham khoi tao co doi so
	public Bao(String maTaiLieu_127, String tenNXB_127, int soBanPhatHanh_127, String ngayPhatHanh_127) {
		super(maTaiLieu_127, tenNXB_127, soBanPhatHanh_127);
		this.ngayPhatHanh_127 = ngayPhatHanh_127;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_127) {
		super.nhapThongTin(sc_127);
		System.out.print("\tNhap ngay phat hanh: ");
		ngayPhatHanh_127 = sc_127.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tNgay phat hanh: " + ngayPhatHanh_127);
	}
}

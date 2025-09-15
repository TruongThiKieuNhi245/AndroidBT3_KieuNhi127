package Class;

import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen_127;
	protected String ngaySinh_127;
	protected String queQuan_127;

	// phuong thuc
	// ham khoi tao khong so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen_127, String ngaySinh_127, String queQuan_127) {
		this.hoTen_127 = hoTen_127;
		this.ngaySinh_127 = ngaySinh_127;
		this.queQuan_127 = queQuan_127;
	}

	// ham nhap thong tin
	public void nhapThongTin(Scanner sc_127) {
		System.out.print("\tNhap ho ten: ");
		hoTen_127 = sc_127.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh_127 = sc_127.nextLine();
		System.out.print("\tNhap que quan: ");
		queQuan_127 = sc_127.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_127);
		System.out.println("\tNgay sinh: " + ngaySinh_127);
		System.out.println("\tQue quan: " + queQuan_127);
	}
}

package Class;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
	// thuoc tinh
	private String mon1_127;
	private String mon2_127;
	private String mon3_127;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhoiA() {

	}

	// ham khoi tao co doi so
	public KhoiA(String mon1_127, String mon2_127, String mon3_127) {
		this.mon1_127 = mon1_127;
		this.mon2_127 = mon2_127;
		this.mon3_127 = mon3_127;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_127) {
		super.nhapThongTin(sc_127);
		System.out.print("\tNhap mon 1: ");
		mon1_127 = sc_127.nextLine();
		System.out.print("\tNhap mon 2: ");
		mon2_127 = sc_127.nextLine();
		System.out.print("\tNhap mon 3: ");
		mon3_127 = sc_127.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTo hop mon thi: " + mon1_127 + " - " + mon2_127 + " - " + mon3_127);
	}
}

package Class;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
	// thuoc tinh
	private int soNguoi_127;
	private int soNha_127;
	private Nguoi[] list_127; // list la mang danh sach chua cac thanh vien trong ho

	// phuong thuc
	// ham khoi tao khong doi so
	public HoDan() {
		list_127 = new Nguoi[10];
	}

	// ham khoi tao co doi so
	public HoDan(String hoTen_127, Date ngaySinh_127, String ngheNghiep_127, int soNguoi_127, int soNha_127) {
		super(hoTen_127, ngaySinh_127, ngheNghiep_127);
		this.soNguoi_127 = soNguoi_127;
		this.soNha_127 = soNha_127;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_127) {
		System.out.print("\tNhap so nguoi: ");
		soNguoi_127 = sc_127.nextInt();
		sc_127.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha_127 = sc_127.nextInt();
		sc_127.nextLine();
		System.out.println("\tNhap thong tin cho tung nguoi trong ho:");
		for (int i_127 = 0; i_127 < soNguoi_127; i_127++) {
			System.out.println("Nguoi thu " + (i_127 + 1) + " la:");
			list_127[i_127] = new Nguoi();
			list_127[i_127].nhapThongTin(sc_127);
		}
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tSo nguoi: " + soNguoi_127);
		System.out.println("\tSo nha: " + soNha_127);
		System.out.println("\tThong tin cua tung nguoi trong gia dinh:");
		for (int i_127 = 0; i_127 < soNguoi_127; i_127++) {
			System.out.println("Nguoi thu " + (i_127 + 1) + " la:");
			list_127[i_127].hienThiThongTin();
		}
	}

	// ham lay ra thanh vien trong ho dan
	public Nguoi[] getList() {
		return list_127;
	}

	// ham lay ra so thanh vien trong ho gia dinh
	public int getSoNguoi() {
		return soNguoi_127;
	}
}

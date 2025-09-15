package BuildClass;

import java.util.Scanner;

public class BienLai extends KhachHang {
	// Thuoc tinh
	private int chiSoMoi_127;
	private int chiSoCu_127;
	private double tien_127;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public BienLai() {

	}

	// Ham khoi tao co doi so
	public BienLai(int chiSoMoi_127, int chiSoCu_127, double tien_127) {
		this.chiSoMoi_127 = chiSoMoi_127;
		this.chiSoCu_127 = chiSoCu_127;
		this.tien_127 = tien_127;
	}

	public BienLai(String tenChuHo_127, int chiSoMoi_127, int chiSoCu_127, double tien_127) {
		this.tenChuHo_127 = tenChuHo_127;
		this.chiSoMoi_127 = chiSoMoi_127;
		this.chiSoCu_127 = chiSoCu_127;
		this.tien_127 = tien_127;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc_127) {
		super.nhapThongTin(sc_127);
		System.out.print("\tNhap chi so moi: ");
		chiSoMoi_127 = sc_127.nextInt();
		sc_127.nextLine();
		System.out.print("\tNhap chi so cu: ");
		chiSoCu_127 = sc_127.nextInt();
		sc_127.nextLine();
		tien_127 = (chiSoMoi_127 - chiSoCu_127) * 750;
	}

	// Ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChi so moi: " + chiSoMoi_127);
		System.out.println("\tChi so cu: " + chiSoCu_127);
		System.out.println("\tTien: : " + tien_127);
	}
}

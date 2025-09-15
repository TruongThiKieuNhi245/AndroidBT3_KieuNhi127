package Class;

import java.util.Scanner;

public class ThiSinh {
	// thuoc tinh
	private int soBaoDanh_127;
	private String hoTen_127;
	private String diaChi_127;
	private String dienUuTien_127;

	// phuong thuc
	// ham khoi tao khong doi so
	public ThiSinh() {

	}

	// ham khoi tao co doi so
	public ThiSinh(int soBaoDanh_127, String hoTen_127, String diaChi_127, String dienUuTien_127) {
		this.soBaoDanh_127 = soBaoDanh_127;
		this.hoTen_127 = hoTen_127;
		this.diaChi_127 = diaChi_127;
		this.dienUuTien_127 = dienUuTien_127;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so bao danh: ");
		soBaoDanh_127 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ho ten: ");
		hoTen_127 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi_127 = sc.nextLine();
		System.out.print("\tNhap dien uu tien: ");
		dienUuTien_127 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tSo bao danh: " + soBaoDanh_127);
		System.out.println("\tHo ten: " + hoTen_127);
		System.out.println("\tDia chi: " + diaChi_127);
		System.out.println("\tDien uu tien: " + dienUuTien_127);
	}

	// ham lay ra thong tin ve so bao danh
	public int getSoBaoDanh_127() {
		return soBaoDanh_127;
	}
}

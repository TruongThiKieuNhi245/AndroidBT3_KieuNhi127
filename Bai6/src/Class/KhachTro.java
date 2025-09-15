package Class;

import java.util.Scanner;

public class KhachTro extends Nguoi {
	// thuoc tinh
	private int soNgayTro_127;
	private String loaiPhong_127;
	private double giaPhong_127;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhachTro() {

	}

	// ham khoi tao co doi so
	public KhachTro(String hoTen_127, int CMND_127, int soNgayTro_127, String loaiPhong_127, double giaPhong_127) {
		this.hoTen_127 = hoTen_127;
		this.CMND_127 = CMND_127;
		this.soNgayTro_127 = soNgayTro_127;
		this.loaiPhong_127 = loaiPhong_127;
		this.giaPhong_127 = giaPhong_127;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_127) {
		super.nhapThongTin(sc_127);

		System.out.print("\tNhap so ngay tro: ");
		soNgayTro_127 = sc_127.nextInt();
		sc_127.nextLine();
		System.out.print("\tNhap loai phong: ");
		loaiPhong_127 = sc_127.nextLine();
		System.out.print("\tNhap gia phong: ");
		giaPhong_127 = sc_127.nextDouble();
		sc_127.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo ngay tro: " + soNgayTro_127);
		System.out.println("\tLoai phong: " + loaiPhong_127);
		System.out.println("\tGia phong: " + giaPhong_127);
	}

	// ham lay ra thong tin so ngay tro
	public int getSoNgayTro() {
		return soNgayTro_127;
	}

	// ham lay thong tin gia phong
	public double getGiaPhong() {
		return giaPhong_127;
	}
}

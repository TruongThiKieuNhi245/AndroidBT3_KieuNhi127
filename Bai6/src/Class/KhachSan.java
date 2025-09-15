package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
	// thuoc tinh
	private ArrayList<KhachTro> ds_127;

	// phuong thuc
	// ham khoi tao
	public KhachSan() {
		ds_127 = new ArrayList<KhachTro>(10);
	}

	// ham them khach tro vao khach san
	public void themKhachTro(KhachTro kt_127) {
		ds_127.add(kt_127);
	}

	// ham nhap danh sach
	public void nhapDanhSach(Scanner sc_127) {
		KhachTro khach_127;

		System.out.print("Nhap vao so luong khach: ");
		int n_127 = sc_127.nextInt();
		sc_127.nextLine();

		System.out.println("Nhap vao thong tin khach tro:");
		for (int i_127 = 0; i_127 < n_127; i_127++) {
			System.out.println("Khach tro thu " + (i_127 + 1) + " la:");
			khach_127 = new KhachTro();
			khach_127.nhapThongTin(sc_127);
			themKhachTro(khach_127);
		}
	}

	// ham hien thi
	public void hienThiDanhSach() {
		for (KhachTro khach_127 : ds_127) {
			khach_127.hienThiThongTin();
		}
	}

	// ham tinh tien
	public double tinhTien(int CMND_127) {
		double tien_127 = 0;

		for (KhachTro khach_127 : ds_127) {
			if (khach_127.getCMND() == CMND_127) {
				tien_127 = khach_127.getSoNgayTro() * khach_127.getGiaPhong();
			}
		}

		return tien_127;
	}
}

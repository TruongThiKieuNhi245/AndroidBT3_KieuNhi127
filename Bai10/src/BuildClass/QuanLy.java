package BuildClass;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	// Thuoc tinh
	private ArrayList<BienLai> ds_127;

	// Phuong thuc
	// Ham khoi tao
	public QuanLy() {
		ds_127 = new ArrayList<BienLai>(10);
	}

	// Ham them bien lai vao danh sach
	public void themBienLai(BienLai bienLai_127) {
		ds_127.add(bienLai_127);
	}

	// Ham nhap danh sach
	public void nhapDanhSach(Scanner sc_127) {
		BienLai bienLai_127;
		System.out.print("Nhap vao so luong bien lai: ");
		int n_127 = sc_127.nextInt();
		sc_127.nextLine();
		System.out.println("Nhap vao danh sach bien lai:");
		for (int i_127 = 0; i_127 < n_127; i_127++) {
			System.out.println("Bien lai thu " + (i_127 + 1) + " la:");
			bienLai_127 = new BienLai();
			bienLai_127.nhapThongTin(sc_127);

			themBienLai(bienLai_127);
		}
	}

	// Ham hien thi danh sach
	public void hienThiDanhSach() {
		for (int i_127 = 0; i_127 < ds_127.size(); i_127++) {
			System.out.println("Bien lai thu " + (i_127 + 1) + " la:");
			ds_127.get(i_127).hienThiThongTin();
			System.out.println();
		}
	}
}

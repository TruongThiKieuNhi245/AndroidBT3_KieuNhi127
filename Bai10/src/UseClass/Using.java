package UseClass;

import java.util.Scanner;

import BuildClass.QuanLy;

public class Using {

	public static void main(String[] args) {
		Scanner sc_127 = new Scanner(System.in);

		QuanLy ql_127 = new QuanLy();
		ql_127.nhapDanhSach(sc_127);

		System.out.println("Danh sach bien lai cua cac ho gia dinh la:");
		ql_127.hienThiDanhSach();

		sc_127.close();
	}

}

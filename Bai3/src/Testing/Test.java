package Testing;

import java.util.Scanner;

import Class.QuanLySach;

public class Test {

	public static void main(String[] args) {
		Scanner sc_127 = new Scanner(System.in);

		QuanLySach qls_127 = new QuanLySach();

		qls_127.nhapDanhSachTL(sc_127);

		System.out.print("\n\nNhap vao loai tai lieu can tim: ");
		String loai_127 = sc_127.nextLine();
		qls_127.timLoaiTL(loai_127);

		System.out.print("\n\nNhap vao ma tai lieu can tim: ");
		String maTL_127 = sc_127.nextLine();
		qls_127.timMaTL(maTL_127);

		sc_127.close();
	}

}

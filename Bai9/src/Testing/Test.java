package Testing;

import java.util.Scanner;

import Class.QuanLy;

public class Test {

	public static void main(String[] args) {
		Scanner sc_127 = new Scanner(System.in);

		QuanLy ql_127 = new QuanLy();

		ql_127.nhapDanhSach(sc_127);

		System.out.println("Danh sach sinh vien tra sach vao cuoi thang:");
		ql_127.hienThiDanhSachTraCuoiThang();

		sc_127.close();
	}

}

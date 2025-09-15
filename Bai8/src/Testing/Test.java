package Testing;

import java.util.Scanner;

import Class.QuanLy;

public class Test {

	public static void main(String[] args) {
		Scanner sc_127 = new Scanner(System.in);

		QuanLy ql_127 = new QuanLy();

		ql_127.nhapDanhSach(sc_127);

		System.out.println("Danh sach nhung can bo co luong >= 8 trieu la:");
		ql_127.timKiem(8000000);

		sc_127.close();
	}

}

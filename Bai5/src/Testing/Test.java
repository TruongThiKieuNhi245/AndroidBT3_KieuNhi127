package Testing;

import java.util.Scanner;

import Class.KhuPho;

public class Test {

	public static void main(String[] args) {
		Scanner sc_127 = new Scanner(System.in);

		KhuPho qlkp_127 = new KhuPho();

		qlkp_127.nhapDanhSach(sc_127);

		System.out.println("Danh sach ho dan co nguoi 80 tuoi la:");
		qlkp_127.timKiemThongTin();
	}

}

package Testing;

import java.util.Scanner;

import Class.TuyenSinh;

public class Test {

	public static void main(String[] args) {
		Scanner sc_127 = new Scanner(System.in);

		TuyenSinh dsTuyenSinh_127 = new TuyenSinh();

		System.out.println("Nhap vao danh sach thi sinh: ");
		dsTuyenSinh_127.nhapDanhSach(sc_127);

		System.out.println("Danh sach thi sinh du thi la:");
		dsTuyenSinh_127.hienThiDanhSach();

		System.out.print("Nhap so bao danh can tim: ");
		int soBaoDanh_127 = sc_127.nextInt();
		sc_127.nextLine();

		dsTuyenSinh_127.timKiemThiSinh(soBaoDanh_127);

		sc_127.close();
	}

}

package Testing;

import java.util.Scanner;

import Class.KhachSan;

public class Test {

	public static void main(String[] args) {
		Scanner sc_127 = new Scanner(System.in);

		KhachSan ql_127 = new KhachSan();

		ql_127.nhapDanhSach(sc_127);

		System.out.print("Nhap vao khach tro can tinh tien: ");
		int cmnd_127 = sc_127.nextInt();

		System.out.println("==> Tong tien la: " + ql_127.tinhTien(cmnd_127));

		sc_127.close();
	}

}

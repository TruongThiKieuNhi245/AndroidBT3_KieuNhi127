package Class;

import java.util.Scanner;

public class PhanSo {
	// thuoc tinh
	private int tuSo_127;
	private int mauSo_127;

	// phuong thuc
	// ham khoi tao khong doi so
	public PhanSo() {
		tuSo_127 = 0;
		mauSo_127 = 1;
	}

	// ham khoi tao co doi so
	public PhanSo(int tuSo_127, int mauSo_127) {
		this.tuSo_127 = tuSo_127;
		this.mauSo_127 = mauSo_127;
	}

	// ham nhap phan so
	public void nhapPS(Scanner sc_127) {
		int a_127;
		int b_127;

		do {
			System.out.print("\tNhap vao tu so: ");
			a_127 = sc_127.nextInt();

			System.out.print("\tNhap vao mau so: ");
			b_127 = sc_127.nextInt();

			// kiem tra
			if (b_127 == 0) {
				System.out.println("Mau so khong duoc bang 0. Hay nhap lai!");
			} else {
				tuSo_127 = a_127;
				mauSo_127 = b_127;
			}
		} while (b_127 == 0);
	}

	// ham hien thi
	public void hienThiPS() {
		if (tuSo_127 * mauSo_127 < 0) {
			System.out.println("\t-" + Math.abs(tuSo_127) + "/" + Math.abs(mauSo_127));
		} else {
			System.out.println("\t" + Math.abs(tuSo_127) + "/" + Math.abs(mauSo_127));
		}
	}

	// ham cong
	public PhanSo congPS(PhanSo ps2_127) {
		int a_127 = tuSo_127 * ps2_127.mauSo_127 + ps2_127.tuSo_127 * mauSo_127;
		int b_127 = mauSo_127 * ps2_127.mauSo_127;

		return new PhanSo(a_127, b_127);
	}

	// ham tru
	public PhanSo truPS(PhanSo ps2_127) {
		int a_127 = tuSo_127 * ps2_127.mauSo_127 - ps2_127.tuSo_127 * mauSo_127;
		int b_127 = mauSo_127 * ps2_127.mauSo_127;

		return new PhanSo(a_127, b_127);
	}

	// ham nhan
	public PhanSo nhanPS(PhanSo ps2_127) {
		int a_127 = tuSo_127 * ps2_127.tuSo_127;
		int b_127 = mauSo_127 * ps2_127.mauSo_127;

		return new PhanSo(a_127, b_127);
	}

	// ham chia
	public PhanSo chiaPS(PhanSo ps2_127) {
		int a_127 = tuSo_127 * ps2_127.mauSo_127;
		int b_127 = mauSo_127 * ps2_127.tuSo_127;

		return new PhanSo(a_127, b_127);
	}

	// ham tim uscln
	private int timUSCLN(int a_127, int b_127) {
		int r_127 = a_127 % b_127;

		while (r_127 != 0) {
			a_127 = b_127;
			b_127 = r_127;
			r_127 = a_127 % b_127;
		}

		return b_127;
	}

	// ham kiem tra phan so toi gian hay chua
	public boolean kiemTraToiGian() {
		if (timUSCLN(tuSo_127, mauSo_127) == 1) {
			return true;
		}
		return false;
	}

	// ham toi gian
	public void toiGianPS() {
		int x_127 = timUSCLN(tuSo_127, mauSo_127);

		tuSo_127 /= x_127;
		mauSo_127 /= x_127;
	}
}

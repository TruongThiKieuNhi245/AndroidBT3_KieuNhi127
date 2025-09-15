package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
	// thuoc tinh
	private ArrayList<CanBo> dscb_127;

	// phuong thuc
	// ham khoi tao
	public QLCB() {
		dscb_127 = new ArrayList<CanBo>(10);
	}

	// ham them can bo
	public void themCanBo(CanBo cb_127) {
		dscb_127.add(cb_127);
	}

	// ham nhap danh sach
	public void nhapDanhSach(Scanner sc_127) {
		CanBo cb_127;
		System.out.print("Nhap vao so luong can bo: ");
		int n_127 = sc_127.nextInt();
		sc_127.nextLine();

		System.out.println("Nhap thong tin chi tiet:");
		for (int i_127 = 0; i_127 < n_127; i_127++) {
			System.out.println("Lan nhap thu " + (i_127 + 1) + ":");
			System.out.print("Chon can bo (1-KySu; 2-NhanVien;3-CongNhan): ");
			int chon_127 = sc_127.nextInt();
			sc_127.nextLine();

			cb_127 = new CanBo();

			switch (chon_127) {
			case 1:
				cb_127 = new KySu();
				break;
			case 2:
				cb_127 = new NhanVien();
				break;
			case 3:
				cb_127 = new CongNhan();
				break;

			default:
				cb_127 = new KySu();
				break;
			}

			// sau khi chon loai can bo thi nhap thong tin cho can bo do
			cb_127.nhapThongTin(sc_127);

			// nhap xong roi thi them can bo vao danh sach
			themCanBo(cb_127);
		}
	}

	// ham tim kiem theo ten
	public void timKiemCanBo(String hoTen_127) {
		for (CanBo cb_127 : dscb_127) {
			if (hoTen_127.equals(cb_127.getHoTen())) {
				cb_127.hienThiThongTin();
			}
		}
	}
}

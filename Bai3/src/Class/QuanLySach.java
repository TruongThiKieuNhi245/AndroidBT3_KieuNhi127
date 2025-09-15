package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
	// thuoc tinh
	private ArrayList<TaiLieu> dstl_127;

	// phuong thuc
	// ham khoi tao
	public QuanLySach() {
		dstl_127 = new ArrayList<TaiLieu>(10);
	}

	// them moi 1 tai lieu
	public void themTaiLieu(TaiLieu tl_127) {
		dstl_127.add(tl_127);
	}

	// nhap danh sach tai lieu
	public void nhapDanhSachTL(Scanner sc_127) {
		int chon_127;
		String stop_127;
		TaiLieu tl_127;

		do {
			System.out.print("Chon loai tai lieu (1-Sach; 2-TapChi; 3-Bao): ");
			chon_127 = sc_127.nextInt();
			sc_127.nextLine();

			switch (chon_127) {
			case 1:
				tl_127 = new Sach();
				break;
			case 2:
				tl_127 = new TapChi();
				break;
			case 3:
				tl_127 = new Bao();
				break;

			default:
				tl_127 = new Sach();
				break;
			}

			tl_127.nhapThongTin(sc_127);
			themTaiLieu(tl_127);

			System.out.print("\nBan co muon nhap vao nua hay khong (c/k): ");
			stop_127 = sc_127.nextLine();
		} while (stop_127.equals("c"));
	}

	// tim kiem theo ma tai lieu
	public void timMaTL(String maTL_127) {
		for (TaiLieu tl_127 : dstl_127) {
			if (maTL_127.equals(tl_127.getMaTaiLieu())) {
				tl_127.hienThiThongTin();
			}
		}
	}

	// tim kiem theo loai tai lieu
	public void timLoaiTL(String loai_127) {
		for (TaiLieu tl_127 : dstl_127) {
			if (loai_127.equals("Sach") && (tl_127 instanceof Sach)) {
				tl_127.hienThiThongTin();
			} else if (loai_127.equals("TapChi") && (tl_127 instanceof TapChi)) {
				tl_127.hienThiThongTin();
			} else if (loai_127.equals("Bao") && (tl_127 instanceof Bao)) {
				tl_127.hienThiThongTin();
			}
		}
	}
}

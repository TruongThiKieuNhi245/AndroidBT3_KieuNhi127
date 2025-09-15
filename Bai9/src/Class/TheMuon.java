package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
	// thuoc tinh
	private int soMuon_127;
	private Date ngayMuon_127;
	private Date hanTra_127;
	private String soHieu_127;

	// phuong thuc
	// ham khoi tao khong doi so
	public TheMuon() {

	}

	// ham khoi tao co doi so
	public TheMuon(int soMuon_127, Date ngayMuon_127, String soHieu_127) {
		this.soMuon_127 = soMuon_127;
		this.ngayMuon_127 = ngayMuon_127;
		this.soHieu_127 = soHieu_127;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_127) {
		super.nhapThongTin(sc_127);

		System.out.print("\tNhap so muon: ");
		soMuon_127 = sc_127.nextInt();
		sc_127.nextLine();

		System.out.print("\tNhap ngay muon: ");
		String strNgayMuon_127 = sc_127.nextLine();
		ngayMuon_127 = strToDate(strNgayMuon_127);

		String strNgayTra_127 = "31-12-2020";
		hanTra_127 = strToDate(strNgayTra_127);

		System.out.println("\tNhap so hieu: ");
		soHieu_127 = sc_127.nextLine();
	}

	private Date strToDate(String strNgayMuon_127) {
		Date date_127 = null;

		SimpleDateFormat sdf_127 = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date_127 = sdf_127.parse(strNgayMuon_127);
		} catch (ParseException e_127) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date_127;
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo phieu muon: " + soMuon_127);
		System.out.println("\tNgay muon: " + ngayMuon_127);
		System.out.println("\tHan tra: " + hanTra_127);
		System.out.println("\tSo hieu: " + soHieu_127);
	}

	// ham lay ra thong tin ve han tra
	public Date getHanTra() {
		return hanTra_127;
	}
}

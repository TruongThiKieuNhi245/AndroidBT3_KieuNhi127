package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen_127;
	protected Date ngaySinh_127;
	protected int CMND_127;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen_127, Date ngaySinh_127, int CMND_127) {
		this.hoTen_127 = hoTen_127;
		this.ngaySinh_127 = ngaySinh_127;
		this.CMND_127 = CMND_127;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_127) {
		System.out.print("\tNhap ho ten: ");
		hoTen_127 = sc_127.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate_127 = sc_127.nextLine();
		ngaySinh_127 = strToDate(strDate_127);
		System.out.print("\tNhap CMND: ");
		CMND_127 = sc_127.nextInt();
	}

	private Date strToDate(String strDate_127) {
		Date date_127 = null;
		SimpleDateFormat sdf_127 = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date_127 = sdf_127.parse(strDate_127);
		} catch (ParseException e_127) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date_127;
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_127);
		System.out.println("\tNgay sinh: " + ngaySinh_127);
		System.out.println("\tCMND: " + CMND_127);
	}

	// ham lay ra thong tin CMND
	public int getCMND() {
		return CMND_127;
	}
}

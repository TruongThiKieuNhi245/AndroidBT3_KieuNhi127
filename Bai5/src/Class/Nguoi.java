package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	private String hoTen_127;
	private Date ngaySinh_127;
	private String ngheNghiep_127;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen_127, Date ngaySinh_127, String ngheNghiep_127) {
		this.hoTen_127 = hoTen_127;
		this.ngaySinh_127 = ngaySinh_127;
		this.ngheNghiep_127 = ngheNghiep_127;
	}

	// nhap cac thong tung nguoi trong ho gia dinh
	public void nhapThongTin(Scanner sc_127) {
		System.out.print("\tNhap ho ten: ");
		hoTen_127 = sc_127.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate_127 = sc_127.nextLine();
		ngaySinh_127 = strToDate(strDate_127);
		System.out.print("\tNhap nghe nghiep: ");
		ngheNghiep_127 = sc_127.nextLine();
	}

	// ham thuc hien chuyen string sang date
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

	// hien thi ra tung nguoi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_127);
		System.out.println("\tNgay sinh: " + dateToString(ngaySinh_127));
		System.out.println("\tNghe nghiep: " + ngheNghiep_127);
	}

	// ham chuyen dinh dang tu date sang String
	private String dateToString(Date date_127) {
		SimpleDateFormat sdf_127 = new SimpleDateFormat("dd-MM-yyyy");
		String strDate_127 = sdf_127.format(date_127);
		return strDate_127;
	}

	// ham lay thong tin ve ngay sinh
	public Date getNgaySinh() {
		return ngaySinh_127;
	}
}

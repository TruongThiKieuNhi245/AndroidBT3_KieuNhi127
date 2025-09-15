package Class;

import java.util.Scanner;

public class NhanVien extends CanBo {
// thuoc tinh
private String congViec_127;

// phuong thuc
// ham khoi tao khong doi so
public NhanVien() {

}

// ham khoi tao co doi so
public NhanVien(String hoten_127, String ngaySinh_127, String gioiTinh_127, String diaChi_127, String congViec_127) {
	super(hoten_127, ngaySinh_127, gioiTinh_127, diaChi_127);
	this.congViec_127 = congViec_127;
}

// ham nhap
public void nhapThongTin(Scanner sc_127) {
	super.nhapThongTin(sc_127);
	System.out.print("\tNhap cong viec: ");
	congViec_127 = sc_127.nextLine();
}

// ham hien thi
public void hienThiThongTin() {
	super.hienThiThongTin();
	System.out.println("\tCong viec: " + congViec_127);
}


}
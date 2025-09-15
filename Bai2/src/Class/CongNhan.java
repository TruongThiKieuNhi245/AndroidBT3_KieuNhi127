package Class;

import java.util.Scanner;

public class CongNhan extends CanBo {
// thuoc tinh
private String bac_127;

// phuong thuc
// ham khoi tao khong doi so
public CongNhan() {

}

// ham khoi tao co doi so
public CongNhan(String hoten_127, String ngaySinh_127, String gioiTinh_127, String diaChi_127, String bac_127) {
	super(hoten_127, ngaySinh_127, gioiTinh_127, diaChi_127);
	this.bac_127 = bac_127;
}

// ham nhap
public void nhapThongTin(Scanner sc_127) {
	super.nhapThongTin(sc_127);
	System.out.print("\tNhap bac: ");
	bac_127 = sc_127.nextLine();
}

// ham hien thi thong tin
public void hienThiThongTin() {
	super.hienThiThongTin();
	System.out.println("\tBac: " + bac_127);
}


}
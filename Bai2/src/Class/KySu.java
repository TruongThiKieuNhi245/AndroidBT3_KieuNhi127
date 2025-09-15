package Class;

import java.util.Scanner;

public class KySu extends CanBo {
// thuoc tinh
private String nganhDaoTao_127;

// phuong thuc
// ham khoi tao khong doi so
public KySu() {

}

// ham khoi tao co doi so
public KySu(String hoten_127, String ngaySinh_127, String gioiTinh_127, String diaChi_127, String nganhDaoTao_127) {
	super(hoten_127, ngaySinh_127, gioiTinh_127, diaChi_127);
	this.nganhDaoTao_127 = nganhDaoTao_127;
}

// ham nhap
public void nhapThongTin(Scanner sc_127) {
	super.nhapThongTin(sc_127);
	System.out.print("\tNhap nganh dao tao: ");
	nganhDaoTao_127 = sc_127.nextLine();
}

// ham hien thi
public void hienThiThongTin() {
	super.hienThiThongTin();
	System.out.println("\tNganh dao tao: " + nganhDaoTao_127);
}


}
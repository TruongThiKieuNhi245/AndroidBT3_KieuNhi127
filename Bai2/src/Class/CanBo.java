package Class;

import java.util.Scanner;

public class CanBo {
// thuoc tinh
private String hoTen_127;
private String ngaySinh_127;
private String gioiTinh_127;
private String diaChi_127;

// phuong thuc
// ham khoi tao khong doi so
public CanBo() {

}

// ham khoi tao co doi so
public CanBo(String hoten_127, String ngaySinh_127, String gioiTinh_127, String diaChi_127) {
	this.hoTen_127 = hoten_127;
	this.ngaySinh_127 = ngaySinh_127;
	this.gioiTinh_127 = gioiTinh_127;
	this.diaChi_127 = diaChi_127;
}

// ham nhap
public void nhapThongTin(Scanner sc_127) {
	System.out.print("\tNhap ho ten: ");
	hoTen_127 = sc_127.nextLine();
	System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
	ngaySinh_127 = sc_127.nextLine();
	System.out.print("\tNhap gioi tinh: ");
	gioiTinh_127 = sc_127.nextLine();
	System.out.print("\tNhap dia chi: ");
	diaChi_127 = sc_127.nextLine();
}

// ham hien thi
public void hienThiThongTin() {
	System.out.println("\tHo ten: " + hoTen_127);
	System.out.println("\tNgay sinh: " + ngaySinh_127);
	System.out.println("\tGioi tinh: " + gioiTinh_127);
	System.out.println("\tDia chi: " + diaChi_127);
}

// ham lay thong tin ho ten
public String getHoTen() {
	return this.hoTen_127;
}


}
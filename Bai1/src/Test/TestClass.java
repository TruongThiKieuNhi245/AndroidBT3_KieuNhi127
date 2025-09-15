package Test;

import java.util.Scanner;
import Class.PhanSo;

public class TestClass {

    public static void main(String[] args) {
        Scanner sc_127 = new Scanner(System.in);
        PhanSo ps1_127 = new PhanSo();
        PhanSo ps2_127 = new PhanSo();
        PhanSo psTong_127 = new PhanSo();
        
        // nhập phân số
        System.out.println("Nhap vao phan so thu nhat:");
        ps1_127.nhapPS(sc_127);
        System.out.println("Nhap vao phan so thu hai:");
        ps2_127.nhapPS(sc_127);
        
        // tính tổng 2 phân số
        psTong_127 = ps1_127.congPS(ps2_127);
        
        // hiển thị phân số
        System.out.println("\nPhan so thu nhat la:");
        ps1_127.hienThiPS();
        System.out.println("\nPhan so thu hai la:");
        ps2_127.hienThiPS();
        System.out.println("\nPhan so tong la:");
        psTong_127.hienThiPS();
        
        sc_127.close();
    }
}

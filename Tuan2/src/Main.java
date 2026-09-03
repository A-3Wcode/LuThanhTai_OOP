import  java.util.Scanner;
public static void main() {
    SinhVien sv1 = new SinhVien(11111, "Nguyen Thanh An", 6.5, 8.5);
    SinhVien sv2 = new SinhVien(22222, "Le Thi Bong", 7.5, 8.0 );
    SinhVien sv3 = new SinhVien();
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap ma sinh vien: ");
    int maSV = sc.nextInt();

    sc.nextLine();

    System.out.print("Nhap ho ten: ");
    String hoTen = sc.nextLine();

    System.out.print("Nhap diem ly thuyet: ");
    double diemLT = sc.nextDouble();

    System.out.print("Nhap diem thuc hanh: ");
    double diemTH = sc.nextDouble();

    sv3.setMaSV(maSV);
    sv3.setHoTen(hoTen);
    sv3.setDiemLT(diemLT);
    sv3.setDiemTH(diemTH);
    sc.close();

    System.out.printf("%-10s %-25s %-10s %-10s %-10s\n",
            "Ma SV", "Ho Ten", "Diem LT", "Diem TH", "Diem TB");
    System.out.println(sv1);
    System.out.println(sv2);
    System.out.println(sv3);
}

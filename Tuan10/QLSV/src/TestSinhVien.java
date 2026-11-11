public class TestSinhVien {
    public static void main(String[] args) {
        ListSinhVien dsSV = new ListSinhVien();
        // Tạo sinh viên
        SinhVien sv1 = new SinhVienChinhQui("SV01", "An");
        SinhVien sv2 = new SinhVienTuXa("SV02", "Binh");

        // Thêm môn học cho sinh viên An
        sv1.themMonHoc(MonHoc.JAVA);
        sv1.themMonHoc(MonHoc.OOP);

        // Thêm môn học cho sinh viên Binh
        sv2.themMonHoc(MonHoc.PYTHON);
        sv2.themMonHoc(MonHoc.CSDL);

        dsSV.them(sv1);
        dsSV.them(sv2);
        dsSV.hienThi();
        SinhVien testTK = dsSV.timKiem("sv01");
        if(testTK == null){
            System.out.println("Khong tim thay sinh vien sv1");
        }else {
            System.out.println("Tim thay sinh vien sv1");
            System.out.printf("MaSV: %-15s | TenSV: %-15s | HocPhi: %.0f%n",
                    testTK.getMaSV(), testTK.getHoTen(), testTK.thanhTien());
        }

        if (dsSV.xoa("SV01")) {
            System.out.println("Xoa thanh cong");
        } else {
            System.out.println("Khong tim thay sinh vien de xoa");
        }

        dsSV.hienThi();
    }
}
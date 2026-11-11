public class SinhVienTuXa extends SinhVien{
    public SinhVienTuXa(String maSV, String hoTen) {
        super(maSV, hoTen);
    }

    @Override
    public double thanhTien() {
        return super.thanhTien() * 0.9;
    }
}

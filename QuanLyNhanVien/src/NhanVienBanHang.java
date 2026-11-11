public class NhanVienBanHang extends NhanVien{
    private double doanhSo;
    private double hoaHong;

    public NhanVienBanHang(String maNV, String hoTen, double luongCoBan, double doanhSo, double hoaHong){
        super(maNV, hoTen, luongCoBan);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    @Override
    public double tinhLuong(){
        return luongCoBan + (doanhSo*hoaHong);
    }
}

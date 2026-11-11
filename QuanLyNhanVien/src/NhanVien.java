public class NhanVien {
    protected String maNV;
    protected String hoTen;
    protected double luongCoBan;

    public NhanVien(String maNV, String hoTen, double luongCoBan){
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
    }

    public double tinhluong(){
        return luongCoBan;
    }

    public void hienThiThongTin(){
        System.out.println("Ma nhan vien: " + maNV);
        System.out.println("Ho ten nhan vien: " + hoTen);
        System.out.println("Luong nhan vien: " + luongCoBan);
    }
}

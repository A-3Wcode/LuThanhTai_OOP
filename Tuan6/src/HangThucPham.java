import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
    private String maHang;
    private String tenHang;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;
    private double gia;

    public HangThucPham(){
        this("000", "Chua Xac Dinh", LocalDate.now(), LocalDate.now().plusDays(7), 1.0);
    }

    public HangThucPham(String maHang, String tenHang, LocalDate ngaySanXuat, LocalDate ngayHetHan, double gia){
        setMaHang(maHang);
        setTenHang(tenHang);
        setNgaySanXuat(ngaySanXuat);
        setNgayHetHan(ngayHetHan);
        setGia(gia);
    }

    public String getMaHang() {return maHang;}
    public void setMaHang(String maHang) {
        this.maHang = (maHang != null && !maHang.trim().isEmpty()) ? maHang : "000";
    }

    public String getTenHang() {return tenHang;}
    public void setTenHang(String tenHang) {
        this.tenHang = (tenHang != null && !tenHang.trim().isEmpty()) ? tenHang : "000";
    }

    public LocalDate getNgaySanXuat() {return ngaySanXuat;}
    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        this.ngaySanXuat = (ngaySanXuat != null) ? ngaySanXuat : LocalDate.now();
    }

    public LocalDate getNgayHetHan() {return ngayHetHan;}
    public void setNgayHetHan(LocalDate ngayHetHan) {
        if (ngayHetHan != null && ngayHetHan.isAfter(this.ngaySanXuat)){
            this.ngayHetHan = ngayHetHan;
        }else{
            this.ngayHetHan = this.ngaySanXuat.plusDays(7);
        }
    }

    public double getGia() {return gia;}
    public void setGia(double gia) {
        this.gia = (gia > 0) ? gia : 0;
    }

    public boolean kiemTraHetHan(){
        return  ngayHetHan.isBefore(LocalDate.now());
    }

    public String trangThai(){
        return kiemTraHetHan() ? "Da het han" : "Con han";
    }

    @Override
    public String toString(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("TP[ %-5s | %-15s | NSX: %s | HSD: %s | %,10.2f VND| %s]",
                maHang, tenHang, ngaySanXuat.format(dtf), ngayHetHan.format(dtf), gia, trangThai());
    }
}

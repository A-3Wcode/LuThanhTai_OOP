import java.time.LocalDate;

public class GiaoDichNha extends GiaoDich {
    private String loaiNha; // "Cao cấp" hoặc "Thường"
    private String diaChi;

    public GiaoDichNha(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loaiNha, String diaChi) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public double thanhTien() {
        if ("Cao cấp".equalsIgnoreCase(loaiNha) || "Cao Cap".equalsIgnoreCase(loaiNha)) {
            return getDienTich() * getDonGia();
        }
        return getDienTich() * getDonGia() * 0.9;
    }

    @Override
    public String toString() {
        return String.format("[Giao Dich Nha] %s | Loai Nha: %s | Dia Chi: %s",
                super.toString(), loaiNha, diaChi);
    }
}
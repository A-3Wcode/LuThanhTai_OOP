import java.time.LocalDate;

public class GiaoDichDat extends GiaoDich {
    private String loaiDat;

    public GiaoDichDat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loaiDat) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    @Override
    public double thanhTien() {
        if ("A".equalsIgnoreCase(loaiDat)) {
            return getDienTich() * getDonGia() * 1.5;
        }
        return getDienTich() * getDonGia();
    }

    @Override
    public String toString() {
        return String.format("[Dat] %s | Loai Dat: %s", super.toString(), loaiDat);
    }
}
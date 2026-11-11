import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class GiaoDich {
    private String maGiaoDich;
    private LocalDate ngayGiaoDich;
    private double donGia;
    private double dienTich;

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = Math.max(0, donGia);
        this.dienTich = Math.max(0, dienTich);
    }

    public abstract double thanhTien();

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public LocalDate getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = Math.max(0, donGia);
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = Math.max(0, dienTich);
    }

    @Override
    public String toString() {
        return String.format(
                "Ma: %-5s | Ngay: %s | DonGia: %,.2f | DienTich: %,.2f | ThanhTien: %,.2f",
                maGiaoDich, ngayGiaoDich.format(DATE_FORMATTER), donGia, dienTich, thanhTien()
        );
    }
}
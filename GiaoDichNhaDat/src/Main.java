import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GiaoDich> dsGiaoDich = new ArrayList<>();

        dsGiaoDich.add(new GiaoDichDat("GD001", LocalDate.of(2013, 9, 15), 1000, 100, "A"));
        dsGiaoDich.add(new GiaoDichDat("GD002", LocalDate.of(2013, 9, 20), 800, 150, "B"));
        dsGiaoDich.add(new GiaoDichDat("GD003", LocalDate.of(2013, 10, 5), 1200, 80, "C"));

        dsGiaoDich.add(new GiaoDichNha("GD004", LocalDate.of(2013, 9, 10), 2000, 120, "Cao cấp", "123 Nguyen Hue"));
        dsGiaoDich.add(new GiaoDichNha("GD005", LocalDate.of(2013, 8, 25), 1500, 90, "Thường", "456 Le Loi"));
        dsGiaoDich.add(new GiaoDichNha("GD006", LocalDate.of(2013, 9, 30), 1800, 110, "Cao cấp", "789 Tran Hung Dao"));

        System.out.println("=== DANH SÁCH TẤT CẢ GIAO DỊCH ===");
        for (GiaoDich gd : dsGiaoDich) {
            System.out.println(gd);
        }

        int soLuongDat = 0;
        int soLuongNha = 0;
        double tongTienDat = 0;

        for (GiaoDich gd : dsGiaoDich) {
            if (gd instanceof GiaoDichDat) {
                soLuongDat++;
                tongTienDat += gd.thanhTien();
            } else if (gd instanceof GiaoDichNha) {
                soLuongNha++;
            }
        }

        System.out.println("\n=== THỐNG KÊ ===");
        System.out.printf("Tổng số lượng giao dịch đất: %d\n", soLuongDat);
        System.out.printf("Tổng số lượng giao dịch nhà: %d\n", soLuongNha);

        // Tính trung bình thành tiền của giao dịch đất[cite: 1, 2]
        if (soLuongDat > 0) {
            double trungBinhTienDat = tongTienDat / soLuongDat;
            System.out.printf("Trung bình thành tiền giao dịch đất: %,.2f\n", trungBinhTienDat);
        } else {
            System.out.println("Không có giao dịch đất nào.");
        }

        // Xuất giao dịch tháng 9/2013[cite: 1, 2]
        System.out.println("\n=== CÁC GIAO DỊCH THÁNG 9/2013 ===");
        for (GiaoDich gd : dsGiaoDich) {
            LocalDate ngay = gd.getNgayGiaoDich();
            if (ngay.getYear() == 2013 && ngay.getMonthValue() == 9) {
                System.out.println(gd);
            }
        }
    }
}
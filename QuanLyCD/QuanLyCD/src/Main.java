public class Main {
    public static void main(String[] args) {
        CDList ds = new CDList(3); // Khởi tạo mảng ban đầu có sức chứa 3 để test tự động expand

        System.out.println("=== 1. THÊM CÁC ĐỐI TƯỢNG CD ===");
        CD cd1 = new CD(101, "Nhạc Trịnh Cổ Điển", 12, 150000);
        CD cd2 = new CD(102, "Tuyệt Phẩm Nhạc Vàng", 15, 200000);
        CD cd3 = new CD(103, "Nhạc Trẻ Hot Hits", 10, 120000);
        CD cd4 = new CD(104, "Tình Ca Trịnh Công Sơn", 8, 200000); // Cùng giá 200k với cd2 để test sắp xếp tựa
        CD cd5 = new CD(101, "Nhạc Trùng Mã", 5, 50000); // Trùng mã 101 -> Sẽ thất bại

        System.out.println("Thêm cd1 (101): " + ds.add(cd1));
        System.out.println("Thêm cd2 (102): " + ds.add(cd2));
        System.out.println("Thêm cd3 (103): " + ds.add(cd3));
        System.out.println("Thêm cd4 (104 - Kích hoạt expand mảng): " + ds.add(cd4));
        System.out.println("Thêm cd5 (101 - Trùng mã): " + ds.add(cd5));

        System.out.println("\n=== DANH SÁCH BAN ĐẦU ===");
        ds.inDanhSach();

        System.out.println("\n=== 2. THỐNG KÊ ===");
        System.out.println("Tổng giá thành: " + String.format("%,.0f VND", ds.getTongGiaThanh()));
        System.out.println("Giá trung bình: " + String.format("%,.0f VND", ds.getTBGia()));
        System.out.println("CD đắt nhất: " + ds.getCDDatNhat().getTuaCD());
        System.out.println("CD rẻ nhất: " + ds.getCDReNhat().getTuaCD());

        System.out.println("\n=== 3. TÌM KIẾM TỰA CD ===");
        System.out.println("--> Tìm bắt đầu bằng 'nhạc':");
        ds.searchByTitleStartsWith("nhạc").inDanhSach();

        System.out.println("--> Tìm kết thúc bằng 'sơn':");
        ds.searchByTitleEndsWith("sơn").inDanhSach();

        System.out.println("--> Tìm gần giống chứa 'trịnh':");
        ds.searchByTitleContains("trịnh").inDanhSach();

        System.out.println("\n=== 4. SẮP XẾP (Giá giảm dần, Tựa tăng dần) ===");
        ds.sapXep();
        ds.inDanhSach();

        System.out.println("\n=== 5. XÓA CD THEO MÃ ===");
        System.out.println("Xóa CD mã 102: " + ds.remove(102));
        System.out.println("Xóa CD mã 999 (không tồn tại): " + ds.remove(999));

        System.out.println("\n=== DANH SÁCH SAU KHI XÓA ===");
        ds.inDanhSach();
    }
}
public class QuanLyThucPham {
    private HangThucPham[] danhSach;
    private int soLuong;

    public QuanLyThucPham(int capacity){
        int size =  (capacity > 0) ? capacity : 1;
        this.danhSach = new HangThucPham[size];
        this.soLuong = 0;
    }
    private void ensureCapacity(){
        if(soLuong >= danhSach.length){
            HangThucPham[] newArr = new HangThucPham[danhSach.length * 2];
            System.arraycopy(danhSach, 0, newArr, 0, soLuong);
            danhSach = newArr;
        }
    }

    public HangThucPham timkiemTheoMa(String maHang){
        for(int i = 0; i < soLuong; i++){
            if(danhSach[i].getMaHang().equalsIgnoreCase(maHang)){
                return danhSach[i];
            }
        }
        return null;
    }

    public boolean them(HangThucPham tp){
        if(tp == null || timkiemTheoMa(tp.getMaHang()) != null) return false;
        ensureCapacity();
        danhSach[soLuong++] = tp;
        return true;
    }

    public boolean xoa(String maHang){
        for (int i = 0; i < soLuong; i++){
            if(danhSach[i].getMaHang().equalsIgnoreCase(maHang)){
                for (int j = i; j < soLuong; j++){
                    danhSach[j] = danhSach[j+1];
                }
                danhSach[--soLuong] = null;
                return true;
            }
        }
        return false;
    }

    public boolean sua(HangThucPham tpMoi){
        if (tpMoi == null) return false;
        HangThucPham found = timkiemTheoMa(tpMoi.getMaHang());
        if(found != null){
            found.setTenHang(tpMoi.getTenHang());
            found.setNgaySanXuat(tpMoi.getNgaySanXuat());
            found.setNgayHetHan(tpMoi.getNgayHetHan());
            found.setGia(tpMoi.getGia());
            return true;
        }
        return false;
    }

}

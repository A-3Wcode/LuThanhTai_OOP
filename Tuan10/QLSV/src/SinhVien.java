import java.util.ArrayList;

public class SinhVien {
    protected String maSV;
    protected String hoTen;
    protected ArrayList<MonHoc> dsMonHoc;

    public SinhVien(String maSV, String hoTen) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.dsMonHoc = new ArrayList<MonHoc>();
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean themMonHoc(MonHoc mh){
        return dsMonHoc.add(mh);
    }

    public double thanhTien(){
        double tong = 0;
        for(MonHoc mh : dsMonHoc){
            tong += mh.getDonGia();
        }
        return tong;
    }
}

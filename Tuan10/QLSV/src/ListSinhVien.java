import java.util.ArrayList;

public class ListSinhVien implements IFSinhVien{
    private ArrayList<SinhVien> dsSV;

    public ListSinhVien() {
        this.dsSV = new ArrayList<SinhVien>();
    }

    @Override
    public boolean them(SinhVien sv) {
        return dsSV.add(sv);
    }

    @Override
    public boolean xoa(String maSV) {
        SinhVien sv = timKiem(maSV);

        if (sv == null) {
            return false;
        }

        return dsSV.remove(sv);
    }

    @Override
    public SinhVien timKiem(String maSV) {
        for(SinhVien sv: dsSV){
            if (sv.getMaSV().equalsIgnoreCase(maSV)){
                return sv;
            }
        }
        return null;
    }

    @Override
    public void hienThi() {
        if(dsSV.isEmpty()){
            System.out.println("Danh Sach Rong!");
            return;
        }
        for (SinhVien sv : dsSV){
            System.out.printf("MaSV: %-15s | TenSV: %-15s | HocPhi: %.0f%n",
                    sv.getMaSV(), sv.getHoTen(), sv.thanhTien());
        }
    }
}

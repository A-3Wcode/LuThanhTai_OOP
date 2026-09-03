public class SinhVien {
    private int maSV;
    private String hoTen;
    private double diemLT;
    private double diemTH;

    public SinhVien(){
        this(0, "", 0.0, 0.0);
    }

    public SinhVien(int maSV, String hoTen, double diemLT, double diemTH) {
        setMaSV(maSV);
        setHoTen(hoTen);
        setDiemLT(diemLT);
        setDiemTH(diemTH);
    }
    public int getMaSV(){
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = (maSV > 0) ? maSV : 0;
    }

    public String getHoTen(){
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = (hoTen != null && !hoTen.trim().isEmpty()) ? hoTen : "Chua xac dinh";
    }

    public double getDiemLT(){
        return diemLT;
    }

    public void setDiemLT(double diemLT) {
        this.diemLT = (diemLT >= 0.0 && diemLT <= 10.0) ? diemLT : 0.0;
    }

    public double getDiemTH(){
        return diemTH;
    }

    public void setDiemTH(double diemTH) {
        this.diemTH = (diemTH >= 0.0 && diemTH <= 10.0) ? diemTH : 0.0;
    }

    public double diemTB(){
        return (diemLT+diemTH)/2;
    }

    @Override
    public String toString() {
        return String.format("%-10d %-25s %-10.2f %-10.2f %-10.2f",
                maSV, hoTen, diemLT, diemTH, diemTB());
    }

}

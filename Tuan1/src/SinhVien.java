public class SinhVien {
    // Thuoc tinh
    private String maSV;
    private String hoTen;
    private  double diemTB;

    // Constructor
    public SinhVien(String maSV, String hoTen, double diemTB){
        this.maSV = maSV;
        this.hoTen = hoTen;
        setDiemTB(diemTB);
    }

    // Getters va Setters
    public String getMaSV(){
        return maSV;
    }

    public void  setMaSV(String maSV){
        this.maSV = maSV;
    }

    public String getHoTen(){
        return hoTen;
    }

    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }

    public double getDiemTB(){
        return diemTB;
    }

    public void setDiemTB(double diemTB){
        if (diemTB >= 0.0 && diemTB <= 10.0){
            this.diemTB = diemTB;
        }else {
            System.out.println("Khong hop le!");
        }
    }

    // Phuong thuc
    public String xepLoai(){
        if(this.diemTB >= 8.0){
            return "Gioi";
        } else if (this.diemTB >= 5.0) {
            return "Kha";
        }else {
            return "Trung Binh";
        }
    }

    public void hienThiThongTinh(){
        System.out.println("Ma SV: " + maSV);
        System.out.println("Ho Ten: " + hoTen);
        System.out.println("Diem TB: " + diemTB);
        System.out.println("Xep loai: " + xepLoai());
    }
}

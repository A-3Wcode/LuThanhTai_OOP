public class PhanSo {
    // Thuoc tinh
    private int tuSo;
    private int mauSo;

    // Constructor
    public PhanSo(int tuSo, int mauSo){
        this.tuSo = tuSo;
        setKhacKhong(mauSo);
    }

    // Getter va Setter
    public int getTuSo(){
        return tuSo;
    }

    public int getMauSo(){
        return mauSo;
    }

    public void setKhacKhong(int mauSo){
        if (mauSo == 0){
            System.out.println("Loi");
        }else {
            this.mauSo = mauSo;
        }
    }

    // Phuong thuc
    public int UCLN(int x, int y){
        while (y != 0){
            int tam = x%y;
            x = y;
            y = tam;
        }
        return x;
    }

    public void rutGon(){
        int ucln = UCLN(tuSo, mauSo);
        this.tuSo = tuSo/ucln;
        this.mauSo = mauSo/ucln;
    }

    public PhanSo cong(PhanSo psKhac) {
        int tuMoi = (this.tuSo * psKhac.getMauSo() + psKhac.getTuSo() * this.mauSo);
        int mauMoi = (this.mauSo * psKhac.getMauSo());
        PhanSo psKetQua = new PhanSo(tuMoi, mauMoi);
        psKetQua.rutGon();
        return psKetQua;
    }

    public void hienThi(){
        System.out.println(tuSo + "/" + mauSo);
    }
}

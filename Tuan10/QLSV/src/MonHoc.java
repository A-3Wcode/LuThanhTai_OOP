public enum MonHoc {
    JAVA(150),
    PYTHON(200),
    CSDL(150),
    CAU_TRUC_DU_LIEU(200),
    MANG_MAY_TINH(100),
    HE_DIEU_HANH(200),
    OOP(250),
    THIET_KE_WEB(100);

    private final double donGia;

    MonHoc(double donGia) {
        this.donGia = donGia;
    }

    public double getDonGia() {
        return donGia;
    }

}

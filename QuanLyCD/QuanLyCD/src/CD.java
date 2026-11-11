public class CD {
    private int maCD;
    private String tuaCD;
    private int soBaiHat;
    private double giaThanh;

    public CD() {
        this(999999, "Chua xac dinh", 1, 1);
    }

    public int getMaCD() {
        return maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setMaCD(int maCD) {
        this.maCD = (maCD > 0) ? maCD : 999999;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = (tuaCD != null && !tuaCD.trim().isEmpty()) ? tuaCD : "Chua xac dinh";
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = (soBaiHat > 0) ? soBaiHat : 1;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = (giaThanh > 0) ? giaThanh : 1;
    }

    public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
       setMaCD(maCD);
       setTuaCD(tuaCD);
       setSoBaiHat(soBaiHat);
       setGiaThanh(giaThanh);
    }

    @Override
    public String toString() {
        return String.format("| %-10d | %-35s | %-10d | %12.3f |", maCD, tuaCD, soBaiHat, giaThanh);
    }
}

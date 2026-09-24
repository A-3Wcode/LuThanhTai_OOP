public class CD {
    // Attribute
    private int maCD;
    private String tuaCD;
    private int soBaiHat;
    private double giaThanh;

    // Default Constructor
    public CD (){
        this(999999, "chua xac dinh", 1, 1.0);
    }

    // Constructor
    public CD (int maCD, String tuaCD, int soBaiHat, double giaThanh){
        setMaCD(maCD);
        setTuaCD(tuaCD);
        setSoBaiHat(soBaiHat);
        setGiaThanh(giaThanh);
    }

    // Getter/Setter
    public int getMaCD(){
        return maCD;
    }

    public void setMaCD(int maCD){
        if(maCD > 0) this.maCD = maCD;
        else this.maCD = 999999;
    }

    public String getTuaCD(){
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        if (tuaCD != null && !tuaCD.trim().isEmpty()) {
            this.tuaCD = tuaCD;
        } else {
            this.tuaCD = "chua xac dinh";
        }
    }

    public int getSoBaiHat(){
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = (soBaiHat > 0) ? soBaiHat : 1;
    }

    public double getGiaThanh(){
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = (giaThanh > 0) ? giaThanh : 1.0;
    }

    // Method
    @Override
    public String toString() {
        return String.format("CD[%d - %s - %d bai - %.2f VNĐ]",
                maCD, tuaCD, soBaiHat, giaThanh);
    }
}

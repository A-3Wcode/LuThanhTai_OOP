public class CDList {
    private CD[] list;
    private int soLuong;

    // Mang nguyen thuy
    public CDList(int capacity){
        this.list = new CD[capacity > 0 ? capacity : 10];
        this.soLuong = 0;
    }

    public CDList(){
        this(10);
    }

    // Mo rong kich thuong khi day
    private void expand(){
        if (this.list.length == this.soLuong){
            CD[] newList = new CD[this.list.length * 2];
            System.arraycopy(this.list, 0, newList, 0, this.soLuong);
            this.list = newList;
        }
    }

    // Kiem tra trung ma
    public CD findByMa(int maCD){
        for(int i = 0; i < this.soLuong; i++){
            if(this.list[i].getMaCD() == maCD){
                return this.list[i];
            }
        }
        return null;
    }

    public int findIndex(int maCD){
        for(int i = 0; i < this.soLuong; i++){
            if(this.list[i].getMaCD() == maCD){
                return i;
            }
        }
        return -1;
    }

    // Them CD
    public boolean add(CD cd){
        if (cd != null && findByMa(cd.getMaCD()) == null){
            expand();
            this.list[soLuong++] = cd;
            return true;
        } else return false;
    }

    // Xoa CD
    public boolean remove(int maCD){
        int index = findIndex(maCD);
        if(index != -1){
            for (int i = index; i < soLuong - 1; i++){
                this.list[i] = this.list[i+1];
            }
            list[--soLuong] = null;
            return true;
        }
        return false;
    }

    // Tim kiem theo 3 che do
    public CDList searchByTitleContains(String keyword){
        CDList result = new CDList();
        for(int i = 0; i < soLuong; i++){
            if(this.list[i].getTuaCD().toLowerCase().contains(keyword.toLowerCase())){
                result.add(list[i]);
            }
        }
        return result;
    }

    public CDList searchByTitleStartsWith(String keyword){
        CDList result = new CDList();
        for(int i = 0; i < soLuong; i++){
            if(this.list[i].getTuaCD().toLowerCase().startsWith(keyword.toLowerCase())){
                result.add(list[i]);
            }
        }
        return result;
    }

    public CDList searchByTitleEndsWith(String keyword){
        CDList result = new CDList();
        for(int i = 0; i < soLuong; i++){
            if(this.list[i].getTuaCD().toLowerCase().endsWith(keyword.toLowerCase())){
                result.add(list[i]);
            }
        }
        return result;
    }

    public CD getCDDatNhat(){
        if(soLuong == 0) return null;
        CD max = list[0];
        for(int i = 1; i < soLuong; i++){
            if(this.list[i].getGiaThanh() > max.getGiaThanh()){
                max = list[i];
            }
        }
        return max;
    }

    public CD getCDReNhat(){
        if(soLuong == 0) return null;
        CD min = list[0];
        for(int i = 1; i < soLuong; i++){
            if(this.list[i].getGiaThanh() < min.getGiaThanh()){
                min = list[i];
            }
        }
        return min;
    }

    public double getTongGiaThanh(){
        double sum = 0;
        for (int i = 0; i < soLuong; i++){
            sum += this.list[i].getGiaThanh();
        }
        return sum;
    }

    public double getTBGia(){
        if (soLuong == 0) return 0;
        return getTongGiaThanh() / soLuong;
    }

    public void sapXep(){
        for(int i = 0; i < soLuong -1 ; i++){
            for(int j = i+1; j < soLuong; j++){
                if(this.list[i].getGiaThanh() < this.list[j].getGiaThanh() ||
                        (this.list[i].getGiaThanh() == this.list[j].getGiaThanh() && this.list[i].getTuaCD().compareToIgnoreCase(this.list[j].getTuaCD()) > 0)){
                    CD temp = this.list[i];
                    this.list[i] = this.list[j];
                    this.list[j] = temp;
                }
            }
        }
    }

    public void inDanhSach() {
        if (soLuong == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        System.out.println("------------------------------------------------------------------");
        System.out.printf("| %-10s | %-35s | %-10s | %-12s |\n", "Mã CD", "Tựa CD", "Số bài", "Giá thành");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < soLuong; i++) {
            System.out.println(list[i]);
        }
        System.out.println("------------------------------------------------------------------");
    }
}

import java.util.Collections;

public class CDList {
    // Attribute
    private CD[] list;
    private int count;

    // Constructor
    public CDList(int capacity) {
        int size = (capacity > 0) ? capacity : 10;
        this.list = new CD[size];
        this.count = 0;
    }

    private void ensureCapacity() {
        if (count >= list.length){
            CD[] newList = new CD[list.length * 2];
            System.arraycopy(list, 0, newList, 0, count);
            list = newList;
        }
    }

    // Method
    public CD findById(int maCD) {
        for(int i = 0; i < count; i++){
            if(list[i].getMaCD() == maCD){
                return list[i];
            }
        }
        return null;
    }

    public boolean add(CD cd) {
        if (cd == null || findById(cd.getMaCD()) != null) {
            return false;
        }

        ensureCapacity();
        list[count++] = cd;
        return true;
    }

    public boolean remove(int maCD) {
        for(int i = 0; i < count; i++){
            if(list[i].getMaCD() == maCD){
                for(int j = i; j < count - 1; j++){
                    list[j] = list[j + 1];
                }
                list[--count] = null;
                return true;
            }
        }
        return false;
    }

    public boolean update(CD cd) {
        if (cd == null) return false;
        CD found = findById(cd.getMaCD());
        if (found != null) {
            found.setTuaCD(cd.getTuaCD());
            found.setSoBaiHat(cd.getSoBaiHat());
            found.setGiaThanh(cd.getGiaThanh());
            return true;
        }
        return false;
    }

    public CDList searchByTitle(String key, int mode) {
        CDList result = new CDList(count);
        if (key == null) return result;

        String k = key.toLowerCase();
        for (int i = 0; i < count; i++) {
            String title = list[i].getTuaCD().toLowerCase();
            boolean match = false;

            if (mode == 1) match = title.startsWith(k);
            else if (mode == 2) match = title.endsWith(k);
            else if (mode == 3) match = title.contains(k);

            if (match) {
                result.add(list[i]);
            }
        }
        return result;
    }

    public void printStats() {
        if (count == 0) {
            System.out.println("Danh sach trong!");
            return;
        }

        double sum = 0;
        double maxGia = list[0].getGiaThanh();
        double minGia = list[0].getGiaThanh();

        for (int i = 0; i < count; i++) {
            double gia = list[i].getGiaThanh();
            sum += gia;
            if (gia > maxGia) maxGia = gia;
            if (gia < minGia) minGia = gia;
        }

        double avg = sum / count;

        System.out.printf("So luong: %d | Tong: %.2f | TB: %.2f | Max: %.2f | Min: %.2f\n",
                count, sum, avg, maxGia, minGia);
    }
    public void sort() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {

                double g1 = list[i].getGiaThanh();
                double g2 = list[j].getGiaThanh();

                boolean uuTienGia = g1 < g2;

                boolean uuTienTua = (g1 == g2) && (list[i].getTuaCD().compareToIgnoreCase(list[j].getTuaCD()) > 0);

                if (uuTienGia || uuTienTua) {
                    CD temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}

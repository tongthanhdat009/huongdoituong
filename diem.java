public class diem {

    private float avgDiem;
    private String xeploai;
    private int namhoc;
    private int hocky;
    private monhoc[] monhoc;
    private int maHS;

    public diem(int maHS, int namhoc, int hocky, monhoc[] monhoc) {
        this.maHS = maHS;
        this.namhoc = namhoc;
        this.hocky = hocky;
        this.monhoc = monhoc;
        this.avgDiem = tinhDiemTB();
        this.xeploai = setXeploai();
    }

    public float getAvgDiem() {
        return avgDiem;
    }

    public void setAvgDiem(float avgDiem) {
        this.avgDiem = avgDiem;
    }

    public String getXeploai() {
        return xeploai;
    }

    public void setXeploai(String xeploai) {
        this.xeploai = xeploai;
    }

    public int getNamhoc() {
        return namhoc;
    }

    public void setNamhoc(int namhoc) {
        this.namhoc = namhoc;
    }

    public int getHocky() {
        return hocky;
    }

    public void setHocky(int hocky) {
        this.hocky = hocky;
    }

    public monhoc[] getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(monhoc[] monhoc) {
        this.monhoc = monhoc;
    }

    public int getMaHS() {
        return maHS;
    }

    public void setMaHS(int maHS) {
        this.maHS = maHS;
    }

    public float tinhDiemTB() {
        float tongdiem = 0;
        int somon = monhoc.length;
        for (int i = 0; i < somon; i++) {
            tongdiem += monhoc[i].getDiem();
        }
        return tongdiem / somon;
    }

    public String setXeploai() {
        if (avgDiem >= 9) {
            return "Xuat sac";
        } else if (avgDiem >= 8) {
            return "Gioi";
        } else if (avgDiem >= 6.5) {
            return "Kha";
        } else if (avgDiem >= 5) {
            return "Trung binh";
        } else if (avgDiem >= 3.5) {
            return "Yeu";
        } else {
            return "Kem";
        }
    }
    public String toString(){
        return "Hoc ky: "+getHocky()+"\t, Nam hoc: "+getNamhoc()+"\t, DTB: "+getAvgDiem()+"\t, Hoc luc: "+getXeploai();
    }
}

// Lớp điểm (diem)
public class diem {
    // Các thuộc tính của lớp điểm
    private float avgDiem; // Điểm trung bình
    private String xeploai; // Xếp loại học sinh
    private int namhoc; // Năm học
    private int hocky; // Học kỳ
    private monhoc[] monhoc; // Mảng các môn học
    private int maHS; // Mã học sinh

    // Phương thức khởi tạo lớp điểm
    public diem(int maHS, int namhoc, int hocky, monhoc[] monhoc) {
        this.maHS = maHS;
        this.namhoc = namhoc;
        this.hocky = hocky;
        this.monhoc = monhoc;
        this.avgDiem = tinhDiemTB(); // Tính điểm trung bình
        this.xeploai = setXeploai(); // Đặt xếp loại học sinh
    }

    // Các phương thức get và set cho các thuộc tính
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

    // Phương thức tính điểm trung bình
    public float tinhDiemTB() {
        float tongdiem = 0; // Tổng điểm của các môn học
        int somon = monhoc.length; // Số môn học
        for (int i = 0; i < somon; i++) {
            tongdiem += monhoc[i].getDiem(); // Cộng dồn điểm của từng môn học
        }
        return tongdiem / somon; // Trả về điểm trung bình
    }

    // Phương thức đặt xếp loại học sinh
    public String setXeploai() {
        if (avgDiem >= 9) {
            return "Xuat sac"; // Xếp loại xuất sắc nếu điểm trung bình từ 9 trở lên
        } else if (avgDiem >= 8) {
            return "Gioi"; // Xếp loại giỏi nếu điểm trung bình từ 8 đến dưới 9
        } else if (avgDiem >= 6.5) {
            return "Kha"; // Xếp loại khá nếu điểm trung bình từ 7 đến dưới 8
        } else if (avgDiem >= 5) {
            return "Trung binh"; // Xếp loại trung bình nếu điểm trung bình từ 6 đến dưới 7
        } else if (avgDiem >= 3.5) {
            return "Yeu"; // Xếp loại yếu nếu điểm trung bình từ 5 đến dưới 6
        } else {
            return "Kem"; // Xếp loại kém nếu điểm trung bình dưới 5
        }
    }
}

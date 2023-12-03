// Lớp môn học (monhoc)
public class monhoc {
    // Các thuộc tính của lớp môn học
    private String tenmon; // Tên môn học
    private float diem; // Điểm môn học
    private int mamon; // Mã môn học

    // Phương thức khởi tạo lớp môn học
    public monhoc(String tenmon, float diem, int mamon) {
        this.tenmon = tenmon;
        this.diem = diem;
        this.mamon = mamon;
    }

    // Các phương thức get và set cho các thuộc tính
    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public int getMamon() {
        return mamon;
    }

    public void setMamon(int mamon) {
        this.mamon = mamon;
    }
}

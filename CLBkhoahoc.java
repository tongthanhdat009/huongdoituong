public class CLBkhoahoc extends caulacbo {
    public CLBkhoahoc(){
        super.setMaCLB("CLBkhoahoc");
        super.setTenCLB("Cau lac bo khoa hoc");
        super.setCongViec("Nghien cuu de tai khoa hoc tai truong");
    }

    @Override
    public String toString() {
        return "maCLB: " + super.getMaCLB() + ", tenCLB: " + super.getTenCLB() + ", congviec: " + super.getCongViec();
    }
}

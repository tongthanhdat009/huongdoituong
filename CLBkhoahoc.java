public class CLBkhoahoc extends caulacbo {
    public CLBkhoahoc(){
        super();
        setCongViec("Nghien cuu de tai de tai khoa hoc");
    }
    public CLBkhoahoc(String maCLB, String tenCLB, String congviec){
        super.setTenCLB(tenCLB);
        super.setCongViec("Nghien cuu de tai khoa hoc");
        super.setMaCLB(maCLB);
    }
    @Override
    public String toString() {
        return "maCLB: " + getMaCLB() + ", tenCLB: " + getTenCLB() + ", congviec: " + getCongViec();
    }
}

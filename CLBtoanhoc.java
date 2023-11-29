public class CLBtoanhoc extends caulacbo {
    public CLBtoanhoc(){
        super();
        setCongViec("Nghien cuu de tai toan hoc");
    }
    public CLBtoanhoc(String maCLB, String tenCLB, String congviec){
        super.setTenCLB(tenCLB);
        super.setCongViec("Nghien cuu de tai toan hoc");
        super.setMaCLB(maCLB);
    }
    @Override
    public String toString() {
        return "maCLB: " + getMaCLB() + ", tenCLB: " + getTenCLB() + ", congviec: " + getCongViec();
    }
}

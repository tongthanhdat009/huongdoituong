public class CLBtoanhoc extends caulacbo {
    public CLBtoanhoc(){
        super.setMaCLB("CLBtoanhoc");
        super.setTenCLB("Cau lac bo toan hoc");
        super.setCongViec("Nghien cuu de tai toan hoc");
    }

    @Override
    public String toString() {
        return "maCLB: " + super.getMaCLB() + ", tenCLB: " + super.getTenCLB() + ", congviec: " + super.getCongViec();
    }
}

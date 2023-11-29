public class CLBamnhac extends caulacbo {
    public CLBamnhac(){
        super();
        setCongViec("Giao luu, tham gia van nghe khoa hoc");
    }
    public CLBamnhac(String maCLB, String tenCLB, String congviec){
        super.setTenCLB(tenCLB);
        super.setCongViec("Giao luu, tham gia van nghe khoa hoc");
        super.setMaCLB(maCLB);
    }
    @Override
    public String toString() {
        return "maCLB: " + getMaCLB() + ", tenCLB: " + getTenCLB() + ", congviec: " + getCongViec();
    }
}

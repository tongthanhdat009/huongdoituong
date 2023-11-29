public class CLBtoanhoc extends caulacbo {
    public String tenCLB;
    public String maCLB;
    public String congviec="Nghien cuu de tai toan hoc";
    public CLBtoanhoc(){
        this.tenCLB = "";
        this.maCLB = "";
        this.congviec = "";
    }
    public CLBtoanhoc(String tenCLB, String maCLB, String congviec){
        super.setTenCLB(tenCLB);
        super.setCongViec(congviec);
        super.setMaCLB(maCLB);
    }
    @Override
    public String getCongViec(){
        super.getCongViec();
        return this.congviec;
    }
    
}

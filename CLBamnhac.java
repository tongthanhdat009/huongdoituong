public class CLBamnhac extends caulacbo {
    public CLBamnhac(){
        super.setMaCLB("CLBamnhac");
        super.setTenCLB("Cau lac bo am nhac");
        super.setCongViec("Dien van nghe o truong");
    }

    @Override
    public String toString() {
        return super.getMaCLB() + ", " + super.getTenCLB() + ", " + super.getCongViec();
    }
}

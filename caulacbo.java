import java.util.*;
public class caulacbo {
    public String maCLB;
    public String tenCLB;
    public String congviec;
    Scanner in = new Scanner(System.in);
    public caulacbo(){
        this.maCLB = "";
        this.tenCLB = "";
        this.congviec = "";
    }
    public caulacbo(String maCLB, String tenCLB, String congviec){
        setMaCLB(maCLB);
        setTenCLB(tenCLB);
        setCongViec(congviec);
    }
    public void setMaCLB(String maCLB){
        String regex = "([CLB]){3}([A-Z]|[a-z]){0,256}";
        if(maCLB.matches(regex)){
            this.maCLB = maCLB;
        }
        else{
            this.maCLB = "Null"; //mã câu lạc bộ không hợp lệ
        }
    }
    public void setTenCLB(String tenCLB){
        String regex = "([A-Z]|[a-z]|\s){0,256}";
        if(tenCLB.matches(regex)){
            this.tenCLB = tenCLB;
        }
        else{
            this.tenCLB = "Null"; //mã câu lạc bộ không hợp lệ
        }
    }
    public void setCongViec(String congviec){
        this.congviec = congviec;
    }
    public String getMaCLB(){
        return this.maCLB;
    }
    public String getTenCLB(){
        return this.tenCLB;
    }
    public String getCongViec(){
        return this.congviec;
    }
    public void nhap(){
        String maCLB;
        String tenCLB;
        String congviec;
        System.out.println("Moi nhap thong tin cau lac bo: ");
        System.out.println("Moi nhap ma CLB (CLB + chu de clb vi du: CLBToanHoc): ");
        maCLB = in.nextLine();
        setMaCLB(maCLB);
        System.out.print("Moi nhap ten cau lac bo (vi du: Cau lac bo toan hoc): ");
        tenCLB = in.nextLine();
        setTenCLB(tenCLB);;
        System.out.println("Moi nhap cong viec cua cau lac bo: ");
        congviec = in.nextLine();
        setCongViec(congviec);
    }
    public String toString() {
        return "maCLB: " + this.maCLB + ", tenCLB: " + this.tenCLB + ", congviec: " + this.congviec;
    }
    public void xuat(){
        System.out.printf("Thong tin cau lac bo: %s",toString());
    }
    public static void main(String args[]){
    }
}


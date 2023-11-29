import java.util.*;
public class phuhuynh extends nguoi {
    public String quanHe;
    public String sdt;
    public String congViec;
    private static int maPH=0;
    Scanner in = new Scanner(System.in);
    public phuhuynh(){
        this.quanHe="";
        this.sdt="";
        this.congViec="";
        maPH++;
    }
    public phuhuynh(String hoten, String gioitinh, int ngaysinh, int thangsinh, int namsinh, String diachi, String socccd,String quanhe, String sdt, String congviec){
        super(hoten,gioitinh,ngaysinh,thangsinh,namsinh,diachi,socccd);
        setQuanhe(quanhe);
        setSdt(sdt);
        setCongviec(congviec);
        maPH++;
    }
    public void setQuanhe(String quanhe){
        this.quanHe=quanhe;
    } 
    public void setSdt(String sdt){
        if(sdt.matches("(84|0[35789])[0-9]{8}$")){
            this.sdt=sdt;
        }
        else{
            this.sdt="so dien thoai khong hop le";
        }
    }
    public void setCongviec(String congviec){
        this.congViec=congviec;
    }
    public String getSdt(){
        return this.sdt;
    }
    public String getQuanhe(){
        return this.quanHe;
    }
    public String getCongviec(){
        return this.congViec;
    }
    public int getMaPH(){
        return maPH;
    }
    @Override
    public void nhap(){
        String hoten;
        String gioitinh;
        int ngay,thang,nam;
        String diachi;
        String cccd;
        String quanhe;
        String sdt;
        String congviec;
        System.out.println("Moi nhap thong tin phu huynh: ");
        System.out.print("moi nhap ho ten:");
        hoten=in.nextLine();
        setHoten(hoten);
        System.out.print("moi nhap gioi tinh:");
        gioitinh = in.nextLine();
        setGioitinh(gioitinh);
        System.out.println("moi nhap lan luot ngay thang nam sinh:");
        System.out.print("nhap ngay:");
        ngay=in.nextInt();
        System.out.print("nhap thang:");
        thang=in.nextInt();        
        System.out.print("nhap nam:");
        nam=in.nextInt();
        setNgaythangnamsinh(ngay, thang, nam);
        System.out.print("moi nhap dia chi:");
        in.nextLine();
        diachi=in.nextLine();
        setDiachi(diachi);
        System.out.print("moi nhap so cccd:");
        cccd=in.nextLine();
        setCCCD(cccd);
        System.out.print("moi nhap moi quan he voi hoc sinh:");
        quanhe=in.nextLine();
        setQuanhe(quanhe);
        System.out.print("nhap ten cong viec hien tai:");
        congviec = in.nextLine();
        setCongviec(congviec);
        System.out.print("nhap so dien thoai: ");
        sdt = in.nextLine();
        setSdt(sdt);
    }
    @Override
    public void xuat(){
        System.out.printf("Thong tin phu huynh da nhap:\n\tHo va ten: %s\n\tGioi tinh: %s\n\tNgay-thang-nam sinh: %d-%d-%d\n\tDia chi: %s\n\tSo cccd: %s\n", getHoten(), getGioitinh(), getNgaysinh(), getThangsinh(), getNamsinh(), getDiachi(), getCCCD());    
        System.out.printf("\tCong viec: %s \n\tQuan he: %s\n\tSdt: %s",getCongviec(),getQuanhe(),getSdt());
    }
    public static void main(String args[]){
        phuhuynh a = new phuhuynh("tong thanh dat", "Nam",14,5, 2004, "tphcm", "12121","Anh trai", "0395632027", "Dev lo");
        a.xuat();
    }
}

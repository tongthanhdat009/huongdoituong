import java.util.*;
public class giaovien extends nguoi{
    public String sdt;
    private int maGV;
    private static int soLuongGV=0;
    Scanner in = new Scanner(System.in);
    public giaovien(){
        super();
        this.sdt="";
        //cập nhật mã giáo viên + số lượng giáo viên theo static
        maGV = ++soLuongGV;
    }
    public giaovien(String hoten, String gioitinh, int ngaysinh, int thangsinh, int namsinh, String diachi, String socccd,String sdt){
        super(hoten,gioitinh,ngaysinh,thangsinh,namsinh,diachi,socccd);
        setSdt(sdt);
        //cập nhật mã giáo viên + số lượng giáo viên theo static
        maGV = ++soLuongGV;
    }
    public void setSdt(String sdt){
        if(sdt.matches("(84|0[35789])[0-9]{8}$")){
            this.sdt=sdt;
        }
        else{
            this.sdt="So dien thoai khong hop le";
        }
    }
    public String getSdt(){
        return this.sdt;
    }
    public int getMagv(){
        return maGV;
    }
    public int getSoLuongGv(){
        return soLuongGV;
    }
    @Override
    public void nhap() {
        String hoten;
        String gioitinh;
        int ngay,thang,nam;
        String diachi;
        String cccd;
        String sdt;
        System.out.println("Moi nhap thong tin giao vien: ");
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
        System.out.println("Nhap so dien thoai cua giao vien: ");
        sdt = in.nextLine();
        setSdt(sdt);
    }
    @Override
    public void xuat() {
        System.out.println("Thong tin giao vien da nhap: ");
         System.out.printf("Ma giao vien: %s\n", getMagv());
        System.out.printf("Thong tin da nhap:\n\tHo va ten: %s\n\tGioi tinh: %s\n\tNgay-thang-nam sinh: %d-%d-%d\n\tDia chi: %s\n\tSo cccd: %s\n", getHoten(), getGioitinh(), getNgaysinh(), getThangsinh(), getNamsinh(), getDiachi(), getCCCD());    
        System.out.printf("So dien thoai giao vien: %s\n", getSdt());
        System.out.printf("Ma giao vien: %d\n",getMagv());

    }
    public String toString()
    {
        {
            return maGV+"\t"+sdt+"\t"+hoten+"\t"+gioitinh+"\t"+ngaysinh+"/"+thangsinh+"/"+namsinh+"\t"+diachi+"\t"+socccd; 
        }
    }
    public static void main(String args[]){
        giaovien[] a=new giaovien[2];          
        for(int i=0;i<1;i++){
            a[i]=new giaovien();
            a[i].nhap();
        }
        for(int i=0;i<2;i++){
            a[i].xuat();
        }
    }
}
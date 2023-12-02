import java.util.Scanner;
public class lop{
    Scanner sc=new Scanner(System.in);
    public String maLop;
	public int siSo;
    public phongHoc phong;
    public giaovien gvcn;
    public lop(String maLop, int siSo, String maPhong, int soGhe, int soBan, String sdt, String hoten, String gioitinh,int ngaysinh, int thangsinh, int namsinh, String diachi, String std, String socccd)
    {
        this.maLop=maLop;
        this.siSo=siSo;
        this.phong=new phongHoc(maPhong, soGhe, soBan);
        this.gvcn =new giaovien(hoten,gioitinh,ngaysinh,thangsinh,namsinh,diachi,socccd,sdt);
    }
    public lop()
    {
        maLop="";
        siSo=0;
        phong=new phongHoc();
        gvcn=new giaovien();
    }
    public String getMaLop() {
        return maLop;
    }
    public phongHoc getPhong() {
        return phong;
    }
    public int getSiSo() {
        return siSo;
    }
    public giaovien getGVCN() {
        return gvcn;
    }
    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }
    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }
    public void setPhong(phongHoc phong) {
        this.phong = phong;
    }
    public void setGVCN(giaovien gvcn) {
        this.gvcn = gvcn;
    }
    public void nhap()
    {
        System.out.print("Nhap ma lop: ");
        maLop = sc.nextLine();
        System.out.print("Nhap si so: ");
        siSo = sc.nextInt();
        phong.nhap();
        gvcn.nhap();
    }
    public String toString()
    {
        return "Ma lop: "+maLop+", si so: "+siSo+", "+phong.toString()+", "+gvcn.toString();
    }
}

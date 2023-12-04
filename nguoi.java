import java.time.LocalDate;
import java.util.*;
public abstract class nguoi {
    public String hoten; // họ tên
    public String gioitinh; // giới tính
    public int ngaysinh; // ngày sinh
    public int thangsinh; // tháng sinh
    public int namsinh; // năm sinh
    public String diachi; //địa chỉ
    public String socccd; // căn cước công dân
    Scanner in = new Scanner(System.in);
    //hàm thiết lập
    public nguoi(){
        hoten="";
        gioitinh="";
        ngaysinh=1;
        thangsinh=1;
        namsinh=1999;
        diachi="";
        socccd="";
    }
    public nguoi(String hoten, String gioitinh, int ngaysinh, int thangsinh, int namsinh, String diachi, String socccd){
        setHoten(hoten);
        setGioitinh(gioitinh);
        setNgaythangnamsinh(ngaysinh, thangsinh, namsinh);
        setDiachi(diachi);
        setCCCD(socccd);
    }
    // get/set họ tên
    public void setHoten(String hoten) {
        if (hoten.matches("([a-z]|[A-Z]|\\s){10,20}$")) {
            this.hoten = hoten.toUpperCase();
        } else {
            this.hoten = "ho ten khong hop le";
        }
    }
    
    public String getHoten(){
        return this.hoten;
    }

    // get/set giới tính
    public void setGioitinh(String gioitinh){
        if(gioitinh.matches("(N|n){1}[a]{1}[m]{1}$")|| gioitinh.matches("(N|n){1}[u]{1}$")){
            this.gioitinh = gioitinh;
        }
        else this.gioitinh=" gioi tinh khong hop le";
    }
    public String getGioitinh(){
        return gioitinh;
    }
    
    // phương thức kiếm tra năm nhuận
    private boolean kiemtranamnhuan(int namsinh){
        if(namsinh%400==0){
            return true;
        }
        if(namsinh % 4 == 0 && namsinh % 100 == 0){
            return true;
        }
        return false;
    }
    
    //get/set ngày tháng năm sinh
    public void setNgaythangnamsinh(int ngaysinh, int thangsinh, int namsinh){
        LocalDate localDate = LocalDate.now();//lấy thời gian hiện tại
        int year = localDate.getYear(); //lấy năm hiện tại
        switch (thangsinh) { //kiểm tra tháng sinh
            case 1:
                if(ngaysinh <= 31 && ngaysinh > 0){ //kiểm tra ngày
                    this.ngaysinh= ngaysinh;
                    this.thangsinh= thangsinh;
                    if(namsinh>1950 && year>namsinh ){ //kiểm tra năm
                        this.namsinh=namsinh;
                    }
                }
                break;
            case 2:
                if(kiemtranamnhuan(namsinh)){//kiểm tra năm nhuận
                    if(ngaysinh>0 && ngaysinh<=29){//kiểm tra ngày
                        this.ngaysinh=ngaysinh;
                        this.thangsinh=thangsinh;
                        this.namsinh=namsinh;
                    }
                }
                else{
                    if(ngaysinh > 0 && ngaysinh<=28){//kiểm tra ngày
                        this.ngaysinh=ngaysinh;
                        this.thangsinh = ngaysinh;
                        this.namsinh = namsinh;
                    }
                }
                break;
            case 3:
                if(ngaysinh <= 31 && ngaysinh > 0){ //kiểm tra ngày
                    this.ngaysinh= ngaysinh;
                    this.thangsinh= thangsinh;
                    if(namsinh>1950 && year>namsinh ){ //kiểm tra năm
                        this.namsinh=namsinh;
                    }
                }
                break;
            case 4:
                if(ngaysinh <= 30 && ngaysinh > 0){
                    this.ngaysinh= ngaysinh;
                    this.thangsinh= thangsinh;
                    if(namsinh>1950 && year>namsinh ){ //kiểm tra năm
                        this.namsinh=namsinh;
                    }
                }
                break;
            case 5:
                if(ngaysinh <= 31 && ngaysinh > 0){ //kiểm tra ngày
                    this.ngaysinh= ngaysinh;
                    this.thangsinh= thangsinh;
                    if(namsinh>1950 && year>namsinh ){ //kiểm tra năm
                        this.namsinh=namsinh;
                    }
                }
                break;
            case 6:
                if(ngaysinh <= 30 && ngaysinh > 0){
                    this.ngaysinh= ngaysinh;
                    this.thangsinh= thangsinh;
                    if(namsinh>1950 && year>namsinh ){ //kiểm tra năm
                        this.namsinh=namsinh;
                    }
                }
                break;
            case 7:
                if(ngaysinh <= 31 && ngaysinh > 0){ //kiểm tra ngày
                    this.ngaysinh= ngaysinh;
                    this.thangsinh= thangsinh;
                    if(namsinh>1950 && year>namsinh ){ //kiểm tra năm
                        this.namsinh=namsinh;
                    }
                }
                break;
            case 8:
                if(ngaysinh <= 31 && ngaysinh > 0){ //kiểm tra ngày
                    this.ngaysinh= ngaysinh;
                    this.thangsinh= thangsinh;
                    if(namsinh>1950 && year>namsinh ){ //kiểm tra năm
                        this.namsinh=namsinh;
                    }
                }
                break;
            case 9:
                if(ngaysinh <= 30 && ngaysinh > 0){
                    this.ngaysinh= ngaysinh;
                    this.thangsinh= thangsinh;
                    if(namsinh>1950 && year>namsinh ){ //kiểm tra năm
                        this.namsinh=namsinh;
                    }
                }
                break;
            case 10:
                if(ngaysinh <= 31 && ngaysinh > 0){ //kiểm tra ngày
                    this.ngaysinh= ngaysinh;
                    this.thangsinh= thangsinh;
                    if(namsinh>1950 && year>namsinh ){ //kiểm tra năm
                        this.namsinh=namsinh;
                    }
                }
                break;  
            case 11:
                if(ngaysinh <= 30 && ngaysinh > 0){
                    this.ngaysinh= ngaysinh;
                    this.thangsinh= thangsinh;
                    if(namsinh>1950 && year>namsinh ){ //kiểm tra năm
                        this.namsinh=namsinh;
                    }
                }
                break;
            case 12:
                if(ngaysinh <= 31 && ngaysinh > 0){ //kiểm tra ngày
                    this.ngaysinh= ngaysinh;
                    this.thangsinh= thangsinh;
                    if(namsinh>1950 && year>namsinh ){ //kiểm tra năm
                        this.namsinh=namsinh;
                    }
                }
                break;
            default:
                this.thangsinh=0;
                break;
        }
    }
    public int getNgaysinh(){
        return this.ngaysinh;
    }
    public int getThangsinh(){
        return this.thangsinh;
    }
    public int getNamsinh(){
        return this.namsinh;
    }

    // get/set địa chỉ
    public void setDiachi(String diachi){
        if(!(diachi.length()>256)){
            this.diachi = diachi;
        }
        else this.diachi="";
    }
    public String getDiachi(){
        return diachi;
    }

    // get/set mã căn cước công dân
    public void setCCCD(String socccd){
        if(socccd.matches("[0-9]{12}$")){
            this.socccd=socccd;
        }
        else this.socccd="so can cuoc cong dan khong hop le";
    }
    public String getCCCD(){
        return this.socccd;
    }
    public abstract void nhap();
    public abstract void xuat();
}

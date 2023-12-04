
import java.util.Scanner;

public class danhsachhocsinh extends nguoi {
	Scanner input = new Scanner(System.in);

	public int ma;
	public String khoahoc;
	public String sdt;
	private String hanhkiem;
	
	public danhsachhocsinh() {
		khoahoc = "";
		sdt = "";
		ma = 0;
		hanhkiem = "";
		
	}
	public danhsachhocsinh(int ma, String khoahoc, String sdt,String hanhkiem) {
		
		this.ma = ma;
		this.khoahoc = khoahoc;
		this.sdt = sdt;
		this.hanhkiem=hanhkiem;
	}
	public String getKhoahoc() {
		return khoahoc;
	}
	public void setKhoahoc(String khoahoc) {
		this.khoahoc = khoahoc;
	}
	public String getHanhkiem() {
		return hanhkiem;
	}
	public void setHanhkiem(String hanhkiem) {
		//Điều kiện biểu thức chính quy kiểm tra hạnh kiểm
		if(hanhkiem.matches("(((T|t){1}ot)|((K|k){1}ha)|((T|t){1}rung(\\s|\\S)(B|b){1}inh)|((Y|y){1}eu))$")) {
		this.hanhkiem = hanhkiem;}
		else {
			System.out.println("Ban nhap sai roi!");
			System.out.println("Chon chuc nang chi tiet, de cap nhat lai!");

		}
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
//		bắt đầu bằng 1 chữ số và không quá 5 chữ số
	if(ma <= 500000 && ma >= 1 ) {
		this.ma = ma;
		}
	else {
		System.out.println("Ban nhap sai roi!");
		System.out.println("Chon chuc nang chi tiet, de cap nhat lai!");

	}
	}
	
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		if(sdt.matches("[0-9]{10}$")){
           this.sdt = sdt;
        }
		else{
			System.out.println("Số điện thoại không hợp lệ !!");
		}
		
	}
	
@Override	
public void nhap() {
	 String hoten;
     String gioitinh;
     int ngay,thang,nam;
     String diachi;
     String cccd;
     System.out.print("Moi nhap ho ten ho ten:(luu y: viet hoa ten)");
     hoten=in.nextLine();
     setHoten(hoten);
     System.out.print("Moi nhap gioi tinh cua hoc sinh:");
     gioitinh = in.nextLine();
     setGioitinh(gioitinh);
     System.out.println("Moi nhap lan luot ngay, thang, nam sinh cua hoc sinh :");
     System.out.print("Nhap ngay:");
     ngay=in.nextInt();
     System.out.print("Nhap thang:");
     thang=in.nextInt();        
     System.out.print("Nhap nam:");
     nam=in.nextInt();
     setNgaythangnamsinh(ngay, thang, nam);
     System.out.print("\nNhap dia chi hoc sinh: ");
     in.nextLine();
     diachi=in.nextLine();
     setDiachi(diachi);
     System.out.print("\nNhap cccd hoc sinh( chu y :12 so):");
     cccd=in.nextLine();
     setCCCD(cccd);
	System.out.println("Nhap ma so hoc sinh khong qua 5 chu so:");
	ma = input.nextInt();
	setMa(ma);
	input.nextLine();
	System.out.println("Nhap so dien thoai cua hoc sinh, (luu y : dai 10 so):");
	sdt = input.nextLine();
	setSdt(sdt);
	System.out.println("Nhap hanh kiem cua hoc sinh:");
	hanhkiem = input.nextLine();
	setHanhkiem(hanhkiem);
	System.out.println("Nhap nien khoa cua hoc sinh: ");
	khoahoc = input.nextLine();
	setKhoahoc(khoahoc);
	

	
}
@Override
public void xuat() {
	System.out.printf("Thong Tin Hoc sinh:\n\tHo va ten hoc sinh: %s\n\tGioi tinh: %s\n\tNgay-thang-nam sinh: %d-%d-%d\n\tdia chi: %s\n\tSo can cuoc cong dan: %s\n\t ma so: %d\n\t so dien thoai: %s\n\thanh kiem %s\n\tkhoa hoc %s\n\t",
			getHoten(), getGioitinh(), getNgaysinh(), getThangsinh(), getNamsinh(), getDiachi(), getCCCD(), getMa(),getSdt(),getHanhkiem(),getKhoahoc());
}

public String getFileline() {
	return " stt : "+getMa()+","+" Ho va ten :"+ getHoten()+ ","+" Gioi tinh :"+ getGioitinh() + ","+" Ngay sinh :" + getNgaysinh() +","+" Thang sinh :"+ getThangsinh()+","+" Nam sinh :"+ getNamsinh()+ ","+" Dia chi :"+ getDiachi()+","+" So can cuoc cong dan :"+ getCCCD()+","+" So dien thoai :"+ getSdt()+","+" Hanh kiem :"+ getHanhkiem()+","+" Khoa hoc :"+ getKhoahoc()+ "\n";
}
public String toString2() {
	return "Ma HS: "+getMa()+"\tHo va ten: "+ getHoten()+"\tKhoa hoc :"+ getKhoahoc()+"\tGioi tinh: "+ getGioitinh() +"\tNgay thang nam sinh: "+ getNgaysinh() +"/"+ getThangsinh()+"/"+getNamsinh()+"\tDia chi: "+ getDiachi()+","+"So can cuoc cong dan: "+ getCCCD()+"\tSo dien thoai: "+ getSdt()+"\tHanh kiem :"+ getHanhkiem();
}
public void parse(String line) {
	String[] param = line.split(",");
	try {
//		ma = Integer.parseInt(param[1]);
		ma = Integer.parseInt(param[0]);
		hoten = param[1];
		gioitinh = param[2];
		ngaysinh =Integer.parseInt(param[3]);
		thangsinh =Integer.parseInt(param[4]);
		namsinh =Integer.parseInt(param[5]);
		
		
		diachi= param[6];
		socccd = param[7];
		sdt = param[8];
		hanhkiem= param[9];
		khoahoc = param[10];
		
	}catch(ArrayIndexOutOfBoundsException ex) {
		
	}finally {
		
	}
	
	
}

	
	
}

package doan;
import java.util.Scanner;

public class danhsachhocsinh extends nguoi {
	Scanner input = new Scanner(System.in);

	public int ma;
	public String khoahoc;
	public String sdt;
	private String hanhkiem;

	private String diachi;
	
	
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
		if(hanhkiem.equals("Tốt") ||hanhkiem.equals("Khá") || hanhkiem.equals("Trung bình") || 
				hanhkiem.equals("Yếu") || hanhkiem.equals("tốt") || hanhkiem.equals("khá") || hanhkiem.equals("trung bình")|| hanhkiem.equals("yếu")|| hanhkiem.equals("tot") ||
				hanhkiem.equals("kha") || hanhkiem.equals("trung binh") || hanhkiem.equals("yeu")) {
		this.hanhkiem = hanhkiem;}
		else {
			System.out.println("Bạn nhập sai rồi!!");
			System.out.println("Chọn chức năng sửa chi tiết, để cập nhật lại!!");

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
		System.out.println("Bạn nhập sai rồi!!");
		System.out.println("Chọn chức năng sửa chi tiết, để cập nhật lại!!");

	}
	}
	
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	
@Override	
public void nhap() {
	 String hoten;
     String gioitinh;
     int ngay,thang,nam;
     String diachi;
     String cccd;
     System.out.print("mời nhập họ tên:");
     hoten=in.nextLine();
     setHoten(hoten);
     System.out.print("mời nhập giới tính:");
     gioitinh = in.nextLine();
     setGioitinh(gioitinh);
     System.out.println("Mời nhập lần lượt ngày tháng năm sinh:");
     System.out.print("nhập ngày:");
     ngay=in.nextInt();
     System.out.print("nhập tháng:");
     thang=in.nextInt();        
     System.out.print("nhập năm:");
     nam=in.nextInt();
     setNgaythangnamsinh(ngay, thang, nam);
     System.out.print("\nNhập địa chỉ học sinh:");
     in.nextLine();
     diachi=in.nextLine();
     setDiachi(diachi);
     System.out.print("\nNhập cccd học sinh:");
     cccd=in.nextLine();
     setCCCD(cccd);
	System.out.println("Nhập mã số học sinh, không quá 5 số:");
	ma = input.nextInt();
	setMa(ma);
	input.nextLine();
	System.out.println("Nhập số điện thoại học sinh:");
	sdt = input.nextLine();
	setSdt(sdt);
	System.out.println("Nhập hạnh kiểm học sinh  :");
	hanhkiem = input.nextLine();
	setHanhkiem(hanhkiem);
	System.out.println("Nhập khóa học học sinh  :");
	khoahoc = input.nextLine();
	setKhoahoc(khoahoc);
	

	
}
@Override
public void xuat() {
	System.out.printf("Thông Tin Học sinh:\n\tHọ và tên học sinh: %s\n\tGiới tính: %s\n\tNgày-tháng-năm sinh: %d-%d-%d\n\tđịa chỉ: %s\n\tSố căn cước công dân: %s\n\t mã số: %d\n\t so dien thoai: %s\n\thạnh kiểm %s\n\tkhóa học %s\n\t",
			getHoten(), getGioitinh(), getNgaysinh(), getThangsinh(), getNamsinh(), getDiachi(), getCCCD(), getMa(),getSdt(),getHanhkiem(),getKhoahoc());
}

public String getFileline() {
	return " stt : "+getMa()+","+" Họ và tên :"+ getHoten()+ ","+" Giới tính :"+ getGioitinh() + ","+" Ngày sinh :" + getNgaysinh() +","+" Tháng sinh :"+ getThangsinh()+","+" Năm sinh :"+ getNamsinh()+ ","+" Địa chỉ :"+ getDiachi()+","+" Số căn cước công dân :"+ getCCCD()+","+" Số điện thoại :"+ getSdt()+","+" Hạnh kiểm :"+ getHanhkiem()+","+" Khóa học :"+ getKhoahoc()+ "\n";
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
		
		
		socccd = param[6];
		diachi= param[7];
		sdt = param[8];
		hanhkiem= param[9];
		khoahoc = param[10];
		
	}catch(ArrayIndexOutOfBoundsException ex) {
		
	}finally {
		
	}
	
	
}

	
	
}

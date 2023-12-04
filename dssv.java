
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class dssv implements file{
	public  int n;
    Scanner input = new Scanner(System.in);

    ArrayList<danhsachhocsinh> danhsachhocsinh = new ArrayList<>();
	public dssv() {
		n = 0;
		this.danhsachhocsinh= new ArrayList<danhsachhocsinh>();
	}
	public dssv(int n, ArrayList<danhsachhocsinh> dssv){
		this.n = n;
		this.danhsachhocsinh=dssv;
	}
	
	public void nhaphocsinh(){
		System.out.println("-----------------//-----------------");
		System.out.println("Nhap so luong hoc sinh can nhap: \n");
	

		
		n = input.nextInt();
		for(int i = 0 ;i < n ;i++) {
			danhsachhocsinh ds = new danhsachhocsinh();
			ds.nhap();
			danhsachhocsinh.add(ds);
		
		}
	}
	public void xuatdanhsachhocsinh() {
		if(danhsachhocsinh.size()==0) {
			System.out.println(" Danh sach rong");
		}else {
		System.out.println(" Danh sach hoc sinh:");
		for(danhsachhocsinh ds :danhsachhocsinh ) {
			ds.xuat();
		}
	}
	}
	public void deletestudent() {
		
		int chosse=1;
		while(chosse > 0){
			show();
			System.out.println(" Nhap vao lua chon can xoa:");
			 chosse = input.nextInt();
			input.nextLine();
			switch(chosse) {
			case 1: 
			{
				String hoten;
				System.out.println(" Nhap vao hoc ten hoc sinh can xoa:\n");
				hoten = input.nextLine();
				boolean check = false;
				int i;
				for( i=0; i < danhsachhocsinh.size();i++) {
					if(danhsachhocsinh.get(i).getHoten().equals(hoten))
					{
					    check= true;
					    break;
					}
				}
				if(check) {
					danhsachhocsinh.remove(i);
				}
				else {
					System.out.println("Nhap sai ho ten hoc sinh hoac khong co trong danh sach!");
				}
				System.out.println("Thuc hien chu nang thanh cong!");
				break;
			}
			case 2 :
			{
				int ma;
				System.out.println(" Nhap vao ma so hoc sinh can xoa:\n");
				ma = input.nextInt();
				boolean check = false;
				int i;
				for( i=0; i < danhsachhocsinh.size();i++) {
					if(danhsachhocsinh.get(i).getMa() == ma)
					{
					    check= true;
					    break;
					}
				}
				if(check) {
					danhsachhocsinh.remove(i);
				}
				else {
					System.out.println("Nhap sai ma hoc sinh hoac khong co trong danh sach!");
				}
				System.out.println("Thuc hien chuc nang thanh cong!");
				break;
				
				
			}
			case 3:{
				String std;
				System.out.println("Nhap so dien thoai hoc sinh can xoa\n");
				std = input.nextLine();
				boolean check = false;
				int i;
				for( i=0; i < danhsachhocsinh.size();i++) {
					if(danhsachhocsinh.get(i).getSdt().equals(std))
					{
					    check= true;
					    break;
					}
				}
				if(check) {
					danhsachhocsinh.remove(i);
				}
				else {
					System.out.println("Nhap sai so dien thoai hoc sinh hoac khong co trong danh sach");
				}
				System.out.println("Thuc hien chuc nang thanh cong!");
				break;
			}
			case 4: 
			{
				System.out.println(" Thoat!!");
				System.out.println(" BYE ");
				break;
			}
			default:
			{
				System.out.println(" Lua chon khong hop le! Moi nhap lai.");
				chosse=input.nextInt();
			}
			
		
			}
			System.out.println("Nhap 0 de thoat hoac 1 de tiep tuc");
			chosse=input.nextInt();
		}
	}
	
	
	public void updatedetail() {
		int luachon=1;
		
		while(luachon>0) {
			showupdate();
			System.out.println(" Lua chon thong tin can cap nhat:");
			luachon = input.nextInt();
			input.nextLine();

			switch(luachon) {
			case 1:{
				
				String hoten;
				System.out.println("Nhap ho va ten cua hoc sinh cu:");
				hoten = input.nextLine();
				System.out.println("Nhap vao ho va ten cua hoc sinh moi:");
				String hotenmoi = input.nextLine();
				for(danhsachhocsinh ds : danhsachhocsinh) {
					if(ds.getHoten().equals(hoten)) {
						ds.setHoten(hotenmoi);
					}
					else {
						System.out.println("Khong tim thay hoc sinh de cap nhat!");
						System.out.println("Vui long kiem tra lai.");
					}
				}
				System.out.println("Thuc hien chuc nang thanh cong! ");
				break;
			}
			case 2: {
				System.out.println("Nhap vao gioi tinh cua hoc sinh cu:");
				String gioitinh = input.nextLine();
				System.out.println("Nhap vao gioi tinh cua hoc sinh moi:");
				String gioitinhmoi = input.nextLine();
				for(danhsachhocsinh ds : danhsachhocsinh) {
					if(ds.getGioitinh().equals(gioitinh)) {
						ds.setGioitinh(gioitinhmoi);
					}
					else {
						System.out.println("Khong tim thay hoc sinh de cap nhat!");
						System.out.println("Vui long kiem tra lai.");
					}
				}
				System.out.println("Thuc hien chuc nang thanh cong!");
				break;
			}
			case 3:
			{
				System.out.println("Nhap vao ngay sinh cua hoc sinh cu:");
				int ngay = input.nextInt();
				System.out.println("Nhap vao thang sinh cua hoc sinh cu:");
				int thang = input.nextInt();
				System.out.println("Nhap vao nam sinh cua hoc sinh cu:");
				int nam = input.nextInt();
				System.out.println("Nhap vao ngay sinh cua hoc sinh moi:");
				int ngaymoi = input.nextInt();
				System.out.println("Nhap vao thang sinh cua hoc sinh moi:");
				int thangmoi = input.nextInt();
				System.out.println("Nhap vao nam sinh cua hoc sinh moi:");
				int nammoi = input.nextInt();
				for(danhsachhocsinh ds : danhsachhocsinh) {
					if(ds.getNgaysinh()== ngay || ds.getThangsinh() == thang || ds.getNamsinh()== nam) {
						ds.setNgaythangnamsinh(ngaymoi,thangmoi,nammoi);
					}
					else {
						System.out.println("Khong tim thay hoc sinh de cap nhat");
						System.out.println("Vui long kiem tra lai.");
					}
				}
				System.out.println("Thuc hien chuc nang thanh cong!");
				
				break;
			}
			case 4: 
			{
				System.out.println("Nhap vao dia chi cua hoc sinh cu");
				String diachi = input.nextLine();
				System.out.println("Nhap vao dia chi cua hoc sinh moi");
				String diachimoi = input.nextLine();
				for(danhsachhocsinh ds : danhsachhocsinh) {
					if(ds.getDiachi().equals(diachi)) {
						ds.setDiachi(diachimoi);
					}
					else {
						System.out.println("Khong tim thay hoc sinh de cap nhat");
						System.out.println("Vui long kiem tra lai.");
					}
				}
				System.out.println("Thuc hien chuc nang thanh cong!");
				break;
			}
			case 5:{
				System.out.println("Nhap vao ma can cuoc cong dan cua hoc sinh cu");
				String cccd = input.nextLine();
				System.out.println("Nhap vao ma can cuoc cong dan cua hoc sinh moi");
				String cccdmoi = input.nextLine();
				for(danhsachhocsinh ds : danhsachhocsinh) {
					if(ds.getCCCD().equals(cccd)) {
						ds.setCCCD(cccdmoi);
					}
					else {
						System.out.println("Khong tim thay hoc sinh de cap nhat");
						System.out.println("Vui long kiem tra lai.");
					}
				}
				System.out.println("Thuc hien chuc nang thanh cong!");
				break;
			}
			case 6:{
				System.out.println("Nhap vao ma hoc sinh cu:");
				int maso = input.nextInt();
				System.out.println("Nhap vao ma hoc sinh moi:");
				int  masomoi = input.nextInt();
				for(danhsachhocsinh ds : danhsachhocsinh) {
					if(ds.getMa() == maso) {
						ds.setMa(masomoi);
					}
					else {
						System.out.println("Khong tim thay hoc sinh de cap nhat");
						System.out.println("Vui long kiem tra lai.");
					}
				}
				System.out.println("Thuc hien chuc nang thanh cong!");
				break;
			}
			case 7:{
				System.out.println("Nhap vao so dien thoai cua hoc sinh cu:");
				String sdt = input.nextLine();
				System.out.println("Nhap vao so dien thoai cua hoc sinh moi:");
				String stdmoi = input.nextLine();
				for(danhsachhocsinh ds : danhsachhocsinh) {
					if(ds.getSdt().equals(sdt)) {
						ds.setSdt(stdmoi);
					}
					else {
						System.out.println("Khong tim thay hoc sinh de cap nhat");
						System.out.println("Vui long kiem tra lai.");
					}
				}
				System.out.println("Thuc hien chuc nang thanh cong!");
				break;
			}
			case 8:{
				System.out.println("Nhap vao hanh kiem cua hoc sinh cu:");
				String hanhkiem = input.nextLine();
				System.out.println("Nhap vao hanh kiem cua hoc sinh moi:");
				String hanhkiemmoi = input.nextLine();
				for(danhsachhocsinh ds : danhsachhocsinh) {
					if(ds.getHanhkiem().equals(hanhkiem)) {
						ds.setHanhkiem(hanhkiemmoi);
					}
					else {
						System.out.println("Khong tim thay hoc sinh de cap nhat");
						System.out.println("Vui long kiem tra lai.");
					}
				}
				System.out.println("Thuc hien chuc nang thanh cong!");
				break;
			}
			case 9 :{
				System.out.println("Nhap vao khoa hoc cu:");
				String khoahoc = input.nextLine();
				System.out.println("Nhap vao khoa hoc moi:");
				String khoahocmoi = input.nextLine();
				for(danhsachhocsinh ds : danhsachhocsinh) {
					if(ds.getKhoahoc().equals(khoahoc)) {
						ds.setKhoahoc(khoahocmoi);
					}
					else {
						System.out.println("Khong tim thay hoc sinh de cap nhat");
						System.out.println("Vui long kiem tra lai.");
					}
				}
				System.out.println("Thuc hien chuc nang thanh cong!");
				break;
			}
			case 0:
				System.out.println("Tam biet thoat khoi chuong trinh!");
				break;
			
			default:
			{
				System.out.println("Lua chon khong hop le vui long nhap lai");
				luachon=input.nextInt();
			}
			
			}
			System.out.println("Thoat chuc nang thanh cong!");
			System.out.println("Nhap vao so 0 hoac lon hon 0 de tiep tuc ");
			luachon=input.nextInt();
			
		}
		
	}
	
	public void show() {
		System.out.println("-----------------//-----------------");
		System.out.println("----------------Menu----------------");
		System.out.println("1.Xoa theo ten hoc sinh.");
		System.out.println("2.Xoa theo ma so hoc sinh.");
		System.out.println("3.Xoa theo so dien thoai cua hoc sinh.");
		System.out.println("4.Thoat, chon chuc nang moi!!");
		System.out.println("-----------------//-----------------");

		
	}
	
	public void showupdate() {
		System.out.println("-----------------//-----------------");
		System.out.println("----------------Menu----------------");
		System.out.println("1.Sua chi tiet ho và ten hoc sinh.");
		System.out.println("2.Sua chi tiet gioi tinh hoc sinh.");
		System.out.println("3.Sua chi tiet ngay thang nam sinh cua hoc sinh.");
		System.out.println("4.Sua chi tiet dia chi hoc sinh.");
		System.out.println("5.Sua chi tiet can cuoc cong dan cua hoc sinh.");
		System.out.println("6.Sua chi tiet ma so hoc sinh.");
		System.out.println("7.Sua chi tiet so dien thoai hoc sinh.");
		System.out.println("8.Sua chi tiet hanh kiem hoc sinh");
		System.out.println("9.Sua chi tiet khoa hoc cua hoc sinh");
		System.out.println("0.Thoat chuong trinh  ");
		System.out.println("-----------------//-----------------");

	}
	

public void update() {
	System.out.println("-----------------//-----------------");
	System.out.println("--Nhap vao ma so hoc sinh can tim:--");
	System.out.println("-----------------//-----------------");
	int luachon = 1;
	while(luachon>0)
	{
	int maso = input.nextInt();
	for(danhsachhocsinh hs : danhsachhocsinh) {
		if(hs.getMa()== maso)
		{
			danhsachhocsinh.remove(hs);
			hs.nhap();
			danhsachhocsinh.add(hs);
			System.out.println("Cap nhat thanh cong!");

		}
		else {
			System.out.println("Ma sinh vien khong hop le!");
		}
		System.out.println("Nhap 1 de thuc hien lai hoac nhap 0 de ket thuc.");
		luachon= input.nextInt();
		
	}
		
	
	}
	
	
}
public void findstudent() {
	System.out.println("-----------------//-----------------");
	System.out.println("--Nhap vao ma so hoc sinh can tim:--");
	System.out.println("-----------------//-----------------");
	int luachon = 1;
	while(luachon>0) {
	int findmaso = input.nextInt();
	for(danhsachhocsinh hs : danhsachhocsinh) {
		if(hs.getMa()== findmaso)
		{
			System.out.println("Tim hoc sinh thanh cong!");
			hs.xuat();
		}
		else {
			System.out.println("Ma so hoc sinh khong hop le!");
		}
		
	}
	System.out.println("Nhap 1 de thuc hien lai hoac nhap 0 de ket thuc.");
	luachon= input.nextInt();
		}
}

//@Override
//public void readFile1() {
//	
//	try {
//	    System.out.println("file out !!");
//		BufferedReader input = new BufferedReader(new FileReader("data.txt"));
//		
//		String line =input.readLine();
//		
//		
//		while(line != null) {
//			
//			String[] arr =line.split(",");
//			for(int i=0;i<arr.length;i++)
//				
//				System.out.println(arr[i]);
//			    line = input.readLine();
//		
//		
//		
//		}
//		input.close();
//	
//	}
//	catch(Exception e) {
//		e.printStackTrace();
//	}
//}
@Override
public void docFile() {
	
	FileInputStream fis =null;
	InputStreamReader reader = null;
	
	BufferedReader bufferedReader =null;
	try {
		String currentDirectory = System.getProperty("user.dir");
            // Tạo đường dẫn tương đối của file
        String filePath = currentDirectory + File.separator + "input-output" + File.separator + "dshocsinh_in.txt";
	fis = new FileInputStream(filePath);
	reader = new InputStreamReader(fis, StandardCharsets.UTF_8);
	
	bufferedReader = new BufferedReader(reader);
	
	String line = null;
	while((line = bufferedReader.readLine())!= null) {
		if(line.isEmpty()) {
			continue;
		}
		danhsachhocsinh std = new danhsachhocsinh();
		std.parse(line);
		
		danhsachhocsinh.add(std);
		
	}
	}catch(FileNotFoundException ex) {
		 Logger.getLogger(file.class.getName()).log(Level.SEVERE, null, ex);
	} catch (IOException ex) {
		// TODO Auto-generated catch block
		 Logger.getLogger(file.class.getName()).log(Level.SEVERE, null, ex);

	}finally{
		if(fis != null) {
			try {
				fis.close();
			} catch (IOException ex) {
				// TODO Auto-generated catch block
				Logger.getLogger(file.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		if (reader != null) {
			try {
				reader.close();
			} catch (IOException ex) {
				// TODO Auto-generated catch block
				Logger.getLogger(file.class.getName()).log(Level.SEVERE, null, ex);
		}
			
		}
		if(bufferedReader != null) {
			try {
				bufferedReader.close();
			} catch (IOException ex) {
				// TODO Auto-generated catch block
				Logger.getLogger(file.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}
	
	System.out.println("Successfull!!");
                    
  
}


@Override
public void ghiFile(){
	
		
	System.out.println("bat dau luu");
	FileOutputStream fos = null;
	
	 try {
		String currentDirectory = System.getProperty("user.dir");
            // Tạo đường dẫn tương đối của file
            String filePath = currentDirectory + File.separator + "input-output" + File.separator + "dshocsinh_out.txt";
		 fos = new FileOutputStream(filePath,true);
		 for(danhsachhocsinh ds :danhsachhocsinh) {
			 String line =ds.getFileline();
			 byte[] b= line.getBytes("utf8");
			 // save 
			 fos.write(b);
		 }
         // Ghi  Object là đối tượng x xuống file
     } catch (FileNotFoundException ex) {
         Logger.getLogger(file.class.getName()).log(Level.SEVERE, null, ex);
     } catch (UnsupportedEncodingException ex) {
		// TODO Auto-generated catch block
    	  Logger.getLogger(file.class.getName()).log(Level.SEVERE, null, ex);
	} catch (IOException ex) {
		// TODO Auto-generated catch block
		  Logger.getLogger(file.class.getName()).log(Level.SEVERE, null, ex);
	}finally {
		if(fos != null) {
			try {
				fos.close();
				
			}catch(IOException ex) {
				 Logger.getLogger(file.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}
	 System.out.println("file was create");

}
//@Override
//public void writeFile() {
//	try {
//		FileWriter fw = new FileWriter("C:\\Users\\CUONG\\eclipse-workspace\\student\\src\\doan\\data.txt");
//		fw.write("");
//		fw.close();
//	} catch(Exception e){
//		System.out.println(e)
//		{
//			for(danhsachsinhvien ds : dssv) {
//				try {
//					FileWriter fw = new FileWriter("C:\\Users\\CUONG\\eclipse-workspace\\student\\src\\doan\\data.txt");
//					
//
//				}
//			}
//		}
//		
//	}
//}

  
}

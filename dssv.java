
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class dssv<Oject> implements file{
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
		System.out.println("nhập vào số lượng sinh viên cần nhập cho danh sách học sinh :\n");
	

		
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
		System.out.println(" Danh sách học sinh:");
		for(danhsachhocsinh ds :danhsachhocsinh ) {
			ds.xuat();
		}
	}
	}
	public void deletestudent() {
		
		int chosse=1;
		while(chosse > 0){
			show();
			System.out.println(" Nhập vào lựa chọn cần xóa:");
			 chosse = input.nextInt();
			input.nextLine();
			switch(chosse) {
			case 1: 
			{
				String hoten;
				System.out.println(" Nhập vào họ tên học sinh cần xóa:\n");
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
					System.out.println("Nhập sai sdt hoặc không có trong danh sách");
				}
				System.out.println("thực hiện chức năng thành công");
				break;
			}
			case 2 :
			{
				int ma;
				System.out.println(" Nhập vào mã số học sinh cần xóa:\n");
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
					System.out.println("Nhập sai sdt hoặc không có trong danh sách");
				}
				System.out.println("thực hiện chức năng thành công");
				break;
				
				
			}
			case 3:{
				String std;
				System.out.println(" Nhập vào sdt học sinh cần xóa:\n");
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
					System.out.println("Nhập sai sdt hoặc không có trong danh sách");
				}
				System.out.println("thực hiện chức năng thành công");
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
				System.out.println(" Nhập sai rồi, nhập lại các số trong chức năng!");
				chosse=input.nextInt();
			}
			
		
			}
			System.out.println("Nhập vào số 0 để thoát hoặc số 1 để tiếp tục ");
			chosse=input.nextInt();
		}
	}
	
	
	public void updatedetail() {
		int luachon=1;
		
		while(luachon>0) {
			showupdate();
			System.out.println(" Lụa chọn theo chức năng cần sửa:\n");
			luachon = input.nextInt();
			input.nextLine();

			switch(luachon) {
			case 1:{
				
				String hoten;
				System.out.println("Nhập vào họ và tên của học sinh cũ\n");
				hoten = input.nextLine();
				System.out.println("Nhập vào họ và tên của học sinh mới\n");
				String hotenmoi = input.nextLine();
				for(danhsachhocsinh ds : danhsachhocsinh) {
					if(ds.getHoten().equals(hoten)) {
						ds.setHoten(hotenmoi);
					}
					else {
						System.out.println("Không tìm thấy học sinh để cập nhật");
						System.out.println("Vui lòng kiểm tra lại");
					}
				}
				System.out.println("Thực hiện xong chức năng ");
				break;
			}
			case 2: {
				System.out.println("Nhập vào giới tính của học sinh cũ");
				String gioitinh = input.nextLine();
				System.out.println("Nhập vào giới tính của học sinh mới");
				String gioitinhmoi = input.nextLine();
				for(danhsachhocsinh ds : danhsachhocsinh) {
					if(ds.getGioitinh().equals(gioitinh)) {
						ds.setGioitinh(gioitinhmoi);
					}
					else {
						System.out.println("Không tìm thấy học sinh để cập nhật");
						System.out.println("Vui lòng kiểm tra lại");
					}
				}
				System.out.println("Thực hiện xong chức năng ");
				break;
			}
			case 3:
			{
				System.out.println("Nhập vào ngày của học sinh cũ");
				int ngay = input.nextInt();
				System.out.println("Nhập vào tháng của học sinh cũ");
				int thang = input.nextInt();
				System.out.println("Nhập vào năm của học sinh cũ");
				int nam = input.nextInt();
				System.out.println("Nhập vào ngày của học sinh mới");
				int ngaymoi = input.nextInt();
				System.out.println("Nhập vào tháng của học sinh mới");
				int thangmoi = input.nextInt();
				System.out.println("Nhập vào năm của học sinh mới");
				int nammoi = input.nextInt();
				for(danhsachhocsinh ds : danhsachhocsinh) {
					if(ds.getNgaysinh()== ngay || ds.getThangsinh() == thang || ds.getNamsinh()== nam) {
						ds.setNgaythangnamsinh(ngaymoi,thangmoi,nammoi);
					}
					else {
						System.out.println("Không tìm thấy học sinh để cập nhật");
						System.out.println("Vui lòng kiểm tra lại");
					}
				}
				System.out.println("Thực hiện xong chức năng ");
				
				break;
			}
			case 4: 
			{
				System.out.println("Nhập vào địa chỉ của học sinh cũ");
				String diachi = input.nextLine();
				System.out.println("Nhập vào địa chỉ của học sinh mới");
				String diachimoi = input.nextLine();
				for(danhsachhocsinh ds : danhsachhocsinh) {
					if(ds.getDiachi().equals(diachi)) {
						ds.setDiachi(diachimoi);
					}
					else {
						System.out.println("Không tìm thấy học sinh để cập nhật");
						System.out.println("Vui lòng kiểm tra lại");
					}
				}
				System.out.println("Thực hiện xong chức năng ");
				break;
			}
			case 5:{
				System.out.println("Nhập vào căn cước công dân  của học sinh cũ");
				String cccd = input.nextLine();
				System.out.println("Nhập vào căn cước công dân của học sinh mới");
				String cccdmoi = input.nextLine();
				for(danhsachhocsinh ds : danhsachhocsinh) {
					if(ds.getCCCD().equals(cccd)) {
						ds.setCCCD(cccdmoi);
					}
					else {
						System.out.println("Không tìm thấy học sinh để cập nhật");
						System.out.println("Vui lòng kiểm tra lại");
					}
				}
				System.out.println("Thực hiện xong chức năng ");
				break;
			}
			case 6:{
				System.out.println("Nhập vào mã số của học sinh cũ");
				int maso = input.nextInt();
				System.out.println("Nhập vào mã số của học sinh mới");
				int  masomoi = input.nextInt();
				for(danhsachhocsinh ds : danhsachhocsinh) {
					if(ds.getMa() == maso) {
						ds.setMa(masomoi);
					}
					else {
						System.out.println("Không tìm thấy học sinh để cập nhật");
						System.out.println("Vui lòng kiểm tra lại");
					}
				}
				System.out.println("Thực hiện xong chức năng ");
				break;
			}
			case 7:{
				System.out.println("Nhập vào số điện thoại của học sinh cũ");
				String sdt = input.nextLine();
				System.out.println("Nhập vào số điện thoại của học sinh mới");
				String stdmoi = input.nextLine();
				for(danhsachhocsinh ds : danhsachhocsinh) {
					if(ds.getSdt().equals(sdt)) {
						ds.setSdt(stdmoi);
					}
					else {
						System.out.println("Không tìm thấy học sinh để cập nhật");
						System.out.println("Vui lòng kiểm tra lại");
					}
				}
				System.out.println("Thực hiện xong chức năng ");
				break;
			}
			case 8:{
				System.out.println("Nhập vào hạnh kiểm  của học sinh cũ");
				String hanhkiem = input.nextLine();
				System.out.println("Nhập vào hạnh kiểm của học sinh mới");
				String hanhkiemmoi = input.nextLine();
				for(danhsachhocsinh ds : danhsachhocsinh) {
					if(ds.getHanhkiem().equals(hanhkiem)) {
						ds.setHanhkiem(hanhkiemmoi);
					}
					else {
						System.out.println("Không tìm thấy học sinh để cập nhật");
						System.out.println("Vui lòng kiểm tra lại");
					}
				}
				System.out.println("Thực hiện xong chức năng ");
				break;
			}
			case 9 :{
				System.out.println("Nhập vào khóa học của học sinh cũ");
				String khoahoc = input.nextLine();
				System.out.println("Nhập vào khóa học của học sinh mới");
				String khoahocmoi = input.nextLine();
				for(danhsachhocsinh ds : danhsachhocsinh) {
					if(ds.getKhoahoc().equals(khoahoc)) {
						ds.setKhoahoc(khoahocmoi);
					}
					else {
						System.out.println("Không tìm thấy học sinh để cập nhật");
						System.out.println("Vui lòng kiểm tra lại");
					}
				}
				System.out.println("Thực hiện xong chức năng ");
				break;
			}
			case 0:
				System.out.println("Tạm biệt, thoát khỏi chương trình");
				break;
			
			default:
			{
				System.out.println("Nhập sai rồi, chưa thực hiện được ,chọn lại !!");
				luachon=input.nextInt();
			}
			
			}
			System.out.println("Thoát thành công chức năng ");
			System.out.println("Nhập vào số 0 để thoát hoặc số lớn hơn không để tiếp tục ");
			luachon=input.nextInt();
			
		}
		
	}
	
	public void show() {
		System.out.println("-----------------//-----------------");
		System.out.println("----------------Menu----------------");
		System.out.println("1.Xóa theo tên học sinh");
		System.out.println("2.Xóa theo mã số học sinh");
		System.out.println("3.Xóa theo số điện thoại học sinh");
		System.out.println("4.Thoát,Chọn chức năng mới!!");
		System.out.println("-----------------//-----------------");

		
	}
	
	public void showupdate() {
		System.out.println("-----------------//-----------------");
		System.out.println("----------------Menu----------------");
		System.out.println("1.Sửa chi tiết họ và tên học sinh");
		System.out.println("2.Sửa chi tiết giới tính học sinh");
		System.out.println("3.Sửa chi tiết ngày tháng năm sinh cửa học sinh");
		System.out.println("4.Sửa chi tiết dịa chỉ học sinh");
		System.out.println("5.Sửa chi tiết căn cước công dân học sinh");
		System.out.println("6.Sửa chi tiết mã số  học sinh");
		System.out.println("7.Sửa chi tiết số điện thoại học sinh");
		System.out.println("8.Sửa chi tiết hạnh kiểm học sinh");
		System.out.println("9.Sửa chi tiết khóa học  học sinh");
		System.out.println("0.Thoát chương trình  ");
		System.out.println("-----------------//-----------------");

	}
	

public void update() {
	System.out.println("-----------------//-----------------");
	System.out.println("        --Nhập vào mã số học sinh cần tìm--");
	System.out.println("        -----------------//-----------------");
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
			System.out.println("Cập nhật thành công");

		}
		else {
			System.out.println("Bạn nhập mã sinh viên không đúng");
		}
		System.out.println("Nhập 1 để nhập thực hiện lại hoặc nhập 0 để kết thúc ");
		luachon= input.nextInt();
		
	}
		
	
	}
	
	
}
public void findstudent() {
	System.out.println("-----------------//-----------------");
	System.out.println("        --Nhập vào mã số học sinh cần tìm--");
	System.out.println("        -----------------//-----------------");
	int luachon = 1;
	while(luachon>0) {
	int findmaso = input.nextInt();
	for(danhsachhocsinh hs : danhsachhocsinh) {
		if(hs.getMa()== findmaso)
		{
			System.out.println("Tìm học sinh thành công");
			hs.xuat();
		}
		else {
			System.out.println("Bạn nhập mã sinh viên không đúng");
		}
		
	}
	System.out.println("Nhập 1 để nhập thực hiện lại hoặc nhập 0 để kết thúc ");
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
	fis = new FileInputStream("C:\\Users\\CUONG\\eclipse-workspace\\student\\src\\doan\\data.txt");
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
		 fos = new FileOutputStream("C:\\Users\\CUONG\\eclipse-workspace\\student\\src\\doan\\data.txt",true);
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

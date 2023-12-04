import java.util.*;
public class main {
    static Scanner in = new Scanner(System.in);
    //Quản lý danh sách câu lạc bộ
    public static void quanLyCLB(dscaulacbo dsCLB){
        int luachon1;
                    do{
                        System.out.println("--------------------------------------------------");
                        System.out.println("Lua chon tac vu xu ly cau lac bo: ");
                        System.out.println("1. Doc file");
                        System.out.println("2. Ghi file");
                        System.out.println("3. Them cau lac bo");
                        System.out.println("4. Xoa cau lac bo");
                        System.out.println("5. Sua thong tin cau lac bo");
                        System.out.println("6. Quay lai giao dien chinh");
                        System.out.print("Moi nhap lua chon: ");
                        luachon1 = in.nextInt();
                        switch (luachon1) {
                            case 1:
                                dsCLB.docFile();
                                break;
                            case 2:
                                dsCLB.ghiFile();
                                break;
                            case 3: 
                                dsCLB.themCLB();
                                break;
                            case 4:
                                dsCLB.xoaCLB();
                                break;
                            case 5:
                                dsCLB.suaCLB();
                                break;
                            case 6:
                                break;
                            default:
                                System.out.println("Lua chon khong hop le vui long chon lai");
                                break;
                        }
                    }while(luachon1>6);
    }

    //Quản lý danh sách lớp
    public static void quanLylop(dsLop dsLop){
        int luachon1;
        do{
            System.out.println("--------------------------------------------------");
            System.out.println("Lua chon tac vu xu ly lop: ");
            System.out.println("1. Doc file");
            System.out.println("2. Ghi file");
            System.out.println("3. Them 1 lop");
            System.out.println("4. Xoa lop");
            System.out.println("5. Sua thong tin 1 lop");
            System.out.println("6. In danh sach lop");
            System.out.println("0. Quay lai giao dien chinh");
            System.out.print("Moi nhap lua chon: ");
            luachon1=in.nextInt();
            switch (luachon1) {
                case 1:
                    dsLop.docFile();
                    break;
                case 2:
                    dsLop.ghiFile();
                    break;
                case 3:
                    dsLop.them();
                    break;
                 case 4:
                    dsLop.xoa();
                    break;
                case 5:
                    dsLop.sua();
                    break;
                case 6:
                    dsLop.in();
                    break;
                default:
                    System.out.println("Lua chon khong hop le vui long chon lai");
                    break;
            }
        }
        while(luachon1!=0);
    }

    //Quản lý danh sách học sinh
    public static void quanLyHocSinh(dssv dsHocSinh){
        int luachon;
        do{
            System.out.println("--------------------------------------------------");
            System.out.println("Lua chon tac vu xu ly danh sach hoc sinh: ");
            System.out.println("1. Doc file");
            System.out.println("2. Ghi file");
            System.out.println("3. Them hoc sinh");
            System.out.println("4. Xoa hoc sinh");
            System.out.println("5. Sua thong tin 1 hoc sinh");
            System.out.println("6. Cap nhat hoc sinh");
            System.out.println("7. Tim kiem thong tin hoc sinh");
            System.out.println("8. In danh sach hoc sinh theo ma so");
            System.out.println("0. Quay lai giao dien chinh");
            System.out.print("Moi nhap lua chon: ");
            luachon = in.nextInt();
            switch (luachon) {
                case 1:
                    dsHocSinh.docFile();
                    break;
                case 2:
                    dsHocSinh.ghiFile();
                    break;
                case 3:
                    dsHocSinh.nhaphocsinh();
                    break;
                case 4:
                    dsHocSinh.deletestudent();
                    break;
                case 5:
                    dsHocSinh.updatedetail();
                    break;
                case 6:
                    dsHocSinh.update();
                    break;
                case 7:
                    dsHocSinh.findstudent();
                    break;
                case 8:
                    dsHocSinh.xuatdanhsachhocsinh();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lua chon khong hop le! Vui long nhap lai.");
                    break;
            }
        }while(luachon!=0);

    }
    public static void quanLyGiaoVien(){}
    public static void quanLyDanhSachDiem(){}
    public static void main(String[] args){
        ArrayList<caulacbo> dsclb = new ArrayList<caulacbo>();
        //tính đa hình của câu lạc bộ
        caulacbo CLBtoanhoc = new CLBtoanhoc();
        caulacbo CLBkhoahoc = new CLBkhoahoc();
        caulacbo CLBamnhac = new CLBamnhac();
        dsclb.add(CLBtoanhoc);
        dsclb.add(CLBkhoahoc);
        dsclb.add(CLBamnhac);
        dscaulacbo dsCLB = new dscaulacbo(dsclb);

        dsLop dsLop = new dsLop();
        dssv dsHocSinh = new dssv();
        int luachon;
        do{ 
            System.out.println("CHUONG TRINH QUAN LY HOC SINH");
            System.out.println("Moi nhap lua chon de xem:");
            System.out.println("1. Quan ly cau lac bo");
            System.out.println("2. Quan ly cau lop");
            System.out.println("3. Quan ly hoc sinh");
            System.out.println("4. Quan ly giao vien");
            System.out.println("5. Quan ly diem");
            System.out.println("0.Dung chuong trinh");
            System.out.println("Nhap lua chon: ");
            luachon = in.nextInt();
            in.nextLine();
            switch(luachon){
                case 1:
                    quanLyCLB(dsCLB);
                    break;
                case 2:
                    quanLylop(dsLop);
                    break;
                case 3:
                    quanLyHocSinh(dsHocSinh);
                case 0:
                    System.out.println("Chuong trinh hoan thanh");
                default:
                    System.out.println("Lua chon khong hop le vui long chon lai");
                    break;
            }
        }while(luachon != 0);
    }
}

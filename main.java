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
    public static void quanLyGiaoVienCN(dsGVCN dsGVCNCN){
        int luachon;
        do{
            System.out.println("--------------------------------------------------");
            System.out.println("Lua chon tac vu xu ly danh sach hoc sinh: ");
            System.out.println("1. Doc file");
            System.out.println("2. Ghi file");
            System.out.println("3. Them giao vien");
            System.out.println("4. Xoa giao vien");
            System.out.println("5. Sua thong tin 1 giao vien");
            System.out.println("6. In danh sach hoc sinh theo ma so");
            System.out.println("0. Quay lai giao dien chinh");
            System.out.print("Moi nhap lua chon: ");
            luachon = in.nextInt();
            switch (luachon) {
                case 1:
                    dsGVCNCN.docFile();
                    break;
                case 2:
                    dsGVCNCN.ghiFile();
                    break;
                case 3:
                    dsGVCNCN.them();
                    break;
                case 4:
                    dsGVCNCN.xoa();
                    break;
                case 5:
                    dsGVCNCN.sua();
                    break;
                case 6:
                    dsGVCNCN.in();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lua chon khong hop le! Vui long nhap lai.");
                    break;
            }
        }while(luachon!=0);
    }

    public static void quanLyDanhSachDiem(DSdiem dsdiem){
        int luachon1;
        do {
            System.out.println("--------------------------------------------------");
            System.out.println("Lua chon tac vu xu ly diem: ");
            System.out.println("1. Doc file");
            System.out.println("2. Ghi file");
            System.out.println("3. Nhap diem");
            System.out.println("4. Xoa diem");
            System.out.println("5. Sua diem cua 1 hoc sinh theo ma");
            System.out.println("6. Tim kiem diem cua 1 hoc sinh theo ma");
            System.out.println("7. Them diem cho 1 hoc sinh theo ma");
            System.out.println("0. Quay lai giao dien chinh");
            System.out.print("Moi nhap lua chon: ");
            luachon1 = in.nextInt();
            switch (luachon1) {
                case 1:
                    dsdiem.docFile();
                    break;
                case 2:
                    dsdiem.ghiFile();
                    break;
                case 3:
                    dsdiem.nhapDS();
                    break;
                 case 4:
                    dsdiem.xoaDiem();
                    break;
                case 5:
                    dsdiem.suaDiem();
                    break;
                case 6:
                    dsdiem.timKiemDiem();
                    break;
                case 7:
                    dsdiem.themDiem();
                default:
                    System.out.println("Lua chon khong hop le vui long chon lai");
                    break;
            }
        }
        while(luachon1!=0);
    }
    
    public static void main(String[] args){
        //danh sách câu lạc bộ
        ArrayList<caulacbo> dsclb = new ArrayList<caulacbo>();
        //tính đa hình của câu lạc bộ
        caulacbo CLBtoanhoc = new CLBtoanhoc();
        caulacbo CLBkhoahoc = new CLBkhoahoc();
        caulacbo CLBamnhac = new CLBamnhac();
        dsclb.add(CLBtoanhoc);
        dsclb.add(CLBkhoahoc);
        dsclb.add(CLBamnhac);
        dscaulacbo dsCLB = new dscaulacbo(dsclb);

        //danh sách lớp
        dsLop dsLop = new dsLop();

        // danh sách học sinh
        dssv dsHocSinh = new dssv();

        // danh sách giáo viên chủ nhiệm
        dsGVCN dsGVCN = new dsGVCN();

        //danh sách điểm học sinh
        DSdiem dsDiem = new DSdiem();
        int luachon;
        do{ 
            System.out.println("CHUONG TRINH QUAN LY HOC SINH");
            System.out.println("Moi nhap lua chon de xem:");
            System.out.println("1. Quan ly cau lac bo");
            System.out.println("2. Quan ly lop");
            System.out.println("3. Quan ly hoc sinh");
            System.out.println("4. Quan ly giao vien");
            System.out.println("5. Quan ly diem");
            System.out.println("6. Ket hop danh sach lop, hoc sinh, giao vien, diem");
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
                    break;
                case 4:
                    quanLyGiaoVienCN(dsGVCN);
                    break;
                case 5:
                    quanLyDanhSachDiem(dsDiem);
                case 6:
                    dsdaydu ds = new dsdaydu(dsGVCN.getDs(),dsLop.getds(),dsHocSinh.getDs(),dsDiem.getDs());
                    ds.ghiFile();
                    break;
                case 0:
                    System.out.println("Chuong trinh hoan thanh");
                default:
                    System.out.println("Lua chon khong hop le vui long chon lai");
                    break;
            }
        }while(luachon != 0);
    }
}

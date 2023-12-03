import java.util.*;
public class main {
    static Scanner in = new Scanner(System.in);
    public static void quanLyCLB(dscaulacbo dsCLB){
        int luachon1;
                    do{
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
    public static void main(String[] args){
        dscaulacbo dsCLB = new dscaulacbo();
        int luachon;
        do{ 
            System.out.println("CHUONG TRINH QUAN LY HOC SINH");
            System.out.println("Moi nhap lua chon de xem:");
            System.out.println("1.Quan ly cau lac bo");
            System.out.println("0.Dung chuong trinh");
            System.out.println("Nhap lua chon: ");
            luachon = in.nextInt();
            in.nextLine();
            switch(luachon){
                case 1:
                    quanLyCLB(dsCLB);
                    break;
                case 0:
                    System.out.println("Chuong trinh hoan thanh");
            }
        }while(luachon > 0);
    }
}

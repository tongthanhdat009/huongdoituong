import java.util.*;
public class dscaulacbo{
    public ArrayList<caulacbo> dsCLB = new ArrayList<>();
    public int soluong;
    Scanner in = new Scanner(System.in);
    public dscaulacbo(){
        this.dsCLB = new ArrayList<>();
        this.soluong=0;
    }
    public dscaulacbo(ArrayList<caulacbo> dscaulacbo){
        this.dsCLB = dscaulacbo;
        this.soluong = dscaulacbo.size();
    }
    public void setDanhSach(ArrayList<caulacbo> dsCLB){
        this.dsCLB = dsCLB;
    }
    public ArrayList<caulacbo> getDanhSach(){
        return this.dsCLB;
    }
    public void nhap(){
        int soluong;
        ArrayList<caulacbo> ds = new ArrayList<>();
        System.out.println("Nhap so luong cau lac bo: ");
        soluong = in.nextInt();
        this.soluong = soluong;
        for(int i=0; i < soluong; i++){
            boolean flag;
            do {
                flag = true; // Đặt flag mỗi lần bắt đầu vòng lặp
                caulacbo a = new caulacbo();
                a.nhap();
                for (caulacbo b : this.dsCLB) {
                    if (a.getMaCLB().equals(b.getMaCLB())) {
                        System.out.println("--------------------------------------------");
                        System.out.println("Ma khong hop le moi nhap lai!");
                        System.out.println("--------------------------------------------");
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    ds.add(a);
                }
            } while (!flag);    
        }
        this.dsCLB =ds;
    }
    public void themCLB() {
        System.out.println("**Them cau lac bo**");
        boolean flag;
        do {
            flag = true; // Đặt flag mỗi lần bắt đầu vòng lặp
            caulacbo a = new caulacbo();
            a.nhap();
            for (caulacbo b : this.dsCLB) {
                if (a.getMaCLB().equals(b.getMaCLB())) {
                    System.out.println("--------------------------------------------");
                    System.out.println("Ma khong hop le moi nhap lai!");
                    System.out.println("--------------------------------------------");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                this.dsCLB.add(a);
            }
        } while (!flag);
    }
    
    public void xoaCLB(){
        System.out.println("**Xoa cau lac bo**");
        System.out.println("Moi nhap ma cau lac bo de xoa: ");
        String a = new String();
        do{
            a = in.nextLine();
            if(a.matches("([CLB]){3}([A-Z]|[a-z]){0,256}")){
                for(caulacbo b : dsCLB){
                    if(a.equals(b.getMaCLB())){
                        dsCLB.remove(b);
                        break;
                    }
                }
            }
            else{
                System.out.println("Ma cau lac bo khong hop le moi nhap lai");
            }
        }while(!a.matches("([CLB]){3}([A-Z]|[a-z]){0,256}"));// biểu thức chính quy để xét mã câu lạc bộ
    }
    public void suaCLB(){
        System.out.println("**Sua thong tin cau lac bo");
        System.out.println("Moi nhap ma cau lac bo can sua thong tin: ");
        String a = new String();
        boolean found;
        do{
            found = true;
            a = in.nextLine();
            if(a.matches("([CLB]){3}([A-Z]|[a-z]){0,256}")){
                for(caulacbo b : dsCLB){
                    if(a.equals(b.getMaCLB())){
                        boolean flag;
                        do{
                            flag = true;
                            System.out.println("Nhap so de lua chon thong tin can sua: ");
                            System.out.println("1. Sua ten cau lac bo");
                            System.out.println("2. Sua cong viec cua cau lac bo");
                            int choice;
                            choice = in.nextInt();
                            in.nextLine();
                            if(choice == 1){
                                String c = new String();
                                System.out.print("Nhap ten cau lac bo muon thay doi: ");
                                c = in.nextLine();
                                b.setTenCLB(c);
                            }
                            else if (choice == 2){
                                String c = new String();
                                System.out.println("Nhap cong viec muon thay doi: ");
                                c = in.nextLine();
                                b.setCongViec(c);
                            }
                            else{
                                System.out.println("Lua chon khong hop le moi nhap lai!");
                                flag = false;
                            }
                        }while(!flag);
                        break;
                    }
                }
            }
            else{
                System.out.println("Ma cau lac bo khong hop le! Moi nhap lai");
                found = false;
            }
        }while(!a.matches("([CLB]){3}([A-Z]|[a-z]){0,256}") || !found);// biểu thức chính quy để xét mã câu lạc bộ
    }

    public void xuat(){
        System.out.printf("Danh sach hien tai co %d:\n",this.dsCLB.size());
        for(caulacbo a : dsCLB){
            System.out.println(a.toString());
        }
    }

    public static void main (String args[]){
        ArrayList<caulacbo> a = new ArrayList<>();
        caulacbo a1 = new CLBamnhac();
        caulacbo a2 = new CLBtoanhoc();
        caulacbo a3 = new CLBkhoahoc();
        a.add(a1);
        a.add(a2);
        a.add(a3);
        dscaulacbo b = new dscaulacbo(a);
        b.xuat();
        // b.nhap();
        // b.themCLB();
        // b.xoaCLB();
        b.suaCLB();
        b.xuat();
    }
}
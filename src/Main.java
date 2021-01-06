import java.util.Scanner;

public class Main {
    static BillManage billManage = new BillManage();
    static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm biên lai ");
            System.out.println("2.Hiển thị tất cả danh sách");
            System.out.println("nhập lựa chọn:");
            choice=Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhập số khách hàng muốn thêm vào: ");
                    int number = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < number; i++) {
                        addNew();
                    }
                    break;
                case 2:
                    billManage.displayAll();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }while (choice!=0);


    }
    public static void addNew(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập số nhà: ");
        String homeID = sc.nextLine();
        System.out.println("Nhập mã công tơ: ");
        String meterCode = scanner.nextLine();
        System.out.println("Nhập số điện cũ: ");
        int oldIndex = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số điện mới: ");
        int newIndex = Integer.parseInt(scanner.nextLine());
        Custumer custumer=new Custumer( name, homeID, meterCode);
        Bill bill = new Bill( custumer, oldIndex, newIndex);
        billManage.addBill(bill);
        System.out.println("________________________");
    }
}

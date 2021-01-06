import java.util.ArrayList;

public class BillManage {
    ArrayList<Bill> arrayList = new ArrayList<>();

    public void addBill(Bill bill){
        arrayList.add(bill);
    }

    public void displayAll(){
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

        }
    }


}

public class Bill {
    private Custumer custumer;
    private int oldIndex;
    private int newIndex;
    private int totalMoney;

    public Bill(Custumer custumer, int oldIndex, int newIndex) {
        this.custumer = custumer;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public Custumer getCustumer() {
        return custumer;
    }

    public int getTotalMoney() {
        return totalMoney = (newIndex - oldIndex) * 750;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "custumer=" + custumer +
                ", oldIndex=" + oldIndex +
                ", newIndex=" + newIndex +
                ", totalMoney=" + getTotalMoney() +
                '}';
    }
}

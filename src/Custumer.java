public class Custumer {
    private String name;
    private String homeID;
    private String meterCode;

    public Custumer(String name, String homeID, String meterCode) {
        this.name = name;
        this.homeID = homeID;
        this.meterCode = meterCode;
    }

    public String getMeterCode() {
        return meterCode;
    }

    @Override
    public String toString() {
        return "Custumer{" +
                "name='" + name + '\'' +
                ", homeID='" + homeID + '\'' +
                ", meterCode='" + meterCode + '\'' +
                '}';
    }
}

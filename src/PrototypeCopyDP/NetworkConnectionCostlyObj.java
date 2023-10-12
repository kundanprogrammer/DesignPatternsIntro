package PrototypeCopyDP;

public class NetworkConnectionCostlyObj implements Cloneable{

    private String ip;

    @Override
    public String toString() {
        return "NetworkConnectionCostlyObj{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                '}';
    }

    private String importantData;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void loadVeryImportantData(){

        this.importantData="Bahuut Important Data";

        //it contains the complex logic to implement
    }

    @Override
    public NetworkConnectionCostlyObj clone() {
        try {


//            deep copy:->
//
//            NetworkConnectionCostlyObj network1=new NetworkConnectionCostlyObj();
//            network1.setIp(this.getIp());
//            network1.setImportantData(this.getImportantData());
//            for (String d:this.arrayList()){
//                network1.getarrayList().add(d);
//            }

            NetworkConnectionCostlyObj clone = (NetworkConnectionCostlyObj) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

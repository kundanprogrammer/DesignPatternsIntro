package PrototypeCopyDP;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating objects for the first time");
        NetworkConnectionCostlyObj networkConnectionCostlyObj= new NetworkConnectionCostlyObj();
        networkConnectionCostlyObj.setIp("192.143.43.3");
        networkConnectionCostlyObj.loadVeryImportantData();
        System.out.println(networkConnectionCostlyObj);

        System.out.println("Creating objects for the second time");
//          by default shallow copy

        NetworkConnectionCostlyObj newConnection=null;
        newConnection= (NetworkConnectionCostlyObj) networkConnectionCostlyObj.clone();
        System.out.println(newConnection);

        /*
            shallow copy:
                same reference of copied {object commonly accessed for both<object inside object>}
                full memory reference is coppied not its value so it works on the "same common data"
                rather then making a new Object of Object
            deep copy:
                values are stored and we have our own values clonned from the class, if we change  the
                value of cloned varibles/objects , its values are changed locally , and it "does not
                affect" the Real Object from which its been cloned, so we have our "local copy"
         */



    }
}

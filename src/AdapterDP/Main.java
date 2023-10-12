package AdapterDP;

public class Main {
    public static void main(String[] args) {
        System.out.println("Battery Low so charge the phone");

//        AppleCharger appleOriginalCharger= new AppleChargerCompany();

        AppleCharger jadooCharger=new AdapterConverterAppleChargerFromAndroidCharger(new AndroidChargerCompany());

        IPhone15 iPhone15 =new IPhone15(jadooCharger);

        iPhone15.chargeIPhone();
    }
}

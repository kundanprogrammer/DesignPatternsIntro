package AdapterDP;

public class AdapterConverterAppleChargerFromAndroidCharger implements AppleCharger{

    private AndroidCharger charger;

    public AdapterConverterAppleChargerFromAndroidCharger(AndroidCharger charger) {
        this.charger = charger;
    }

    @Override
    public void chargeiPhone() {
        charger.chargeAndroid();
        System.out.println("Your phone is charging using Adapter");
    }
}

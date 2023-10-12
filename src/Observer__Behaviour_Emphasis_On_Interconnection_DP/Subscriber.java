package Observer__Behaviour_Emphasis_On_Interconnection_DP;

public class Subscriber implements Observer{
    @Override
    public void notified() {

        System.out.println("new video uploaded: notification");
    }
}

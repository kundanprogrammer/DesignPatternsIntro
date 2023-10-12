package Observer__Behaviour_Emphasis_On_Interconnection_DP;

public class Main
{
    public static void main(String[] args) {
        YouTubeChannel channel=new YouTubeChannel();

        Subscriber aman=new Subscriber();
        channel.subscribe(aman);
        channel.notifyChanges();

    }
}

package Observer__Behaviour_Emphasis_On_Interconnection_DP;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject{

    private List<Observer> subscriber=new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        this.subscriber.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.subscriber.remove(observer);

    }

    @Override
    public void notifyChanges() {
        for(Observer ob:this.subscriber){
            ob.notified();
        }

    }
}

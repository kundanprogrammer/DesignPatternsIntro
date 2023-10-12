package Observer__Behaviour_Emphasis_On_Interconnection_DP;

public interface Subject {

    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyChanges();
}

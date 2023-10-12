package SingletonDP;

public class Jalebi {

    private static Jalebi jalebi = new Jalebi();  //Eager way of creating object

    public static Jalebi getJalebi(){
        return jalebi;
    }

}

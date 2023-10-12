package SingletonDP;

import java.lang.reflect.Constructor;
import java.sql.SQLOutput;

public class Test1 {
    public static void main(String[] args) throws Exception{

        Samosa samosa1 = Samosa.getSamosa();      // lazy way of initialization
        System.out.println(samosa1.hashCode());

        Samosa samosa2 = Samosa.getSamosa();     //  lazy way of initialization
        System.out.println(samosa2.hashCode());

        System.out.println(Jalebi.getJalebi().hashCode());  //Eager way of initialization
        System.out.println(Jalebi.getJalebi().hashCode());  //Eager way of initialization





        // breaking
        Constructor<Samosa> constructor=Samosa.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Samosa s3=constructor.newInstance();
        System.out.println(s3.hashCode());

        //solution 1
//        @Samosa.java-> private Samosa(){
//                    if(samosa!=null){
//                        throw new RuntimeException("Your are trying to break singleton");
//                    }
//        }

//        solution 2
//            @Samosa.java
//                    re-write everythin public enum Samosa{
//            INSTANCE;
//        }
//        CALL-> Samosa s1=Samosa.INSTANCE;
//        System.out.println(s1.hashCode());
//


        /*breaking 2 through serializable and deserializable

        Samosa class must implement Serializable

        Samosa samosa1 -Samosa.getSamosa();
        sout-> hashCode

        ObjectOutputStream oos = ObjectOutputStream(new FileOutputStream("abc.ob"))
        oos.writeObject(samosa);

        ObjectInputStream ois= ObjectInputStream(new FileInputStream("abc.ob"))
        Samosa samosa2=(Samosa) ois.readObject();
        sout->hashcode
         */

//        solution 2 @ Samosa Class


//        breaking 3:
//            clonnable interface

//            Samosa s2=(Samosa) samosa.clone();

    //by implementing clonnable interface@ Samosa and in main we have to
//                        append throws CloneNotSupportedException

//                and at Samosa.java ->
//        public Object clone() throws CloneNotSupportedException{
//                return super.clone();
//        }
    }
}

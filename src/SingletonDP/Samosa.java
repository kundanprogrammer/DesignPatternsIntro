package SingletonDP;

public class Samosa {
    //by default : singleton, i.e. JDBC connection and JDBC template to call
    // construction must be private to prevent creating new object everytime

    private static Samosa samosa;

    private Samosa(){

    }
    public static Samosa getSamosa(){  //for thread safe we may write
                                        //  public synchronized static Samosa getSamosa()

        if(samosa==null)  //but its not tread safe
        {

            /*for thread safe we can also make block as synchronized as
                synchronized (Samosa.class){
                if(samosa==null){
                    samosa=new Samosa();
                    }
                }
             */


            samosa=new Samosa();
        }

        return samosa;
    }

    /*solving breaking pattern 2 of input/output serializable stuff

     */
//    from implements Serializable
//    public Object readResolve(){
//        return samosa;
//    }



}

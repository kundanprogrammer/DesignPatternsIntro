package BuilderDP;

public class Main {
    public static void main(String[] args) {
        User user1=new User.UserBuilder()
                .setUserName("kundan")
                .setUserId("User123").
                setEmailId("Kundanp0002@gmail.com")
                .build();


        System.out.println(user1);
    }
}

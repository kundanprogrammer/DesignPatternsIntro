package BuilderDP;

public class User {
  // for immutable objects
    private String UserId;
    private String userName;
    private String emailId;

    @Override
    public String toString() {
        return "User{" +
                "UserId='" + UserId + '\'' +
                ", userName='" + userName + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    public String getUserId() {
        return UserId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    private User(UserBuilder builder){
        this.UserId=builder.UserId;
        this.userName=builder.userName;
        this.emailId=builder.emailId;

    }
    static class UserBuilder{
        private String UserId;
        private String userName;
        private String emailId;

        public UserBuilder(){


        }

        public UserBuilder setUserId(String userId) {
            UserId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }


        public User build(){
            User user= new User(this);
            return user;
        }
    }
}

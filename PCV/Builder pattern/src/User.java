public class User{
    private String firstname;
    private String lastName;
    private int age;
    private String userName;
    private String password;
    private String gender;
    private int phone;

    public static class Builder {

        private String firstname;
        private String lastName;
        private int age;
        private String userName;
        private String password;
        private String gender;
        private int phone;


        public Builder(String firstname, String lastName){
            this.firstname = firstname;
            this.lastName = lastName;
        }



        public Builder vek(int age){
            this.age = age;
            return this;
        }

        public Builder usName(String userName){
            this.userName = userName;
            return this;
        }

        public Builder heslo(String password){
            this.password = password;
            return this;
        }

        public Builder pohlavi(String gender){
            this.gender = gender;
            return this;
        }

        public Builder telefon(int phone){
            this.phone = phone;
            return this;
        }

        public User build(){
            User user = new User();
            user.firstname = this.firstname;
            user.userName = this.userName;
            user.age = this.age;
            user.password = this.password;
            user.gender = this.gender;
            user.phone = this.phone;

            return user;
        }

    }
}


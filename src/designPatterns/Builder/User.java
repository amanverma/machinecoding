package designPatterns.Builder;

public class User {
    //All final attributes
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // required
    private final String phoneNbr; // optional
    private final String address; // optional
    private final String nationality; //optional

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phoneNbr = builder.phoneNbr;
        this.address = builder.address;
        this.nationality = builder.nationality;
    }

    //Setters are not provided to make it immutable
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getPhoneNbr() {
        return phoneNbr;
    }
    public String getAddress() {
        return address;
    }
    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "User: "+this.firstName+" "+this.lastName+", "+this.age+", "+this.nationality+", "+this.phoneNbr+", "+this.address;
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phoneNbr;
        private String address;
        private String nationality;

       public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
            public UserBuilder age(int age) {
            this.age = age;
            return this;
        }
            public UserBuilder phoneNbr(String phoneNbr) {
            this.phoneNbr = phoneNbr;
            return this;
        }
            public UserBuilder address(String address) {
            this.address = address;
            return this;
        }
            public UserBuilder nationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
            // method to return the constructed object
            public User build() {
            User user =  new User(this);
            validateUserObject(user);
            return user;
        }
            private void validateUserObject(User user) {
            //Validate of the object does not break anything
        }
    }

}

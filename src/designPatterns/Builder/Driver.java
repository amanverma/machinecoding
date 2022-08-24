package designPatterns.Builder;

public class Driver {
    public static void main(String[] args) {
        User firstUser = new User.UserBuilder("Harry", "Potter")
                .age(30)
                .phoneNbr("1234567")
                .address("221B Baker Street - London")
                .build();

        System.out.println(firstUser);

        User secondUser = new User.UserBuilder("Ron", "Weasley")
                .age(32)
                .phoneNbr("5655")
                //no address
                .build();

        System.out.println(secondUser);

        User thirdUser = new User.UserBuilder("Hermoine", "Granger").age(20).nationality("English")
                //No age
                //No phone
                //no address
                .build();

        System.out.println(thirdUser);
    }
}

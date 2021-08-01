public class client {

    public static void main(String[] args) {
        User user1= new User.UserBuilder("Hari","Sahu")
                .withAge(24)
                .withAddress("BBSR")
                .withPhone("909076123")
                .build();
        System.out.println("USER-1::"+user1);

        User user2= new User.UserBuilder("Sima","Sahu")
                .withPhone("909076123")
                .build();
        System.out.println("USER-2::"+user2);

        User user3= new User.UserBuilder("Sanju","Sahu")
                .withAge(24)
                .build();
        System.out.println("USER-3::"+user3);

    }
}

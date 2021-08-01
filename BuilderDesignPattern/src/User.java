public class User {
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional

    public User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.phone = userBuilder.phone;
        this.address = userBuilder.address;
    }


    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class UserBuilder{
        private final String firstName;  //required parameter
        private final String lastName;   //required parameter
        private int age;
        private String phone;
        private String address;


        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder withAge(int age){
            this.age=age;
            return this;

        }
        public UserBuilder withPhone(String phone){
            this.phone=phone;
            return this;

        }

        public UserBuilder withAddress(String address){
            this.address=address;
            return this;

        }


        public User build(){
            User user=new User(this);
            return user;
        }

    }

 /*   "C:\Program Files\Java\jdk1.8.0_291\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2019.3.4\lib\idea_rt.jar=58525:C:\Program Files\JetBrains\IntelliJ IDEA 2019.3.4\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_291\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_291\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_291\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_291\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_291\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_291\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_291\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_291\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_291\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_291\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_291\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_291\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_291\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_291\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_291\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_291\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_291\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_291\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_291\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_291\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_291\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_291\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_291\jre\lib\rt.jar;D:\DesignPatterns\BuilderDesignPattern\out\production\BuilderDesignPattern" client
    USER-1::User{firstName='Hari', lastName='Sahu', age=24, phone='909076123', address='BBSR'}
    USER-2::User{firstName='Sima', lastName='Sahu', age=0, phone='909076123', address='null'}
    USER-3::User{firstName='Sanju', lastName='Sahu', age=24, phone='null', address='null'}*/
}

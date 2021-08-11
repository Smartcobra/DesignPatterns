import java.io.*;

public class Singleton implements Serializable {
    private static Singleton INSTANCE;

    private Singleton() {
    }

    public static Singleton getInstacnce() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }

        return INSTANCE;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton instance= Singleton.getInstacnce();

        ObjectOutputStream os= new ObjectOutputStream(new FileOutputStream("instance.ser"));
        os.writeObject(instance);
        os.close();

        //read the instance
        ObjectInputStream is=new ObjectInputStream(new FileInputStream("instance.ser"));
        Singleton s1= (Singleton) is.readObject();
        is.close();

        ObjectInputStream is2= new ObjectInputStream(new FileInputStream("instance.ser"));
        Singleton s2= (Singleton) is2.readObject();
        is2.close();

        System.out.println("S1 Instance::  "+s1.getInstacnce());
        System.out.println("S2 Instance::  "+s2.getInstacnce());

        System.out.println("S1 ::"+s1);
        System.out.println("S2 ::"+s2);//singleton breaks here
    }

}

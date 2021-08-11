import java.io.*;

public class SingletonUnSerializable implements Serializable {
    private static SingletonUnSerializable INSTANCE;

    private SingletonUnSerializable() {
    }

    public static SingletonUnSerializable getInstacnce() {
        if (INSTANCE == null) {
            synchronized (SingletonUnSerializable.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonUnSerializable();
                }
            }
        }

        return INSTANCE;
    }
             private Object readResolve(){
                  return INSTANCE;
             }//this will ensure Singleton.




    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingletonUnSerializable instanceUN= SingletonUnSerializable.getInstacnce();

        ObjectOutputStream os= new ObjectOutputStream(new FileOutputStream("instance.ser"));
        os.writeObject(instanceUN);
        os.close();

        //read the instance
        ObjectInputStream is=new ObjectInputStream(new FileInputStream("instance.ser"));
        SingletonUnSerializable s1= (SingletonUnSerializable) is.readObject();
        is.close();

        ObjectInputStream is2= new ObjectInputStream(new FileInputStream("instance.ser"));
        SingletonUnSerializable s2= (SingletonUnSerializable) is2.readObject();
        is2.close();

        System.out.println("S1 Instance::  "+s1.getInstacnce());
        System.out.println("S2 Instance::  "+s2.getInstacnce());

        System.out.println("S1 ::"+s1);
        System.out.println("S2 ::"+s2);
    }

}

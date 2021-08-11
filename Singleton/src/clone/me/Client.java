package clone.me;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        SingletonCloning sc1=SingletonCloning.getINSTANCE();
        SingletonCloning sc2= (SingletonCloning) sc1.clone();

        System.out.println("sc1::"+sc1);
        System.out.println("sc2::"+sc2);//breaks singleton

        SingletonCloningUnBreak scB1=SingletonCloningUnBreak.getINSTANCE();
        SingletonCloningUnBreak scB2= (SingletonCloningUnBreak) sc1.clone();

        System.out.println("sc1::"+scB1);
        System.out.println("sc2::"+scB2);//breaks singleton
    }
}

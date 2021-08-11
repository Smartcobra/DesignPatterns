package clone.me;

public class SingletonCloning extends CloneSuper {

    private static SingletonCloning INSTANCE;

    private SingletonCloning() {

    }

    public static SingletonCloning getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (SingletonCloning.class) {
                if (INSTANCE == null) {
                    return new SingletonCloning();
                }

            }
        }
        return INSTANCE;

    }


}

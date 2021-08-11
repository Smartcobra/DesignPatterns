package clone.me;

public class SingletonCloningUnBreak extends CloneSuper {

    private static SingletonCloningUnBreak INSTANCE;

    private SingletonCloningUnBreak() {

    }

    public static SingletonCloningUnBreak getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (SingletonCloningUnBreak.class) {
                if (INSTANCE == null) {
                    return new SingletonCloningUnBreak();
                }

            }
        }
        return INSTANCE;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}

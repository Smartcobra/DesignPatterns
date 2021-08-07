public class RealObjectProxy extends RealObjectImpl {

    @Override
    public void doSomething() {

        //perform logic to security
        System.out.println("Delegating work to real object");

        super.doSomething();
    }
}

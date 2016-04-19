package cast.clazz;

/**
 * Created by Mikalai_Churakou on 4/19/2016.
 */
public class B extends A {
    public B(){
        System.out.println("Constructor B");
    }

    public static void main(String[] args) {
        A a = new B();
        B b = (B)new A();
    }


}

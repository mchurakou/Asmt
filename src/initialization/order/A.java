package initialization.order;

/**
 * Created by Mikalai_Churakou on 4/19/2016.
 */
public class A {

    public A(){

        System.out.println("Constructor A");
    }

    {
        System.out.println("Block A");
    }

    static {
        System.out.println("Static Block A");
    }

}

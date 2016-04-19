package initialization.order;

/**
 * Created by Mikalai_Churakou on 4/19/2016.
 */
public class C extends B {
    public C(){
        System.out.println("Constructor C");
    }

    {
        System.out.println("Block C");
    }


    static {
        System.out.println("Static Block C");
    }

    public static void main(String[] args)
    {
        new C();
    }
}

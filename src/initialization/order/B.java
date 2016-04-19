package initialization.order;

/**
 * Created by Mikalai_Churakou on 4/19/2016.
 */
public class B extends A{
    public B(){
        System.out.println("Constructor B");
    }

    {
        System.out.println("Block B");
    }


    static {
        System.out.println("Static Block B");
    }


}

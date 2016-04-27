package initialization.order;

/**
 * Created by Mikalai_Churakou on 4/19/2016.
 */
class A {

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
class B extends A{
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

class C extends B {
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

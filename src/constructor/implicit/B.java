package constructor.implicit;

/**
 * Created by Mikalai_Churakou on 4/19/2016.
 */
public class B extends A {
    public  B(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        new B("Hello");
    }

}

package constructor.parent;

/**
 * Created by Mikalai_Churakou on 4/19/2016.
 */
class A {
    public A() {
        System.out.println("default");
    }

}

class B extends A {
    public  B(String s){
        System.out.println(s);
        super();
    }

    public static void main(String[] args) {

        new B("Hello");
    }

}

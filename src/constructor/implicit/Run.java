package constructor.implicit;

/**
 * Created by Mikalai_Churakou on 4/19/2016.
 */
class A {

    public A(String str){
        System.out.println("A" + str);
    }

//    public A(){
//        System.out.println("default");
//    }

}

class B extends A {
    public  B(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        new B("Hello");
    }

}

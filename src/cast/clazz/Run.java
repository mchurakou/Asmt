package cast.clazz;

class A {

    public A(){

        System.out.println("Constructor A");
    }

}

class B extends A {
    public B(){
        System.out.println("Constructor B");
    }

    public static void main(String[] args) {
        A a = new B();
        B b = (B)new A();
    }

}

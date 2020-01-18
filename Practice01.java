package Practice01;

public class Practice01 {

    static int count;
    int c;

    public static class A {
        public static void foo() {
            count++;
        }
    }

    public static class B {
        public void foo() {
            count++;
        }
    }


    public class C {
        public void foo() {
            c++;
        }
    }


    public C newC() {
        return new C();
    }

    public static void main(String[] args) {
//        A a = new A();
//        a.foo();
        A.foo();

        //B.foo(); Error!
        B b = new B();
        b.foo();
        System.out.println("count: " + count); // 2? 3?

        //C c = new C(); Error!
        Practice01 p = new Practice01();
        C c1 = p.newC();
        C c2 = p.newC();
        c1.foo(); //?
        c2.foo(); //?
        System.out.println("p.c: " + p.c); //?
//        System.out.println("c1.c: " + c1.c);
//        System.out.println("c2.c: " + c2.c);

    }
}

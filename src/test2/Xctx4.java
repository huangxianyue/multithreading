package test2;

public class Xctx4 {

    public static void main(String[] args) {

        TestBean4 t = new TestBean4();
        Thread t1 = new Thread(new Input4(t));
        Thread t2 = new Thread(new Output4(t));
        t1.start();
        t2.start();
    }
}

package test2;

public class Xctx2 {

    public static void main(String[] args) {

        TestBean t = new TestBean();
        Input2 in = new Input2(t);
        Output2 out = new Output2(t);

        Thread t1 = new Thread(in);
        Thread t2 = new Thread(out);
        t1.start();
        t2.start();
    }
}

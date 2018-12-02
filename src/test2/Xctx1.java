package test2;

public class Xctx1 {

    public static void main(String[] args) {
        TestBean t = new TestBean();
        Input in = new Input(t);
        Output out = new Output(t);
        Thread t1 = new Thread(in);
        Thread t2 = new Thread(out);
        t1.start();
        t2.start();
    }
}

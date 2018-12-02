package test2;

public class Output4 implements Runnable {
    private TestBean4 t;

    Output4(TestBean4 t) {
        this.t = t;
    }

    @Override
    public void run() {
        while (true) {
            t.out();
        }
    }
}

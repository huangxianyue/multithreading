package test2;

public class Input implements Runnable {
    private TestBean t;
    Input(TestBean t) {
        this.t = t;
    }
    @Override
    public void run() {
        int x = 0;
        while (true) {
            if (x == 0) {
                t.name="haha";
                t.sex="girl";
            } else {
                t.name="莎莎";
                t.sex="男的";
            }
            x = (x + 1) % 2;
        }
    }
}

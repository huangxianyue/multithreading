package test2;

public class Input4 implements Runnable {

    private TestBean4 t;

    Input4(TestBean4 t) {
        this.t = t;
    }

    @Override
    public void run() {
        int x = 0;
        while (true) {
                if (x == 0) {
                    t.set("haha","girl");
                } else {
                    t.set("莎莎","男的");
                }
                x= (x+1)%2;
            }
        }
}

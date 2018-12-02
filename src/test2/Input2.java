package test2;

public class Input2 implements Runnable {

    private TestBean t;

    Input2(TestBean t) {
        this.t = t;
    }

    @Override
    public void run() {
        int x = 0;
        while (true) {
            synchronized (t){           //同步代码块，同步对象是唯一的
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
}

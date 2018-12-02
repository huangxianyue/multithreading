package test2;

public class Input3 implements Runnable {

    private TestBean t;

    Input3(TestBean t) {
        this.t = t;
    }

    @Override
    public void run() {
        int x = 0;
        while (true) {
            synchronized (t){           //同步代码块，同步对象是唯一的
                if (t.flag) //true代表有数据，等待，flase代表数据已消费，继续执行
                {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (x == 0) {
                    t.name="haha";
                    t.sex="girl";
                } else {
                    t.name="莎莎";
                    t.sex="男的";
                }
                x = (x + 1) % 2;
                t.flag = true;
                notify();   //唤醒
            }

        }
    }
}

package test2;

public class Output3 implements Runnable {
    private TestBean t;

    Output3(TestBean t) {
        this.t = t;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (t){
                if(!t.flag) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                    System.out.println(t.name + "............." + t.sex);
                    t.flag = false;
                    notify();


            }
        }
    }
}

package test2;

public class Output2 implements Runnable {
    private TestBean t;

    Output2(TestBean t) {
        this.t = t;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (t){
                System.out.println(t.name + "............." + t.sex);
            }
        }
    }
}

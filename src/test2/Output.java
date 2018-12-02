package test2;

public class Output implements Runnable {
    private TestBean t;
    Output(TestBean t) {
        this.t = t;
    }
    @Override
    public void run() {
        while (true) {
            System.out.println(t.name + "............." + t.sex);
        }
    }
}

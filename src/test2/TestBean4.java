package test2;

public class TestBean4 {
    private String name;private String sex;private boolean flag = false;
    public synchronized void set(String name, String sex) {
        if (this.flag) {
            try { wait();} catch (InterruptedException e) {e.printStackTrace();}
        }
        this.name = name;
        this.sex = sex;
        this.flag = true;
        notify();
    }
    public synchronized void out(){
        if (!this.flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.name + "__________" + this.sex);
        this.flag = false;
        notify();
    }
}

package designModel.producterConsumerMode;

public class SyncStack {
    private String[] strings = new String[10];
    private int index;

    public synchronized void product(String str) {
        if (index == strings.length) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        strings[index++] = str;
    }

    //供消费者调用
    public synchronized String consume() {
        if (index == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        return strings[--index];
    }

    public String[] pro() {
        return strings;
    }
}

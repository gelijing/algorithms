package designModel.producterConsumerMode;

public class Producter implements Runnable {
    private SyncStack syncStack;

    public Producter(SyncStack syncStack) {
        this.syncStack = syncStack;
    }

    @Override
    public void run() {
        for (int i = 0; i < syncStack.pro().length; i++) {
            String msg = "产品" + i;
            syncStack.product(msg);
            System.out.println("生产了" + msg);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

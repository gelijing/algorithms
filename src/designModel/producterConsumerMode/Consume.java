package designModel.producterConsumerMode;

public class Consume implements Runnable {
    private SyncStack syncStack;
    public Consume(SyncStack syncStack){
        this.syncStack = syncStack;
    }
    @Override
    public void run() {
        for (int i = 0 ; i < syncStack.pro().length;i++){
            String msg = syncStack.consume();
            System.out.println("消费了"+msg);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

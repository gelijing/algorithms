package designModel.producterConsumerMode;

public class TestStack {
    public static void main(String[] args) {
        SyncStack syncStack = new SyncStack();
        Producter producter = new Producter(syncStack);
        Consume consume = new Consume(syncStack);
        new Thread(consume).start();
        new Thread(producter).start();
    }
}

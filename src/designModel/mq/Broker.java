package designModel.mq;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 缓冲区 本质上是共同访问的，共享数据区域
 * 称为仓库
 */
public class Broker {
    private final static int MAX_SIZE = 3;
    private static ArrayBlockingQueue<String> messageQueue = new ArrayBlockingQueue<>(MAX_SIZE);

    /**
     * 供生产者调用
     * 队列不满
     *
     * @param msg
     */
    public static void produce(String msg) {
        if (messageQueue.offer(msg)) {
            System.out.println("成功向消息中心投递消息：" + msg + ",当前暂存的消息数量是：" + messageQueue.size());
        } else {
            System.out.println("向消息中心投递消息失败：" + msg + ",当前暂存的消息数量是：" + messageQueue.size());
        }
        System.out.println("==================");
    }

    /**
     * 供消费者调用
     * 队列不空
     */
    public static String consume() {
        String msg = messageQueue.poll();
        if (msg != null) {
            System.out.println("成功消费消息：" + msg + ",当前暂存的消息数量是：" + messageQueue.size());
        } else {
            System.out.println("消息处理中心没有消息可供消费！");
        }
        System.out.println("==================");
        return msg;
    }
}

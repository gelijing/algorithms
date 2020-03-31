package tongcheng58Test;

import java.util.Scanner;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>(n);
            //int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                queue.add(sc.nextInt());
            }
            System.out.println(core(m, queue));
        }
    }

    private static int core(int m, PriorityBlockingQueue<Integer> queue) {
        if (queue.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < m; i++) {
            if (!queue.isEmpty()) {
                int a = queue.poll();
                int j = 0;
                while (!queue.isEmpty() && a == queue.peek()) {
                    queue.poll();
                    j++;
                }
                if (queue.isEmpty()) {
                    return a;
                }
                int b = queue.poll();
                for (int k = 0; k < j; k++) {
                    queue.offer(a);
                }
                queue.offer(a + b);
            }
        }
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.poll();
    }

}

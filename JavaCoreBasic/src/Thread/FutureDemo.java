package Thread;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class FutureDemo {

    // Tạo một đối tượng lock để đồng bộ hóa
    private static final Lock lock = new ReentrantLock();

    // Phương thức tính toán giả lập
    public static int compute() {
        lock.lock();
        try {
            // Giả lập thời gian tính toán
            Thread.sleep(100);
            return 123; // Trả về một kết quả giả lập
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
        return 0;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Gửi tác vụ tính toán đến executor service
        Future<Integer> future = executor.submit(new Callable<Integer>() {
            public Integer call() {
                return compute();
            }
        });

        // Thực hiện một tác vụ khác trong khi tác vụ trên đang được xử lý
        Future<Integer> anotherFuture = executor.submit(new Callable<Integer>() {
            public Integer call() {
                return compute();
            }
        });

        // Đợi kết quả từ các future
        Integer result = future.get();
        Integer anotherResult = anotherFuture.get();

        System.out.println("Kết quả của tác vụ 1: " + result);
        System.out.println("Kết quả của tác vụ 2: " + anotherResult);

        // Dọn dẹp và tắt executor service
        executor.shutdown();
    }
}

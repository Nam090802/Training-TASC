package Thread;

public class ThreadExample extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread: " + Thread.currentThread().getName() + " i = " + i);
                // Đặt thread ngủ 1000 milliseconds
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + Thread.currentThread().getName() + " interrupted.");
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " finishing.");
    }

    public static void main(String[] args) {
        ThreadExample thread1 = new ThreadExample();
        thread1.setName("MyThread1");
        thread1.start(); // Khởi động thread

        ThreadExample thread2 = new ThreadExample();
        thread2.setName("MyThread2");
        thread2.start(); // Khởi động thread

        try {
            // Đợi cho đến khi thread1 kết thúc
            thread1.join();
            System.out.println("Thread1 has finished executing.");

            // Kiểm tra xem thread2 có còn sống không
            if (thread2.isAlive()) {
                System.out.println("Thread2 is still alive.");
            } else {
                System.out.println("Thread2 has finished executing.");
            }

            // Gửi yêu cầu ngắt thread2
            thread2.interrupt();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}

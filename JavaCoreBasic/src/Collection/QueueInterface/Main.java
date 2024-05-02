package Collection.QueueInterface;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(8);
        priorityQueue.add(4);
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(6);
        priorityQueue.add(9);
        priorityQueue.add(0);// ném ra ngoại lệ IllegalStateException

        //trả về phần tử đầu tiên và xóa
        priorityQueue.poll();
        priorityQueue.remove();// ném ra ngoại lệ NoSuchElementException

        //trả về phần tử đầu tiên
        priorityQueue.peek();
        priorityQueue.element();// ném ra ngoại lệ NoSuchElementException

        priorityQueue.size();

        priorityQueue.isEmpty();
        System.out.println(priorityQueue);
    }
}

import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {
        // Create a Min-Heap using PriorityQueue
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Values to insert
        int[] values = {10, 4, 8, 1, 7, 3};

        // Insert values into the Min-Heap
        for (int val : values) {
            minHeap.add(val);  // or minHeap.offer(val)
            System.out.println("Inserted " + val + ": Current Min-Heap = " + minHeap);
        }
    }
}

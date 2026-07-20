import java.util.ArrayDeque;
import java.util.Deque;

class PrintServer {
    private Deque<Integer> printQueue = new ArrayDeque<>();

    public void submitJob(int jobId) {
        printQueue.addLast(jobId); // Normal job goes to the back
    }

    public void submitUrgentJob(int jobId) {
        printQueue.addFirst(jobId); // Urgent job jumps straight to the front
    }

    public int printNextJob() {
        if (printQueue.isEmpty()) {
            throw new RuntimeException("No jobs in queue");
        }
        return printQueue.removeFirst(); // Printer always takes from the front
    }
}
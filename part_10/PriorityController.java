package part_10;

public class PriorityController {
    public static void main(String[] args) {
        Exercise_2_pt4 HighPriority = new Exercise_2_pt4("High Priority");
        Exercise_2_pt4 LowPriority = new Exercise_2_pt4("Low Priority");

        HighPriority.thread.setPriority(Thread.MAX_PRIORITY);
        LowPriority.thread.setPriority(Thread.MIN_PRIORITY);

        HighPriority.thread.start();
        LowPriority.thread.start();

        try {
            LowPriority.thread.join();
            HighPriority.thread.join();

        } catch (InterruptedException e) {
            e.toString();
        }
    }
}

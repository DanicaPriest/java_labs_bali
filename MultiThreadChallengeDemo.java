public class MultiThreadChallengeDemo {
    public static void main(String[] args) {
        MultiThreadingChallenge file1 = new MultiThreadingChallenge("/home/danica/Documents/CodingNomads/MTFile1.txt");
        MultiThreadingChallenge file2 = new MultiThreadingChallenge("/home/danica/Documents/CodingNomads/MTFile2.txt");
        MultiThreadingChallenge file3 = new MultiThreadingChallenge("/home/danica/Documents/CodingNomads/MTFile3.txt");
        MultiThreadingChallenge file4 = new MultiThreadingChallenge("/home/danica/Documents/CodingNomads/MTFile4.txt");

        try {
            file1.unicorn.start();
            file1.unicorn.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            file2.unicorn.start();
            file2.unicorn.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            file3.unicorn.start();
            file3.unicorn.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            file4.unicorn.start();
            file4.unicorn.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

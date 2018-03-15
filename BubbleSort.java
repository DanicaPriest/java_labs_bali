public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {27, 5, 99, 777, 7, 3, 3098, 1};
        int x;

        for (int j = 0; j < arr.length; j++) {

            for (int i = 1; i < arr.length - j; i++) {

                if (arr[i - 1] > arr[i]) {
                    x = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = x;
                }



            }
        }

        for (int r :  arr) {
            System.out.print(r + ", ");
        }

    }
}


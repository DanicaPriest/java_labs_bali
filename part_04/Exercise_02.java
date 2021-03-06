package part_04;

/**

 Use a for loop to count to 2017. While looping, populate an array with the
 value of your iterator (ie, i). Once populated, print out the odd values
 (ie, 2017, 2015, 2013) of the array in reverse order.

 */
class Exercise_02{

    public static void main(String[] args) {
        int[] arr = new int[2017];
        for(int i = 0; i < 2017; i++){
            arr[i] = i + 1;
        }

        for (int j = arr.length - 1; j >= 0; j-= 2){
            System.out.print(arr[j] + ", ");
        }
    }
}
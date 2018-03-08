package part_04;

/**

 Use a for loop to count to 2017. While looping, populate an array with the
 value of your iterator (ie, i). Once populated, print out the odd values
 (ie, 2017, 2015, 2013) of the array in reverse order.

 */
class Exercise_02{

    public static void main(String[] args) {
        int[] arr = new int[2017];
        for(int i = 1; i <= 2017; i++){
            arr[i - 1] = i;
        }
       
        for (int j = arr.length; j >= 0; j-= 2){
            System.out.print(j + ", ");
        }
    }
}
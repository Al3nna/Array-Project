// This program was made by Alenna for the Software and Programming Development class.
public class ArraysSum {
    public static void main(String[] args) {
        int[] array = new int [100]; //declaring new array & allocating memory for 100 integars

        sum(array); //passes array to the method "sum"
    }
    public static void sum(int[] array) {
        int sum = 0; //setting sum value to 0

        for (int x = 1; x <= 100; x++) {
            if (x % 2 == 0) { //checking if x is divisible by 2
                System.out.println(x + " is even.");
            } else {
                System.out.println(x + " is odd.");
            }
              sum += x; //Adding the current x to the sum
        }

        System.out.println("The total sum is " + sum + "."); //printing the total sum of all #'s in'
    }
}
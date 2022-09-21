// This program was made by Alenna for the Software and Programming Development class.
public class ArraysLength {
    public static void main(String[] args) {
     int[] array = new int [100]; //Declaring the array and allocating memory for 100 integars

     for (int x = 1; x <= 100; x++) {
        if (x % 2 == 0) { //Checking if current x is divisible by 2
            System.out.println(x + " is even.");
        } else {
            System.out.println(x + " is odd.");
        }
     }
     System.out.println("The total length is " + array.length + ".");
    }
    }
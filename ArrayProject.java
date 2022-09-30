//Alenna - alenna.castaneda@oneidaihla.org
//for CTE software development 1
//instructor Mr Gross
public class ArrayProject {
    public static void main(String[] args) {
        //creating an array with a size of 100
        int[] array = new int [100];

        //adding the values into the array
        for (int Index = 0; Index < array.length; Index++) {
               array[Index] = Index+1; 
        } 
        int sum = 0;

        for (int Index = 0; Index < array.length; Index++) {
            //Checking if current number is divisible by 2
            if (array[Index] % 2 == 0) {
                System.out.println(array[Index] + " is even.");
            } else {
                System.out.println(array[Index] + " is odd.");
            }
            sum += array[Index]; //adding current number to the sum
        }
        System.out.println("The total sum is " + sum + "."); //printing the final sum
    }
}
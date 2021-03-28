public class ArrayTest{
    public static void main(String[] args){
        int[] myArray; // declaring an array
        myArray = new int[5]; // creating array
        // int[] myArray = new int[5]; // Sir likes this method most probably for declaring and creating array together
        for (int i = 0; i < 5; i++)
        myArray[i] = 100 + i; //initializing array

        for (int i = 0; i <= 4; i++)
        System.out.println(myArray[i]);
    }
}


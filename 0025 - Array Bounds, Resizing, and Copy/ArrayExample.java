public class ArrayExample{
    public void arrayElement(int[] myArray) {
        for (int i = 0 ;  i < myArray.length ; i++) {
            System.out.println(myArray[i]);
        }
    }

    public void arrayResizing(){
        int[] arr = new int[10];
        arr = new int[5];
    }

    public void arrayCopy(){
        int[] x = {1, 2, 3, 4, 5, 6};
        int[] y = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.arraycopy(x, 0, y, 0, x.length);
    }
}

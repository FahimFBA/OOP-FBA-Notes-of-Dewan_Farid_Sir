public class CastTest{
    public static void main(String[] args){
        long bigValue = 99L;
        int smallValue = (int) bigValue; // Casting
        System.out.println(smallValue);
        smallValue = 50;
        bigValue = smallValue; // Auto Casting
        System.out.println(bigValue);
    }
}
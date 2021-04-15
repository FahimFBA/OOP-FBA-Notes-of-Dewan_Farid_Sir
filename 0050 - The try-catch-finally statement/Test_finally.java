public class Test_finally {
	public static void main(String[] args){
		try{
			int i = 9 / 10;
			System.out.println(i);
		} catch(ArithmeticException e1){
			System.out.println(" Arithmetic Exception." + e1);

		} finally{
			System.out.println("finally block must execute");
		}
	}
}
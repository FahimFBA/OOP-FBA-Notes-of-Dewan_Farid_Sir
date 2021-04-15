public class Multi_catch{
	public static void main(String[] args){
		try{
			int i = 9 / 0;
			System.out.println(i);
		} catch(ArithmeticException e1){
			System.out.println("Arithmetic Exception. " + e1);
		}catch(Exception e2){
			System.out.println("Exception. " + e2);
		}
	}
}
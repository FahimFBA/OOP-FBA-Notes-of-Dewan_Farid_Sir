public class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}
	public static void main(String[] args){
		try{
			throw new MyException("User defined exception");
		} catch(MyException e){
			System.out.println(e);
		}
	}
}
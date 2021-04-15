// In Java , we can declare exceptions by following:
// 1 . try−catch−finally
// 2 . void methodA ( ) throws IOException {}
// 3 . void methodB ( ) throws IOException , OtherException {}


public class DeclareException{
	public void methodA(){
		try{

		}catch(Exception e){
			System.out.println("If error in try then catch execute");
		} finally{
			System.out.println("finally must execites");
		}
	}
	public void methodB() throws SecurityException{

	}
	public void methodC() throws SecurityException{

	}
}
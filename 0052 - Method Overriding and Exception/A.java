public class A{
	public void methodA() throws IOException{

	}
}

public class B extends A {
	public void MethodA() throws EOFException{
		// Legal, because EOFException is the subclass of the IOException.

	}
}

class C extends A {
	public void methodA() throws Exception{
		// Illegal, because Exception is the superclass of IOException.

	}
}
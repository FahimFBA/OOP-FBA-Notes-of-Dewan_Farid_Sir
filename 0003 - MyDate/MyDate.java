public class MyDate {
	private int day;
	private int month;
	private int year; 

	public MyDate() // Constructor
	{
		day = 1;
		month = 6;
		year = 1979;
	}

	public void showDate() // method
	{
		System.out.println("Day: " + day);
		System.out.println("Month: " + month);
		System.out.println("Year: " + year);

	}

	public static void main(String[] args){ // main method
		MyDate date = new MyDate(); // creating an object of the class
		date.showDate(); // calling the showDate method of the object named date
	}
}
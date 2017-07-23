package session6_4;

public class NegativeAgeException extends Exception {   //Creating a user defined exception class by extending it from Exception class

//Default constructor.

	public NegativeAgeException(String message) {
		// TODO Auto-generated constructor stub
		System.out.println(message);
	}
}

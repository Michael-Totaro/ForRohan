//javac -d bin -cp bin src/RohanException.java
//java -cp bin RohanException

/**
 * Creates an exception.
 * @author Michael Totaro
 */
public class RohanException extends Exception {

	/** Message passed to exception */
	public String message;

	/**
	 * Constructor for a RohanException with a passed parameter.
	 * @param message Message passed when exception is thrown
	 */
	public RohanException(String message) {
		super(message);
	}

	/**
	 * Constructor for a RohanException. Is thrown
	 * when a parameter that's not a fact about
	 * Rohan is passed to the Rohan constructor, in the Rohan.java class.
	 * Thrown when no message is passed as a parameter.
	 */
	public RohanException() {
		super("This isn't a fact about Rohan!");
	}


}

/**
 * 
 */
package graduationprocessor;

/**
 * @author Daniel McAuley
 *
 */
public class Student {

	// instance vars
	private String firstName;
	private String lastName;
	private String studentNumber;

	/**
	 * Creates student with no arguments
	 */
	public Student() {
	}

	/**
	 * Creates new student with all arguments
	 * 
	 * @param firstName
	 * @param lastName
	 * @param studentNumber
	 */
	public Student(String firstName, String lastName, String studentNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentNumber = studentNumber;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the studentNumber
	 */
	public String getStudentNumber() {
		return studentNumber;
	}

	/**
	 * @param studentNumber the studentNumber to set
	 */
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	
}

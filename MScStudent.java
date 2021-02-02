/**
 * 
 */
package graduationprocessor;

/**
 * @author Daniel McAuley
 *
 */
public class MScStudent extends Student {

	// instance vars
	private int programming;
	private int computerFoundations;
	private int databases;
	private int webDevelopment;
	private int softwareEngineering;
	private int average;
	private String classifcation;

	/**
	 * Creates MScStudent with no arguments
	 */
	public MScStudent() {
	}

	/**
	 * Creates MScStudent with all arguments
	 * 
	 * @param programming
	 * @param computerFoundations
	 * @param databases
	 * @param webDevelopment
	 * @param softwareEngineering
	 * @param average
	 * @param classifcation
	 */
	public MScStudent(String studentNumber, String firstName, String lastName, int programming, int computerFoundations,
			int databases, int webDevelopment, int softwareEngineering) {
		super(firstName, lastName, studentNumber);
		this.programming = programming;
		this.computerFoundations = computerFoundations;
		this.databases = databases;
		this.webDevelopment = webDevelopment;
		this.softwareEngineering = softwareEngineering;
		this.average = calculateAverage(programming, computerFoundations, databases, webDevelopment,
				softwareEngineering);
		this.classifcation = calculateClassification(this.average);
	}
	
	public void displayAllDetails() {
		System.out.println("Student no. : " + this.getStudentNumber() + 
							"\nFirst name : " + this.getFirstName() + 
							"\nLast name : " + this.getLastName() + 
							"\nModule results..." + 
							"\nProgramming : " + this.programming +
							"\nComputer foundations : " + this.computerFoundations + 
							"\nDatabases : " + this.databases + 
							"\nWebDevelopment : " + this.webDevelopment + 
							"\nSoftware Engineering : " + this.softwareEngineering + 
							"\nAverage : " + this.average + 
							"\nClassification : " + this.classifcation);
	}

	/**
	 * Calculates and returns classification based on average
	 * 
	 * @param average
	 * @return
	 */
	public String calculateClassification(int average) {
		if (average >= 70 && average <= 100) {
			return "Distinction";
		} else if (average >= 60 && average <= 69) {
			return "Commendation";
		} else if (average >= 50 && average <= 59) {
			return "Pass";
		} else if (average >= 0 && average <= 49) {
			return "Fail";
		} else {
			return "Error";
		}
	}

	/**
	 * Calculates and returns average from a number of subject results
	 * 
	 * @param programming
	 * @param compFound
	 * @param databases
	 * @param webDev
	 * @param softwareEngineering
	 * @return
	 */
	public int calculateAverage(int programming, int compFound, int databases, int webDev, int softwareEngineering) {
		return ((programming)+ compFound + databases + webDev + softwareEngineering) / 5;
	}

	/**
	 * @return the programming
	 */
	public int getProgramming() {
		return programming;
	}

	/**
	 * @param programming the programming to set
	 */
	public void setProgramming(int programming) {
		this.programming = programming;
	}

	/**
	 * @return the computerFoundations
	 */
	public int getComputerFoundations() {
		return computerFoundations;
	}

	/**
	 * @param computerFoundations the computerFoundations to set
	 */
	public void setComputerFoundations(int computerFoundations) {
		this.computerFoundations = computerFoundations;
	}

	/**
	 * @return the databases
	 */
	public int getDatabases() {
		return databases;
	}

	/**
	 * @param databases the databases to set
	 */
	public void setDatabases(int databases) {
		this.databases = databases;
	}

	/**
	 * @return the webDevelopment
	 */
	public int getWebDevelopment() {
		return webDevelopment;
	}

	/**
	 * @param webDevelopment the webDevelopment to set
	 */
	public void setWebDevelopment(int webDevelopment) {
		this.webDevelopment = webDevelopment;
	}

	/**
	 * @return the softwareEngineering
	 */
	public int getSoftwareEngineering() {
		return softwareEngineering;
	}

	/**
	 * @param softwareEngineering the softwareEngineering to set
	 */
	public void setSoftwareEngineering(int softwareEngineering) {
		this.softwareEngineering = softwareEngineering;
	}

	/**
	 * @return the average
	 */
	public int getAverage() {
		return average;
	}

	/**
	 * @param average the average to set
	 */
	public void setAverage(int average) {
		this.average = average;
	}

	/**
	 * @return the classifcation
	 */
	public String getClassifcation() {
		return classifcation;
	}

	/**
	 * @param classifcation the classifcation to set
	 */
	public void setClassifcation(String classifcation) {
		this.classifcation = classifcation;
	}

}

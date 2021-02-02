/**
 * 
 */
package graduationprocessor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Daniel McAuley
 *
 */
public class ExamResultProcessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// array to hold MScStudents
		ArrayList<MScStudent> students = new ArrayList<>();

		ArrayList<MScStudent> mscStudents;
		mscStudents = addStudentsToArray(students);

		// display all student details
		displayAllStudentDetails(mscStudents);

		// display classifications
		displayStudentClassifications(mscStudents);

		// add classification info to .txt file
		addClassificationInfoToFile(mscStudents);

	}

	/**
	 * Adds student classifcation info to a "ListForGraduation.txt" file
	 * 
	 * @param mscStudents
	 */
	private static void addClassificationInfoToFile(ArrayList<MScStudent> mscStudents) {

		// loop through msc students
		for (MScStudent student : mscStudents) {
			if (student != null) {

				// add info to file

				try {
					// create file
					File file = new File("ListForGraduation.txt");
					FileWriter fw = new FileWriter(file, true);
					BufferedWriter bw = new BufferedWriter(fw);

					// if file dosent exist - create it
					if (!file.exists()) {
						file.createNewFile();
					}

					// add info to file
					bw.write("Student number : " + student.getStudentNumber() + "\n");
					bw.write("First name : " + student.getFirstName() + "\n");
					bw.write("Last name : " + student.getLastName() + "\n");
					bw.write("Average : " + String.valueOf(student.getAverage()) + "\n");
					bw.write("Classification : " + student.getClassifcation() + "\n");
					bw.write("\n");

					bw.close();
					fw.close();

				} catch (FileNotFoundException e) {
					System.out.println("File not found");
				} catch (IOException e) {
					System.out.println("IO issue");
				}
			}
		}
	}

	/**
	 * Displays Classification information for each student in a list of MSc
	 * Students
	 * 
	 * @param mscStudents
	 */
	private static void displayStudentClassifications(ArrayList<MScStudent> mscStudents) {
		for (MScStudent student : mscStudents) {
			System.out.println("Student no. : " + student.getStudentNumber() + "\nFirst name : "
					+ student.getFirstName() + "\nLast name : " + student.getLastName() + "\nAverage : "
					+ student.getAverage() + "\nClassification : " + student.getClassifcation());
			System.out.println();
		}
	}

	/**
	 * Displays all student details in a list of Msc Students
	 * 
	 * @param mscStudents
	 */
	private static void displayAllStudentDetails(ArrayList<MScStudent> mscStudents) {
		for (MScStudent student : mscStudents) {
			if (student != null) {
				student.displayAllDetails();
				System.out.println();
			}
		}

	}

	/**
	 * Get student details and subject scores from a file and adds them to an
	 * ArrayList of MscStudents
	 * 
	 * @param students
	 * @return
	 */
	private static ArrayList<MScStudent> addStudentsToArray(ArrayList<MScStudent> students) {

		// vars
		String line;
		String[] moduleScores;
		ArrayList<MScStudent> mscStudents = new ArrayList<>();

		try {
			// get file
			File file = new File("ModuleScoresMSc.csv");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			// skip the first line
			line = br.readLine();
			line = br.readLine();

			// read file
			while (line != null) {

				// split file by comma & add split string to string array
				moduleScores = line.split(",");

				// create new msc student object
				// add elements of string array to msc student object (remember to cast)
				MScStudent mscStudent = new MScStudent(moduleScores[0], moduleScores[1], moduleScores[2],
						Integer.parseInt(moduleScores[3]), Integer.parseInt(moduleScores[4]),
						Integer.parseInt(moduleScores[5]), Integer.parseInt(moduleScores[6]),
						Integer.parseInt(moduleScores[7]));

				// add MscStudent to "student" array list
				mscStudents.add(mscStudent);

				// read next line
				line = br.readLine();
			}

			// close resources
			br.close();
			fr.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("IO issue");
		}

		// return arrayList
		return mscStudents;

	}

}

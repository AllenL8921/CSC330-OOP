import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UnitTestRunner {

	private static final int NUM_OF_QUESTIONS = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnitTest midterm = new UnitTest();
		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<String> studentAnswers;
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		
		try {
			Scanner input = new Scanner(new File("C:\\Users\\oshiw\\eclipse-workspace\\UnitTest\\src\\allAnswers"));
			String answers;
			while(input.hasNext()) {
				String lastName = input.next();
				String firstName = input.next();

				studentAnswers = new ArrayList<String>();
				
				for(int i = 0; i < NUM_OF_QUESTIONS; i++) {
					answers = input.next();
					studentAnswers.add(answers);
				}			
				
				Student s = new Student(firstName, lastName);
				
				studentList.add(s);
												
				map.put((lastName + firstName).toLowerCase(), studentAnswers);
			}
						
		}catch(Exception e) {
			System.out.println("Error. File was not opened.");
			e.printStackTrace();
		}
		
		for(Student student : studentList) {
			String key = (student.getLN()+ student.getFN().toLowerCase()).toLowerCase();
			ArrayList<String> fromMap = map.get(key);
			student.setAverage(midterm.calculateGrade(fromMap));
		}
		
		
		for(int i =0; i < studentList.size();i++) {
			System.out.println(studentList.get(i).getFN() + " " + studentList.get(i).getLN()+ " : " + studentList.get(i).getAverage() + "%");
		}
		
		System.out.println("Class Range: " + midterm.getClassRange(studentList));
		System.out.println("Class Average: " + midterm.getClassAverage(studentList) + "%");

		
	}

}

/* OUTPUT
Patrick Kettyle : 100.0%
James Russo : 30.0%
John Smith : 30.0%
James Henderson : 30.0%
Michael Russo : 20.0%
John DeMartino : 80.0%
Frank Scafuri : 80.0%
Class Range: 80.0
Class Average: 53.0%
*/
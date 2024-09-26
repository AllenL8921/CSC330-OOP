import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;


public class UnitTest {
	private Scanner input;
	private ArrayList<String> answers = new ArrayList<String>(); 
	/**
	 * Constructor that reads in the answers into an array list
	 */
	public UnitTest(){
		try {
			input = new Scanner(new File("C:\\Users\\oshiw\\eclipse-workspace\\UnitTest\\src\\answers"));
			while(input.hasNext()) {
				String answer = input.next();
				answers.add(answer);
			}
			
		}catch(Exception e){
			System.out.println("Error. File was not opened!");
			e.printStackTrace();
		}
	}
	/**
	 * calculates and finds the grade for a student
	 * @param studentAnswers
	 * @return
	 */
	public double calculateGrade(ArrayList<String> studentAnswers) {
		double grade = 0;
		
		for(int i =0; i < studentAnswers.size();i++) {
			if(answers.get(i).equals(studentAnswers.get(i))) {
				grade++;
			}
		}
		
		return grade*100/studentAnswers.size();
	}
	/**
	 * calculates and finds the range for the entire class
	 * @param studentList
	 * @return highest - lowest
	 */
	public double getClassRange(ArrayList<Student> studentList) {
		double highest = 0;
		double lowest = studentList.get(0).getAverage();
		
		for(int i = 0; i < studentList.size();i++) {
			if(studentList.get(i).getAverage() < lowest) {
				lowest = studentList.get(i).getAverage();
			}else if(studentList.get(i).getAverage() > highest){
				highest = studentList.get(i).getAverage();
			}
			
		}
		
		return highest - lowest;
	}
	
	/**
	 * calculates and finds the class average for the test
	 * @param studentList
	 * @return classAverage
	 */
	public double getClassAverage(ArrayList<Student> studentList) {
		double classAverage = 0;
		
		for(int i = 0; i < studentList.size();i++) {
			classAverage += studentList.get(i).getAverage();
		}
		
		return (double)Math.round(classAverage/studentList.size());
	}
	
}

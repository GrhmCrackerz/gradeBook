/* This is part of the starter code! 
 * You need to complete this class yourself!*/
package util;

import java.util.*;

public class Gradebook {
    private ArrayList<Student> listOfStudents;

	public Gradebook() {
		this.listOfStudents = new ArrayList<Student>();
	}

	public void addStudent(String firstName, String lastName, String pidString, String scoreString){
		listOfStudents.add(new Student(firstName, lastName, Integer.parseInt(pidString), Integer.parseInt(scoreString)));
	}

	public void calculateAvg() {
		double sum = 0;
		for(Student s: listOfStudents)
	    	sum += s.getGrade().getScore();
		System.out.println("The average score is " + sum / listOfStudents.size() + "\n");
			//return sum / listOfStudents.size();
    	}//end of calculateAvg

	public void averageLetter() {
		double sum = 0;
		for(Student s: listOfStudents)
			sum += s.getGrade().getScore();
		int scoreForLetter = (int) (sum / listOfStudents.size());
		Grade letter = new Grade(scoreForLetter);
		System.out.println("The average letter grade is " + letter.getLetterGrade() + "\n");
		//return sum / listOfStudents.size();
	}//end of calculateAvg

    public void calculateMedian() {
		int i = 0, n = listOfStudents.size();
		int[] scores = new int[n];
		for(Student s: listOfStudents)
	    	scores[i++] = s.getGrade().getScore();
			Arrays.sort(scores);
		if (n % 2 == 0)
			System.out.println("The median score is " + (scores[n / 2] + scores[n / 2 - 1]) / 2.0  + "\n");
	    	//return (scores[n / 2] + scores[n / 2 - 1]) / 2.0; given line of code
		else
			System.out.println("The median score is " + (scores[n / 2]) + "\n");
	    	//return scores[n / 2];   given line of code
    	}//end of calculateMedian

	public void medianLetter() {
		int i = 0, n = listOfStudents.size();
		String[] scores = new String[n];
		for(Student s: listOfStudents)
			scores[i++] = s.getGrade().getLetterGrade();
		Arrays.sort(scores);
		if (n % 2 == 0)
			System.out.println("The median letter is " + (scores[n / 2 - 1]) + "\n");
			// System.out.println("The median score is " + (scores[n / 2] + scores[n / 2 - 1]) / 2.0 );
			//return (scores[n / 2] + scores[n / 2 - 1]) / 2.0; given line of code
		else
			System.out.println("The median letter is " + (scores[n / 2]) + "\n");
		//return scores[n / 2];   given line of code
	}//end of medianLetter

	public void printLetterViaPID(int pID){
		String letterGrade = "";
		for(Student s : listOfStudents)
			if(pID == s.getPid())
				letterGrade = s.getGrade().getLetterGrade();
		System.out.println("The Student's grad is " + letterGrade + "\n");
		//return "The Student's grade is " + letterGrade;
	}

	public void printNameViaPID(int pID){
		String fullName = "";
		for (Student s : listOfStudents)
			if(pID == s.getPid())
				fullName = s.getFirstName() + " " + s.getLastName();
		System.out.println("The student's name is " + fullName + "\n");
		//return fullName;
	}

	public void changeGradeViaPID(int pID, int newScore){
		for(Student s: listOfStudents)
			if(pID == s.getPid()) {
				s.setGrade(newScore);
				System.out.println("The student's new grade is " + s.getGrade().getScore() + "\n");

				//return "Grade successfully changed!";
			}
	}

	public void minScore() {
		Student min = listOfStudents.get(0); //min is of type student, listOfStudents.get(0) gets the first item of the array

		for(int i = 1; i < listOfStudents.size() ; i++){ //for loop iterates through as many items as are in the listOfStudents ArrayList
			if(listOfStudents.get(i).getGrade().getScore() < min.getGrade().getScore()){ //get(i).getGrade().getScore() looks through the ArrayList and pulls the score and compares it to the one set for min
				min = listOfStudents.get(i); //if it is true then a new min is set
			}
		}
		System.out.printf("The min score is %d by %s %s \n", Integer.parseInt(String.valueOf(min.getGrade().getScore())) , min.getFirstName() , min.getLastName()); // the score is pulled from min.getGrade().getScore(), which is then read as a String.valueOf, which is then read as an Integer by parseInt
	}

	public void minLetter() {
		Student min = listOfStudents.get(0); //min is of type student, listOfStudents.get(0) gets the first item of the array

		for(int i = 1; i < listOfStudents.size() ; i++){ //for loop iterates through as many items as are in the listOfStudents ArrayList
			if(listOfStudents.get(i).getGrade().getScore() < min.getGrade().getScore()){ //get(i).getGrade().getScore() looks through the ArrayList and pulls the score and compares it to the one set for min
				min = listOfStudents.get(i); //if it is true then a new min is set
			}
		}
		System.out.printf("The min letter is %s by %s %s \n", min.getGrade().getLetterGrade() , min.getFirstName() , min.getLastName()); // the score is pulled from min.getGrade().getScore(), which is then read as a String.valueOf, which is then read as an Integer by parseInt
	}

	public void maxScore() {
		Student max = listOfStudents.get(0); //min is of type student, listOfStudents.get(0) gets the first item of the array

		for(int i = 1; i < listOfStudents.size() ; i++){ //for loop iterates through as many items as are in the listOfStudents ArrayList
			if(listOfStudents.get(i).getGrade().getScore() > max.getGrade().getScore()){ //get(i).getGrade().getScore() looks through the ArrayList and pulls the score and compares it to the one set for min
				max = listOfStudents.get(i); //if it is true then a new min is set
			}
		}
		System.out.printf("The max score is %d by %s %s \n", Integer.parseInt(String.valueOf(max.getGrade().getScore())) , max.getFirstName() , max.getLastName()); // the score is pulled from min.getGrade().getScore(), which is then read as a String.valueOf, which is then read as an Integer by parseInt
	}

	public void maxLetter() {
		Student max = listOfStudents.get(0); //min is of type student, listOfStudents.get(0) gets the first item of the array

		for(int i = 1; i < listOfStudents.size() ; i++){ //for loop iterates through as many items as are in the listOfStudents ArrayList
			if(listOfStudents.get(i).getGrade().getScore() > max.getGrade().getScore()){ //get(i).getGrade().getScore() looks through the ArrayList and pulls the score and compares it to the one set for min
				max = listOfStudents.get(i); //if it is true then a new min is set
			}
		}
		System.out.printf("The max letter is %s by %s %s \n", max.getGrade().getLetterGrade() , max.getFirstName() , max.getLastName()); // the score is pulled from min.getGrade().getScore(), which is then read as a String.valueOf, which is then read as an Integer by parseInt
	}

    public void printAllStudents() {
		for(Student s: listOfStudents)
	    	System.out.printf("%s\t%s\t%d\t%d\n", s.getFirstName(), s.getLastName(), s.getPid(), s.getGrade().getScore());
    }//end of printAllStudents

	public void tabLetters() {
		for(Student s: listOfStudents)
			System.out.printf("%s\t%s\t%d\t%s\n", s.getFirstName(), s.getLastName(), s.getPid(), s.getGrade().getLetterGrade());
	}



}

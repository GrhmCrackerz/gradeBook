/* This is part of the starter code! 
 * You need to complete this class yourself!*/
package util;

public class Grade {
    private int score;

    private String letterGrade;

    public int getScore() {
        return score;
    }

    public String getLetterGrade(){
        return letterGrade;
    }

    public Grade(int score) {

        this.score = score;
        if (score < 90) {
            if (score >= 86) {
                letterGrade = "A-";
            }else if(score >= 83){
                letterGrade = "B+";
            }else if(score >= 80){
                letterGrade = "B";
            }else if(score >= 76){
                letterGrade = "B-";
            }else if(score >= 73){
                letterGrade = "C+";
            }else if(score >= 70){
                letterGrade = "C";
            }else if(score >= 60){
                letterGrade = "D";
            }else{
                letterGrade = "F";
            }
        } else {
            letterGrade = "A";
        }

    }//end of getLetterGrade
}

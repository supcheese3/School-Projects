/**
 * Name: Nathan Williamson
 * Date: 10/28/2021
 * Assignment: MultipleChoiceQuestion.java
 * 
 * Purpose (Class Description): 
*/

public class MultipleChoiceQuestion {
    private String question;
    private String[] answerChoice;
    private int correctAnswer;

    public MultipleChoiceQuestion(String question, String[] answerChoice, int correctAnswer){
        this.question = question;
        this.answerChoice = answerChoice;
        this.correctAnswer = correctAnswer;
    }
    //Setter methods
    public void setQuestion(String question){
        this.question = question;
    }

    public void setAnswerChoice(String[] answerChoice){
        this.answerChoice = answerChoice;
    }
    //Getter methods
    public String getQuestion(){
        return question;
    }
    public String[] getAnswerChoice(){
        return answerChoice;
    }

    public void setCorrectAnswer(int correctAnswer){
        if(correctAnswer < answerChoice.length|| correctAnswer > answerChoice.length){
            correctAnswer = -1;
        } else {
            this.correctAnswer = correctAnswer;
        } 
    }

    public int getCorrectAnswer(){
        return correctAnswer;
    }

    public String getCorrectAnswerAsString(){
        if(correctAnswer == -1){
            return "Correct Answer Unknown"; 
        } else{ 
            return answerChoice[correctAnswer];
        }
    }
}

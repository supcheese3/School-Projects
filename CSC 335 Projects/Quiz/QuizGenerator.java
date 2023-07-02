/**
 * Name: Nathan Williamson
 * Date: 10/28/2021
 * Assignment: QuizGenerator.java
 * 
 * Purpose (Class Description): 
 */

import java.util.Scanner;

public class QuizGenerator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        MultipleChoiceQuestion [] questions = new MultipleChoiceQuestion[2];
        String question;
        String[] answerChoice;
        int correctAnswer;
        for(int i = 0; i < questions.length; i++){
            question = question(input);
            answerChoice = answerChoice(input);
            correctAnswer = correctAnswer(input);
            questions[i] = new MultipleChoiceQuestion(question, answerChoice, correctAnswer);
        }
        input.close();
        displayQuiz(questions);
    }
        //Question method
        static String question(Scanner input){
            String question;
            System.out.println("Enter a question: ");
            question = input.nextLine();
            return question;
            
        }
        //The answer choices method
        static String[] answerChoice(Scanner input){
            String[] answerChoice = new String[4];
            for(int i = 0; i < answerChoice.length; i++){
            System.out.println("Enter answer choice #" + (i+1) +":");
            answerChoice[i] = input.nextLine();
            }
            return answerChoice;
        }
        //The correct answer method      
        static int correctAnswer(Scanner input){
            String question = question(input);
            String[] answerChoice = answerChoice(input);
            int correctAnswer;
            System.out.println("This is your question");
            System.out.println(question);
            System.out.println("--------------------");
            for(int i = 0; i < answerChoice.length; i++){
                System.out.println("("+ (i+1) +") "+ answerChoice[i]);
            }
            System.out.println("Enter the correct answer: ");
            correctAnswer = input.nextInt();
            return correctAnswer-1;
        }
        private static String extracted(Scanner input) {
            String question = question(input);
            return question;
        }
        //displays all the quiz details
        static void displayQuiz(MultipleChoiceQuestion[] quiz){
            for(int i = 0; i < quiz.length; i++){
                System.out.println("\nQuestion: " + quiz[i].getQuestion());
                System.out.println("Answer Choices: " + quiz[i].getAnswerChoice());
                System.out.println("Correct Answer: " + quiz[i].getCorrectAnswerAsString());
                System.out.println("-------------------------\n");
            }
        }
}
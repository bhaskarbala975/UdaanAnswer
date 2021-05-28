package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

import entities.Question;
import entities.Quiz;
import entities.User;

public class QuizService {
 public static void main(String[] args)throws IOException {
	
	 HashMap<String,User> users = new HashMap<String,User>();
	 
	 users.put("bhaskar" ,new User(1,"Bhaskar",23));
	 users.put("prasanth" ,new User(2,"Prasanth",25));
	 
	 ArrayList<Quiz> quizzes = new ArrayList<Quiz>();
	 HashMap<Integer,Quiz> quizMap = new HashMap<Integer,Quiz>();
	 ArrayList<Question> questions = new ArrayList<Question>();
	 
	 ArrayList<String> options = new ArrayList<String>();
	 options.add("5");
	 options.add("7");
	 options.add("9");
	 options.add("99");
	 questions.add(new Question(1,"What is value of 2+3",options,0));
	 
	 options = new ArrayList();
	 options.add("2");
	 options.add("7");
	 options.add("6");
	 options.add("99");
	 questions.add(new Question(2,"What is value of 2*3",options,2));
	 
	 options = new ArrayList();
	 options.add("2");
	 options.add("7");
	 options.add("3");
	 options.add("99");
	 questions.add(new Question(3,"How many colors will our national flag have",options,2));
	 
	 options = new ArrayList();
	 options.add("2");
	 options.add("7");
	 options.add("6");
	 options.add("99");
	 questions.add(new Question(4,"What is value of 2*3",options,2));
	 
	 options = new ArrayList();
	 options.add("green");
	 options.add("yellow");
	 options.add("white");
	 options.add("black");
	 questions.add(new Question(5,"What is color of coal",options,3));
	 
	 options = new ArrayList();
	 options.add("24");
	 options.add("7");
	 options.add("6");
	 options.add("99");
	 questions.add(new Question(6,"What is value of 33-9",options,0));
	 
	 options = new ArrayList();
	 options.add("3");
	 options.add("233");
	 options.add("5");
	 options.add("999");
	 questions.add(new Question(7,"What comes after 4",options,2));
	 
	 options = new ArrayList();
	 options.add("GMT");
	 options.add("IST");
	 options.add("US");
	 options.add("UK");
	 questions.add(new Question(8,"What is timezone of India",options,1));
	 
	 options = new ArrayList();
	 options.add("2");
	 options.add("7");
	 options.add("6");
	 options.add("5");
	 questions.add(new Question(9,"What is value of 20/4",options,3));
	 
	 options = new ArrayList();
	 options.add("Hyderabad");
	 options.add("Delhi");
	 options.add("Banglore");
	 options.add("Gujrat");
	 questions.add(new Question(10,"What is capital of India",options,1));
	 
	 
	 ArrayList<Question> quizQuestions = new ArrayList<Question>();
	 quizQuestions.add(questions.get(4));
	 quizQuestions.add(questions.get(0));
	 quizQuestions.add(questions.get(2));
	 quizQuestions.add(questions.get(7));
	 quizQuestions.add(questions.get(9));
	 Quiz tmp = new Quiz(1,quizQuestions) ;
	 quizzes.add(tmp);
	 quizMap.put(1, tmp);
	 //q2
	 quizQuestions = new ArrayList<Question>();
	 quizQuestions.add(questions.get(1));
	 quizQuestions.add(questions.get(3));
	 quizQuestions.add(questions.get(5));
	 quizQuestions.add(questions.get(6));
	 quizQuestions.add(questions.get(8));
	  tmp = new Quiz(2,quizQuestions) ;
	 quizzes.add(tmp);
	 quizMap.put(1, tmp);
	 
	 //q3
	 quizQuestions = new ArrayList<Question>();
	 quizQuestions.add(questions.get(0));
	 quizQuestions.add(questions.get(9));
	 quizQuestions.add(questions.get(4));
	 quizQuestions.add(questions.get(8));
	 quizQuestions.add(questions.get(6));
	  tmp = new Quiz(2,quizQuestions) ;
		 quizzes.add(tmp);
		 quizMap.put(1, tmp);
	 //q4
	 quizQuestions = new ArrayList<Question>();
	 quizQuestions.add(questions.get(7));
	 quizQuestions.add(questions.get(2));
	 quizQuestions.add(questions.get(4));
	 quizQuestions.add(questions.get(5));
	 quizQuestions.add(questions.get(8));
	  tmp = new Quiz(2,quizQuestions) ;
		 quizzes.add(tmp);
		 quizMap.put(1, tmp);
	 //q5
	 quizQuestions = new ArrayList<Question>();
	 quizQuestions.add(questions.get(9));
	 quizQuestions.add(questions.get(8));
	 quizQuestions.add(questions.get(7));
	 quizQuestions.add(questions.get(6));
	 quizQuestions.add(questions.get(5));
	  tmp = new Quiz(2,quizQuestions) ;
		 quizzes.add(tmp);
		 quizMap.put(1, tmp);
	 
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 User currentUser;
	 int offSet = 3;
	 int curIndex =0;
	 System.out.println("Enter Your Name");
	 String userInput = br.readLine();
	 
	 if(!users.containsKey(userInput))
		 System.out.println("Invalid User Name");
	 else
	  currentUser = users.get(userInput);
	 
	 String[] userResponse = null;
//	 while( offSet+curIndex < quizzes.size()) {
//		ArrayList<Quiz> nextSet = getNextQuizzes(quizzes ,curIndex, offSet);
//		
//		userResponse = br.readLine().split(" " );
//		
//		if(userResponse[0].equalsIgnoreCase("Yes")) break;
//		
//		curIndex = curIndex+offSet;
//		
//	 }
//		 int quizId = new Integer(userResponse[1]);
//	 
	 
	 Integer quizid = new Integer(br.readLine() );
	 
	 Quiz currentQuiz = quizMap.get(quizid);
	 int[] userAnswers = new int[5];
	 for(int i=0 ; i<currentQuiz.getQuestions().size(); i++) {
		 
		 System.out.println(currentQuiz.getQuestions().get(i));
		 for(int j=0 ; j< currentQuiz.getQuestions().get(i).getOptions().size(); j++) {
			 System.out.println(currentQuiz.getQuestions().get(i).getOptions().get(j));
		 userAnswers[j] = Integer.parseInt(br.readLine());
		 }
	 }
	 
	 
	 
}
 
 static ArrayList<Quiz> getNextQuizzes(ArrayList<Quiz> quizzes ,int curIndex , int offSet){
	 ArrayList<Quiz> nextQuizzes= new ArrayList<>();
	 
	 for(int i=curIndex ; (i<quizzes.size() && i<curIndex+offSet) ; i++)
		 nextQuizzes.add(quizzes.get(i));
	 
	 return nextQuizzes;
 }

}

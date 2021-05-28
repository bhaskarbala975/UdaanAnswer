package entities;

import java.util.ArrayList;
import java.util.HashSet;

public class Quiz {
	
	private int quizId;
	private ArrayList<Question> questions;
	private HashSet<Question> questionsSet;
	
	public Quiz(int quizId, ArrayList<Question> questions){
		this.quizId = quizId;
		this.questions = questions;
	}
	
	public boolean addQuestion(Question q) {
		
		if(questionsSet.contains(q)) return false;
		if(questions.size() == 5) return false;
		questions.add(q);
		
		return true;
	}
	
	public ArrayList<Question> getQuestions(){
		return this.questions;
	}

}

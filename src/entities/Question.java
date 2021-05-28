package entities;

import java.util.ArrayList;

public class Question {
	
	private String question;
	private ArrayList<String> options;
	private int answer;
	private int questionId;
	public Question(int questionId ,String question, ArrayList<String> options , int answer) {
		setQuestionId(questionId);
		setQuestion(question);
		setOptions(options);
		setAnswer(answer);
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public ArrayList<String> getOptions() {
		return options;
	}
	public void setOptions(ArrayList<String> options) {
		this.options = options;
	}
	public int getAnswer() {
		return answer;
	}
	public void setAnswer(int answer) {
		this.answer = answer;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

}

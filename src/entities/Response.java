package entities;

import java.util.ArrayList;

public class Response {
	
	private User user;
	private Quiz quiz;
    private ArrayList<Integer> userAnswers  = new ArrayList<Integer>();
	public Response(User user , Quiz quiz, ArrayList<Integer> userAnswers) {
		this.user = user;
		this.quiz = quiz;
		this.userAnswers = userAnswers;
	}

}

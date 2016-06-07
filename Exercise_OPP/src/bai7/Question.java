package bai7;

public class Question {
	
	String Question;
	String Answer;
	
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public String getAnswer() {
		return Answer;
	}
	public void setAnswer(String answer) {
		Answer = answer;
	}
	
	
	public Question(String question, String answer) {
		super();
		Question = question;
		Answer = answer;
	}
	public boolean answerCorrect(String x) {
		return true;
	}
	
	public String toString() {
		return super.toString();
	}
	
}

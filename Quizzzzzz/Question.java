package Quizzzzzz;
public class Question{
	String question;
	String ans;

public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Question(String question, String ans) {
		super();
		this.question = question;
		this.ans = ans;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

public Question() {
	super();
}
}

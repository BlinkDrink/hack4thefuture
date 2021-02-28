package bg.unisofia.hack4thefuture.models;

import java.io.Serializable;

public class Answer implements Serializable {
	
	public boolean isCorrect;
	public String  text;
	public String  explanation;
	
	public Answer(boolean isCorrect, String text, String explanation) {
		this.isCorrect   = isCorrect;
		this.text        = text;
		this.explanation = explanation;
	}
}

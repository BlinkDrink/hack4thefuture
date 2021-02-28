package bg.unisofia.hack4thefuture.v2.model;

import bg.unisofia.hack4thefuture.v2.statics.DataProvider;

import java.io.Serializable;
import java.util.UUID;

public class Answer implements Serializable {
	
	private UUID id;
	
	private boolean isCorrect;
	private String  text;
	private String  explanation;
	
	public Answer() {
		this.id = UUID.randomUUID();
		DataProvider.answerMap.put(id, this);
		DataProvider.save();
		
//		isCorrect = false;
//		text = "Loremipsum";
//		explanation = "Loremipsumexplanation";
	}
	
	public void setCorrect(boolean correct) {
		isCorrect = correct;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	
	public UUID getId() {
		return id;
	}
	
	public boolean isCorrect() {
		return isCorrect;
	}
	
	public String getText() {
		return text;
	}
	
	public String getExplanation() {
		return explanation;
	}
}

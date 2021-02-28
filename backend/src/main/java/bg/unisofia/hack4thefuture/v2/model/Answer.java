package bg.unisofia.hack4thefuture.v2.model;

import bg.unisofia.hack4thefuture.v2.statics.DataProvider;
import org.json.JSONObject;

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
		DataProvider.save();
	}
	
	public void setText(String text) {
		this.text = text;
		DataProvider.save();
	}
	
	public void setExplanation(String explanation) {
		this.explanation = explanation;
		DataProvider.save();
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
	
	public JSONObject toJson() {
		JSONObject json = new JSONObject();
		
		json.put("text", getText());
		json.put("explanation", getExplanation());
		json.put("isCorrect", isCorrect());
		
		return json;
	}
}

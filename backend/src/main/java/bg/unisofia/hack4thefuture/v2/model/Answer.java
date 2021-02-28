package bg.unisofia.hack4thefuture.v2.model;

import java.io.Serializable;
import java.util.UUID;

public class Answer implements Serializable {
	
	public UUID id;
	
	public boolean isCorrect;
	public String  text;
	public String  explanation;
	
	public Answer() {
		this.id = UUID.randomUUID();
		isCorrect = false;
		text = "Loremipsum";
		explanation = "Loremipsumexplanation";
	}
}

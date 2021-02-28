package bg.unisofia.hack4thefuture.v2.model;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class Question implements Serializable {
	
	public UUID id;
	public int  points;
	
	public String     questionText;
	public List<UUID> answers;
	
	public Question() {
		this.id           = UUID.randomUUID();
		points = (int) (Math.random() * 10);
		questionText = "Loremipsum";
	}
}

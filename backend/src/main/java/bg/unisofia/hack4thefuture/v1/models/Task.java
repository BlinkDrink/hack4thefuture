package bg.unisofia.hack4thefuture.v1.models;

import java.io.Serializable;
import java.util.UUID;

public class Task implements Serializable {
	
	public String id;
	public String link;
	public int points;
	
	public Task(String link) {
		this.id   = UUID.randomUUID().toString();
		this.link = link;
	}
}

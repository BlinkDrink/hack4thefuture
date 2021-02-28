package bg.unisofia.hack4thefuture.v2.model;

import java.io.Serializable;
import java.util.UUID;

public class Task implements Serializable {
	
	public UUID id;
	public int  points;
	
	public String link;
	
	public Task() {
		this.id   = UUID.randomUUID();
		points = (int) (Math.random() * 10);
		link = "link" + (int) (Math.random() * 10);
	}
}

package bg.unisofia.hack4thefuture.v2.model;

import bg.unisofia.hack4thefuture.v2.statics.DataProvider;

import java.io.Serializable;
import java.util.UUID;

public class Task implements Serializable {
	
	private UUID id;
	private int  points;
	
	private String link;
	
	public Task() {
		this.id   = UUID.randomUUID();
		DataProvider.taskMap.put(id, this);
		DataProvider.save();
		
//		points = (int) (Math.random() * 10);
//		link = "link" + (int) (Math.random() * 10);
	}
	
	public void setPoints(int points) {
		this.points = points;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	public UUID getId() {
		return id;
	}
	
	public int getPoints() {
		return points;
	}
	
	public String getLink() {
		return link;
	}
}

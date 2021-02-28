package bg.unisofia.hack4thefuture.v2.model;

import bg.unisofia.hack4thefuture.v2.statics.DataProvider;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.UUID;

public class Task implements Serializable {
	
	private UUID   id;
	private int    points;
	
	private String name;
	private String link;
	
	public Task() {
		this.id = UUID.randomUUID();
		DataProvider.taskMap.put(id, this);
		DataProvider.save();

//		points = (int) (Math.random() * 10);
//		link = "link" + (int) (Math.random() * 10);
	}
	
	public void setPoints(int points) {
		this.points = points;
		DataProvider.save();
	}
	
	public void setLink(String link) {
		this.link = link;
		DataProvider.save();
	}
	
	public void setName(String name) {
		this.name = name;
		DataProvider.save();
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
	
	public String getName() {
		return name;
	}
	
	public JSONObject toJson() {
		int score = 0;
		
		JSONObject json = new JSONObject();
		
		json.put("id", getId());
		json.put("name", getName());
		json.put("link", getLink());
		json.put("score", score);
		
		return json;
	}
}

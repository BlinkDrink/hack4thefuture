package bg.unisofia.hack4thefuture.v2.model;

import bg.unisofia.hack4thefuture.v2.statics.DataProvider;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Material implements Serializable {
	
	private UUID id;
	
	private String name;
	private String link;
	private int score;
	
	private List<UUID> questions = new ArrayList<>();
	
	public Material() {
		this.id = UUID.randomUUID();
		DataProvider.materialMap.put(id, this);
		DataProvider.save();

//		name = "Material" + (int) (Math.random() * 10);
//		link = "www.linkhere.com";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public List<UUID> getQuestions() {
		return questions;
	}
	
	public UUID getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLink() {
		return link;
	}
	
	public int getScore() {
		return score;
	}
	
	public void addQuestion(UUID question) {
		this.questions.add(question);
		DataProvider.save();
	}
	
	public JSONObject toJson() {
		JSONArray questionsJsonArray = new JSONArray();
		
		for (UUID id : questions) {
			var question = DataProvider.questionMap.get(id);
			
			if (question != null) {
				questionsJsonArray.put(question.toJson());
			}
		}
		
		JSONObject json = new JSONObject();
		
		json.put("id", getId());
		json.put("name", getName());
		json.put("link", getLink());
		json.put("score", getScore());
		json.put("questions", questionsJsonArray);
		
		return json;
	}
}

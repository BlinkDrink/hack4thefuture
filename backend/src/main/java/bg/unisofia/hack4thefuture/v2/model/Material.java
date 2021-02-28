package bg.unisofia.hack4thefuture.v2.model;

import bg.unisofia.hack4thefuture.v2.statics.DataProvider;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Material implements Serializable {
	
	private UUID id;
	
	private String name;
	private String link;
	
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
	
	public void addQuestion(UUID question) {
		this.questions.add(question);
		DataProvider.save();
	}
}

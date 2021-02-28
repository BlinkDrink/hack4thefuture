package bg.unisofia.hack4thefuture.v2.model;

import bg.unisofia.hack4thefuture.v2.statics.DataProvider;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Topic implements Serializable {
	
	private UUID id;
	private int  points;
	
	private String     name;
	private List<UUID> materials = new ArrayList<>();
	private List<UUID> tasks     = new ArrayList<>();
	
	public Topic() {
		this.id = UUID.randomUUID();
		DataProvider.topicMap.put(id, this);
		DataProvider.save();
	}
	
	public void calculatePoints() {
	
	}
	
	public void setId(UUID id) {
		this.id = id;
	}
	
	public void setPoints(int points) {
		this.points = points;
		DataProvider.save();
	}
	
	public void setName(String name) {
		this.name = name;
		DataProvider.save();
	}
	
	public void addMaterial(UUID material) {
		this.materials.add(material);
		DataProvider.save();
	}
	
	
	public void addTask(UUID id) {
		this.tasks.add(id);
		DataProvider.save();
	}
	
	public UUID getId() {
		return id;
	}
	
	public int getPoints() {
		return points;
	}
	
	public String getName() {
		return name;
	}
	
	public List<UUID> getMaterials() {
		return materials;
	}
	
	public List<UUID> getTasks() {
		return tasks;
	}
}

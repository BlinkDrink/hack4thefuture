package bg.unisofia.hack4thefuture.v2.model;

import bg.unisofia.hack4thefuture.v2.statics.DataProvider;
import org.json.JSONArray;
import org.json.JSONObject;

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
	
	public JSONObject toJson() {
		
		int       materialsScore              = 0;
		JSONArray materialsJsonArray = new JSONArray();
		for (UUID id : materials) {
			var material = DataProvider.materialMap.get(id);
			
			if (material != null) {
				materialsJsonArray.put(material.toJson());
				materialsScore += material.getScore();
			}
		}
		
		int       tasksScore              = 0;
		JSONArray tasksJsonArray = new JSONArray();
		for (UUID id : tasks) {
			var task = DataProvider.taskMap.get(id);
			
			if (task != null) {
				tasksJsonArray.put(task.toJson());
				tasksScore += task.getPoints();
			}
		}
		
		JSONObject json = new JSONObject();
		
		json.put("id", getId());
		json.put("name", getName());
		json.put("materialsScore", materialsScore);
		json.put("materialsScore", tasksScore);
		json.put("materials", materialsJsonArray);
		json.put("tasks", tasksJsonArray);
		
		return json;
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Topic{");
		sb.append("id=").append(id);
		sb.append(", points=").append(points);
		sb.append(", name='").append(name).append('\'');
		sb.append(", materials=").append(materials);
		sb.append(", tasks=").append(tasks);
		sb.append('}');
		return sb.toString();
	}
}

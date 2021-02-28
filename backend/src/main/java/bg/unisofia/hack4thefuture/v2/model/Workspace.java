package bg.unisofia.hack4thefuture.v2.model;

import bg.unisofia.hack4thefuture.v2.statics.DataProvider;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Workspace implements Serializable {
	
	private UUID   id;
	private String name;
	
	private List<UUID> topics   = new ArrayList<>();
	private UUID       admin;
	private List<UUID> students = new ArrayList<>();
	
	public Workspace() {
		this.id = UUID.randomUUID();
		DataProvider.workspaceMap.put(id, this);
		DataProvider.save();
	}
	
	public void setId(UUID id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
		DataProvider.save();
	}
	
	public void addTopic(UUID topic) {
		this.topics.add(topic);
		DataProvider.save();
	}
	
	public void setAdmin(UUID admin) {
		this.admin = admin;
		DataProvider.save();
	}
	
	public void addStudent(UUID student) {
		this.students.add(student);
		DataProvider.save();
	}
	
	public UUID getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public List<UUID> getTopics() {
		return topics;
	}
	
	public UUID getAdmin() {
		return admin;
	}
	
	public List<UUID> getStudents() {
		return students;
	}
}

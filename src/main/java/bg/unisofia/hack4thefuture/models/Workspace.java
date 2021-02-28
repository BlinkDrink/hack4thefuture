package bg.unisofia.hack4thefuture.models;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class Workspace implements Serializable {
	
	public String id;
	public String name;
	
	public List<Topic> topics;
	public User        admin;
	public List<User>  students;
	
	public Workspace(String name, List<Topic> topics, User admin, List<User> students) {
		this.id       = UUID.randomUUID().toString();
		this.name     = name;
		this.topics   = topics;
		this.admin    = admin;
		this.students = students;
	}
}

package bg.unisofia.hack4thefuture.models;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class Topic implements Serializable {
	
	public String id;
	public String name;
	
	public int score;
	
	public List<Material> materials;
	public List<Question> questions;
	public List<Task>     tasks;
	
	public Topic(String name, int score, List<Material> materials, List<Question> questions, List<Task> tasks) {
		this.id        = UUID.randomUUID().toString();
		this.name      = name;
		this.score     = score;
		this.materials = materials;
		this.questions = questions;
		this.tasks     = tasks;
	}
}

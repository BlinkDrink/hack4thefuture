package bg.unisofia.hack4thefuture.v2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Topic implements Serializable {
	
	public UUID id;
	public int  points;
	
	public String     name;
	public List<UUID> materials = new ArrayList<>();
	public List<UUID> questions = new ArrayList<>();
	public List<UUID> tasks = new ArrayList<>();
	
	public Topic() {
		this.id        = UUID.randomUUID();
		name = "Topic" + (int) (Math.random() * 10);
		points = (int) (Math.random() * 10);
	}
}

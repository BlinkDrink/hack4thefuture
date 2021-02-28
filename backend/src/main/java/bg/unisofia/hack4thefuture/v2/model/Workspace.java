package bg.unisofia.hack4thefuture.v2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Workspace implements Serializable {
	
	public UUID   id;
	public String name;
	
	public List<UUID> topics = new ArrayList<>();
	public User       admin;
	public List<UUID> students = new ArrayList<>();
	
	public Workspace() {
		this.id = UUID.randomUUID();
		name = "Workspace" + (int) (Math.random() * 10);
	}
}

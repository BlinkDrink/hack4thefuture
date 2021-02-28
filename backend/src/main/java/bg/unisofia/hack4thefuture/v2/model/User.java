package bg.unisofia.hack4thefuture.v2.model;

import org.apache.commons.lang3.tuple.Pair;

import java.io.Serializable;
import java.util.*;

public class User implements Serializable {
	
	public UUID id;
	
	public String name;
	
	public List<UUID> workspaceList      = new ArrayList<>();
	public List<UUID> workspaceAdminList = new ArrayList<>();
	
	public Map<UUID, Pair<Integer, Integer>> taskMap     = new HashMap<>(); // (taskId, currentPoints, maxPoints)
	public Map<UUID, Pair<Integer, Integer>> questionMap = new HashMap<>(); // (questionId, currentPoints, maxPoints)
	
	public User() {
		this.id   = UUID.randomUUID();
		name = "User" + (int) (Math.random() * 10);
	}
}

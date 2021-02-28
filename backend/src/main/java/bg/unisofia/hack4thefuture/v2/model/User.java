package bg.unisofia.hack4thefuture.v2.model;

import bg.unisofia.hack4thefuture.v2.statics.DataProvider;
import org.apache.commons.lang3.tuple.Pair;

import java.io.Serializable;
import java.util.*;

public class User implements Serializable {
	
	private UUID id;
	
	private String name;
	
	private List<UUID> workspaceList      = new ArrayList<>();
	private List<UUID> workspaceAdminList = new ArrayList<>();
	
	private Map<UUID, Pair<Integer, Integer>> taskMap     = new HashMap<>(); // (taskId, currentPoints, maxPoints)
	private Map<UUID, Pair<Integer, Integer>> questionMap = new HashMap<>(); // (questionId, currentPoints, maxPoints)
	
	public User() {
		this.id   = UUID.randomUUID();
		DataProvider.userMap.put(id, this);
		DataProvider.save();
	}
	
	public void setName(String name) {
		this.name = name;
		DataProvider.save();
	}
	
	public void addWorkspace(UUID workspace) {
		this.workspaceList.add(workspace);
		DataProvider.save();
	}
	
	public void addWorkspaceAdmin(UUID workspace) {
		this.workspaceAdminList.add(workspace);
		DataProvider.save();
	}
	
	public void addTask(UUID task, int currPoints, int maxPoints) {
		this.taskMap.put(task, Pair.of(currPoints, maxPoints));
		DataProvider.save();
	}
	
	public void addQuestion(UUID question, int currPoints, int maxPoints) {
		this.questionMap.put(question, Pair.of(currPoints, maxPoints));
		DataProvider.save();
	}
	
	public UUID getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public List<UUID> getWorkspaceList() {
		return workspaceList;
	}
	
	public List<UUID> getWorkspaceAdminList() {
		return workspaceAdminList;
	}
	
	public Map<UUID, Pair<Integer, Integer>> getTaskMap() {
		return taskMap;
	}
	
	public Map<UUID, Pair<Integer, Integer>> getQuestionMap() {
		return questionMap;
	}
}

package bg.unisofia.hack4thefuture.v2.api;

import bg.unisofia.hack4thefuture.v2.model.Topic;
import bg.unisofia.hack4thefuture.v2.model.User;
import bg.unisofia.hack4thefuture.v2.model.Workspace;
import bg.unisofia.hack4thefuture.v2.statics.DataProvider;

import org.json.JSONArray;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@CrossOrigin
@RestController
public class Controller {
	
	@GetMapping("/api/workspaces")
	public String getWorkspaces() {
		return DataProvider.getJson().toString();
	}
	
	@PostMapping("/api/workspaces")
	public Workspace postWorkspaces(Workspace workspace) {
		return workspace;
	}
	
	@DeleteMapping("/api/workspaces/{workspaceId}")
	public void deleteWorkspaceById(@PathVariable String workspaceId) {
		try {
			UUID    id     = UUID.fromString(workspaceId);
			boolean result = DataProvider.Delete.deleteWorkspace(id);
		}
		catch (Exception e) {
		
		}
	}
	
	@PostMapping("/api/workspaces/{workspaceId}/topics")
	public Topic putTopic(@PathVariable String workspaceId, Topic topic) {
		System.out.println(topic);
		
		try {
			UUID id = UUID.fromString(workspaceId);
			topic.setId(UUID.randomUUID());
			
			Workspace workspace = DataProvider.workspaceMap.get(id);
			if (workspace == null) {
				return topic;
			}
			
			workspace.addTopic(topic.getId());
		}
		catch (Exception e) {
		
		}
		return topic;
	}
	
	@GetMapping("/api/workspaces/{workspaceId}/students")
	public List<User> getWorkspaceStudents(@PathVariable String workspaceId) {
		try {
			UUID      id        = UUID.fromString(workspaceId);
			Workspace workspace = DataProvider.workspaceMap.get(id);
			
			List<User> users = new ArrayList<>();
			for (UUID uuid : workspace.getStudents()) {
				User user = DataProvider.userMap.get(uuid);
				if (user != null) {
					users.add(user);
				}
			}
			
			return users;
		}
		catch (Exception e) {
			return new ArrayList<>();
		}
	}
	
	@GetMapping("/api/workspaces/{workspaceId}/admin")
	public User getWorkspaceAdmin(@PathVariable String workspaceId) {
		try {
			UUID      id        = UUID.fromString(workspaceId);
			Workspace workspace = DataProvider.workspaceMap.get(id);
			
			if (workspace == null) {
				return null;
			}
			
			User user = DataProvider.userMap.get(workspace.getAdmin());
			return user;
		}
		catch (Exception e) {
			return null;
		}
	}
}

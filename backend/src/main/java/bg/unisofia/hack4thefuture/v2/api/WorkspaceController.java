package bg.unisofia.hack4thefuture.v2.api;

import bg.unisofia.hack4thefuture.v2.model.Topic;
import bg.unisofia.hack4thefuture.v2.model.Workspace;
import bg.unisofia.hack4thefuture.v2.statics.DataProvider;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class WorkspaceController {
	
	@GetMapping("/api/workspaces")
	public List<Workspace> getWorkspaces() {
		return DataProvider.Get.getWorkspaces();
	}
	
	@PostMapping("/api/workspaces")
	public Workspace postWorkspaces(Workspace workspace) {
		workspace.id = UUID.randomUUID();
		DataProvider.Post.addWorkspace(workspace);
		return workspace;
	}
	
//	@GetMapping("/api/workspaces/{workspaceId}")
//	public void getWorkspaceById(@PathVariable String workspaceId) {
//
//	}
	
//	@PutMapping("/api/workspaces/{workspaceId}")
//	public void putWorkspaceById(@PathVariable String workspaceId) {
//
//	}
	
	@DeleteMapping("/api/workspaces/{workspaceId}")
	public void deleteWorkspaceById(@PathVariable String workspaceId) {
		try {
			UUID id = UUID.fromString(workspaceId);
			boolean result = DataProvider.Delete.deleteWorkspace(id);
		}
		catch (Exception e) {
		
		}
	}

	@PostMapping("/api/workspaces/{workspaceId}/topics")
	public void putTopic(@PathVariable String workspaceId, Topic topic) {
		try {
			UUID id = UUID.fromString(workspaceId);
			topic.id = UUID.randomUUID();
			
			DataProvider.Post.addTopic(id, topic);
		}
		catch (Exception e) {
		
		}
	}
}

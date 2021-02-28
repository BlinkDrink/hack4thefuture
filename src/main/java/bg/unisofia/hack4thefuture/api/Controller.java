package bg.unisofia.hack4thefuture.api;

import bg.unisofia.hack4thefuture.data.DataProvider;
import bg.unisofia.hack4thefuture.models.Workspace;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class Controller {
	
	@GetMapping("/api/workspaces")
	public List<Workspace> getWorkspaces() {
		
		// Serialize
//		File f = new File("data.db");
//		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
//			oos.writeObject(list);
//			oos.flush();
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		
		// Deserialize
//		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
//			list = (List<Workspace>) ois.readObject();
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		
		var list = DataProvider.getAllWorkspaces();
		return list;
	}
	
	@PostMapping("/api/workspaces")
	public Workspace postWorkspaces(Workspace workspace) {
		if (workspace != null) {
			workspace.id = String.valueOf(UUID.randomUUID());
		}
		
		return workspace;
	}
	
	@GetMapping("/api/workspaces/{workspaceId}")
	public void getWorkspaceById(@PathVariable String workspaceId) {
		DataProvider.getWorkspaceById(workspaceId);
	}
}

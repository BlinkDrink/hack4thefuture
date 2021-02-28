package bg.unisofia.hack4thefuture.v1.data;

import bg.unisofia.hack4thefuture.v1.models.*;

import java.util.List;

public class DataProvider {
	
	private static List<Workspace> list;

//	static Connection connection;
	
	public static List<Workspace> getAllWorkspaces() {
		return list;
	}
	
	public static Workspace getWorkspaceById(String workspaceId) {
		return null; // TODO
	}
	
	static void submitLoaded(List<Workspace> list) {
		DataProvider.list = list;
	}
}

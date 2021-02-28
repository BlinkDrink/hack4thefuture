package bg.unisofia.hack4thefuture.data;

import bg.unisofia.hack4thefuture.models.*;

import java.net.MalformedURLException;
import java.sql.Connection;
import java.util.ArrayList;
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

package bg.unisofia.hack4thefuture.data;

import bg.unisofia.hack4thefuture.models.Workspace;
import bg.unisofia.hack4thefuture.util.Constants;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataProviderSetup {
	
	public static void loadDatabase() {
		File dbFile = new File(Constants.DATABASE_FILE);
		List<Workspace> list;
		
		if (!dbFile.exists()) {
			list = new ArrayList<>();
			list.add(DataProviderSample.createSampleWorkspace1());
			list.add(DataProviderSample.createSampleWorkspace2());
		}
		else {
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dbFile))) {
				list = (List<Workspace>) ois.readObject();
			}
			catch (Exception e) {
				e.printStackTrace();
				list = new ArrayList<>();
			}
		}
		DataProvider.submitLoaded(list);
	}
	
	public static void saveDatabase() {
		
		File dbFile = new File("data.db");
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dbFile))) {
			oos.writeObject(DataProvider.getAllWorkspaces());
			oos.flush();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean connectDatabase() {
//		String url = "jdbc:mysql://localhost:3306";
//		String username = "root";
//		String password = "";
//
//		try {
//			DataProvider.connection = DriverManager.getConnection(url, username, password);
//			return true;
//		}
//		catch (SQLException e) {
//			return false;
//		}
		
		// lmao
		return true;
	}
	
	public static void createDatabase() {
//		try {
//			var statement = DataProvider.connection.createStatement();
//			statement.execute("create database if not exists `hack4thefuture`;");
//			statement.close();
//		}
//		catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		// ye this one too
	}
}

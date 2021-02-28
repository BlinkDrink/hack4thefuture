package bg.unisofia.hack4thefuture.v2.statics;

import bg.unisofia.hack4thefuture.v2.model.*;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class DataProvider {
	
	private static Map<UUID, Answer>    answerMap    = new HashMap<>();
	private static Map<UUID, Material>  materialMap  = new HashMap<>();
	private static Map<UUID, Question>  questionMap  = new HashMap<>();
	private static Map<UUID, Task>      taskMap      = new HashMap<>();
	private static Map<UUID, Topic>     topicMap     = new HashMap<>();
	private static Map<UUID, User>      userMap      = new HashMap<>();
	private static Map<UUID, Workspace> workspaceMap = new HashMap<>();
	
	public static void save() {
		File dir = new File("data");
		dir.mkdirs();
		
		saveToFile("data/answer.db", answerMap);
		saveToFile("data/material.db", materialMap);
		saveToFile("data/question.db", questionMap);
		saveToFile("data/task.db", taskMap);
		saveToFile("data/topic.db", topicMap);
		saveToFile("data/user.db", userMap);
		saveToFile("data/workspace.db", workspaceMap);
	}
	
	public static void load() {
		File dir = new File("data");
		dir.mkdirs();
		
		answerMap    = loadFromFile("data/answer.db", answerMap);
		materialMap  = loadFromFile("data/material.db", materialMap);
		questionMap  = loadFromFile("data/question.db", questionMap);
		taskMap      = loadFromFile("data/task.db", taskMap);
		topicMap     = loadFromFile("data/topic.db", topicMap);
		userMap      = loadFromFile("data/user.db", userMap);
		workspaceMap = loadFromFile("data/workspace.db", workspaceMap);
	}
	
	private static <T> void saveToFile(String fileName, Map<UUID, T> map) {
		File dbFile = new File(fileName);
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dbFile))) {
			oos.writeObject(map);
			oos.flush();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static <T> Map<UUID, T> loadFromFile(String fileName, Map<UUID, T> map) {
		File dbFile = new File(fileName);
		
		if (!dbFile.exists()) {
			map = new HashMap<>();
		}
		else {
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dbFile))) {
				map = (Map<UUID, T>) ois.readObject();
			}
			catch (Exception e) {
				e.printStackTrace();
				map = new HashMap<>();
			}
		}
		return map;
	}
	
	public static class Get {
		
		/**
		 *
		 * @return
		 */
		public static List<Workspace> getWorkspaces() {
			return workspaceMap.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
		}
		
		public static Workspace getWorkspace(UUID id) {
			for (var entry : workspaceMap.entrySet()) {
				if (id.equals(entry.getKey())) {
					return entry.getValue();
				}
			}
			return null;
		}
	}
	
	public static class Post {
		
		/**
		 *
		 * @param workspace
		 * @return True if successful, false otherwise
		 */
		public static boolean addWorkspace(Workspace workspace) {
			for (var entry : workspaceMap.entrySet()) {
				if (workspace.id.equals(entry.getKey())) {
					return false;
				}
			}
			
			workspaceMap.put(workspace.id, workspace);
			saveToFile("data/workspace.db", workspaceMap);
			return true;
		}
		
		public static boolean addTopic(UUID workspaceId, Topic topic) {
			Workspace workspace = DataProvider.Get.getWorkspace(workspaceId);
			
			if (workspace == null) {
				return false;
			}
			
			workspace.topics.add(topic.id);
			topicMap.put(topic.id, topic);
			
			saveToFile("data/workspace.db", workspaceMap);
			saveToFile("data/topic.db", topicMap);
			
			// has issues in future
			
			return true;
		}
	}
	
	public static class Delete {
		
		/**
		 *
		 * @param id
		 * @return True if successful, false otherwise
		 */
		public static boolean deleteWorkspace(UUID id) {
			var iter = workspaceMap.entrySet().iterator();
			
			while (iter.hasNext()) {
				var next = iter.next();
				if (id.equals(next.getKey())) {
					iter.remove();
					return true;
				}
			}
			
			saveToFile("data/workspace.db", workspaceMap);
			return true;
		}
	}
}

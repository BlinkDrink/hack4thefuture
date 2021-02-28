package bg.unisofia.hack4thefuture.v2.statics;

import bg.unisofia.hack4thefuture.v2.model.*;

public class DataSample {
	
	public static void addSampleData() {
		
		Workspace work1 = new Workspace();
		work1.setName("Workspace1");
		
		Topic topic1 = getJavaTopic();
		
		User adminUser = new User();
		adminUser.setName("Kris Vachev");
		adminUser.addWorkspaceAdmin(work1.getId());
		
		User studentUser1 = new User();
		studentUser1.setName("Petko Petkov");
		studentUser1.addWorkspace(work1.getId());
		
		User studentUser2 = new User();
		studentUser2.setName("Teodor Todorov");
		studentUser2.addWorkspace(work1.getId());
		
		work1.setAdmin(adminUser.getId());
		work1.addStudent(studentUser1.getId());
		work1.addStudent(studentUser2.getId());
		
		work1.addTopic(topic1.getId());
	}
	
	private static Topic getJavaTopic() {
		
		Task task1 = new Task();
		task1.setName("Create Java project");
		task1.setLink("https://www.google.com");
		task1.setPoints(10);
		
		Material mat1 = getSampleMaterial1();
		
		Topic topic1 = new Topic();
		topic1.setName("Java");
		topic1.addMaterial(mat1.getId());
		topic1.addTask(task1.getId());
		
		return topic1;
	}
	
	private static Material getSampleMaterial1() {
		Answer ans11 = new Answer();
		ans11.setText("Correct answer");
		ans11.setCorrect(true);
		ans11.setExplanation("Explanation here");
		
		Answer ans12 = new Answer();
		ans12.setText("Wrong answer");
		ans12.setCorrect(false);
		ans12.setExplanation("Explanation here");
		
		Answer ans13 = new Answer();
		ans13.setText("Wrong answer");
		ans13.setCorrect(false);
		ans13.setExplanation("Explanation here");
		
		Question ques1 = new Question();
		ques1.setPoints(30);
		ques1.setQuestionText("What is the correct answer?");
		ques1.addAnswer(ans11.getId());
		ques1.addAnswer(ans12.getId());
		ques1.addAnswer(ans13.getId());
		
		Material mat1 = new Material();
		mat1.setName("MaterialName");
		mat1.setLink("https://stackoverflow.com/questions/7785456/maven-assembly-plugin-is-not-setting-the-mainclass-manifest-setting");
		mat1.addQuestion(ques1.getId());
		
		return mat1;
	}
}

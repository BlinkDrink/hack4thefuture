package bg.unisofia.hack4thefuture.v2.statics;

import bg.unisofia.hack4thefuture.v2.model.*;

public class DataSample {
	
	public static void addSampleData() {
//		Workspace work1 = new Workspace();
//
//		Topic topic1 = new Topic();
//		topic1.name   = "Topic1";
//
//		Material mat1  = new Material();
//		mat1.name = "Material1";
//		mat1.link = "https://stackoverflow.com/questions/7785456/maven-assembly-plugin-is-not-setting-the-mainclass-manifest-setting";
//
//		Task     task1 = new Task();
//		task1.points = 10;
//
//		Question ques1 = new Question();
//		ques1.questionText = "Question Text";
//
//		Answer ans11 = new Answer();
//		ans11.text = "Correct answer text11";
//		ans11.isCorrect = true;
//		ans11.explanation = "Explanation11";
//
//		Answer ans12 = new Answer();
//		ans12.text = "Wrong answer text12";
//		ans12.isCorrect = false;
//		ans12.explanation = "Explanation12";
//
//		Answer ans13 = new Answer();
//		ans13.text = "Wrong answer text13";
//		ans13.isCorrect = false;
//		ans13.explanation = "Explanation13";
//
//		ques1.answers.add(ans11.id);
//		ques1.answers.add(ans12.id);
//		ques1.answers.add(ans13.id);
//
//		topic1.materials.add(mat1.id);
//		topic1.tasks.add(task1.id);
//		topic1.questions.add(ques1.id);
//
//		work1.topics.add(topic1.id);
		
		Workspace work1 = new Workspace();
		work1.setName("Workspace1");
		
		Topic topic1 = new Topic();
		topic1.setName("Topic1");
		
		Task task1 = new Task();
		task1.setPoints(10);
		
		Question ques1 = new Question();
		ques1.setQuestionText("Question Text");
		
		Material mat1 = new Material();
		mat1.setName("Material1");
		mat1.setLink("https://stackoverflow.com/questions/7785456/maven-assembly-plugin-is-not-setting-the-mainclass-manifest-setting");
		mat1.addQuestion(ques1.getId());
		
		Answer ans11 = new Answer();
		ans11.setText("Correct answer text11");
		ans11.setCorrect(true);
		ans11.setExplanation("Explanation11");
		
		Answer ans12 = new Answer();
		ans11.setText("Wrong answer text11");
		ans11.setCorrect(false);
		ans11.setExplanation("Explanation12");
		
		Answer ans13 = new Answer();
		ans11.setText("Wrong answer text13");
		ans11.setCorrect(false);
		ans11.setExplanation("Explanation13");
		
		ques1.addAnswer(ans11.getId());
		ques1.addAnswer(ans12.getId());
		ques1.addAnswer(ans13.getId());
		
		topic1.addMaterial(mat1.getId());
		topic1.addTask(task1.getId());
		
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
}

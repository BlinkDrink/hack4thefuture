package bg.unisofia.hack4thefuture.v1.data;

import bg.unisofia.hack4thefuture.v1.models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataProviderSample {
	
	public static Workspace createSampleWorkspace1() {
		
		// Create people
		User admin    = new User("Kristiyan Vachev");
		User student1 = new User("Petko Petkov");
		User student2 = new User("Teodor Todorov");
		
		Topic topic1 = new Topic(
			"Big Four",
			50,
			Arrays.asList(
				new Material(
					"(C++) Big Four - Richel Bilderbeek",
					"https://www.richelbilderbeek.nl/CppBigFour.htm"
				)
			),
			Arrays.asList(
				new Question(
					"Which of those isn't of the big four",
					Arrays.asList(
						new Answer(true, "Constructor", "it is."),
						new Answer(false, "Alpaca", "tempting, but no."),
						new Answer(true, "Destructor", "it is.")
					)
				)
			),
			Arrays.asList(
				new Task("https://www.hackerrank.com/challenges/polar-coordinates/problem")
			)
		);
		
		Topic topic2 = new Topic(
			"Virtual functions",
			100,
			Arrays.asList(),
			Arrays.asList(),
			Arrays.asList()
		);
		
		// Create topics
		List<Topic> topics = new ArrayList<>();
		topics.add(topic1);
		topics.add(topic2);
		
		// Create students array
		List<User> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		
		// Create workspace
		Workspace workspace = new Workspace("OOP", topics, admin, students);
		
		return workspace;
	}
	
	public static Workspace createSampleWorkspace2() {
		
		// Create people
		User admin    = new User("Kristiyan Vachev");
		User student1 = new User("Petko Petkov");
		
		Topic topic1 = new Topic(
			"President",
			0,
			Arrays.asList(
				new Material(
					"Xi Jinping declares complete vicotry in eradicating poverty in China",
					"https://www.thehindu.com/news/international/president-xi-jinping-declares-complete-victory-in-eradicating-poverty-in-china/article33930137.ece"
				)
			),
			Arrays.asList(
				new Question(
					"What cartoon animal does the president of China resemble?",
					Arrays.asList(
						new Answer(true, "Bear", "You know it's true."),
						new Answer(false, "Alpaca", "What?")
					)
				)
			),
			Arrays.asList(
				new Task("https://www.hackerrank.com/challenges/polar-coordinates/problem")
			)
		);
		
		// Create topics
		List<Topic> topics = new ArrayList<>();
		topics.add(topic1);
		
		// Create students array
		List<User> students = new ArrayList<>();
		students.add(student1);
		
		// Create workspace
		Workspace workspace = new Workspace("Chinese", topics, admin, students);
		
		return workspace;
	}
}

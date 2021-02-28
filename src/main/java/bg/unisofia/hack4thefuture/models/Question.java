package bg.unisofia.hack4thefuture.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class Question implements Serializable {
	
	public String       id;
	public String       questionText;
	public List<Answer> answers;
	public int          points;
	
	public Question(String questionText, List<Answer> answers) {
		this.id           = UUID.randomUUID().toString();
		this.questionText = questionText;
		this.answers      = answers;
	}
}

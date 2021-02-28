package bg.unisofia.hack4thefuture.v1.models;

import java.io.Serializable;
import java.util.UUID;

public class User implements Serializable {
	
	public String id;
	public String name;
	
	public User(String name) {
		this.id   = UUID.randomUUID().toString();
		this.name = name;
	}
}

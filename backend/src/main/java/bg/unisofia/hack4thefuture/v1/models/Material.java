package bg.unisofia.hack4thefuture.v1.models;

import java.io.Serializable;
import java.util.UUID;

public class Material implements Serializable {
	
	public String id;
	public String name;
	public String link;
	
	public Material(String name, String link) {
		this.id   = UUID.randomUUID().toString();
		this.name = name;
		this.link = link;
	}
}

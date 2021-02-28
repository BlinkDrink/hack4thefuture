package bg.unisofia.hack4thefuture.v2.model;

import java.io.Serializable;
import java.util.UUID;

public class Material implements Serializable {
	
	public UUID id;
	
	public String name;
	public String link;
	
	public Material() {
		this.id   = UUID.randomUUID();
		name = "Material" + (int) (Math.random() * 10);
		link = "www.linkhere.com";
	}
}

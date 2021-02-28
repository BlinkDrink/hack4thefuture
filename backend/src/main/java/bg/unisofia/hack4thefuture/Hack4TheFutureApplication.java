package bg.unisofia.hack4thefuture;

import bg.unisofia.hack4thefuture.v2.statics.DataProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hack4TheFutureApplication {
	
	
	public static void main(String[] args) {
		var app = SpringApplication.run(Hack4TheFutureApplication.class, args);
		
		// v1
//		if (!DataProviderSetup.connectDatabase()) {
//			app.close();
//			return;
//		}
//
//		DataProviderSetup.createDatabase();
//		DataProviderSetup.loadDatabase();
		
		// v2
		DataProvider.load();
		DataProvider.save();
	}
}

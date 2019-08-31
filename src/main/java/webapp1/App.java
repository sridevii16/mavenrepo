package webapp1;

import webapp1.config.AppConfig;
import com.github.mwmahlberg.speedy.SpeedyApplication;
import com.github.mwmahlberg.speedy.template.ThymeleafModule;

public class App {

	public static void main(String[] args) {
		/*
		 * Create a new SpeedyApplication and tell it where to
		 * look for components
		 */
		SpeedyApplication app = new SpeedyApplication("webapp1");
		
		/*
		 * Configure the app using the command line args
		 * and any number of Guice modules you define in your
		 * application
		 */
		app.configure(args, new AppConfig(), new ThymeleafModule());
		
		try {
			app.run();
		} catch (Exception e) {
			
			e.printStackTrace();
			System.exit(1);
		}
	}

}

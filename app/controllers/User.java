
package controllers;

import play.mvc.Before;
import play.mvc.Controller;
import play.mvc.With;

@With(Secure.class)
public class User extends Controller {

	@Before
	static void setConnectedUser() {
		if (Security.isConnected()) {
			if (Security.connected().equals("root")) {
				renderArgs.put("user", "Administrator");
			} else if (Security.connected().equals("vistor")) {
				renderArgs.put("user", "Vistor");
			}
		}
	}

	public static void index() {
		render();
	}
}

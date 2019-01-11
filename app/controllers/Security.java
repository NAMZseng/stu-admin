package controllers;

public class Security extends Secure.Security {

	public static boolean authenticate(String logId, String passwd) {
		// 管理员账号默认设置为root/root
		boolean ret = logId != null && passwd != null &&
			((logId.equals("root") && passwd.equals("root") ||
			  logId.equals("vistor") && passwd.equals("123")));
		
		// 用于cookie缓存
		session.put("currentUser", logId);
		return ret;
	}
	
	public static void onAuthenticated() {
		User.index();
	}
	
	public static void onDisconnected() {
		Application.index();
	}
	
	public static boolean check(String profile) {
		boolean flg = false;
		if (profile.equals("root") && Security.connected().equals("root")) {
			flg = true;
		}
		if (profile.equals("vistor") && Security.connected().equals("vistor")) {
			flg = true;
		}
		return flg;
	}
}

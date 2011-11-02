/**
 * Dispatcher class, used by Connector class for initiating mouse and keyboard events, 
 * also for taking screen captures.
 *
 * @author(s) Farrukh Yakubov,
 * @date 10/26/2011
 * @c_date 11/2/2011
 * 
 * NOTE: if u commit changes to this code, add your name to @author(s), and change @c_date to current date
 */

public class Dispatcher {
	
	private MouseControl mouse;
	private KeyboardControl keyboard;
	private Photographer screen;
	//need to do multithread! one thread for each of the controls
	public Dispatcher(){
		try {
			mouse = new MouseControl();
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			keyboard = new KeyboardControl();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			screen = new Photographer();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void keyboardEvent(int keyCode, int preference){
		keyboard.keyboardEvent(keyCode, preference);
	}
	
	/*
	 * event type is from 0 to 3 as follows:
	 * 0 set mouse, 1 move mouse, 2 click or release, 3 scroll 
	 * agr0 and arg1 are (x,y) for case 0, (dX, dY) for case 1, 
	 * (btn_number, preference) for case 3, (amount) for case 4.
	 * arg1 is not used for case 4
	 */
	public void mouseEvent(int eventType, int arg0, int arg1){
		switch (eventType) {
			case 0:
				mouse.setMouse(arg0, arg1);
				break;
			case 1:
				mouse.moveMouse(arg0, arg1);
				break;
			case 2:
				mouse.mouseClick(arg0, arg1);
				break;
			case 3:
				mouse.mouseScroll(arg1);
				break;
		}
	}
	
	//take screenshot as requested and return path
	public String screenCapture(int x, int y, int width, int height){
		return screen.takeScreenshot(x, y, width, height);
	}
}

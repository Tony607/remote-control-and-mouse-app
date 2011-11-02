/**
 * KeyboardControl class, used for creating keyboard events in the system.
 * This class uses Java Robot class object.
 *
 * @author(s) Farrukh Yakubov, 
 * @date 10/26/2011
 * @c_date 10/26/2011
 * 
 * NOTE: if u commit changes to this code, add your name to @author(s), and change @c_date to current date
 */

import java.awt.AWTException;
import java.awt.Robot;

class KeyboardControl {
	private Robot kc;
	public KeyboardControl(){
		try {
			kc = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void keyboardEvent(int keyCode, int preference){
		//keyCode is corresponding key's virtual number
		//preference: 0 click and release, 1 click and hold, 3 release
		switch (preference) {
			case 0:
				keyPress(keyCode);
				keyRelease(keyCode);
				break;
			case 1:
				keyPress(keyCode);
				break;
			case 2:
				keyRelease(keyCode);
		}
	}
	
	private void keyPress(int keyCode){
		kc.keyPress(keyCode);
	}
	
	private void keyRelease(int keyCode){
		kc.keyRelease(keyCode);
	}
}

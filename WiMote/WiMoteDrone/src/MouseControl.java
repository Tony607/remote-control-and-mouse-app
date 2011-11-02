/**
 * MouseControl class, used for creating mouse events in the system.
 * This class uses Java Robot class object.
 *
 * @author Farrukh Yakubov
 * @date 10/26/2011
 * @c_date 10/26/2011
 * 
 * NOTE: if u commit changes to this code, add your name to @author(s), and change @c_date to current date
 */

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;


class MouseControl {
	
	private Robot mc;
	private Point b;
	
	public MouseControl(){
		try {
			mc = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setMouse(int x, int y){
		move(x, y);
	}
	
	public void moveMouse(int dX, int dY){
		b = MouseInfo.getPointerInfo().getLocation();
		move((int)b.getX()+dX, (int)b.getY()+dY);
	}
	
	public void mouseScroll(int amount){
		scrollWheel(amount);
	}
	
	public void mouseClick(int button_number, int preference){ 
		//button_number: 0 for left, 1 for middle, 2 for right, 3 for wheel
		//preference: 0 for default(click and release), 1 for click(holds afterwards), 2 for release
		switch (button_number){
			case 0: 
				if (preference == 1) {
					leftBtnClick();
				} else if (preference == 2) {
					leftBtnRelease();
				} else {
					leftBtnClick();
					leftBtnRelease();
				}
				break;
			case 1:
				if (preference == 1) {
					midBtnClick();
				} else if (preference == 2) {
					midBtnRelease();
				} else {
					midBtnClick();
					midBtnRelease();
				}
				break;
			case 2:
				if (preference == 1) {
					rightBtnClick();
				} else if (preference == 2) {
					rightBtnRelease();
				} else {
					rightBtnClick();
					rightBtnRelease();
				}
				break;
			case 3:
				if (preference == 1) {
					scrollBtnClick();
				} else if (preference == 2) {
					scrollBtnRelease();
				} else {
					scrollBtnClick();
					scrollBtnRelease();
				}
				break;
		}
	}
	
	private void move(int x, int y){
		mc.mouseMove(x, y);
	}
	
	private void leftBtnClick(){
		mc.mousePress(InputEvent.BUTTON1_MASK);
	}
	
	private void leftBtnRelease(){
		mc.mouseRelease(InputEvent.BUTTON1_MASK);
	}
	
	private void midBtnClick(){
		mc.mousePress(InputEvent.BUTTON2_MASK);
	}
	
	private void midBtnRelease(){
		mc.mouseRelease(InputEvent.BUTTON2_MASK);
	}
	
	private void rightBtnClick(){
		mc.mousePress(InputEvent.BUTTON3_MASK);
	}
	
	private void rightBtnRelease(){
		mc.mouseRelease(InputEvent.BUTTON3_MASK);
	}
	
	private void scrollBtnClick(){
		mc.mousePress(InputEvent.BUTTON3_DOWN_MASK);
	}
	
	private void scrollBtnRelease(){
		mc.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
	}
	
	private void scrollWheel(int scroll_amount){
		mc.mouseWheel(scroll_amount);
	}
}

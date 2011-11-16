package purdue.acm.sigapp;

public class Connector {
	
	public Connector(){
		
	}
	
	//send passed byte array to pc,
	//if connection is not established or failure to send return false, else return true
	private boolean send(byte b[]){
		
		return false;
	}
	
	//in following methods create byte array for sending via bluetooth, and call send(byteArray[]);
	public void setMouse(int x, int y){}
	
	public void moveMouse(int dX, int dY){}
	
	public void mouseScroll(int amount){}
	
	public void leftBtnClick(){}
	
	public void leftBtnRelease(){}
	
	public void midBtnClick(){}
	
	public void midBtnRelease(){}
	
	public void rightBtnClick(){}
	
	public void rightBtnRelease(){}
	
	public void scrollBtnClick(){}
	
	public void scrollBtnRelease(){}
	
	public void keyPress(int keyCode){}
	
	public void keyRelease(int keyCode){}
	
	public void takeScreenshot(int x, int y, int width, int height){}
}

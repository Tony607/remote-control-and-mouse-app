/**
 * Connector class, used for establishing connection
 * and maintaining data transfer between the phone and WiMoteDrone.
 * Also, based on requests use Dispatcher class to initiate request execution.
 *
 * @author(s) Farrukh Yakubov,
 * @date 10/26/2011
 * @c_date 11/2/2011
 * 
 * NOTE: if u commit changes to this code, add your name to @author(s), and change @c_date to current date
 */


import javax.bluetooth.*;
import javax.obex.*;
import javax.swing.JOptionPane;


class Connector {
	
	private Dispatcher agent;
	//private LocalDevice localDevice; // local Bluetooth Manager
	//private DiscoveryAgent discoveryAgent; // discovery agent
	
	
	public Connector(Dispatcher agent){
		this.agent = agent;
		//send current mouse cursor info to device
	}
	
	public boolean connect(){
		//bring up the gui
		//connect via bluetooth:
		//discover the device
		//send confirmation signal to device
		
		return false;
	}
	
	//use this function to notify user of any errors in input stream of commands
	private void notifyUser(String message){
		System.out.println(message);
		//to do: gui notification
		String frameTitle = "DONE";
	    JOptionPane.showMessageDialog(null, message, frameTitle, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void listen(){
		//following variables will be used for for passing parameters
		int event, arg0, arg1, eventType, keyCode, preference, x, y, width, height, len;
		String notification = "\n";
		boolean error = false;
		while (true){
			//determine eventType
			//instruction is in byte array
			event = 0;//determine this //0 for mouse, 1 for key, 2 for screen, 3 for notification
			
			switch (event){
			
				case 0: //mouse event
					eventType = 0;
					arg0 = 0;
					arg1 = 0;
					if (error){
						notifyUser("ERROR: Input is not valid.\nMake sure that you are using WiMote on Android. \n");
						break;
					}
					agent.mouseEvent(eventType, arg0, arg1);
					break;
				case 1: //keyboard event
					if (error){
						notifyUser("ERROR: Input is not valid.\nMake sure that you are using WiMote on Android. \n");
						break;
					}
					keyCode = 0;
					preference = 0;
					agent.keyboardEvent(keyCode, preference);
					break;
				case 2: //screen capture event
					if (error){
						notifyUser("ERROR: Input is not valid.\nMake sure that you are using WiMote on Android. \n");
						break;
					}
					x = 0;
					y = 0;
					width = 0;
					height = 0;
					agent.screenCapture(x, y, width, height);
					break;
				case 3: //notify
					notifyUser(notification);
					break;
			}
			//thread.sleep(5); //if necessary
		}
		
		//if mouse event
		//agent.mouseEvent(eventType, arg0, arg1);
		
		//if keyevent 
		//
		
		//if screen event
		//
		
		//different approach on calls on multithreaded version
		//create input stream, pass it to threads, threads will take action
	}
}

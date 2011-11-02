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

class Connector {
	
	private Dispatcher agent;
	public Connector(Dispatcher agent){
		this.agent = agent;
	}
	
	public boolean connect(){
		//bring up the gui
		//connect via bluetooth
		return false;
	}
	
	public void listen(){
		//if mouse event
		//agent.mouseEvent(eventType, arg0, arg1);
		
		//if keyevent 
		//agent.keyboardEvent(keyCode, preference);
		
		//if screen event
		//agent.screenCapture(x, y, width, height);
		
		//different approach on calls on multithreaded version
	}
}

/**
 * Drone class, used for initiating WiMoteDrone
 *
 * @author(s) Farrukh Yakubov,
 * @date 10/26/2011
 * @c_date 11/2/2011
 * 
 * NOTE: if u commit changes to this code, add your name to @author(s), and change @c_date to current date
 */

class Drone {
	
	private Connector connection;
	private Dispatcher agent;
	
	private Drone() {
		try {
			agent = new Dispatcher();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection = new Connector(agent);
		} catch (Exception e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drone d = null;
		try {
			d = new Drone();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (d != null){
			if(!d.connection.connect()){
				System.out.println("ERROR: Could not connect.\nExitting...");
				System.exit(0);
			}
			d.connection.listen();
		}
	}
}

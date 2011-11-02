/**
 * Photographer class, used for taking custom screen-shots.
 * This class uses Java Robot class object.
 *
 * @author(s) Farrukh Yakubov,
 * @date 10/26/2011
 * @c_date 11/2/2011
 * 
 * NOTE: if u commit changes to this code, add your name to @author(s), and change @c_date to current date
 */

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

class Photographer {
	
	private Robot pt;
	private Rectangle frame;
	private BufferedImage photo;
	private String savePath, name;
	private int screenWidth, screenHeight;
	
	//constructor
	public Photographer(){
		try {
			pt = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frame = new Rectangle();
		screenWidth = Toolkit.getDefaultToolkit ().getScreenSize().width;
		screenHeight = Toolkit.getDefaultToolkit ().getScreenSize().height;
		JFileChooser f = new JFileChooser();
		savePath = f.getFileSystemView().getDefaultDirectory().toString() + "//Screenshots";
	}
	
	//take a screenshot, and return saved file path
	public String takeScreenshot(int x, int y, int width, int height){
		
		if(x+width > screenWidth){
			width = screenWidth - x;
		}
		if(y+height > screenHeight){
			height = screenHeight - y;
		}
		frame.width = width;
		frame.height = height;
		frame.x = x;
		frame.y = x;
		capture(frame);
		return savePath+name;
	}
	
	//generate file name
	private String getFileName(){
		return "//sample.jpg";
	}
	
	//capture and file IO
	private void capture(Rectangle frame){
		photo = pt.createScreenCapture(frame);
		name = getFileName();
		File photoOut = new File(savePath+name);
		try {
			ImageIO.write(photo, "jpg", photoOut);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

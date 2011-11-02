package purdue.acm.sigapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button mouseButton = (Button)findViewById(R.id.mouseLaunchButton);
        mouseButton.setOnClickListener(this);
        Button keyboardButton = (Button)findViewById(R.id.keyboardLaunchButton);
        keyboardButton.setOnClickListener(this);
        Button scrshotButton = (Button)findViewById(R.id.scrshotLaunchButton);
        scrshotButton.setOnClickListener(this);
        Button settingsButton = (Button)findViewById(R.id.settingsLaunchButton);
        settingsButton.setOnClickListener(this);
        Button aboutButton = (Button)findViewById(R.id.aboutLaunchButton);
        aboutButton.setOnClickListener(this);
        Button helpButton = (Button)findViewById(R.id.helpLaunchButton);
        helpButton.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i;
		switch (v.getId()) {
			case R.id.mouseLaunchButton:
				//launch mouse activity depending on settings
				i = new Intent(this, Mouse.class);
				startActivity(i);
				break;
			case R.id.keyboardLaunchButton:
				//launch keyboard activity
				i = new Intent(this, Keyboard.class);
				startActivity(i);
				
				break;
			case R.id.scrshotLaunchButton:
				//launch screenshot activity
				i = new Intent(this, ScrShot.class);
				startActivity(i);
				break;
			case R.id.settingsLaunchButton:
				//launch settings activity
				i = new Intent(this, Settings.class);
				startActivity(i);
				break;
			case R.id.aboutLaunchButton:
				//launch about activity
				i = new Intent(this, About.class);
				startActivity(i);
				break;
			case R.id.helpLaunchButton:
				//launch help activity
				i = new Intent(this, Help.class);
				startActivity(i);
				break;
		}
	}
}

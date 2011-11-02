package purdue.acm.sigapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Keyboard extends Activity implements OnClickListener {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.keyboard);
		
		Button mouseButton = (Button)findViewById(R.id.gotoMainButton_Keyboard);
        mouseButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
			case R.id.gotoMainButton_Keyboard:
				//close activity
				finish();
				break;
		}
	}
}
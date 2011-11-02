package purdue.acm.sigapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ScrShot extends Activity implements OnClickListener {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.scrshot);
		
		Button mouseButton = (Button)findViewById(R.id.gotoMainButton_ScrShot);
        mouseButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
			case R.id.gotoMainButton_ScrShot:
				//close activity
				finish();
				break;
		}
	}
}

package cse.usf.edu.android;

import android.app.Activity;
import android.os.Bundle;

public class MainMenu extends Activity {

	String username;
	String age;
	String weight;
	String height_feet;
	String height_inches;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_menu);
		
		Bundle b = getIntent().getExtras();
        username = b.getString("USERNAME");
        age = b.getString("AGE");
        weight = b.getString("WEIGHT");
        height_feet = b.getString("HEIGHT_FEET");
        height_inches = b.getString("HEIGHT_INCHES");
        
	}
}

package sachin.onemessage;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class DisplayMessage extends Activity {
	public static final String Msg = "Message";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_message);
		SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
		SharedPreferences.Editor editor = preferences.edit();
		editor.putString(Msg, "Default");
	}
	
	public void onResume()
	{
		super.onResume();
		SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
		String s= preferences.getString(Msg, "Default");
		EditText edt = (EditText) findViewById(R.id.editText1);
		edt.setText(s);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_display_message, menu);
		return true;
	}
	
	public void restore(View view)
	{
		SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
		String s= preferences.getString(Msg, "Default");
		EditText edt = (EditText) findViewById(R.id.editText1);
		edt.setText(s);
	}
	
	public void lock(View view)
	{
		EditText edt = (EditText) findViewById(R.id.editText1);
		SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
		SharedPreferences.Editor editor = preferences.edit();
		editor.putString(Msg, (edt.getText().toString()));
		editor.commit();
		Intent intent = new Intent(this, MainActivity.class);
		intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(intent);
	}

}

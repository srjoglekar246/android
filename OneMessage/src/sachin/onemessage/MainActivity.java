package sachin.onemessage;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private static int clicked = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		View v = (View) findViewById (R.id.button10);
		v.setId(10);
		 v = (View) findViewById (R.id.button1);
		v.setId(11);
		 v = (View) findViewById (R.id.button2);
		v.setId(12);
		 v = (View) findViewById (R.id.button3);
		v.setId(13);
		 v = (View) findViewById (R.id.button4);
		v.setId(14);
		 v = (View) findViewById (R.id.button5);
		v.setId(15);
		 v = (View) findViewById (R.id.button6);
		v.setId(16);
		 v = (View) findViewById (R.id.button7);
		v.setId(17);
		 v = (View) findViewById (R.id.button8);
		v.setId(18);
		 v = (View) findViewById (R.id.button9);
		v.setId(19);
		
	}
	
	public void onResume()
	{
		super.onResume();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public void check(View view)
	{
		int i = view.getId();
		clicked = ((clicked % 1000) * 10) + i%10;
		if (clicked == 7895 )
		{
			Intent intent = new Intent(this, DisplayMessage.class);
			startActivity(intent);
		}
	}

}

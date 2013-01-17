package sachin.addquick;

import java.util.ArrayList;

import android.os.Bundle;
import android.os.RemoteException;
import android.provider.Contacts;
import android.provider.ContactsContract;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.CommonDataKinds.StructuredName;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import android.app.Activity;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	@SuppressWarnings("deprecation")
	public void add(View view)
	{
		EditText ed1 = (EditText) findViewById(R.id.editText1);
		String name = ed1.getText().toString();
		ed1.setText("Add name");
		ed1 = (EditText) findViewById(R.id.editText2);
		String number = ed1.getText().toString();
		ed1.setText("Add number");
		Intent addContactIntent = new Intent(Contacts.Intents.Insert.ACTION, Contacts.People.CONTENT_URI);
		addContactIntent.putExtra(Contacts.Intents.Insert.NAME, name);
		addContactIntent.putExtra(Contacts.Intents.Insert.PHONE, number);// an example, there is other data available
		startActivity(addContactIntent);
		 
	}
}



package com.alissoft.teste;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);

        // Set main.xml as user interface layout
        setContentView(R.layout.main);
    }

    public void OnClickHelloText(View view) 
    {
    	Toast.makeText(this, "You found the Easter Egg ;-;", Toast.LENGTH_LONG).show();
	}


}

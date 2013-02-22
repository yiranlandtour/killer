package com.example.killer;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

@SuppressLint("NewApi") public class MainActivity extends Activity {

    public String killerS;
    public int killerNum;
    public int policeNum;
    public int peaNum;
    
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        Button myButton = (Button) findViewById(R.id.button1);
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        killerS = editText1.getText().toString();
        
        
        setContentView(R.layout.activity_main);
  
    }

    
    
    
public void start(View view)
{
	setContentView(R.layout.choosen);
}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

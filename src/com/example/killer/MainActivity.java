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

    public String tempString;
    public int killerNum;
    public int policeNum;
    public int peaNum;
    
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
       
        
        setContentView(R.layout.activity_main);
  
    }

    
    
    
public void start(View view)
{
	 Button myButton = (Button) findViewById(R.id.button1);
	 
	 /* to get the basic number of role  */
     EditText editText1 = (EditText) findViewById(R.id.editText1);
     tempString = editText1.getText().toString();
     killerNum = Integer.parseInt(tempString);
     
     EditText editText2 = (EditText) findViewById(R.id.editText2);
     tempString = editText2.getText().toString();
     policeNum = Integer.parseInt(tempString);
     
     EditText editText3 = (EditText) findViewById(R.id.editText3);
     tempString = editText3.getText().toString();
     peaNum = Integer.parseInt(tempString);
	
     
     /* a wise rule to create the order*/
     
     
     
	setContentView(R.layout.choosen);
}

public void choose(View view)
{
	
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

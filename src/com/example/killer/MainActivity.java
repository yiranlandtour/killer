package com.example.killer;

import java.util.Random;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.TextView;

@SuppressLint("NewApi") public class MainActivity extends Activity {

    public int godExist = 0;
	public String tempString;
    public int killerNum =0;
    public int policeNum = 0;
    public int peaNum = 0;
    public int length = 0;
    public int all[] = new int[200];
    public int whichOne = 0;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
       /*
        //获取CheckBox实例
        CheckBox cb = (CheckBox)this.findViewById(R.id.checkBox1);
        //绑定监听器
        cb.setOnCheckedChangeListener(new OnCheckedChangeListener() {
                    
                   
                    public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
                        godExist = 1;
                    }
                });
                */
        setContentView(R.layout.activity_main);
  
    }

    
    
    
public void start(View view)
{
	int i,j; 
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
	

     CheckBox cb = (CheckBox)this.findViewById(R.id.checkBox1);
     if(cb.isChecked()) godExist = 1;
     
     /* a wise rule to create the order*/
     length = peaNum + killerNum;
     length = policeNum + length;
     
     for(i = 0; i < length; i++)
     {
    	 for(j = 0; j < peaNum; j++,i++)
    	 {
    		 all[i] = 1;
    	 }
    	 for(j = 0; j < killerNum; j++,i++)
    	 {
    		 all[i] = 2;
    	 }
    	 for(j = 0; j < policeNum; j++,i++)
    	 {
    		 all[i] = 3;
    	 }
    	 
     }
     
     /*if god exist*/
     if(1 == godExist)
     {
    	 length = length+1;
    	 all[length-1] = 0;   	 
     }
     
     int temp;
     //have a sequence
     for(j = 0; j < 10;j++)
     for(i = 0; i < length; i++)
     {
    	 Random random1 = new Random();
         int ramd = random1.nextInt(length);

		temp = all[ramd];
         all[ramd] = all[i];
         all[i] = temp;

     }
     

    /* try to init choosen */ 
	setContentView(R.layout.choosen);
	String text = String.valueOf(whichOne+1);
	TextView textview1 = (TextView)findViewById(R.id.textView1);
    textview1.setText(text);
    text = findwhich(all[whichOne]); 
    TextView textview2 = (TextView)findViewById(R.id.textView2);
    textview2.setText(text);
    
    
    
}

public String findwhich(int a)
{
	String text = "hello";
	if(0 == a)
		text="法官";
	if(2 == a)
		text="杀手";
	if(3 == a)
		text="警察";
	if(1 == a)
		text="平民";
	whichOne++;
	return text;
}
public void choose(View view)
{
	
	if(whichOne > length)
		result();
	setContentView(R.layout.choosen);
	String text = String.valueOf(whichOne+1);
	TextView textview1 = (TextView)findViewById(R.id.textView1);
    textview1.setText(text);
    text = findwhich(all[whichOne]); 
    TextView textview2 = (TextView)findViewById(R.id.textView2);
    textview2.setText(text);
    
    
}
public void next(View view)
{
	
	setContentView(R.layout.next);
}
/* show the result */
public void result()
{
	setContentView(R.layout.result);
	String text="结果如下\n",temp;
	int i;
	for(i = 0; i < length;i++)
	{
	temp = String.valueOf(i+1) + findwhich(all[i]);
	text = text + temp;
	text = text + "\n";
	}
	TextView textview1 = (TextView)findViewById(R.id.textView1);
    textview1.setText(text);
}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

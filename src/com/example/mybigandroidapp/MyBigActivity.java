package com.example.mybigandroidapp;
 
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
 
public class MyBigActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
 
        //---the button is wired to an event handler---
        Button btn1 = (Button)findViewById(R.id.btnClickMe);
        btn1.setOnClickListener(btnListener);
    }
 
    //---create an anonymous class to act as a button click listener---
    private OnClickListener btnListener = new OnClickListener()
    {
        public void onClick(View v)
        {                        
            Toast.makeText(getBaseContext(), 
                    "Hello, readers of MobiForge!", 
                    Toast.LENGTH_LONG).show();
        }
    };    
}
	
	
	
        
        
    



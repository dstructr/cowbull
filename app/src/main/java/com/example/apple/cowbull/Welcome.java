package com.example.apple.cowbull;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.content.Context;
import android.app.Activity;
import 	android.view.LayoutInflater;
import android.widget.ImageView;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


     //public final static String sample_text = "com.example.cowbull.text";
    // Example of a call to a native method
        ImageView image = (ImageView) findViewById(R.id.cow);

//        TextView tv = (TextView) findViewById(R.id.activity_welcome);
//        tv.setText(stringFromJNI());
        Button Button1 = (Button) findViewById(R.id.button1);
        Button Button2 = (Button) findViewById(R.id.button2);
        Button Button3 = (Button) findViewById(R.id.button3);
        Button Button4 = (Button) findViewById(R.id.button4);
        Button Button5 = (Button) findViewById(R.id.button5);
        Button1.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Welcome.this, game.class));
            }
        });
        Button3.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Welcome.this, inst.class));
            }
        });
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

}

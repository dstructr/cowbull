package com.example.apple.cowbull;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.InputFilter;
//import static com.example.apple.cowbull.R.id.textView;

public class game extends AppCompatActivity {
    EditText edit1;
    EditText edit2;
    EditText edit3;
    EditText edit4;
    Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        edit1 = (EditText) findViewById(R.id.editText);
        edit2 = (EditText) findViewById(R.id.editText3);
        edit3 = (EditText) findViewById(R.id.editText4);
        edit4 = (EditText) findViewById(R.id.editText5);
        ok = (Button) findViewById(R.id.ok);
        edit1.addTextChangedListener(generalTextWatcher1);
        edit2.addTextChangedListener(g2);
        edit3.addTextChangedListener(g3);
        edit4.addTextChangedListener(g4);
     //   edit2.setFilters(new InputFilter[] {new InputFilter.AllCaps()});
    }

    private final TextWatcher  generalTextWatcher1 = new TextWatcher()
    {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            Integer textlength = edit1.getText().length();
            if(textlength>=1){      //If text length greater than 1 move to next EditText

                edit2.requestFocus();

            }
        }

        @Override
        public void afterTextChanged(Editable s) {
            
        }
    };
    private final TextWatcher  g2 = new TextWatcher()
    {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            Integer textlength = edit2.getText().length();
            if(textlength>=1){      //If text length greater than 1 move to next EditText

                edit3.requestFocus();

            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    private final TextWatcher  g3 = new TextWatcher()
    {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            Integer textlength = edit3.getText().length();
            if(textlength>=1){      //If text length greater than 1 move to next EditText

                edit4.requestFocus();

            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    private final TextWatcher  g4 = new TextWatcher()
    {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            Integer textlength = edit4.getText().length();
            if(textlength>=1){      //If text length greater than 1 move to next EditText

                ok.requestFocus();

            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}



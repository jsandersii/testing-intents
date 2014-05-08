package com.example.testingintents.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class IntentActivity3 extends ActionBarActivity {
    private static String TAG = IntentActivity3.class.getSimpleName();

    EditText numview1;
    EditText numview2;
    TextView numtv3;
    Button btnSum1;
    double x = 0;
    double y = 0;
    double z = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_activity3);

        setupViews();
    }

    private void setupViews(){
        numview1 = (EditText)findViewById(R.id.numview1);
        numview2 = (EditText)findViewById(R.id.numview2);
        numtv3 = (TextView)findViewById(R.id.numtv3);
        btnSum1 = (Button)findViewById(R.id.btnSum1);
        btnSum1.setOnClickListener(new Button.OnClickListener(){
        public void onClick(View v){
        calculate();}
        }
        );
    }

    private void calculate(){
        x=Double.parseDouble(numview1.getText().toString());
        y=Double.parseDouble(numview2.getText().toString());
        z=x+y;
        numtv3.setText(Double.toString(z));
    }
}

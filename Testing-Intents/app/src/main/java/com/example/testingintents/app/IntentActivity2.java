package com.example.testingintents.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class IntentActivity2 extends ActionBarActivity {
    private static String TAG = IntentActivity2.class.getSimpleName();

    private TextView tv2 = null;
    private Button goAct1 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_activity2);

        setupViews();

    }

    private void setupViews() {
        tv2 = (TextView)findViewById(R.id.tv2);
        goAct1 = (Button)findViewById(R.id.goAct1);

    }

    public void onClickAct1(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }

    public void onClickAct3(View view){
        Intent intent = new Intent(this,IntentActivity3.class);
        startActivity(intent);
    }
}

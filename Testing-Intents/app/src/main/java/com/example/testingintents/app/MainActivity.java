package com.example.testingintents.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private static String TAG = MainActivity.class.getSimpleName();

    private TextView tv1 = null;
    private Button goAct2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();

    }

    private void setupViews() {
        tv1 = (TextView)findViewById(R.id.tv1);
        goAct2 = (Button)findViewById(R.id.goAct2);

    }

    public void onClickAct2(View view){
        Intent intent = new Intent(this,IntentActivity2.class);
        startActivity(intent);

    }


}

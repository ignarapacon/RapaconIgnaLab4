package com.rapacon.igna.samplelab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITG", "onCreate() has Executed..");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITG", "onStart() has Executed..");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITG", "onResume() has Executed..");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITG", "onPause() has Executed..");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITG", "onStop() has Executed..");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITG", "onRestart() has Executed..");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITG", "onDestroy() has Executed..");
    }

    public void showMessage (View v){
        Toast.makeText(this,"Toast", Toast.LENGTH_LONG).show();
    }

    public void showMessage2 (View x){
        Snackbar.make(x, "Snackbar", Snackbar.LENGTH_LONG).show();
    }




}

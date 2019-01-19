package com.example.bendun.sudoku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class SudokuActivity extends AppCompatActivity {

    public Button* currentButton;
    private static final String TAG = "SudokuActivity";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate(Bundle) called");
        setContentView(R.layout.activity_sudoku);
    }
}

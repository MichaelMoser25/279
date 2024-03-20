package com.example.clickenheimer2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private int nClicks = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button clickMeButton = (Button) findViewById(R.id.clickMeButton);
//        Button clickMeButton = (Button) findViewById(R.id.clickMeButton);
        TextView clickCounter = (TextView) findViewById(R.id.clickCounterTextView);

        clickMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                nClicks += 1 ;
                clickMeButton.setText("" + nClicks);
                clickCounter.setText("" + nClicks);
            }
        });
    }
}
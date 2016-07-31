package com.intertech.customviewsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.intertech.customviews.ValueBar;
import com.intertech.customviews.ValueSelector;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ValueSelector valueSelector = (ValueSelector) findViewById(R.id.valueSelector);
        valueSelector.setMinValue(0);
        valueSelector.setMaxValue(100);

        final ValueBar valueBar = (ValueBar) findViewById(R.id.valueBar);
        valueBar.setMaxValue(100);
        valueBar.setAnimated(true);
        valueBar.setAnimationDuration(4000l);

        Button updateButton = (Button) findViewById(R.id.updateButton);
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value = valueSelector.getValue();
                valueBar.setValue(value);
            }
        });


        final ValueSelector valueSelector2 = (ValueSelector) findViewById(R.id.valueSelector2);
        valueSelector2.setMinValue(0);
        valueSelector2.setMaxValue(100);

        final ValueBar valueBar2 = (ValueBar) findViewById(R.id.valueBar2);
        valueBar2.setMaxValue(100);
        valueBar2.setAnimated(true);
        valueBar2.setAnimationDuration(4000l);

        Button updateButton2 = (Button) findViewById(R.id.updateButton2);
        updateButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value = valueSelector2.getValue();
                valueBar2.setValue(value);
            }
        });
    }
}

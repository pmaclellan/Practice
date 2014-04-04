package com.example.practice.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RelativeLayout bg = (RelativeLayout) findViewById(R.id.background);

        final ToggleButton lightSwitch = (ToggleButton) findViewById(R.id.light_switch);
        lightSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lightSwitch.isChecked()) {
                    // lights off
                    bg.setBackgroundColor(0xFF111111);
                } else {
                    // lights on
                    bg.setBackgroundColor(0xFFFFFFA0);
                }
            }
        });
    }
}

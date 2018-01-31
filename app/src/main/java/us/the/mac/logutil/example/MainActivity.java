package us.the.mac.logutil.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import us.the.mac.logutil.LogDebug;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogDebug.d("Some message");
    }
}

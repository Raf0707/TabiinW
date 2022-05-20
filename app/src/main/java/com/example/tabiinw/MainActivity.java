package com.example.tabiinw;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.tabiinw.koran.KoranFragment;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment, new KoranFragment()).commit();
    }
}
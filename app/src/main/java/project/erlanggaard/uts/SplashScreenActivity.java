package project.erlanggaard.uts;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.erlanggaard.uts.R;


public class SplashScreenActivity extends AppCompatActivity {

    //Erlangga Ardiansyah R
    //10121802
    //IF-3
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splashscreen);

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), NavigationDrawerActivity.class));
                finish();
            }
        }, 3000L);

    }

}
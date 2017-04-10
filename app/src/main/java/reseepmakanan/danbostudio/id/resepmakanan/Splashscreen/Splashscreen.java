package reseepmakanan.danbostudio.id.resepmakanan.Splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import reseepmakanan.danbostudio.id.resepmakanan.MainActivity;
import reseepmakanan.danbostudio.id.resepmakanan.R;

public class Splashscreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                }catch ( Exception e ){
                    e.printStackTrace();
                }
                Intent i = new Intent(Splashscreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        thread.start();
    }
}

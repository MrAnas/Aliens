package sa.elm.aliens;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class LoadingScreen extends AppCompatActivity {

    /** Duration of wait **/
    private final int LOADING_DISPLAY_LENGTH = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);


//        new Handler().postDelayed(new Runnable(){
//            @Override
//            public void run() {
//                /* Create an Intent that will start the Menu-Activity. */
//                Intent mainIntent = new Intent(LoadingScreen.this , null);
//                LoadingScreen.this.startActivity(mainIntent);
//                LoadingScreen.this.finish();
//            }
//        }, LOADING_DISPLAY_LENGTH);
    }
}

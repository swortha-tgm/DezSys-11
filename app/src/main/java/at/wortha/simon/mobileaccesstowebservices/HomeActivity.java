package at.wortha.simon.mobileaccesstowebservices;

/**
 * Created by Simon Wortha on 21.04.2016.
 */
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 *
 * Home Screen Activity
 */
public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Displays Home Screen
        setContentView(R.layout.home);

        //Displays welcome Message
        TextView welcome_text = (TextView) findViewById(R.id.welcome_text);
        welcome_text.setText(getIntent().getStringExtra("welcome_text"));

    }

}


package looping.life;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
		TextView textView = (TextView) findViewById(R.id.text_view);
		textView.setText("Hello world!");
    }
}

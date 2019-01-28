package pl.poznan.ue.seoaudit;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button b1;
    TextView t1;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.submitButton);
        t1=(TextView)findViewById(R.id.textView);
        Click();
    }

    private void Click(){
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = t1.getText().toString();
            }
        });
    }
}

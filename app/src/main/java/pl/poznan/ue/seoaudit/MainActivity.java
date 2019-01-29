package pl.poznan.ue.seoaudit;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button b1;
    Button createReportButton;
    TextView t1;
    TextInputLayout textInputLayout;
    String url;
    String reportButtonText = "create report";
    String buttonText = "submit";
    String textViewText = "Input url to analyze";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.submitButton);
        t1=(TextView)findViewById(R.id.textView);
    //    createReportButton=(Button)findViewById(R.id.)
        Click();
    }

    private void Click(){
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = textInputLayout.getEditText().getText().toString();
                analyzeUrl(url);
            }
        });

    }


    private void getReport(){
        createReportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    private void analyzeUrl(String url) {




        setContentView(R.layout.after_analyze);
    }
}

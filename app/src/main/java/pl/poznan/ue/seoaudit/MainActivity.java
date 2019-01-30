package pl.poznan.ue.seoaudit;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

import static pl.poznan.ue.seoaudit.AnalizedFields.*;

public class MainActivity extends Activity {

    Button b1;
    Button createReportButton;
    TextView t1;
    TextView reportTextView;
    TextInputLayout textInputLayout;
    String url;
    String reportButtonText = "create report";
    String buttonText = "submit";
    String textViewText = "Input url to analyze";
    String reportText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInstance();
        addToFields("created on " + Calendar.getInstance().getTime().toString());

        b1=(Button)findViewById(R.id.submitButton);
        t1=(TextView)findViewById(R.id.textView);
        createReportButton=(Button)findViewById(R.id.createReportButton);
        reportTextView=(TextView)findViewById(R.id.reportTextView);

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


    private void getReport(){ //todo: tworzy plik ze stworzonych wskazówek - pola OneLongString - i zapisuje jako txt
        createReportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }


    private void analyzeUrl(String url) {





        setContentView(R.layout.after_analyze);
        reportTextView.setText(getOneLongString());


    }
}

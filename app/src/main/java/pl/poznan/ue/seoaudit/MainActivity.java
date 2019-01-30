package pl.poznan.ue.seoaudit;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

import static pl.poznan.ue.seoaudit.AnalizedFields.*;

public class MainActivity extends Activity {

    Button b1;
    Button createReportButton;
    TextView t1;
    TextView reportTextView;
    EditText textInputLayout;
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
        textInputLayout=(EditText)findViewById(R.id.editText2);


        Click();
    }

    private void Click(){
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = textInputLayout.getText().toString();
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




        addToFields("Analized url is: "+ url+"\n");
        setContentView(R.layout.after_analyze);
        createReportButton=(Button)findViewById(R.id.createReportButton);
        reportTextView=(TextView)findViewById(R.id.reportTextView);
        reportTextView.setText(getOneLongString());



    }


    private void saveReportToFile(){
        Context context = getApplicationContext();
        File path = context.getFilesDir();
        File file = new File(path, "report "+Calendar.getInstance().getTime().toString().substring(5, 19)+".txt");
        FileOutputStream stream = null;
        try {
            stream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            stream.write(getOneLongString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

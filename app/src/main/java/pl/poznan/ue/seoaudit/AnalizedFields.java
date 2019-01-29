package pl.poznan.ue.seoaudit;

import java.util.ArrayList;

public class AnalizedFields {
    private static AnalizedFields instance;
    private ArrayList<String> fields;
    private String OneLongString;


    private AnalizedFields(){};

    public void initInstance(){
        if (instance == null){
            instance = new AnalizedFields();
        }
    }

    public AnalizedFields getInstance(){
        return instance;
    }

    public void addToFields(String toAdd){
        fields.add(toAdd);
    }

    public String getOneLongString(){
        for (int i = 0; i <= fields.lastIndexOf(fields); i++){
            OneLongString = OneLongString + fields.get(i) + "\n";
        }
        return OneLongString;
    }
}

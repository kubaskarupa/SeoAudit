package pl.poznan.ue.seoaudit;

import java.util.ArrayList;

public class AnalizedFields {
    private static AnalizedFields instance;
    private static ArrayList<String> fields;
    private static String OneLongString;


    private AnalizedFields(){};

    public static void initInstance(){
        if (instance == null){
            instance = new AnalizedFields();
        }
    }

    public AnalizedFields getInstance(){
        return instance;
    }

    public static void addToFields(String toAdd){
        fields.add(toAdd);
    }

    public static String getOneLongString(){
        for (int i = 0; i <= fields.lastIndexOf(fields); i++){
            OneLongString = OneLongString + fields.get(i) + "\n";
        }
        return OneLongString;
    }
}

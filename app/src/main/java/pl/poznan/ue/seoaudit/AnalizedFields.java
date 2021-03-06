package pl.poznan.ue.seoaudit;

import java.util.ArrayList;

public class AnalizedFields {
    private static AnalizedFields instance;
    private static ArrayList<String> fields = new ArrayList<String>();
    private static String OneLongString = new String();


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
        for (int i = 0; i < fields.size(); i++){
            OneLongString = OneLongString + fields.get(i) + "\n";
        }
        return OneLongString;
    }

    public static String checkhttps(String url){
        if (url.length()>5){
        if (url.substring(0,5).toUpperCase().equals("HTTPS")  ){
            return "HTTPS detected, check your certificate";
        }} else{
            return "HTTPS not detected, consider using HTTPS";
        }
        return "HTTPS not detected, consider using HTTPS";
    }
}

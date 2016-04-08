package com.nkdroid.wordpress.app.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.nkdroid.wordpress.app.model.Pages;


public class PrefUtils {

    public static void setPages(Pages currentUser, Context ctx){
        ComplexPreferences complexPreferences = ComplexPreferences.getComplexPreferences(ctx, "page_prefs", 0);
        complexPreferences.putObject("page_value", currentUser);
        complexPreferences.commit();
    }
//    public static void clearCurrentUser( Context ctx){
//        ComplexPreferences complexPreferences = ComplexPreferences.getComplexPreferences(ctx, "page_prefs", 0);
//        complexPreferences.clearObject();
//        complexPreferences.commit();
//    }



    public static Pages getPages(Context ctx){
        ComplexPreferences complexPreferences = ComplexPreferences.getComplexPreferences(ctx, "page_prefs", 0);
        Pages currentUser = complexPreferences.getObject("page_value", Pages.class);
        return currentUser;
    }
//
//
//    public static void setNotificationId(String login, Context ctx){
//        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(ctx);
//        SharedPreferences.Editor editor = preferences.edit();
//        editor.putString("notification", login);
//        editor.apply();
//    }
//
//    public static String getNotificationId(Context ctx){
//        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(ctx);
//        return preferences.getString("notification", "");
//
//    }
//
//
//    public static void setForm(GetAssignedForm1 currentUser, Context ctx){
//        ComplexPreferences complexPreferences = ComplexPreferences.getComplexPreferences(ctx, "form1_prefs", 0);
//        complexPreferences.putObject("from1_value", currentUser);
//        complexPreferences.commit();
//    }
//
//
//
//    public static GetAssignedForm1 getForm(Context ctx){
//        ComplexPreferences complexPreferences = ComplexPreferences.getComplexPreferences(ctx, "form1_prefs", 0);
//        GetAssignedForm1 currentUser = complexPreferences.getObject("from1_value", GetAssignedForm1.class);
//        return currentUser;
//    }
}

package com.tmsnith.locate.utilities;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by sahil on 4/2/17.
 */

public class SharedPref {
    private static final String PREF_NAME = "userData";
    private static final String LOGIN_STATUS = "loginStatus";
    private static final String USER_KEY = "apiKey";
    private static final String Email = "email";
    private static final String Name = "name";
    private static final String HAS_SKIP = "hasSkip";
    private SharedPreferences sharedPref;
    private SharedPreferences.Editor editor;

    public SharedPref(Context context) {
        sharedPref = context.getSharedPreferences(PREF_NAME, 0);
        editor = sharedPref.edit();
    }

    public String getName() {
        return sharedPref.getString(Name, "");
    }

    public void setName(String name) {
        editor.putString(Name, name);
        editor.commit();
    }

    public String getEmail() {
        return sharedPref.getString(Email, "");
    }

    public void setEmail(String email) {
        editor.putString(Email, email);
        editor.commit();
    }

    public boolean getLoginStatus() {
        return sharedPref.getBoolean(LOGIN_STATUS, false);
    }

    public void setLoginStatus(boolean isLogIn) {
        editor.putBoolean(LOGIN_STATUS, isLogIn);
        editor.commit();
    }

    //    public  void setUserKey(String key){
//        editor.putString(USER_KEY,key);
//        editor.commit();
//    }
//
    public String getUserKey() {
        return sharedPref.getString(USER_KEY, "");
    }
//
//    public  void setLoginSkipStatus(boolean hasSkip){
//        editor.putBoolean(HAS_SKIP,hasSkip);
//        editor.commit();
//    }
//
//    public boolean getLoginSkipStatus(){
//        return sharedPref.getBoolean(HAS_SKIP,false);
//    }
}

package kz.abcsoft.android.cloud;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "3N70F5MZA4RgoeWuRIG9YrV9gAN8h1IbPhKLsTDo", "Wsrmix4xVE0VPL0gcrKDkM1j4MHcJdl3Sfa8fxu8") ;

//        ParseUser.enableAutomaticUser();
//        ParseACL defaultACL = new ParseACL() ;
//
//        defaultACL.setPublicReadAccess(true);
//        ParseACL.setDefaultACL(defaultACL, true);
    }
}

package payapu.tawan.myrestaurant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by admin on 12/12/2015 AD.
 */
public class ManageTABLE {

    //Explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;



    public ManageTABLE(Context context) {

        //Connect Database
       objMyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMyOpenHelper.getReadableDatabase();



    } // Constructor


} //Main Class

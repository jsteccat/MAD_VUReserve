package com.example.wildcat.mad_vureserve;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;

/**
 * Created by wildcat on 4/10/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "user.db";
    private static final String TABLE_NAME   = "user";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_USERNAME = "username";
    private static final String COLUMN_EMAIL = "email";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_PASSWORD = "password";

    SQLiteDatabase db;

    private static final String TABLE_CREATE = "create table user( id integer primary key autoincrement not null , " +
            "username text not null, email text not null, name text not null, password text not null);";


    public DatabaseHelper(Context context){
        super(context , DATABASE_NAME , null , DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db = db;
    }

    public void insertUser(User u){

        ContentValues values = new ContentValues();
        values.put(COLUMN_USERNAME , u.getUsername());
        values.put(COLUMN_EMAIL , u.getEmail());
        values.put(COLUMN_NAME , u.getName());
        values.put(COLUMN_PASSWORD , u.getPassword());
        db = this.getWritableDatabase();
        db.insert(TABLE_NAME , "" , values);
        //db.close();
    }

    public String searchPass(String username) {
        db = this.getReadableDatabase();
        String query = "select username, password from " +TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);
        String a;
        String b;
        b = "not found";
        if (cursor.moveToFirst()) {
            do {
                a = cursor.getString(0);
                if (a.equals(username)) {
                    b = cursor.getString(1);
                    break;
                }
            }
            while (cursor.moveToNext());
        }
        return b;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS "+TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);

    }
}

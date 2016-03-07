package falconrobotics.scoutingprogram;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.sql.SQLException;

/**
 * Created on 3/4/2016.
 */
public class DBHelper_Pit {
    public static final String ROW_ID = "_id";
    private static final String DATABASE_TABLE = "Pit";
    private final Context context;
    private DBHelper dbHelper;
    private SQLiteDatabase db;


    public DBHelper_Pit(Context context) {
        this.context = context;
    }

    public DBHelper_Pit open() throws SQLException {
        dbHelper = new DBHelper(context);
        db = dbHelper.getWritableDatabase();
        return this;
    }

    public void close() {
        dbHelper.close();
    }

    public Cursor get(long _id, String key) throws SQLException {

        Cursor mCursor = db.query(true, DATABASE_TABLE,
                new String[]{key}, ROW_ID + "=" + _id, null, null, null, null, null);
        if (mCursor != null) {
            mCursor.moveToFirst();
        }
        return mCursor;
    }

    public void update(long _id, String key, String data) {
        ContentValues values = new ContentValues();

        values.put(key, data);

//        return db.update(DATABASE_TABLE, values, ROW_ID + "=" + _id, null);
    }

    public void update(long _id, String key, int data) {
        ContentValues values = new ContentValues();

        values.put(key, data);

//        return db.update(DATABASE_TABLE, values, ROW_ID + "=" + _id, null) > 0;
    }

}
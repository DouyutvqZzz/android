package com.byted.camp.todolist.db;

import android.provider.BaseColumns;
import android.util.Log;

public final class TodoContract {

    public static final String SQL_CREATE_NOTES =
            "CREATE TABLE " + TodoNote.TABLE_NAME
                    + "(" + TodoNote._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + TodoNote.COLUMN_DATE + " INTEGER, "
                    + TodoNote.COLUMN_STATE + " INTEGER, "
                    + TodoNote.COLUMN_CONTENT + " TEXT, "
                    + TodoNote.COLUMN_PRIORITY + " INTEGER, "
                    + TodoNote.COLUMN_DDL_DATE+" CHAR(20))";

    public static final String SQL_ADD_PRIORITY_COLUMN =
            "ALTER TABLE " + TodoNote.TABLE_NAME + " ADD " + TodoNote.COLUMN_PRIORITY + " INTEGER";

    private TodoContract() {
    }

    public static class TodoNote implements BaseColumns {
        public static final String TABLE_NAME = "note";
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_STATE = "state";
        public static final String COLUMN_CONTENT = "content";
        public static final String COLUMN_PRIORITY = "priority";
        public static final String COLUMN_DDL_DATE="ddl_date";
    }

}

package com.example.administrator.testgreendao;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SQLiteDatabase db = new DaoMaster.DevOpenHelper(this, "notes-db", null).getWritableDatabase();;
        DaoMaster daoMaster = new DaoMaster(db);
        DaoSession daoSession = daoMaster.newSession();
        UserDao userDao = daoSession.getUserDao();
        User user = new User(1L,"GJ",5);
        userDao.insert(user);
        List<User> users = userDao.loadAll();
        Log.d("users",users.size()+"");
    }
}

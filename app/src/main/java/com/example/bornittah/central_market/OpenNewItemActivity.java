package com.example.bornittah.central_market;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.bornittah.central_market.fragments.Clothes;
import com.example.bornittah.central_market.fragments.Fruits;
import com.example.bornittah.central_market.fragments.Vegetables;

/**
 * Created by Bornittah on 9/25/2017.
 */

public class OpenNewItemActivity extends AppCompatActivity {

    private static final String TAG = "OpenNewItemActivity";
    FragmentManager fsupp;
    FragmentTransaction ftrans;
    private Context cont;
    String choiceOfUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
   setContentView(R.layout.open_new_item);
        cont=OpenNewItemActivity.this;


        fsupp=getSupportFragmentManager();
        ftrans=fsupp.beginTransaction();

        if(choiceOfUser.equals("veg")){
            Fragment frag=new Vegetables();
            ftrans.replace(R.id.itemmain,frag);
            ftrans.commit();
        }
        if(choiceOfUser.equals("fruits")){
            Fragment frag=new Fruits();
            ftrans.replace(R.id.itemmain,frag);
            ftrans.commit();
        }

        if(choiceOfUser.equals("cloth")){
            Fragment frag=new Clothes();
            ftrans.replace(R.id.itemmain,frag);
            ftrans.commit();
        }

    }
}

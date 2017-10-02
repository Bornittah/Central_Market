package com.example.bornittah.central_market;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    String[] items={"fruits","cloth","veg"};

    private Context cont;
    String customers_choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cont=MainActivity.this;


        int config=getResources().getConfiguration().orientation;
        if(config== Configuration.ORIENTATION_LANDSCAPE){


            setContentView(R.layout.landscape_layout);
            ListView listView= (ListView) findViewById(R.id.list);

            ListAdapter adapt=new ArrayAdapter<String>(cont,android.R.layout.simple_list_item_1,items);
            listView.setAdapter(adapt);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                RelativeLayout rLayout1= (RelativeLayout) findViewById(R.id.fruits);
                RelativeLayout rLayout2= (RelativeLayout) findViewById(R.id.vegetables);
                RelativeLayout rLayout3= (RelativeLayout) findViewById(R.id.clothes);
                RelativeLayout rLayout4= (RelativeLayout) findViewById(R.id.wcm);

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                   customers_choice=String.valueOf(parent.getItemAtPosition(position));
                    switch (customers_choice){
                        case "veg":

                            rLayout2.setVisibility(View.VISIBLE);
                            rLayout1.setVisibility(View.INVISIBLE);
                            rLayout3.setVisibility(View.INVISIBLE);
                            rLayout4.setVisibility(View.INVISIBLE);

                            break;
                        case "fruits":

                            rLayout2.setVisibility(View.INVISIBLE);
                            rLayout1.setVisibility(View.VISIBLE);
                            rLayout3.setVisibility(View.INVISIBLE);
                            rLayout4.setVisibility(View.INVISIBLE);
                            break;

                        case "cloth":
                            rLayout3.setVisibility(View.VISIBLE);
                            rLayout2.setVisibility(View.INVISIBLE);
                            rLayout1.setVisibility(View.INVISIBLE);
                            rLayout4.setVisibility(View.INVISIBLE);
                            break;

                    }
                }
            });


        }

      else if(config== Configuration.ORIENTATION_PORTRAIT){


            setContentView(R.layout.potrt);
            ListView listView= (ListView) findViewById(R.id.list);

            ListAdapter adapt=new ArrayAdapter<String>(cont,android.R.layout.simple_list_item_1,items);
            listView.setAdapter(adapt);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                RelativeLayout rLayout1= (RelativeLayout) findViewById(R.id.fruits);
                RelativeLayout rLayout2= (RelativeLayout) findViewById(R.id.vegetables);
                RelativeLayout rLayout3= (RelativeLayout) findViewById(R.id.clothes);
                RelativeLayout rLayout4= (RelativeLayout) findViewById(R.id.wcm);

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    customers_choice=String.valueOf(parent.getItemAtPosition(position));
                    switch (customers_choice){
                        case "veg":

                            rLayout1.setVisibility(View.INVISIBLE);
                            rLayout2.setVisibility(View.VISIBLE);
                            rLayout3.setVisibility(View.INVISIBLE);
                            rLayout4.setVisibility(View.INVISIBLE);

                            break;
                        case "fruits":

                            rLayout2.setVisibility(View.INVISIBLE);
                            rLayout1.setVisibility(View.VISIBLE);
                            rLayout3.setVisibility(View.INVISIBLE);
                            rLayout4.setVisibility(View.INVISIBLE);
                            break;

                        case "cloth":
                            rLayout3.setVisibility(View.VISIBLE);
                            rLayout2.setVisibility(View.INVISIBLE);
                            rLayout1.setVisibility(View.INVISIBLE);
                            rLayout4.setVisibility(View.INVISIBLE);
                            break;

                    }
                }
            });


        }

    }

    }


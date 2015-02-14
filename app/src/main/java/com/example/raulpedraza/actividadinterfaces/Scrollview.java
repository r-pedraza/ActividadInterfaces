package com.example.raulpedraza.actividadinterfaces;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class Scrollview extends ActionBarActivity {
ImageView imageView;
    TextView name,name1,age,age1,gender,gender1,profesion,profesion1,phone,phone1,email,email1,hobby,hobby1,
            ilike,ilike1,idislike,idislike1,address,addres1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollview);
        imageView=(ImageView)findViewById(R.id.imageView);
        name=(TextView)findViewById(R.id.name);
        name1=(TextView)findViewById(R.id.name1);
        age=(TextView)findViewById(R.id.age);
        age1=(TextView)findViewById(R.id.age1);
        gender=(TextView)findViewById(R.id.gender);
        gender1=(TextView)findViewById(R.id.gender1);
        profesion=(TextView)findViewById(R.id.profession);
        profesion1=(TextView)findViewById(R.id.profession1);
        phone=(TextView)findViewById(R.id.phone);
        phone1=(TextView)findViewById(R.id.phone1);
        email=(TextView)findViewById(R.id.email);
        email1=(TextView)findViewById(R.id.email1);
        hobby=(TextView)findViewById(R.id.hobby);
        hobby1=(TextView)findViewById(R.id.hobby1);
        ilike=(TextView)findViewById(R.id.ilike);
        ilike1=(TextView)findViewById(R.id.ilike1);
        idislike=(TextView)findViewById(R.id.idislike);
        idislike1=(TextView)findViewById(R.id.idislike1);
        address=(TextView)findViewById(R.id.address);
        addres1=(TextView)findViewById(R.id.address1);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrollview, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

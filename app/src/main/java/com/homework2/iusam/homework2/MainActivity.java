package com.homework2.iusam.homework2;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
import android.view.View;
import android.app.Activity;

public class MainActivity extends AppCompatActivity {
    private Button toastButton;
    private EditText toastEdit ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // my code
        toastButton = (Button) findViewById(R.id.button_sayhello);
        toastEdit   = (EditText)findViewById(R.id.editText);
        toastButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Hello " + toastEdit.getText() , Toast.LENGTH_LONG).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_about :
                AlertDialog.Builder ad = new AlertDialog.Builder(this) ;
                ad.setTitle("About this APP") ;
                ad.setMessage("Author : Iu-Sam Chong") ;

                DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener() {
                    public  void onClick(DialogInterface di, int i){
                    }
                } ;

                ad.setPositiveButton("OK", listener) ;
                ad.show() ;
                break ;
            case R.id.action_reset :
                EditText cleartext = (EditText) findViewById(R.id.editText);
                cleartext.setText("");
                break ;
        }
        return super.onOptionsItemSelected(item);
    }

}

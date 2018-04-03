package com.vorldline.basketcount;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class DetailActivity extends AppCompatActivity {

    EditText homeName;
    EditText awayName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        homeName = (EditText)findViewById(R.id.homeName);
        awayName = (EditText)findViewById(R.id.awayName);

        Button confirmButton = (Button)findViewById(R.id.confirmButton);
        confirmButton.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                String name1 = homeName.getText().toString();
                String name2 = awayName.getText().toString();
                Intent main = new Intent(DetailActivity.this,MainActivity.class);
                main.putExtra("HOME",name1);
                main.putExtra("AWAY",name2);
                startActivity(main);
            }
        });
    }

}

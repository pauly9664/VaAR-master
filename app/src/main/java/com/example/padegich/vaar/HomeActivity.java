package com.example.padegich.vaar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView shopCard,accountCard,deliveryCard,preferenceCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        shopCard = (CardView) findViewById(R.id.shopcartId);
        accountCard = (CardView) findViewById(R.id.accountid);
        preferenceCard = (CardView) findViewById(R.id.preferenceid);
        deliveryCard = (CardView) findViewById(R.id.deliveryid);

        shopCard.setOnClickListener(this);
        accountCard.setOnClickListener(this);
        deliveryCard.setOnClickListener(this);
        preferenceCard.setOnClickListener(this);

        Button logout = findViewById(R.id.buttonLogin);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, LoginActivity.class));
            }
        });
    }


    @Override
    public void onClick(View view) {
        Intent i;

        switch(view.getId()) {
            case R.id.shopcartId:i = new Intent(this,ShopActivity.class);startActivity(i);break;
            default:break;
        }

    }
}

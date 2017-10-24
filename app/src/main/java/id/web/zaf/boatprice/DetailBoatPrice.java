package id.web.zaf.boatprice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.Locale;

public class DetailBoatPrice extends AppCompatActivity {

    public static String EXTRA_BOAT_PRICE_ID = "extra_boat_price_id";

    ImageView boatPhoto, boatLogo;
    TextView boatPrice, boatDepart, boatDepartTime, boatArrive, boatArriveTime, boatAgent;
    Button bookNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_boat_price);

        int boatPriceId = getIntent().getIntExtra(EXTRA_BOAT_PRICE_ID, 0);

        BoatPrice bp = BoatPriceData.getListData().get(boatPriceId);

        boatPhoto = (ImageView) findViewById(R.id.boat_photo);
        boatPrice = (TextView) findViewById(R.id.boat_price);
        boatDepart = (TextView) findViewById(R.id.boat_depart);
        boatDepartTime = (TextView) findViewById(R.id.boat_depart_time);
        boatArrive = (TextView) findViewById(R.id.boat_arrive);
        boatArriveTime = (TextView) findViewById(R.id.boat_arrive_time);
        boatAgent = (TextView) findViewById(R.id.boat_agent);
        bookNow = (Button) findViewById(R.id.book_now);

        getSupportActionBar().setTitle(bp.getBoat());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Glide.with(this)
                .load(bp.getBoatPhoto())
                .crossFade()
                .into(boatPhoto);

        String boatPriceFormatted = "IDR " + String.format(Locale.US, "%,d", Integer.valueOf(bp.getPrice()));
        boatPrice.setText(boatPriceFormatted);
        boatDepart.setText(bp.getDepart());
        boatDepartTime.setText(bp.getDepartTime());
        boatArrive.setText(bp.getArrive());
        boatArriveTime.setText(bp.getArriveTime());
        boatAgent.setText(bp.getAgent());

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

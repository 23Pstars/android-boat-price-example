package id.web.zaf.boatprice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvCategory = (RecyclerView) findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ItemBoatPriceAdapter itemBoatPriceAdapter = new ItemBoatPriceAdapter(this);
        itemBoatPriceAdapter.setBoatPriceData(BoatPriceData.getListData());

        rvCategory.setAdapter(itemBoatPriceAdapter);

    }
}

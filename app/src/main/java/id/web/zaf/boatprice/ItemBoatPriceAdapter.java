package id.web.zaf.boatprice;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ItemBoatPriceAdapter extends RecyclerView.Adapter<ItemBoatPriceAdapter.ItemViewHolder> {

    private Context context;
    private ArrayList<BoatPrice> boatPriceData;

    ItemBoatPriceAdapter(Context context) {
        this.context = context;
        this.boatPriceData = new ArrayList<>();
    }

    void setBoatPriceData(ArrayList<BoatPrice> boatPriceData) {
        this.boatPriceData = boatPriceData;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemBoatPrice = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_boat_price, parent, false);
        return new ItemViewHolder(itemBoatPrice);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        Glide.with(context)
                .load(this.boatPriceData.get(position).getBoatPhoto())
                .crossFade()
                .into(holder.boatPhoto);
        holder.boatName.setText(this.boatPriceData.get(position).getBoat());
        holder.boatDepart.setText(this.boatPriceData.get(position).getDepart());
        holder.boatDepartTime.setText(this.boatPriceData.get(position).getDepartTime());
        holder.boatArrive.setText(this.boatPriceData.get(position).getArrive());
        holder.boatArriveTime.setText(this.boatPriceData.get(position).getArriveTime());

        holder.boatDetail.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {

                Intent detailBoatPrice = new Intent(context, DetailBoatPrice.class);
                detailBoatPrice.putExtra(DetailBoatPrice.EXTRA_BOAT_PRICE_ID, position);
                context.startActivity(detailBoatPrice);

            }
        }));
    }

    @Override
    public int getItemCount() {
        return this.boatPriceData.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        ImageView boatPhoto;
        TextView boatName, boatDepart, boatDepartTime, boatArrive, boatArriveTime;
        Button boatDetail;

        ItemViewHolder(View itemView) {
            super(itemView);
            boatPhoto = (ImageView) itemView.findViewById(R.id.boat_photo);
            boatName = (TextView) itemView.findViewById(R.id.boat_name);
            boatDepart = (TextView) itemView.findViewById(R.id.boat_depart);
            boatDepartTime = (TextView) itemView.findViewById(R.id.boat_depart_time);
            boatArrive = (TextView) itemView.findViewById(R.id.boat_arrive);
            boatArriveTime = (TextView) itemView.findViewById(R.id.boat_arrive_time);
            boatDetail = (Button) itemView.findViewById(R.id.boat_detail);
        }
    }

}

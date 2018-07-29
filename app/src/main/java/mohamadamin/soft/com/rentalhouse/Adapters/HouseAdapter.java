package mohamadamin.soft.com.rentalhouse.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import mohamadamin.soft.com.rentalhouse.Models.SecondaryHouse;
import mohamadamin.soft.com.rentalhouse.MyApplication;
import mohamadamin.soft.com.rentalhouse.R;

public class HouseAdapter extends RecyclerView.Adapter<HouseAdapter.MyViewHolder>
{
    private List<SecondaryHouse> secondaryHouseList;

    public HouseAdapter(List<SecondaryHouse> secondaryHouseList)
    {
        this.secondaryHouseList = secondaryHouseList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View houseItemView = inflater.inflate(R.layout.customed_item_layout_house, parent, false);
        return new MyViewHolder(houseItemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position)
    {
        SecondaryHouse secondaryHouse=secondaryHouseList.get(position);
        Glide.with(MyApplication.getContext()).load(secondaryHouse.getPhoto()).into(holder.imgHouseMainPhoto);
    }

    @Override
    public int getItemCount()
    {
        return secondaryHouseList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView imgHouseMainPhoto;
        private TextView txtHouseName;
        private TextView txtHouseVisitedCount;

        public MyViewHolder(View itemView)
        {
            super(itemView);
            imgHouseMainPhoto=(ImageView)itemView.findViewById(R.id.img_house_main_photo);
            txtHouseName=(TextView)itemView.findViewById(R.id.txt_house_name);
            txtHouseVisitedCount=(TextView)itemView.findViewById(R.id.txt_house_visited_count);
        }

    }
}

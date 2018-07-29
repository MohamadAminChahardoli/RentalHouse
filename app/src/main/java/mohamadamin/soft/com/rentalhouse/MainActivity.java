package mohamadamin.soft.com.rentalhouse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import mohamadamin.soft.com.rentalhouse.Adapters.HouseAdapter;
import mohamadamin.soft.com.rentalhouse.Models.SecondaryHouse;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView recyclerViewHouses;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        try
        {
            setContentView(R.layout.activity_main);
            //initializeComponents();
            //bindRecyclerViewWithAdapter();
        }
        catch (Exception ex)
        {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

    private void initializeComponents()
    {
        recyclerViewHouses=findViewById(R.id.recycler_view_houses);
    }

    private void bindRecyclerViewWithAdapter()
    {
        List<SecondaryHouse> secondaryHouseList = SecondaryHouse.createHouses(20);
        HouseAdapter adapter = new HouseAdapter(secondaryHouseList);
        recyclerViewHouses.setAdapter(adapter);
        recyclerViewHouses.setLayoutManager(new LinearLayoutManager(this));
    }
}

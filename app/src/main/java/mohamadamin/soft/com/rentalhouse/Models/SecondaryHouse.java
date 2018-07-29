package mohamadamin.soft.com.rentalhouse.Models;

import java.util.ArrayList;
import java.util.List;

import mohamadamin.soft.com.rentalhouse.R;

public class SecondaryHouse
{
    private String name;
    private int photo;
    private int visitedCount;

    public SecondaryHouse()
    {
    }

    public SecondaryHouse(String name, int photo, int visitedCount)
    {
        this.name = name;
        this.photo = photo;
        this.visitedCount = visitedCount;
    }

    public String getName()
    {
        return name;
    }

    public int getPhoto()
    {
        return photo;
    }

    public int getVisitedCount()
    {
        return visitedCount;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPhoto(int photo)
    {
        this.photo = photo;
    }

    public void setVisitedCount(int visitedCount)
    {
        this.visitedCount = visitedCount;
    }

    public static ArrayList<SecondaryHouse> createHouses(int numberOfHouses)
    {
        ArrayList<SecondaryHouse> housesList = new ArrayList<SecondaryHouse>();
        for (int i = 1; i <= numberOfHouses; i++)
        {
            housesList.add(new SecondaryHouse("خانه "+i, R.drawable.pic1,i+17));
        }
        return housesList;
    }
}

package com.mycompany.mavenproject9;

public class Truck extends Vehicle
{
    int MaxLoad;
    int NoOfWheels;
    
    public Truck()
    {
      MaxLoad = 4000;
      NoOfWheels = 6;
    }
    
    public Truck(int ym, String en, String cl, int ml, int nw)
    {
        super(ym,en,cl);
        MaxLoad = ml;
        NoOfWheels = nw;
    }
    
    public Truck(Truck tr)
    {
        super(tr.YearMade,tr.EngineNo, tr.color);
        MaxLoad = tr.MaxLoad;
        NoOfWheels = tr.NoOfWheels;
    }
}

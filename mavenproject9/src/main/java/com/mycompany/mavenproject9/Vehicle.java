package com.mycompany.mavenproject9;

public class Vehicle 
{
    public int YearMade;
    public String EngineNo;
    public String color;
    
    public Vehicle()
    {
        YearMade = 2012;
        EngineNo = "RYTR656546";
        color = "Red";
    }
    
    public Vehicle(int ym, String en, String cl)
    {
        YearMade = ym;
        EngineNo = en;
        color = cl;
    }
    
    public Vehicle(Vehicle vl)
    {
        YearMade = vl.YearMade;
        EngineNo = vl.EngineNo;
        color = vl.color;
    }
    
    public int add(int a, int b)
    {
        return a+b;
    }
}

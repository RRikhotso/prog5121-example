package com.mycompany.mavenproject9;

public class Mavenproject9 
{
    public static void main(String[] args) 
    {
        Vehicle v1 = new Vehicle();
        
        v1.YearMade = 2022;
        v1.EngineNo = "HJGHFGH75765";
        v1.color = "Black";
        Vehicle v2 = new Vehicle(v1);
        
        v1.YearMade = 2000;
        v1.EngineNo = "HJGH7777";
        v1.color = "Brown";
        
        Truck t1 = new Truck();
        System.out.println(t1.color);
        
        Truck t2 = new Truck(2023, "JHGDFJHT656", "Blue", 18000, 18);
        
        Truck[] truck = new Truck[4];
        truck[0] = new Truck();
        truck[1] = new Truck();
        truck[2] = new Truck(2015, "FRDT6456", "Maroon", 10000, 12);
        truck[3] = new Truck(truck[1]);
    }
}

package models;

import java.math.BigDecimal;


public class Dime
{
    private int year;

    Dime(int year)
    {
        this.year = year;
    }


    public static BigDecimal getFaceValue()
    {
        return new BigDecimal(".10");
    }

    BigDecimal getCollectibleValue()
    {
        return getFaceValue();
    }
    public int getYear()
    {
        return year;
    }

    public String toString()
    {
        return "Dime"+"\t"+"Year: "+year;
    }
}


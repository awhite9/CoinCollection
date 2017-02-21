package models;

import java.math.BigDecimal;


public class Nickle
{
    private int year;

    Nickle (int year)
    {
        this.year = year;
    }

    public static BigDecimal getFaceValue()
    {
        return new BigDecimal(".05");

    }

    BigDecimal getCollectibleValue()
    {
        BigDecimal multiplier = new BigDecimal(".10");
        BigDecimal years = new BigDecimal(1935-year);
        if(year>1935)
        {
            years = BigDecimal.ZERO;
        }
        BigDecimal yearMultiplier = multiplier.multiply(years);
        return getFaceValue().add(yearMultiplier);

    }
    public int getYear()
    {
        return year;
    }
    public String toString()
    {
        return "Nickle"+"\t"+"Year: "+year;
    }
}

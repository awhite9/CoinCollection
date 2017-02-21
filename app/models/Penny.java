package models;

import java.math.BigDecimal;

public class Penny
{
    private int year;

    Penny(int year)
    {
        this.year = year;
    }

    public static BigDecimal getFaceValue()
    {
        return new BigDecimal(".01");
    }

    BigDecimal getCollectibleValue()
    {
        BigDecimal multiplier = new BigDecimal(".03");
        BigDecimal years = new BigDecimal(1945-year);
        if(year>1945)
        {
            years = BigDecimal.ZERO;
        }
        BigDecimal pennyMultiplier = multiplier.multiply(years);
        return getFaceValue().add(pennyMultiplier);

    }
    public String toString()
    {
        return "Penny"+"\t"+"Year: "+year;
    }

    public int getYear()
    {
        return year;
    }

}

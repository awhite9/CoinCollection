package models;

import java.math.BigDecimal;

public class Quarter
{
    private int year;

    Quarter(int year)
    {
        this.year = year;
    }

    public static BigDecimal getFaceValue()
    {
        return new BigDecimal(".25");
    }
    BigDecimal getCollectibleValue()
    {
        BigDecimal multiplier = new BigDecimal(".22");
        BigDecimal years = new BigDecimal(1923-year);
        if(year>1923)
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

}

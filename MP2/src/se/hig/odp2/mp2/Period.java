package se.hig.odp2.mp2;

public class Period
{
    private int year, period;

    public Period(int year, int period)
    {
        this.year = year;
        this.period = period;
    }

    public int getYear()
    {
        return year;
    }

    public int getPeriod()
    {
        return period;
    }
}
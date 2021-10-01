import java.io.Serializable;

/**
 * A class that creates dates
 * @author Kyra
 * @version 5
 */

public class Date implements Serializable
{
  private int day;
  private int month;
  private int year;

  /**
   * Three-argument constructor that initializes the three private fields
   * @param day the valid days in a specific month
   * @param month the valid months in a year
   * @param year number of years
   */

  public Date(int day,int month, int year)
  {

    if(month>0 && month<13)
    {
      this.month=month;
       if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8
           || month == 10 || month == 12)
       {
         if (day>0 && day<31)
           this.day=day;
         else
           throw new IllegalArgumentException("You have entered an incorrect date!");
       }
       else if(month == 4 || month == 6 || month == 9 || month == 11)
       {
         if(day>0 && day<30)
           this.day=day;
         else
           throw new IllegalArgumentException("You have entered an incorrect date!");
       }
       else if ((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0)
       {
         if(day>0 && day<29)
           this.day=day;
         else
           throw new IllegalArgumentException("You have entered an incorrect date!");
       }
       else
       {
         if(day>0 && day<28)
           this.day=day;
         else
           throw new IllegalArgumentException("You have entered an incorrect date!");
       }

    }
    else
    {
      throw new IllegalArgumentException("You have entered an incorrect date!");
    }

    if(year>2020)
    {
      this.year=year;
    }
    else
    {
      throw new IllegalArgumentException("You have entered an incorrect date!");
    }
  }


  public int getDay()
  {
    return day;
  }

  /**
   * A method that returns the month
   * @return the month
   */

  public int getMonth()
  {
    return month;
  }

  /**
   * A method that returns the year
   * @return the year
   */

  public int getYear()
  {
    return year;
  }

  /**
   * A method that returns a String with all the information from the class
   * @return all the important information from the class
   */

  public String toString()
  {
    return getDay()+"/"+getMonth()+"/"+getYear();
  }

  /**
   * A method that compares two objects
   * @param obj the object to compare a date object with
   * @return a boolean which is stating if the compared two objects equal or not
   */

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Date))
      return false;

    Date temp = (Date)obj;

    return day==temp.day && month==temp.month && year == temp.year;
  }
}

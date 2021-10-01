import java.io.Serializable;
import java.util.ArrayList;

/**
 * A class where we declare team members, their roles and activity.
 * @author Milan Tolnai
 * @version 3.0
 */

public class TeamMember implements Serializable
{
  private String email;
  private String name;
  private String role;

  /**
   * A constructor where we initialize the team member's email, name and role.
   * @param email For their personal email.
   * @param name For their name.
   */
  public TeamMember(String email, String name)
  {
    this.email=email;
    this.name=name;
    role="Employee";
  }

  /**
   * A method setting the role of the team member.
   * @param role For their role in the project.
   */
  public void setRole(String role)
  {
    this.role = role;
  }


  /**
   * A method getting the personal email of the team member.
   * @return email
   */
  public String getEmail()
  {
    return email;
  }

  /**
   * A method that returns all the important information in the class in String format
   * @return String
   */
  public String toString()
  {
    return "Name: "+name+", Role: "+role+", E-mail: "+email;
  }

  /**
   * A method comparing two objects
   * @param obj the object to compare a TeamMember object with
   * @return returns a boolean representing if the two objects are equal or not
   */

  public boolean equals(Object obj)
  {
    if(!(obj instanceof TeamMember))
      return false;

    TeamMember temp = (TeamMember)obj;

    return email.equals(temp.email) && name.equals(temp.name) && role.equals(temp.role);
  }
}

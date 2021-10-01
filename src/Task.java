import java.io.Serializable;
import java.util.ArrayList;

/**
 * A class that creates, and verifies the tasks
 * @author Kyra Tolnai
 * @version 10
 */
public class Task implements Serializable
{
  private int taskID;
  private int relatedReqID;
  private String estimateTime;
  private String title;
  private String status;
  private double totalHoursWorked;
  private Date deadline;
  private ArrayList<TeamMember> teamMembers;

  /**
   * A five-argument constructor setting the private fields, initializing
   * the arraylist
   * @param title the title of the task
   * @param deadline the deadline set for the task
   * @param responsibleTM the team member who is responsible for the task
   * @param relatedReqID the ID of the requirement to which the task is created to
   * @param taskID the ID of the task
   */
  public Task(String title,String estimateTime, Date deadline,TeamMember responsibleTM,int relatedReqID,int taskID)
  {
    this.title=title;
    this.estimateTime=estimateTime;
    this.deadline=deadline;
    this.relatedReqID=relatedReqID;
    this.taskID=taskID;
    teamMembers= new ArrayList<TeamMember>();
    teamMembers.add(responsibleTM);
    setStatus("Not Started");
  }

  /**
   * A method setting the status of the requirement
   * @param status status of the requirement
   */

  public void setStatus(String status)
  {
    this.status = status;
  }

  /**
   * A method that sets the total hours worked on the requirement
   * @param totalHoursWorked the total hours worked on the requirement
   */

  public void setTotalHoursWorked(double totalHoursWorked)
  {
    this.totalHoursWorked +=totalHoursWorked;
  }

    /**
   * A method returning the estimate time set for the task
   * @return estimate time
   */

  public String getEstimateTime()
  {
    return estimateTime;
  }

  /**
   * A method returning an arraylist of team member objects
   * @return an arraylist of team member objects
   */

  public ArrayList<TeamMember> getTeamMembers()
  {
    return teamMembers;
  }

  /**
   * A method returning the date
   * @return a Date object representing the deadline
   */

  public Date getDeadline()
  {
    return deadline;
  }

  /**
   * A method returning the ID of the task
   * @return the ID of the task
   */

  public int getTaskID()
  {
    return taskID;
  }


    /**
   * A method returning the status of the task
   * @return the status of the task
   */

  public String getStatus()
  {
    return status;
  }

  /**
   * A method returning the total hours worked on the task
   * @return the total hours worked on the task
   */

  public double getTotalHoursWorked()
  {
    return totalHoursWorked;
  }

  /**
   * A method adding a TeamMember object to the arraylist of team members who work on the task
   * @param teamMember object of TeamMember
   */

  public void addTeamMember(TeamMember teamMember)
  {
    teamMembers.add(teamMember);
  }


  /**
   * A method returning all the important information about the task in a String format
   * @return the important information about the task in a String format
   */
  public String toString()
  {
    return "Status: "+getStatus()+"   Deadline: "+getDeadline();

  }

  /**
   * A method comparing two objects
   * @param obj the object to compare a Task object with
   * @return returns a boolean representing if the two objects are equal or not
   */

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Task))
      return false;

    Task temp = (Task)obj;

    return taskID == temp.taskID && relatedReqID == temp.relatedReqID &&
            deadline.equals(temp.deadline) && estimateTime.equals(temp.estimateTime) &&
            title.equals(temp.title) && status.equals(temp.status) &&
            totalHoursWorked == temp.totalHoursWorked && teamMembers.equals(temp.teamMembers);
  }
}

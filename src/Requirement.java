import java.util.ArrayList;
import java.io.Serializable;
/**
 * The Requirement class is an abstract class that has the general information about the requirement.
 * @author Bianca Militaru
 * @version 3.0
 */
public abstract class Requirement implements Serializable
{
    private int requirementID;
    private String estimatedTime;
    private String status;
    private double hoursWorked;
    private ArrayList<TeamMember> teamMembers;
    private Date deadline;

     /**
     * The four parameters constructor receive information about the requirement.
     * @param estimatedTime is the estimated time for the requirement to be done
     * @param deadline is the date when the requirement should be finished
     * @param responsibleTeamMember is the team member that is responsible for the requirement
     * @param requirementID is the ID of the requirement
     */

    public Requirement(String estimatedTime, Date deadline, TeamMember responsibleTeamMember, int requirementID)
    {
        this.requirementID =requirementID;
        this.estimatedTime = estimatedTime;
        status = "Not Started";
        hoursWorked = 0;
        teamMembers = new ArrayList<TeamMember>();
        teamMembers.add(responsibleTeamMember);
        this.deadline = deadline;
    }


    /**
     * The setStatus method takes one argument and initialize the status of the requirement.
     * @param status is the status of the requirement
     */

    public void setStatus(String status)
    {
        this.status = status;
    }

    /**
     * The setTotalHoursWorked method takes one argument and increment the total hours worked.
     * @param hours is the amount of hours worked
     */

    public void setTotalHoursWorked(double hours)
    {
        this.hoursWorked += hours;
    }

    /**
     * The getRequirementID method returns the id of the requirement.
     * @return an int with the id of the requirement
     */
    public int getRequirementID()
    {
        return requirementID;
    }

    /**
     * The getEstimatedTime method returns the estimated time for the requirement to be done.
     * @return a String with the estimated time for the requirement to be done
     */

    public String getEstimatedTime()
    {
        return estimatedTime;
    }

    /**
     * The getStatus method returns the status of the project.
     * @return a String with the status of the porject.
     */

    public String getStatus()
    {
        return status;
    }

    /**
     * The getHoursWorked method returns the total hours worked at the requirement.
     * @return a double with the total hours worked at the requirement
     */

    public double getHoursWorked()
    {
        return hoursWorked;
    }


    /**
     * The getTeamMembers returns all the team members that worked to the requirement.
     * @return an ArrayList of TeamMember that has all the team members that worked to the requirement
     */

    public ArrayList<TeamMember> getTeamMembers()
    {
        return teamMembers;
    }

    /**
     * The getDeadline method returns the deadline of the requirement.
     * @return a Date object that represents the deadline of the requirement
     */

    public Date getDeadline()
    {
        return deadline;
    }

    /**
     * The addTeamMember method takes one argument and adds a team member in the array list.
     * @param teamMember is a TeamMember object
     */

    public void addTeamMember(TeamMember teamMember)
    {
        teamMembers.add(teamMember);
    }


    /**
     * The verifyRequirement method take one argument and sets the status to "Approved" or "Rejected".
     * @param verify is true if the requirement is approved or false if not
     */

    public void verifyRequirement(boolean verify)
    {
        if (verify)
            setStatus("Approved");
        else
            setStatus("Rejected");
    }

    /**
     * The toString method returns all the util information about the class.
     * @return a String which contains the status and the hoursWorked
     */

    public String toString()
    {
        return "Status: " + status + ". Hours worked: " + hoursWorked;
    }

    /**
     * The equal method compares the ID, the estimated time, the status,
     * the hours worked, the team members and the deadline for two requirements
     * @param obj The objects to compare with
     * @return True if the given object is equal to this requirement
     */

    public boolean equals(Object obj)
    {
        if(!(obj instanceof Requirement))
            return false;

        Requirement temp = (Requirement)obj;

        return requirementID == temp.requirementID && estimatedTime.equals(temp.estimatedTime) &&
                status.equals(temp.status) && hoursWorked == temp.hoursWorked &&
                teamMembers.equals(temp.teamMembers) && deadline.equals(temp.deadline);
    }
}

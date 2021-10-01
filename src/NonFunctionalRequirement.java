import java.io.Serializable;
/**
 * The NonFunctionalRequirement is a class that has the specific information for a non functional requirement.
 * @extends Requirement
 * @author Bianca Militaru
 * @version 2.0
 */
public class NonFunctionalRequirement extends Requirement implements Serializable
{
    private String description;

    /**
     * The five arguments constructor receive the information about the non functional requirement.
     * @param estimatedTime is the estimated time for the requirement to be done
     * @param deadline is the date when the requirement should be finished
     * @param responsibleTeamMember is the team member that is responsible for the requirement
     * @param requirementID is the ID of the requirement
     * @param description is the description of the requirement
     */

    public NonFunctionalRequirement(String estimatedTime, Date deadline, TeamMember responsibleTeamMember,
                                    int requirementID, String description)
    {
        super(estimatedTime, deadline, responsibleTeamMember, requirementID);
        this.description = description;
    }

    /**
     * The setTotalHoursWorked takes one argument and send it to the superclass.
     * @param hours is the amount of hours worked on the non functional requirement
     */

    public void setTotalHoursWorked(double hours)
    {
        super.setTotalHoursWorked(hours);
    }

    /**
     * A method that adds a new team member to the non-functional requirement
     * @param teamMember is a TeamMember object
     */


    public void addTeamMember(TeamMember teamMember)
    {
        addTeamMember(teamMember);
    }


    /**
     * The verifyRequirement method take one argument and sets the status to "Approved" or "Rejected".
     * @param verify is true if the requirement is approved or false if not
     */

    public void verifyRequirement(boolean verify)
    {
        super.verifyRequirement(verify);
    }

    /**
     * The toString method returns all the util information of the class.
     * @return a String with the information for the super class and also with the description of the
     * non functional requirement
     */

    public String toString()
    {
        return super.toString() + ". Description: " + description;
    }

    /**
     * The equal method compares the fields for two non-functional requirements
     * @param obj The objects to compare with
     * @return True if the given object is equal to this non-functional requirement
     */
    public boolean equals(Object obj)
    {
        if(!(obj instanceof NonFunctionalRequirement))
            return false;

        NonFunctionalRequirement temp = (NonFunctionalRequirement)obj;

        return super.equals(temp) && description.equals(temp.description);
    }
}

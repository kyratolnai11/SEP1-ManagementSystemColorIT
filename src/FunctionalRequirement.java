import java.util.ArrayList;
import java.io.Serializable;

/**
 * The FunctionalRequirement is a class that has the specific information for a functional requirement.
 * @extends Requirement
 * @author Bianca Militaru
 * @version 2.0
 */
public class FunctionalRequirement extends Requirement implements Serializable
{
    private String userStory;
    private ArrayList<Task> tasks;

    /**
     * The five parameters constructor receive information abut the functional requirement.
     * @param estimatedTime is the estimated time for the requirement to be done
     * @param deadline is the date when the requirement should be finished
     * @param responsibleTeamMember is the team member that is responsible for the requirement
     * @param requirementID is the ID of the requirement
     * @param userStory is the description of the requirement
     */
    public FunctionalRequirement(String estimatedTime, Date deadline, TeamMember responsibleTeamMember,
                                 int requirementID, String userStory)
    {
        super(estimatedTime, deadline, responsibleTeamMember, requirementID);
        this.userStory = userStory;
        tasks = new ArrayList<Task>();
    }

    /**
     * The setUserStory method takes one argument and initialize the user story.
     * @param userStory is the description of the requirement
     */

    public void setUserStory(String userStory)
    {
        this.userStory = userStory;
    }

    /**
     * The setTotalHoursWorked method adds all the hours worked to the tasks and sends it to the super class.
     */

    public void setTotalHoursWorked()
    {
        double hours = 0;
        for (int i = 0; i < tasks.size(); i++)
            hours += tasks.get(i).getTotalHoursWorked();
        super.setTotalHoursWorked(hours);
        if(!getStatus().equals("Started"))
            setStatus("Started");
    }

    /**
     * The getTasks method returns all the tasks that are in this requirement.
     * @return an ArrayList of Task that has all the tasks that are in this requirement
     */

    public ArrayList<Task> getTasks()
    {
        return tasks;
    }

    /**
     * The addTask method takes five arguments and add a new task to the array list of the tasks.
     * @param title is the title of the task
     * @param deadline is the deadline of the task
     * @param responsibleTM is the responsible team member of the task
     * @param relatedReqID is the id of the requirement where is the task added
     */

    public void addTask(String title, String estimatedTime, Date deadline, TeamMember responsibleTM, int relatedReqID)
    {
        Task temp = new Task(title, estimatedTime, deadline,  responsibleTM, relatedReqID, tasks.size());
        tasks.add(temp);
    }


    /**
     * The addTeamMember method takes one argument and adds a team member in the array list.
     * @param teamMember is a TeamMember object
     */

    public void addTeamMember(TeamMember teamMember)
    {
        super.addTeamMember(teamMember);
    }

    /**
     * The verifyRequirement method checks if all the tasks from this requirement are approved and then sends the
     * information to the super class.
     */

    public void verifyRequirement()
    {
        boolean verify = true;
        for (int i = 0; i < tasks.size(); i++)
        {
            if (tasks.get(i).getStatus().equals("Rejected"))
            {
                verify = false;
            }
        }

        super.verifyRequirement(verify);
    }

    /**
     * The toString method returns all the util information of the class.
     * @return a String with the information for the super class and also with the user story of the
     * functional requirement
     */

    public String toString()
    {
        return super.toString() + ". User story: " + userStory;
    }
    /**
     * The equal method compares the fields for two functional requirements
     * @param obj The objects to compare with
     * @return True if the given object is equal to this functional requirement
     */

    public boolean equals(Object obj)
    {
        if(!(obj instanceof FunctionalRequirement))
            return false;

        FunctionalRequirement temp = (FunctionalRequirement)obj;

        return super.equals(temp) && userStory.equals(temp.userStory) &&
                tasks.equals(temp.tasks);
    }
}

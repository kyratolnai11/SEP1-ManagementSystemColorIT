/**
 * A class that creates and modifies projects
 * @author Tabita Roxana Varlan
 * @version 12.0
 */
import java.io.Serializable;
import  java.util.ArrayList;

public class Project implements Serializable
{
  private int projectID;
  private Date deadline;
  private ArrayList<Requirement> requirements;
  private ArrayList<TeamMember> teamMembers;
  private String status;
  private double hoursWorked;

  /**
   * Five-argument constructor that initializes the private fields
   * @param deadline for storing the deadline of the project
   * @param projectID for storing the ID of the project
   * @param scrumMaster the Scrum Master member
   * @param productOwner  the Product Owner member
   * @param projectCreator  the Project Creator member
   */

  public Project(Date deadline, int projectID, TeamMember scrumMaster,
      TeamMember productOwner, TeamMember projectCreator )
  {
    this.projectID=projectID;
    this.deadline=deadline;
    requirements = new ArrayList<Requirement>();
    teamMembers = new ArrayList<TeamMember>();
    status = "Not started";
    teamMembers.add(scrumMaster);
    scrumMaster.setRole("Scrum Master");
    teamMembers.add(productOwner);
    productOwner.setRole("Product Owner");
    teamMembers.add(projectCreator);
    projectCreator.setRole("Project Creator");
    hoursWorked = 0;
  }

  /**
   * A method that set the hours worked for a project
   */
  public void setHoursWorked()
  {
    for (int i = 0; i < requirements.size(); i++)
    {
      hoursWorked += requirements.get(i).getHoursWorked();
    }
    if(!status.equals("Started"))
      status = "Started";
  }

  /**
   * A method that returns the deadline of the project as a Date object
   * @return The deadline of the project
   */
  public Date getDeadline()
  {
    return deadline;
  }

  /**
   * A method that returns the Id of the project
   * @return ID
   */

  public int getProjectID()
  {
    return projectID;
  }

  /**
   * A method that returns the status of the project as a String
   * @return The project's status
   */

  public String getStatus()
  {
    return status;
  }

  /**
   * A method that returns the hours worked for the project as a double
   * @return The number of hours worked for the project
   */

  public double getHoursWorked()
  {
    return hoursWorked;
  }

  /**
   * A method that returns an array with all the requirements
   * @return all the requirements
   */
  public ArrayList<Requirement> getRequirements()
  {
    return requirements;
  }

  /**
   * A method returns an array with all the team members
   * @return all the team members
   */
  public ArrayList<TeamMember> getTeamMembers()
  {
    return teamMembers;
  }

  /**
   * A method that add a new team member to the project
   * @param teamMember - The team member added
   */

  public void addTeamMember(TeamMember teamMember)
  {
    teamMembers.add(teamMember);
  }


  /**
   * A method that add a new functional requirement to the project
   * @param estimateTime - The estimated time of finishing the requirement
   * @param deadline - The deadline of the requirement
   * @param responsibleTM - The responsible team member for the requirement
   * @param userStory - The user story for the functional requirement
   */
  public void addFunctionalReq(String estimateTime, Date deadline, TeamMember responsibleTM, String userStory)
  {
    int index;
    if (requirements.size() == 0)
      index = 1;
    else
      index = requirements.get(requirements.size()-1).getRequirementID()+1;
    Requirement temp = new FunctionalRequirement(estimateTime,deadline,responsibleTM,
        index, userStory);
    requirements.add(temp);
  }

  /**
   * A method that add a new non-functional requirement to the project
   * @param estimateTime - The estimated time of finishing the requirement
   * @param deadline - The deadline of the requirement
   * @param responsibleTM - The responsible team member for the requirement
   * @param description - The description for the non-functional requirement
   */
  public void addNonFunctionalReq(String estimateTime, Date deadline, TeamMember responsibleTM, String description)
  {
    int index;
    if(requirements.size() == 0)
      index = 1;
    else
      index = requirements.get(requirements.size()-1).getRequirementID()+1;
    Requirement temp = new NonFunctionalRequirement(estimateTime,deadline,responsibleTM,
        index, description);
    requirements.add(temp);
  }

  /**
   * A method that reorder the requirement inside a project
   * @param requirementID - The requirement ID
   * @param wantedReqIndex -The position wanted for the specific requirement to be moved in
   */
  public void reorderRequirements(int requirementID, int wantedReqIndex )
  {
    Requirement temp = null;
    for (int i = 0; i < requirements.size(); i++)
    {
      if(requirements.get(i).getRequirementID() == requirementID)
      {
        temp = requirements.get(i);
        requirements.remove(i);
      }
    }
    requirements.add(wantedReqIndex-1, temp);
  }

  /**
   * A method that removes a requirement by indicating his requirement ID
   * @param requirementID The ID of the requirement
   */
  public void removeRequirement(int requirementID)
  {
    for (int i = 0; i < requirements.size(); i++)
    {
      if(requirements.get(i).getRequirementID() == requirementID)
      {
        requirements.remove(i);
      }
    }
  }

  /**
   * A method that verifies a project in order to change his status
   */

  public void verifyProject()
  {
    boolean ok = true;
    for (int i = 0; i < requirements.size(); i++)
    {
      if(requirements.get(i).getStatus().equals("Rejected"))
      {
        ok = false;
        break;
      }
    }

    if(ok)
      status = "Approved";
    else
      status = "Rejected";
  }

  /**
   * A method that returns a String with the information from the class
   * @return all the important information from the class
   */

  public String toString()
  {
    return "Project ID: " + projectID + " Deadline: " + deadline;
  }

  /**
   * A method that compares the projectId, the requirements,the team members and the status for two projects
   * @param obj The project to compare with
   * @return True if the given object is equal to this project
   */

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Project))
      return false;

    Project temp = (Project)obj;

    return projectID == (temp.projectID) && deadline.equals(temp.deadline) &&
            requirements.equals(temp.requirements) && teamMembers.equals(temp.teamMembers) &&
            status.equals(temp.status);
  }


}

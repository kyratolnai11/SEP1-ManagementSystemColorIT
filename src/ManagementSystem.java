/**
 * A class for managing the system
 * @author Tabita Roxana Varlan + Bianca Maria Militaru
 * @version 14.0
 */
import java.io.Serializable;
import java.util.ArrayList;

public class ManagementSystem implements Serializable
{
  private ArrayList<Project> projects;
  private ArrayList<TeamMember> employees;

  /**
   * Constructor that initializes the private fields
   */
  public ManagementSystem()
  {
    projects = new ArrayList<Project>();
    employees = new ArrayList<TeamMember>();
  }

  /**
   * A method that adds a project in the system
   * @param deadline The project's deadline
   * @param scrumMaster the Scrum Master member
   * @param productOwner  the Product Owner member
   * @param projectCreator  the Project Creator member
   */
  public void addProject(Date deadline,TeamMember scrumMaster,
      TeamMember productOwner, TeamMember projectCreator )
  {

    projects.add(new Project(deadline, projects.size(), scrumMaster, productOwner, projectCreator));
  }

  /**
   * A method that adds a team member in the system
   * @param teamMember The team member  that has been added
   */
  public void addTeamMember(TeamMember teamMember)
  {
    employees.add(teamMember);
  }

  /**
   * A method that returns a specific requirement from a project
   * @param projectID The id of the project
   * @param requirementID The Id of the requirement
   * @return The Requirement object
   */

  public Requirement getRequirement(int projectID, int requirementID)
  {
    for (int i = 0; i < getProjects().get(projectID).getRequirements().size(); i++)
    {
      if(getProjects().get(projectID).getRequirements().get(i).getRequirementID() == requirementID)
        return getProjects().get(projectID).getRequirements().get(i);
    }
    return null;
  }

  /**
   * A method that returns an array of team members
   * @return a list of all employees
   */

  public ArrayList<TeamMember> getTeamMembers()
  {
    return employees;
  }

  /**
   * A method that returns an array of all projects
   * @return all the projects
   */
  public ArrayList<Project> getProjects()
  {
    return projects;
  }


  /**
   * A method that can change the role of a team member
   * @param projectID The project Id
   * @param teamMember The employee
   * @param role The new role
   */
  public void changeRole(int projectID, TeamMember teamMember, String role)
  {
    for (int i = 0; i < projects.get(projectID).getTeamMembers().size(); i++)
    {
      if(projects.get(projectID).getTeamMembers().get(i).getEmail().equals(teamMember.getEmail()))
      {
        projects.get(projectID).getTeamMembers().get(i).setRole(role);
      }
    }
  }

  /**
   * A method that sets the number of hours for a specific task
   * @param projectID Id of the project
   * @param requirementID Id of the requirement
   * @param taskID Id of the task
   * @param hours The number of hours worked for the task
   * @param teamMember The team member that reports the activity
   */

  public void reportMyTaskActivity(int projectID, int requirementID, int taskID, double hours,
      TeamMember teamMember)
  {
    FunctionalRequirement temp = null;
    for (int i = 0; i <  projects.get(projectID).getRequirements().size(); i++)
      if (projects.get(projectID).getRequirements().get(i).getRequirementID() == requirementID)
        temp = (FunctionalRequirement)projects.get(projectID).getRequirements().get(i);

    if(temp != null)
    {
      temp.getTasks().get(taskID).setTotalHoursWorked(hours);
      if(!temp.getTasks().get(taskID).getTeamMembers().contains(teamMember))
        temp.getTasks().get(taskID).addTeamMember(teamMember);
      if(!temp.getTasks().get(taskID).getStatus().equals("Started"))
        temp.getTasks().get(taskID).setStatus("Started");
    }

  }


  /**
   * A method that sets the number of hours for a non-functional requirement
   * @param projectID Id of the project
   * @param requirementID Id of the requirement
   * @param hours The number of hours worked for the non-functional requirement
   * @param teamMember The team member that reports the activity
   */
  public void reportMyNFActivity(int projectID, int requirementID, double hours, TeamMember teamMember)
  {
    for (int i = 0; i < projects.get(projectID).getRequirements().size(); i++)
    {
      if (projects.get(projectID).getRequirements().get(i).getRequirementID() == requirementID)
      {
        projects.get(projectID).getRequirements().get(i).setTotalHoursWorked(hours);
        if (!projects.get(projectID).getRequirements().get(i).getTeamMembers().contains(teamMember))
          projects.get(projectID).getRequirements().get(i).addTeamMember(teamMember);
        if(!projects.get(projectID).getRequirements().get(i).getStatus().equals("Started"))
          projects.get(projectID).getRequirements().get(i).setStatus("Started");
      }
    }
  }

}

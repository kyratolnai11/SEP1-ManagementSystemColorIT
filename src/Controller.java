import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

/*import parser.ParserException;
import parser.XmlJsonParser;*/



import java.util.ArrayList;

/**
 * A class responsible for all the functionality in GUI
 */
public class Controller {

    @FXML private TextField dayAddProjectTextField;
    @FXML private TextField monthAddProjectTextField;
    @FXML private TextField yearAddProjectTextField;

    @FXML private ComboBox<TeamMember> teamMembersScrumMasterComboBox;
    @FXML private ComboBox<TeamMember> teamMembersProductOwnerComboBox;
    @FXML private ComboBox<TeamMember> teamMembersProjectCreatorComboBox;

    @FXML private Button addProjectButton;
    @FXML private Button addFunctionalRequirementButton;
    @FXML private Button addNonFunctionalRequirementButton;
    @FXML private Button addTaskButton;
    @FXML private Button addNewTeamMemberButton;
    @FXML private Button addTeamMemberToProjectButton;
    @FXML private Button addTeamMemberToRequirementButton;
    @FXML private Button addTeamMemberToTaskButton;

    @FXML private ComboBox<Project> projectsAddFunctionalRequirementComboBox;
    @FXML private TextField userStoryTextField;
    @FXML private TextField dayAddFunctionalRequirementTextField;
    @FXML private TextField monthAddFunctionalRequirementTextField;
    @FXML private TextField yearAddFunctionalRequirementTextField;
    @FXML private TextField estimateTimeFunctionalRequirementTextField;
    @FXML private ComboBox<TeamMember> teamMembersResponsibleAddFunctionalRequirementComboBox;

    @FXML private ComboBox<Project> projectsAddNonFunctionalRequirementComboBox;
    @FXML private TextField descriptionTextField;
    @FXML private TextField dayAddNonFunctionalRequirementTextField;
    @FXML private TextField monthAddNonFunctionalRequirementTextField;
    @FXML private TextField yearAddNonFunctionalRequirementTextField;
    @FXML private TextField estimateTimeNonFunctionalRequirementTextField;
    @FXML private ComboBox<TeamMember> teamMembersResponsibleAddNonFunctionalRequirementComboBox;

    @FXML private ComboBox<Project> projectsAddTaskComboBox;
    @FXML private ComboBox<Requirement> requirementsAddTaskComboBox;
    @FXML private TextField titleAddTaskTextField;
    @FXML private TextField estimateTimeAddTaskTextField;
    @FXML private TextField dayAddTaskTextField;
    @FXML private TextField monthAddTaskTextField;
    @FXML private TextField yearAddTaskTextField;
    @FXML private ComboBox<TeamMember> teamMembersResponsibleAddTaskComboBox;

    @FXML private TextField nameTextField;
    @FXML private TextField emailTextField;

    @FXML private ComboBox<Project> projectsAddTeamMemberToProjectComboBox;
    @FXML private ComboBox<TeamMember> teamMembersAddTeamMemberToProjectComboBox;

    @FXML private ComboBox<Project> projectsAddTeamMemberToRequirementComboBox;
    @FXML private ComboBox<TeamMember> teamMembersAddTeamMemberToRequirementComboBox;
    @FXML private ComboBox<Requirement> requirementsAddTeamMemberToRequirementComboBox;

    @FXML private ComboBox<Project> projectsAddTeamMemberToTaskComboBox;
    @FXML private ComboBox<TeamMember> teamMembersAddTeamMemberToTaskComboBox;
    @FXML private ComboBox<Requirement> requirementsAddTeamMemberToTaskComboBox;
    @FXML private ComboBox<Task> tasksAddTeamMemberToTaskComboBox;

    @FXML private ComboBox<Project> projectsReorderRequirementsComboBox;
    @FXML private ComboBox<Requirement> requirementsReorderRequirementsComboBox;
    @FXML private ComboBox positionsReorderRequirementComboBox;

    @FXML private ComboBox<Project> projectsRemoveRequirementsComboBox;
    @FXML private ComboBox<Requirement> requirementsRemoveRequirementsComboBox;

    @FXML private ComboBox<Project> projectsChangeRoleComboBox;
    @FXML private ComboBox<TeamMember> teamMembersChangeRoleComboBox;
    @FXML private ComboBox<String> roles;

    @FXML private Button saveReorderButton;
    @FXML private Button removeButton;
    @FXML private Button saveChangeRoleButton;

    @FXML private ComboBox<TeamMember> teamMembersSearchEmployeeComboBox;
    @FXML private TextArea projectsTextArea;

    @FXML private ComboBox<Project> projectsSearchProjectComboBox;
    @FXML private TextArea requirementsTextArea;

    @FXML private ComboBox<Project> projectsSearchRequirementComboBox;
    @FXML private ComboBox<Requirement> requirementsSearchRequirementComboBox;
    @FXML private TextArea tasksAreaTextArea;

    @FXML private ComboBox<Project> projectsVerifyTaskComboBox;
    @FXML private ComboBox<Requirement> requirementsVerifyTaskComboBox;
    @FXML private ComboBox<Task> tasksVerifyTaskComboBox;
    @FXML private Button approveTaskButton;
    @FXML private Button rejectTaskButton;

    @FXML private ComboBox<Project> projectsVerifyFunctionalRequirementComboBox;
    @FXML private ComboBox<Requirement> requirementsVerifyFunctionalRequirementComboBox;
    @FXML private Button verifyFunctionalRequirementButton;

    @FXML private ComboBox<Project> projectsVerifyNonFunctionalRequirementComboBox;
    @FXML private ComboBox<Requirement> requirementsVerifyNonFunctionalRequirementComboBox;
    @FXML private Button approveNonFunctionalRequirementButton;
    @FXML private Button rejectNonFunctionalRequirementButton;

    @FXML private ComboBox<Project> projectsVerifyComboBox;
    @FXML private Button verifyProjectButton;

    @FXML private ComboBox<Project> projectsReportActivityTaskComboBox;
    @FXML private ComboBox<Requirement> requirementsReportActivityTaskComboBox;
    @FXML private ComboBox<Task> tasksReportActivityTaskComboBox;
    @FXML private ComboBox<TeamMember> teamMembersReportActivityTaskComboBox;
    @FXML private TextField hoursWorkedReportActivityTaskTextField;
    @FXML private CheckBox endedTaskReportActivityTaskCheckBox;
    @FXML private Button reportTaskButton;

    @FXML private ComboBox<Project> projectsReportActivityNonFunctionalRequirementComboBox;
    @FXML private ComboBox<Requirement> requirementsReportActivityNonFunctionalRequirementComboBox;
    @FXML private ComboBox<TeamMember> teamMembersReportActivityNonFunctionalRequirementComboBox;
    @FXML private TextField hoursWorkedReportActivityNonFunctionalRequirementTextField;
    @FXML private CheckBox endedNonFunctionalRequirementReportActivityCheckBox;
    @FXML private Button reportNonFunctionalRequirementButton;

    @FXML private ComboBox<Project> projectsReportActivityFunctionalRequirementComboBox;
    @FXML private ComboBox<Requirement> requirementsReportActivityFunctionalRequirementComboBox;
    @FXML private Button reportFunctionalRequirementButton;

    @FXML private ComboBox<Project> projectsReportActivityProjectComboBox;
    @FXML private Button reportProjectButton;

    @FXML private Button exportButton;

    private ManagementSystemFileAdapter fileAdapter;

    /**
     * A method that is initializing the fields and is loading data in ComboBoxes
     */

    public void initialize()
    {
        fileAdapter = new ManagementSystemFileAdapter("C:\\Users\\Kira\\IdeaProjects\\SEP1-ManagementSystemColorIT\\src\\test.bin");
        updateTeamMembers();
        updateProjects();

        ArrayList<String> roles1=new ArrayList<String>();

        roles1.add("Product Owner");
        roles1.add("Project Creator");
        roles1.add("Scrum Master");

        roles.getItems().addAll(roles1);
        roles.getSelectionModel().select(0);
    }

    /**
     * A method that updates the ComboBoxes for the team members
     */

    public void updateTeamMembers()
    {
        ManagementSystem managementSystem = fileAdapter.loadManagementSystem();
        ArrayList<TeamMember> teamMembers = managementSystem.getTeamMembers();
        teamMembersScrumMasterComboBox.getItems().addAll(teamMembers);
        teamMembersScrumMasterComboBox.getSelectionModel().select(0);
        teamMembersProjectCreatorComboBox.getItems().addAll(teamMembers);
        teamMembersProjectCreatorComboBox.getSelectionModel().select(0);
        teamMembersProductOwnerComboBox.getItems().addAll(teamMembers);
        teamMembersProductOwnerComboBox.getSelectionModel().select(0);
        teamMembersResponsibleAddFunctionalRequirementComboBox.getItems().addAll(teamMembers);
        teamMembersResponsibleAddFunctionalRequirementComboBox.getSelectionModel().select(0);
        teamMembersResponsibleAddNonFunctionalRequirementComboBox.getItems().addAll(teamMembers);
        teamMembersResponsibleAddNonFunctionalRequirementComboBox.getSelectionModel().select(0);
        teamMembersResponsibleAddTaskComboBox.getItems().addAll(teamMembers);
        teamMembersResponsibleAddTaskComboBox.getSelectionModel().select(0);
        teamMembersAddTeamMemberToProjectComboBox.getItems().addAll(teamMembers);
        teamMembersAddTeamMemberToProjectComboBox.getSelectionModel().select(0);
        teamMembersAddTeamMemberToRequirementComboBox.getItems().addAll(teamMembers);
        teamMembersAddTeamMemberToRequirementComboBox.getSelectionModel().select(0);
        teamMembersAddTeamMemberToTaskComboBox.getItems().addAll(teamMembers);
        teamMembersAddTeamMemberToTaskComboBox.getSelectionModel().select(0);
        teamMembersSearchEmployeeComboBox.getItems().addAll(teamMembers);
        teamMembersSearchEmployeeComboBox.getSelectionModel().select(0);
    }

    /**
     * A method that clears the ComboBoxes for the team members
     */
    public void clearTeamMembers()
    {
        teamMembersScrumMasterComboBox.getItems().clear();
        teamMembersProjectCreatorComboBox.getItems().clear();
        teamMembersProductOwnerComboBox.getItems().clear();
        teamMembersResponsibleAddFunctionalRequirementComboBox.getItems().clear();
        teamMembersResponsibleAddNonFunctionalRequirementComboBox.getItems().clear();
        teamMembersResponsibleAddTaskComboBox.getItems().clear();
        teamMembersAddTeamMemberToProjectComboBox.getItems().clear();
        teamMembersAddTeamMemberToRequirementComboBox.getItems().clear();
        teamMembersAddTeamMemberToTaskComboBox.getItems().clear();
        teamMembersChangeRoleComboBox.getItems().clear();
        teamMembersSearchEmployeeComboBox.getItems().clear();
        teamMembersReportActivityTaskComboBox.getItems().clear();
        teamMembersReportActivityNonFunctionalRequirementComboBox.getItems().clear();
    }

    /**
     * A method that updates the ComboBoxes for the projects
     */
    public void updateProjects()
    {
        ManagementSystem managementSystem = fileAdapter.loadManagementSystem();
        ArrayList<Project> projects = managementSystem.getProjects();
        projectsAddFunctionalRequirementComboBox.getItems().addAll(projects);
        projectsAddFunctionalRequirementComboBox.getSelectionModel().select(0);
        projectsAddNonFunctionalRequirementComboBox.getItems().addAll(projects);
        projectsAddNonFunctionalRequirementComboBox.getSelectionModel().select(0);
        projectsAddTaskComboBox.getItems().addAll(projects);
        projectsAddTaskComboBox.getSelectionModel().select(0);
        projectsAddTeamMemberToProjectComboBox.getItems().addAll(projects);
        projectsAddTeamMemberToProjectComboBox.getSelectionModel().select(0);
        projectsAddTeamMemberToRequirementComboBox.getItems().addAll(projects);
        projectsAddTeamMemberToRequirementComboBox.getSelectionModel().select(0);
        projectsAddTeamMemberToTaskComboBox.getItems().addAll(projects);
        projectsAddTeamMemberToTaskComboBox.getSelectionModel().select(0);
        projectsReorderRequirementsComboBox.getItems().addAll(projects);
        projectsReorderRequirementsComboBox.getSelectionModel().select(0);
        projectsRemoveRequirementsComboBox.getItems().addAll(projects);
        projectsRemoveRequirementsComboBox.getSelectionModel().select(0);
        projectsChangeRoleComboBox.getItems().addAll(projects);
        projectsChangeRoleComboBox.getSelectionModel().select(0);
        projectsSearchProjectComboBox.getItems().addAll(projects);
        projectsSearchProjectComboBox.getSelectionModel().select(0);
        projectsSearchRequirementComboBox.getItems().addAll(projects);
        projectsSearchRequirementComboBox.getSelectionModel().select(0);
        projectsVerifyTaskComboBox.getItems().addAll(projects);
        projectsVerifyTaskComboBox.getSelectionModel().select(0);
        projectsVerifyFunctionalRequirementComboBox.getItems().addAll(projects);
        projectsVerifyFunctionalRequirementComboBox.getSelectionModel().select(0);
        projectsVerifyNonFunctionalRequirementComboBox.getItems().addAll(projects);
        projectsVerifyNonFunctionalRequirementComboBox.getSelectionModel().select(0);
        projectsVerifyComboBox.getItems().addAll(projects);
        projectsVerifyComboBox.getSelectionModel().select(0);
        projectsReportActivityTaskComboBox.getItems().addAll(projects);
        projectsReportActivityTaskComboBox.getSelectionModel().select(0);
        projectsReportActivityNonFunctionalRequirementComboBox.getItems().addAll(projects);
        projectsReportActivityNonFunctionalRequirementComboBox.getSelectionModel().select(0);
        projectsReportActivityFunctionalRequirementComboBox.getItems().addAll(projects);
        projectsReportActivityFunctionalRequirementComboBox.getSelectionModel().select(0);
        projectsReportActivityProjectComboBox.getItems().addAll(projects);
        projectsReportActivityProjectComboBox.getSelectionModel().select(0);
    }

    /**
     * A method that clears the ComboBoxes for the projects
     */
    public void clearProjects()
    {
        projectsAddFunctionalRequirementComboBox.getItems().clear();
        projectsAddNonFunctionalRequirementComboBox.getItems().clear();
        projectsAddTaskComboBox.getItems().clear();
        projectsAddTeamMemberToProjectComboBox.getItems().clear();
        projectsAddTeamMemberToRequirementComboBox.getItems().clear();
        projectsAddTeamMemberToTaskComboBox.getItems().clear();
        projectsReorderRequirementsComboBox.getItems().clear();
        projectsRemoveRequirementsComboBox.getItems().clear();
        projectsChangeRoleComboBox.getItems().clear();
        projectsSearchProjectComboBox.getItems().clear();
        projectsSearchRequirementComboBox.getItems().clear();
        projectsVerifyTaskComboBox.getItems().clear();
        projectsVerifyFunctionalRequirementComboBox.getItems().clear();
        projectsVerifyNonFunctionalRequirementComboBox.getItems().clear();
        projectsVerifyComboBox.getItems().clear();
        projectsReportActivityTaskComboBox.getItems().clear();
        projectsReportActivityNonFunctionalRequirementComboBox.getItems().clear();
        projectsReportActivityFunctionalRequirementComboBox.getItems().clear();
        projectsReportActivityProjectComboBox.getItems().clear();
    }
    /**
     * A method that updates all the ComboBoxes
     */

    public void update()
    {
        clearProjects();
        updateProjects();
        clearTeamMembers();
        updateTeamMembers();
    }

    /**
     * A method called when an ActionEvent occur for the requirements Combo Boxes
     * @param e the Action Event
     */

    public void handleRequirements(ActionEvent e)
    {
        if (e.getSource() == projectsAddTaskComboBox)
        {
            Project temp = projectsAddTaskComboBox.getSelectionModel().getSelectedItem();
            if (temp != null)
            {
                requirementsAddTaskComboBox.getItems().clear();
                for (int i = 0; i < temp.getRequirements().size(); i++)
                {
                    if (temp.getRequirements().get(i) instanceof FunctionalRequirement)
                        requirementsAddTaskComboBox.getItems().add(temp.getRequirements().get(i));
                }
                requirementsAddTaskComboBox.getSelectionModel().select(0);
            }
        }
        else if(e.getSource() == projectsAddTeamMemberToRequirementComboBox)
        {
            Project temp = projectsAddTeamMemberToRequirementComboBox.getSelectionModel().getSelectedItem();
            if (temp != null)
            {
                requirementsAddTeamMemberToRequirementComboBox.getItems().clear();
                requirementsAddTeamMemberToRequirementComboBox.getItems().addAll(temp.getRequirements());
                requirementsAddTeamMemberToRequirementComboBox.getSelectionModel().select(0);
            }
        }
        else if(e.getSource() == projectsAddTeamMemberToTaskComboBox)
        {
            Project temp = projectsAddTeamMemberToTaskComboBox.getSelectionModel().getSelectedItem();
            if (temp != null)
            {
                requirementsAddTeamMemberToTaskComboBox.getItems().clear();
                for (int i = 0; i < temp.getRequirements().size(); i++)
                {
                    if(temp.getRequirements().get(i) instanceof FunctionalRequirement)
                        requirementsAddTeamMemberToTaskComboBox.getItems().add(temp.getRequirements().get(i));
                }
                requirementsAddTeamMemberToTaskComboBox.getSelectionModel().select(0);
            }
        }
        else if(e.getSource() == projectsReorderRequirementsComboBox)
        {
            Project temp = projectsReorderRequirementsComboBox.getSelectionModel().getSelectedItem();
            if (temp != null)
            {
                requirementsReorderRequirementsComboBox.getItems().clear();
                requirementsReorderRequirementsComboBox.getItems().addAll(temp.getRequirements());
                requirementsReorderRequirementsComboBox.getSelectionModel().select(0);
            }
        }
        else if(e.getSource() == projectsRemoveRequirementsComboBox)
        {
            Project temp = projectsRemoveRequirementsComboBox.getSelectionModel().getSelectedItem();
            if (temp != null)
            {
                requirementsRemoveRequirementsComboBox.getItems().clear();
                requirementsRemoveRequirementsComboBox.getItems().addAll(temp.getRequirements());
            }
            requirementsRemoveRequirementsComboBox.getSelectionModel().select(0);
        }
        else if(e.getSource() == projectsSearchRequirementComboBox)
        {
            Project temp = projectsSearchRequirementComboBox.getSelectionModel().getSelectedItem();
            if (temp != null)
            {
                requirementsSearchRequirementComboBox.getItems().clear();
                for (int i = 0; i < temp.getRequirements().size(); i++)
                {
                    if (temp.getRequirements().get(i) instanceof FunctionalRequirement)
                        requirementsSearchRequirementComboBox.getItems().add(temp.getRequirements().get(i));
                }
                requirementsSearchRequirementComboBox.getSelectionModel().select(0);
            }
        }
        else if(e.getSource() == projectsVerifyTaskComboBox)
        {
            Project temp = projectsVerifyTaskComboBox.getSelectionModel().getSelectedItem();
            if (temp != null)
            {
                requirementsVerifyTaskComboBox.getItems().clear();
                for (int i = 0; i < temp.getRequirements().size(); i++)
                {
                    if(temp.getRequirements().get(i) instanceof FunctionalRequirement)
                        requirementsVerifyTaskComboBox.getItems().add(temp.getRequirements().get(i));
                }
                requirementsVerifyTaskComboBox.getSelectionModel().select(0);
            }
        }
        else if(e.getSource() == projectsVerifyFunctionalRequirementComboBox)
        {
            Project temp = projectsVerifyFunctionalRequirementComboBox.getSelectionModel().getSelectedItem();
            if (temp != null)
            {
                requirementsVerifyFunctionalRequirementComboBox.getItems().clear();
                for (int i = 0; i < temp.getRequirements().size(); i++)
                {
                    if(temp.getRequirements().get(i) instanceof FunctionalRequirement)
                        requirementsVerifyFunctionalRequirementComboBox.getItems().add(temp.getRequirements().get(i));
                }
                requirementsVerifyFunctionalRequirementComboBox.getSelectionModel().select(0);
            }
        }
        else if(e.getSource() == projectsVerifyNonFunctionalRequirementComboBox)
        {
            Project temp = projectsVerifyNonFunctionalRequirementComboBox.getSelectionModel().getSelectedItem();
            if (temp != null)
            {
                requirementsVerifyNonFunctionalRequirementComboBox.getItems().clear();
                for (int i = 0; i < temp.getRequirements().size(); i++)
                {
                    if(temp.getRequirements().get(i) instanceof NonFunctionalRequirement)
                        requirementsVerifyNonFunctionalRequirementComboBox.getItems().add(temp.getRequirements().get(i));
                }
                requirementsVerifyNonFunctionalRequirementComboBox.getSelectionModel().select(0);
            }
        }
        else if(e.getSource() == projectsReportActivityTaskComboBox)
        {
            Project temp = projectsReportActivityTaskComboBox.getSelectionModel().getSelectedItem();
            if (temp != null)
            {
                requirementsReportActivityTaskComboBox.getItems().clear();
                for (int i = 0; i < temp.getRequirements().size(); i++)
                {
                    if(temp.getRequirements().get(i) instanceof FunctionalRequirement)
                        requirementsReportActivityTaskComboBox.getItems().add(temp.getRequirements().get(i));
                }
                requirementsReportActivityTaskComboBox.getSelectionModel().select(0);
            }
        }
        else if(e.getSource() == projectsReportActivityNonFunctionalRequirementComboBox)
        {
            Project temp = projectsReportActivityNonFunctionalRequirementComboBox.getSelectionModel().getSelectedItem();
            if (temp != null)
            {
                requirementsReportActivityNonFunctionalRequirementComboBox.getItems().clear();
                for (int i = 0; i < temp.getRequirements().size(); i++)
                {
                    if(temp.getRequirements().get(i) instanceof NonFunctionalRequirement)
                        requirementsReportActivityNonFunctionalRequirementComboBox.getItems().
                                add(temp.getRequirements().get(i));
                }
                requirementsReportActivityNonFunctionalRequirementComboBox.getSelectionModel().select(0);
            }
        }
        else if(e.getSource() == projectsReportActivityFunctionalRequirementComboBox)
        {
            Project temp = projectsReportActivityFunctionalRequirementComboBox.getSelectionModel().getSelectedItem();
            if (temp != null)
            {
                requirementsReportActivityFunctionalRequirementComboBox.getItems().clear();
                for (int i = 0; i < temp.getRequirements().size(); i++)
                {
                    if(temp.getRequirements().get(i) instanceof FunctionalRequirement)
                        requirementsReportActivityFunctionalRequirementComboBox.getItems().
                                add(temp.getRequirements().get(i));
                }
                requirementsReportActivityFunctionalRequirementComboBox.getSelectionModel().select(0);
            }
        }
    }

    /**
     * A method called when an ActionEvent occur for the team members Combo Boxes
     * @param e the Action Event
     */

    public void handleTeamMembers(ActionEvent e)
    {
        if(e.getSource() == teamMembersScrumMasterComboBox)
        {
            teamMembersProductOwnerComboBox.getItems().
                    remove(teamMembersScrumMasterComboBox.getSelectionModel().getSelectedItem());
            teamMembersProjectCreatorComboBox.getItems().
                    remove(teamMembersScrumMasterComboBox.getSelectionModel().getSelectedItem());
        }
        else if(e.getSource() == teamMembersProductOwnerComboBox)
        {
            teamMembersProjectCreatorComboBox.getItems().
                    remove(teamMembersProductOwnerComboBox.getSelectionModel().getSelectedItem());
            teamMembersScrumMasterComboBox.getItems().
                    remove(teamMembersProductOwnerComboBox.getSelectionModel().getSelectedItem());
        }
        else if(e.getSource() == teamMembersProjectCreatorComboBox)
        {
            teamMembersProductOwnerComboBox.getItems().
                    remove(teamMembersProjectCreatorComboBox.getSelectionModel().getSelectedItem());
            teamMembersScrumMasterComboBox.getItems().
                    remove(teamMembersProjectCreatorComboBox.getSelectionModel().getSelectedItem());
        }
        else if(e.getSource() == projectsChangeRoleComboBox)
        {
            Project temp = projectsChangeRoleComboBox.getSelectionModel().getSelectedItem();
            if (temp != null)
            {
                teamMembersChangeRoleComboBox.getItems().clear();
                teamMembersChangeRoleComboBox.getItems().addAll(temp.getTeamMembers());
                teamMembersChangeRoleComboBox.getSelectionModel().select(0);
            }
        }
        else if(e.getSource() == requirementsReportActivityNonFunctionalRequirementComboBox)
        {
            NonFunctionalRequirement temp=(NonFunctionalRequirement)
                    requirementsReportActivityNonFunctionalRequirementComboBox.getSelectionModel().getSelectedItem();
            if (temp != null)
            {
                teamMembersReportActivityNonFunctionalRequirementComboBox.getItems().clear();
                teamMembersReportActivityNonFunctionalRequirementComboBox.getItems().addAll(temp.getTeamMembers());
            }
            teamMembersReportActivityNonFunctionalRequirementComboBox.getSelectionModel().select(0);
        }
        else if (e.getSource() == tasksReportActivityTaskComboBox)
        {
            Task temp = tasksReportActivityTaskComboBox.getSelectionModel().getSelectedItem();
            if (temp != null)
            {
                teamMembersReportActivityTaskComboBox.getItems().clear();
                teamMembersReportActivityTaskComboBox.getItems().addAll(temp.getTeamMembers());
            }
            teamMembersReportActivityTaskComboBox.getSelectionModel().select(0);
        }
        else if(e.getSource()==requirementsReorderRequirementsComboBox)
        {
            Project temp = projectsReorderRequirementsComboBox.
                    getSelectionModel().getSelectedItem();
            ArrayList<Requirement> requirements = temp.getRequirements();
            positionsReorderRequirementComboBox.getItems().clear();
            for (int i = 0; i < requirements.size(); i++)
            {
                positionsReorderRequirementComboBox.getItems().add(requirements.get(i).getRequirementID());
            }
            positionsReorderRequirementComboBox.getSelectionModel().select(0);
        }
    }
    /**
     * A method called when an ActionEvent occur for the tasks Combo Boxes
     * @param e the Action Event
     */

    public void handleTasks(ActionEvent e)
    {
        if(e.getSource() == requirementsAddTeamMemberToTaskComboBox)
        {
            FunctionalRequirement temp = (FunctionalRequirement)requirementsAddTeamMemberToTaskComboBox.
                    getSelectionModel().getSelectedItem();
            if (temp != null)
            {
                tasksAddTeamMemberToTaskComboBox.getItems().clear();
                tasksAddTeamMemberToTaskComboBox.getItems().addAll((temp.getTasks()));
                tasksAddTeamMemberToTaskComboBox.getSelectionModel().select(0);
            }
        }
        else if(e.getSource() == requirementsVerifyTaskComboBox)
        {
            FunctionalRequirement temp = (FunctionalRequirement)requirementsVerifyTaskComboBox.
                    getSelectionModel().getSelectedItem();
            if (temp != null)
            {
                tasksVerifyTaskComboBox.getItems().clear();
                tasksVerifyTaskComboBox.getItems().addAll((temp.getTasks()));
                tasksVerifyTaskComboBox.getSelectionModel().select(0);
            }
        }
        else if(e.getSource() == requirementsReportActivityTaskComboBox)
        {
            FunctionalRequirement temp = (FunctionalRequirement)requirementsReportActivityTaskComboBox.
                    getSelectionModel().getSelectedItem();
            if (temp != null)
            {
                tasksReportActivityTaskComboBox.getItems().clear();
                tasksReportActivityTaskComboBox.getItems().addAll((temp.getTasks()));
            }
            tasksReportActivityTaskComboBox.getSelectionModel().select(0);
        }
    }
    /**
     * A method called when an ActionEvent occur for a Button
     * @param e the Action Event
     */

    public void handleButtons(ActionEvent e)
    {
        ManagementSystem managementSystem = fileAdapter.loadManagementSystem();
        if(e.getSource() == addProjectButton)
        {
            try
            {
                Date deadline = new Date(Integer.parseInt(dayAddProjectTextField.getText()),
                    Integer.parseInt(monthAddProjectTextField.getText()),
                    Integer.parseInt(yearAddProjectTextField.getText()));
                managementSystem.addProject(deadline, teamMembersScrumMasterComboBox.getValue(),
                    teamMembersProductOwnerComboBox.getValue(), teamMembersProjectCreatorComboBox.getValue());
                fileAdapter.saveManagementSystem(managementSystem);
                update();
            }
            catch (IllegalArgumentException f)
            {
                Alert alert=new Alert(Alert.AlertType.ERROR,"You have entered an invalid date!\nPlease enter a new date!",ButtonType.OK);
                alert.setTitle("Invalid date");
                alert.setHeaderText(null);
                alert.showAndWait();
            }

        }
        else if(e.getSource()==addFunctionalRequirementButton)
        {
            try
            {
                Date deadline=new Date(Integer.parseInt(dayAddFunctionalRequirementTextField.getText()),
                    Integer.parseInt(monthAddFunctionalRequirementTextField.getText()),
                    Integer.parseInt(yearAddFunctionalRequirementTextField.getText()));
                managementSystem.getProjects().get(projectsAddFunctionalRequirementComboBox.getSelectionModel().getSelectedIndex()).
                    addFunctionalReq(estimateTimeFunctionalRequirementTextField.getText(),deadline,teamMembersResponsibleAddFunctionalRequirementComboBox.
                        getSelectionModel().getSelectedItem(),userStoryTextField.getText());
                fileAdapter.saveManagementSystem(managementSystem);
                update();
                dayAddFunctionalRequirementTextField.setText("");
                monthAddFunctionalRequirementTextField.setText("");
                yearAddFunctionalRequirementTextField.setText("");
                userStoryTextField.setText("");
                estimateTimeFunctionalRequirementTextField.setText("");
            }
            catch(IllegalArgumentException b)
            {
                Alert alert=new Alert(Alert.AlertType.ERROR,"You have entered an invalid date!\nPlease enter a new date!",ButtonType.OK);
                alert.setTitle("Invalid date");
                alert.setHeaderText(null);
                alert.showAndWait();
            }

        }
        else if(e.getSource()== addNonFunctionalRequirementButton)
        {
            try
            {
                Date deadline=new Date(Integer.parseInt(dayAddNonFunctionalRequirementTextField.getText()),
                    Integer.parseInt(monthAddNonFunctionalRequirementTextField.getText()),
                    Integer.parseInt(yearAddNonFunctionalRequirementTextField.getText()));
                managementSystem.getProjects().get(projectsAddNonFunctionalRequirementComboBox.getSelectionModel().getSelectedIndex()).
                    addNonFunctionalReq(estimateTimeNonFunctionalRequirementTextField.getText(),deadline,teamMembersResponsibleAddNonFunctionalRequirementComboBox.
                        getSelectionModel().getSelectedItem(),descriptionTextField.getText());
                fileAdapter.saveManagementSystem(managementSystem);
                update();
                descriptionTextField.setText("");
                dayAddNonFunctionalRequirementTextField.setText("");
                monthAddNonFunctionalRequirementTextField.setText("");
                yearAddNonFunctionalRequirementTextField.setText("");
                estimateTimeNonFunctionalRequirementTextField.setText("");
            }
            catch (IllegalArgumentException k)
            {
                Alert alert=new Alert(Alert.AlertType.ERROR,"You have entered an invalid date!\nPlease enter a new date!",ButtonType.OK);
                alert.setTitle("Invalid date");
                alert.setHeaderText(null);
                alert.showAndWait();
            }

        }
        else if(e.getSource()==addTaskButton)
        {
            try
            {
                Date deadline = new Date(Integer.parseInt(dayAddTaskTextField.getText()),
                    Integer.parseInt(monthAddTaskTextField.getText()), Integer.parseInt(yearAddTaskTextField.getText()));
                FunctionalRequirement temp=(FunctionalRequirement)managementSystem.getProjects().get(projectsAddTaskComboBox.getSelectionModel()
                    .getSelectedIndex()).getRequirements().get(requirementsAddTaskComboBox.getSelectionModel().getSelectedIndex());
                temp.addTask(titleAddTaskTextField.getText(),estimateTimeAddTaskTextField.getText(),deadline,teamMembersResponsibleAddTaskComboBox.getSelectionModel().
                    getSelectedItem(),requirementsAddTaskComboBox.getSelectionModel().getSelectedItem().getRequirementID());
                fileAdapter.saveManagementSystem(managementSystem);
                update();
                titleAddTaskTextField.setText("");
                estimateTimeAddTaskTextField.setText("");
                dayAddTaskTextField.setText("");
                monthAddTaskTextField.setText("");
                yearAddTaskTextField.setText("");
            }
            catch (IllegalArgumentException h)
            {
                Alert alert=new Alert(Alert.AlertType.ERROR,"You have entered an invalid date!\nPlease enter a new date!",ButtonType.OK);
                alert.setTitle("Invalid date");
                alert.setHeaderText(null);
                alert.showAndWait();
            }
        }
        else if(e.getSource() == addNewTeamMemberButton)
        {
            String name1 = nameTextField.getText();
            String email1 =emailTextField.getText();
            TeamMember teamMember = new TeamMember(email1, name1);
            managementSystem.addTeamMember(teamMember);
            fileAdapter.saveManagementSystem(managementSystem);
            update();
            nameTextField.setText("");
            emailTextField.setText("");
        }
        else if (e.getSource() == saveChangeRoleButton)
        {
            managementSystem.changeRole(projectsChangeRoleComboBox.getSelectionModel().getSelectedItem().getProjectID(),
                    teamMembersChangeRoleComboBox.getValue(), roles.getSelectionModel().getSelectedItem());
            fileAdapter.saveManagementSystem(managementSystem);
            update();
        }
        else if(e.getSource() == teamMembersSearchEmployeeComboBox)
        {
            projectsTextArea.clear();
            for (int i=0; i<managementSystem.getProjects().size(); i++)
            {
                if (managementSystem.getProjects().get(i).getTeamMembers().contains(teamMembersSearchEmployeeComboBox.getSelectionModel().getSelectedItem()))
                {
                    projectsTextArea.setText(projectsTextArea.getText()+"Project ID: "+managementSystem.getProjects().get(i).getProjectID()+
                            ", Deadline: " + managementSystem.getProjects().get(i).getDeadline().toString()+
                            ", Status: " +managementSystem.getProjects().get(i).getStatus() +
                            ", Hours worked: "  + managementSystem.getProjects().get(i).getHoursWorked()+ "\n");
                }
            }
        }
        else if(e.getSource() == addTeamMemberToProjectButton)
        {
            TeamMember tm1 = teamMembersAddTeamMemberToProjectComboBox.getSelectionModel().getSelectedItem();
            managementSystem.getProjects().get(projectsAddTeamMemberToProjectComboBox.getSelectionModel().getSelectedItem().getProjectID()).addTeamMember(tm1);
            fileAdapter.saveManagementSystem(managementSystem);
            update();
        }
        else if(e.getSource() == addTeamMemberToRequirementButton)
        {
            TeamMember tm2 = teamMembersAddTeamMemberToRequirementComboBox.getSelectionModel().getSelectedItem();

            for (int i = 0; i < managementSystem.getProjects().get(projectsAddTeamMemberToRequirementComboBox.
                    getSelectionModel().getSelectedItem().getProjectID()).
                    getRequirements().size(); i++)
            {
                if(managementSystem.getProjects().get(projectsAddTeamMemberToRequirementComboBox.
                        getSelectionModel().getSelectedItem().getProjectID()).
                        getRequirements().get(i).getRequirementID() == requirementsAddTeamMemberToRequirementComboBox.
                        getSelectionModel().getSelectedItem().getRequirementID())
                {
                    managementSystem.getProjects().get(projectsAddTeamMemberToRequirementComboBox.
                            getSelectionModel().getSelectedItem().getProjectID()).
                            getRequirements().get(i).addTeamMember(tm2);
                }

            }
            fileAdapter.saveManagementSystem(managementSystem);
            update();
        }
        else if(e.getSource() == approveTaskButton)
        {
            FunctionalRequirement temp = (FunctionalRequirement) managementSystem.
                    getRequirement(projectsVerifyTaskComboBox.getSelectionModel().getSelectedItem().getProjectID(),
                            requirementsVerifyTaskComboBox.getSelectionModel().getSelectedItem().getRequirementID());
            temp.getTasks().get(tasksVerifyTaskComboBox.getSelectionModel().
                    getSelectedItem().getTaskID()).setStatus("Approved");
            fileAdapter.saveManagementSystem(managementSystem);
            tasksVerifyTaskComboBox.getItems().clear();
            update();
        }
        else if(e.getSource() == rejectTaskButton)
        {
            FunctionalRequirement temp = (FunctionalRequirement) managementSystem.
                    getRequirement(projectsVerifyTaskComboBox.getSelectionModel().getSelectedItem().getProjectID(),
                            requirementsVerifyTaskComboBox.getSelectionModel().getSelectedItem().getRequirementID());
            temp.getTasks().get(tasksVerifyTaskComboBox.getSelectionModel().
                    getSelectedItem().getTaskID()).setStatus("Rejected");
            fileAdapter.saveManagementSystem(managementSystem);
            tasksVerifyTaskComboBox.getItems().clear();
            update();
        }
        else if (e.getSource() == approveNonFunctionalRequirementButton)
        {
            managementSystem.getRequirement(projectsVerifyNonFunctionalRequirementComboBox.getSelectionModel().
                            getSelectedItem().getProjectID(),
                    requirementsVerifyNonFunctionalRequirementComboBox.getSelectionModel().getSelectedItem().
                            getRequirementID()).setStatus("Approved");
            fileAdapter.saveManagementSystem(managementSystem);
            requirementsVerifyNonFunctionalRequirementComboBox.getItems().clear();
            update();
            Project temp = projectsVerifyNonFunctionalRequirementComboBox.getSelectionModel().getSelectedItem();
            for (int i = 0; i < temp.getRequirements().size(); i++)
            {
                if(temp.getRequirements().get(i) instanceof NonFunctionalRequirement)
                    requirementsVerifyNonFunctionalRequirementComboBox.getItems().add(temp.getRequirements().get(i));
            }
            requirementsVerifyNonFunctionalRequirementComboBox.getSelectionModel().select(0);
        }
        else if (e.getSource() == rejectNonFunctionalRequirementButton)
        {
            managementSystem.getRequirement(projectsVerifyNonFunctionalRequirementComboBox.
                            getSelectionModel().getSelectedItem().getProjectID(),
                    requirementsVerifyNonFunctionalRequirementComboBox.getSelectionModel().getSelectedItem().
                                    getRequirementID()).setStatus("Rejected");
            fileAdapter.saveManagementSystem(managementSystem);
            requirementsVerifyNonFunctionalRequirementComboBox.getItems().clear();
            update();
            Project temp = projectsVerifyNonFunctionalRequirementComboBox.getSelectionModel().getSelectedItem();
            for (int i = 0; i < temp.getRequirements().size(); i++)
            {
                if(temp.getRequirements().get(i) instanceof NonFunctionalRequirement)
                    requirementsVerifyNonFunctionalRequirementComboBox.getItems().add(temp.getRequirements().get(i));
            }
            requirementsVerifyNonFunctionalRequirementComboBox.getSelectionModel().select(0);
        }
        else if(e.getSource() == addTeamMemberToTaskButton)
        {
            TeamMember tm3 = teamMembersAddTeamMemberToTaskComboBox.getSelectionModel().getSelectedItem();

            for (int i = 0; i < managementSystem.getProjects().get(projectsAddTeamMemberToTaskComboBox.
                    getSelectionModel().getSelectedItem().getProjectID()).getRequirements().size(); i++)
            {
                if(managementSystem.getProjects().get(projectsAddTeamMemberToTaskComboBox.
                        getSelectionModel().getSelectedItem().getProjectID()).
                        getRequirements().get(i).getRequirementID() == requirementsAddTeamMemberToTaskComboBox.
                        getSelectionModel().getSelectedItem().getRequirementID())
                {
                    FunctionalRequirement functionalRequirement = (FunctionalRequirement)managementSystem.getRequirement(projectsAddTeamMemberToTaskComboBox.
                            getSelectionModel().getSelectedItem().getProjectID(), requirementsAddTeamMemberToTaskComboBox.
                            getSelectionModel().getSelectedItem().getRequirementID());
                    for (int j = 0; j < functionalRequirement.getTasks().size(); j++)
                    {
                        if(functionalRequirement.getTasks().get(j).getTaskID() ==
                                tasksAddTeamMemberToTaskComboBox.getSelectionModel().getSelectedItem().getTaskID())
                        {
                            functionalRequirement.getTasks().get(j).addTeamMember(tm3);
                        }
                    }
                }
            }
            fileAdapter.saveManagementSystem(managementSystem);
            update();
        }
        else if(e.getSource()==verifyFunctionalRequirementButton)
        {
            Project temp=managementSystem.getProjects().
                    get(projectsVerifyFunctionalRequirementComboBox.getSelectionModel().getSelectedIndex());
            FunctionalRequirement requirement=(FunctionalRequirement) temp.getRequirements().
                    get(requirementsVerifyFunctionalRequirementComboBox.getSelectionModel().getSelectedIndex());
            requirement.verifyRequirement();
            fileAdapter.saveManagementSystem(managementSystem);
            update();
            requirementsVerifyFunctionalRequirementComboBox.getItems().clear();
            for (int i = 0; i < temp.getRequirements().size(); i++)
            {
                if(temp.getRequirements().get(i) instanceof FunctionalRequirement)
                    requirementsVerifyFunctionalRequirementComboBox.getItems().add(temp.getRequirements().get(i));
            }
            requirementsVerifyFunctionalRequirementComboBox.getSelectionModel().select(0);
        }
        else if (e.getSource() == verifyProjectButton)
        {
            managementSystem.getProjects().get(projectsVerifyComboBox.
                    getSelectionModel().getSelectedItem().getProjectID()).verifyProject();
            fileAdapter.saveManagementSystem(managementSystem);
            update();
            clearProjects();
            updateProjects();
        }
        else if(e.getSource()==saveReorderButton)
        {
            int projectID=projectsReorderRequirementsComboBox.getSelectionModel().getSelectedItem().getProjectID();
            Requirement requirement=requirementsReorderRequirementsComboBox.getSelectionModel().getSelectedItem();
            managementSystem.getProjects().get(projectID).reorderRequirements(requirement.getRequirementID(),
                    (int)positionsReorderRequirementComboBox.getSelectionModel().getSelectedItem());
            fileAdapter.saveManagementSystem(managementSystem);
            update();
            requirementsReorderRequirementsComboBox.getItems().clear();
            requirementsReorderRequirementsComboBox.getItems().addAll(projectsReorderRequirementsComboBox.
                    getSelectionModel().getSelectedItem().getRequirements());
            requirementsReorderRequirementsComboBox.getSelectionModel().select(0);
        }
        else if(e.getSource()==removeButton)
        {
            Project project=projectsRemoveRequirementsComboBox.getSelectionModel().getSelectedItem();
            int requirementID=requirementsRemoveRequirementsComboBox.getSelectionModel().getSelectedItem().getRequirementID();
            managementSystem.getProjects().get(projectsRemoveRequirementsComboBox.getSelectionModel().getSelectedIndex()).removeRequirement(requirementID);
            fileAdapter.saveManagementSystem(managementSystem);
            update();
            requirementsRemoveRequirementsComboBox.getItems().clear();
            requirementsRemoveRequirementsComboBox.getItems().addAll(project.getRequirements());
            requirementsRemoveRequirementsComboBox.getSelectionModel().select(0);
        }
        else if (e.getSource() == projectsSearchProjectComboBox)
        {
            if (projectsSearchProjectComboBox.getSelectionModel().getSelectedItem() != null)
            {
                requirementsTextArea.clear();
                for (int i=0; i<managementSystem.getProjects().size(); i++)
                {
                    if (managementSystem.getProjects().get(i).getProjectID() == projectsSearchProjectComboBox.getSelectionModel().getSelectedItem().getProjectID() )
                    {
                        for (int b=0; b<managementSystem.getProjects().get(i).getRequirements().size(); b++)
                        {
                            requirementsTextArea.setText(requirementsTextArea.getText()+"Requirement ID: "+managementSystem.getProjects().get(i).getRequirements().get(b).getRequirementID()+
                                    ", Status: "+managementSystem.getProjects().get(i).getRequirements().get(b).getStatus()+", Estimated time: "+managementSystem.getProjects().get(i).getRequirements().get(b).getEstimatedTime()+
                                    ", Deadline: "+managementSystem.getProjects().get(i).getRequirements().get(b).getDeadline()+", Hours worked: "+managementSystem.getProjects().get(i).getRequirements().get(b).getHoursWorked()+"\n");
                        }
                    }
                }
            }
        }
        else if (e.getSource() == requirementsSearchRequirementComboBox)
        {
            if ((projectsSearchRequirementComboBox.getSelectionModel().getSelectedItem() != null) && (
                    requirementsSearchRequirementComboBox.getSelectionModel().getSelectedItem() != null))
            {
                tasksAreaTextArea.clear();
                for (int i = 0; i < managementSystem.getProjects().get(projectsSearchRequirementComboBox.
                        getSelectionModel().getSelectedItem().getProjectID()).getRequirements().size(); i++)
                {
                    if(managementSystem.getProjects().get(projectsSearchRequirementComboBox.
                            getSelectionModel().getSelectedItem().getProjectID()).
                            getRequirements().get(i).getRequirementID() == requirementsSearchRequirementComboBox.
                            getSelectionModel().getSelectedItem().getRequirementID())
                    {
                        FunctionalRequirement functionalRequirement = (FunctionalRequirement)managementSystem.getRequirement(projectsSearchRequirementComboBox.
                                getSelectionModel().getSelectedItem().getProjectID(), requirementsSearchRequirementComboBox.
                                getSelectionModel().getSelectedItem().getRequirementID());

                        for (int j = 0; j < functionalRequirement.getTasks().size(); j++)
                        {
                            tasksAreaTextArea.setText(tasksAreaTextArea.getText()+"TaskId: "+functionalRequirement.getTasks().get(j).getTaskID()+
                                    ", Status: "+functionalRequirement.getTasks().get(j).getStatus()+", Estimated time: "+functionalRequirement.getTasks().get(j).getEstimateTime()+
                                    ", Deadline: "+functionalRequirement.getTasks().get(j).getDeadline()+", Hours worked: "+functionalRequirement.getTasks().get(j).getTotalHoursWorked()+"\n");
                        }
                    }
                }
            }
        }
        else if(e.getSource() == reportTaskButton)
        {
            TeamMember tm4 = teamMembersReportActivityTaskComboBox.getSelectionModel().getSelectedItem();
            double hours = Double.parseDouble(hoursWorkedReportActivityTaskTextField.getText());

            for (int i = 0; i < managementSystem.getProjects().get(projectsReportActivityTaskComboBox.
                    getSelectionModel().getSelectedItem().getProjectID()).getRequirements().size(); i++)
            {
                if(managementSystem.getProjects().get(projectsReportActivityTaskComboBox.
                        getSelectionModel().getSelectedItem().getProjectID()).
                        getRequirements().get(i).getRequirementID() == requirementsReportActivityTaskComboBox.
                        getSelectionModel().getSelectedItem().getRequirementID())
                {
                    FunctionalRequirement functionalRequirement = (FunctionalRequirement)managementSystem.getRequirement(projectsReportActivityTaskComboBox.
                            getSelectionModel().getSelectedItem().getProjectID(), requirementsReportActivityTaskComboBox.
                            getSelectionModel().getSelectedItem().getRequirementID());
                    for (int j = 0; j < functionalRequirement.getTasks().size(); j++)
                    {
                        if(functionalRequirement.getTasks().get(j).getTaskID() ==
                                tasksReportActivityTaskComboBox.getSelectionModel().getSelectedItem().getTaskID())
                        {
                            managementSystem.reportMyTaskActivity(projectsReportActivityTaskComboBox.
                                            getSelectionModel().getSelectedItem().getProjectID(),requirementsReportActivityTaskComboBox.
                                            getSelectionModel().getSelectedItem().getRequirementID(),
                                    tasksReportActivityTaskComboBox.getSelectionModel().getSelectedItem().getTaskID(),hours,tm4);
                            if(endedTaskReportActivityTaskCheckBox.isSelected())
                            {
                                ((FunctionalRequirement) managementSystem.getRequirement(projectsReportActivityTaskComboBox.
                                        getSelectionModel().getSelectedItem().getProjectID(),requirementsReportActivityTaskComboBox.
                                        getSelectionModel().getSelectedItem().getRequirementID())).getTasks().
                                        get(tasksReportActivityTaskComboBox.getSelectionModel().getSelectedItem().getTaskID()).setStatus("Ended");
                            }
                        }
                    }
                }
            }
            fileAdapter.saveManagementSystem(managementSystem);
            update();
            Project temp = projectsReportActivityTaskComboBox.getSelectionModel().getSelectedItem();
            for (int i = 0; i < temp.getRequirements().size(); i++)
            {
                if(temp.getRequirements().get(i) instanceof FunctionalRequirement)
                    requirementsReportActivityTaskComboBox.getItems().add(temp.getRequirements().get(i));
            }
            requirementsReportActivityTaskComboBox.getSelectionModel().select(0);
            hoursWorkedReportActivityTaskTextField.setText("");
        }
        else if(e.getSource() == reportNonFunctionalRequirementButton)
        {
            TeamMember tm5 = teamMembersReportActivityNonFunctionalRequirementComboBox.getSelectionModel().getSelectedItem();
            double hours2 = Double.parseDouble(hoursWorkedReportActivityNonFunctionalRequirementTextField.getText());

            for (int i = 0; i < managementSystem.getProjects().get(projectsReportActivityNonFunctionalRequirementComboBox.
                    getSelectionModel().getSelectedItem().getProjectID()).getRequirements().size(); i++)
            {
                if(managementSystem.getProjects().get(projectsReportActivityNonFunctionalRequirementComboBox.
                        getSelectionModel().getSelectedItem().getProjectID()).
                        getRequirements().get(i).getRequirementID() == requirementsReportActivityNonFunctionalRequirementComboBox.
                        getSelectionModel().getSelectedItem().getRequirementID())
                {
                    managementSystem.reportMyNFActivity(projectsReportActivityNonFunctionalRequirementComboBox.
                            getSelectionModel().getSelectedItem().getProjectID(),requirementsReportActivityNonFunctionalRequirementComboBox.
                            getSelectionModel().getSelectedItem().getRequirementID(),hours2,tm5);

                    if(endedNonFunctionalRequirementReportActivityCheckBox.isSelected())
                    {
                        managementSystem.getRequirement(projectsReportActivityNonFunctionalRequirementComboBox.
                                getSelectionModel().getSelectedItem().getProjectID(),requirementsReportActivityNonFunctionalRequirementComboBox.
                                getSelectionModel().getSelectedItem().getRequirementID()).setStatus("Ended");
                    }
                }
            }
            fileAdapter.saveManagementSystem(managementSystem);
            update();
            hoursWorkedReportActivityNonFunctionalRequirementTextField.setText("");
            Project temp = projectsReportActivityNonFunctionalRequirementComboBox.getSelectionModel().getSelectedItem();
            requirementsReportActivityNonFunctionalRequirementComboBox.getItems().clear();
            for (int i = 0; i < temp.getRequirements().size(); i++)
            {
                if(temp.getRequirements().get(i) instanceof NonFunctionalRequirement)
                    requirementsReportActivityNonFunctionalRequirementComboBox.getItems().
                            add(temp.getRequirements().get(i));
            }
            requirementsReportActivityNonFunctionalRequirementComboBox.getSelectionModel().select(0);
            NonFunctionalRequirement temp1=(NonFunctionalRequirement)
                    requirementsReportActivityNonFunctionalRequirementComboBox.getSelectionModel().getSelectedItem();
            if (temp1 != null)
            {
                teamMembersReportActivityNonFunctionalRequirementComboBox.getItems().clear();
                teamMembersReportActivityNonFunctionalRequirementComboBox.getItems().addAll(temp1.getTeamMembers());
            }
            teamMembersReportActivityNonFunctionalRequirementComboBox.getSelectionModel().select(0);
        }
        else if (e.getSource()==reportFunctionalRequirementButton)
        {
            FunctionalRequirement temp = (FunctionalRequirement)
                    managementSystem.getRequirement(projectsReportActivityFunctionalRequirementComboBox.getSelectionModel().
                            getSelectedItem().getProjectID(), requirementsReportActivityFunctionalRequirementComboBox.
                            getSelectionModel().getSelectedItem().getRequirementID());
            temp.setTotalHoursWorked();
            fileAdapter.saveManagementSystem(managementSystem);
            update();
            Project temp1 = projectsReportActivityFunctionalRequirementComboBox.getSelectionModel().getSelectedItem();
            if (temp1 != null)
            {
                requirementsReportActivityFunctionalRequirementComboBox.getItems().clear();
                for (int i = 0; i < temp1.getRequirements().size(); i++)
                {
                    if(temp1.getRequirements().get(i) instanceof FunctionalRequirement)
                        requirementsReportActivityFunctionalRequirementComboBox.getItems().
                                add(temp1.getRequirements().get(i));
                }
                requirementsReportActivityFunctionalRequirementComboBox.getSelectionModel().select(0);
            }
        }
        else if (e.getSource() == reportProjectButton)
        {
            for (int i=0; i<managementSystem.getProjects().size(); i++)
            {
                if (projectsReportActivityProjectComboBox.getSelectionModel().getSelectedItem().getProjectID() ==managementSystem.getProjects().get(i).getProjectID())
                {
                    managementSystem.getProjects().get(i).setHoursWorked();
                }
            }
            fileAdapter.saveManagementSystem(managementSystem);
            update();
        }
    }

    /**
     * A method that export all the information for the website
     * @param e the Action Event
     */


   /* public void handleWebsite(ActionEvent e)
    {
        ManagementSystem managementSystem = fileAdapter.loadManagementSystem();

        if (e.getSource() == exportButton)
        {
            update();

            XmlJsonParser parser = new XmlJsonParser();

            try
            {
                parser.toXml(managementSystem, "systemFile.xml");
            }
            catch (ParserException parserException)
            {
                parserException.printStackTrace();
            }


        }
    }*/
}

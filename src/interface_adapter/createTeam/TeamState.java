package interface_adapter.createTeam;

public class TeamState
{
    String addTeamNameInput;

    String addMemberNameInput;

    private boolean isCreateTeamFailed;
    private boolean isAddTeamMemberFailed;

    public TeamState()
    {
        addTeamNameInput = "";
        addMemberNameInput = "";
        isCreateTeamFailed = false;
        isAddTeamMemberFailed = false;
    }


    public boolean getIsCreateTeamFailed()
    {
        return isCreateTeamFailed;
    }

    public void setIsCreateTeamFailed(boolean isCreateTeamFailed)
    {
        this.isCreateTeamFailed = isCreateTeamFailed;
    }

    public String getAddTeamNameInput()
    {
        return addTeamNameInput;
    }

    public void setAddTeamNameInput(String name)
    {
        addTeamNameInput = name;
    }

    public String getAddMemberNameInput()
    {
        return addMemberNameInput;
    }

    public void setAddMemberNameInput(String name)
    {
        addMemberNameInput = name;
    }

    public boolean getIsAddTeamMemberFailed()
    {
        return isAddTeamMemberFailed;
    }

    public void setIsAddTeamMemberFailed(boolean status)
    {
        isAddTeamMemberFailed = status;
    }

}

package FootballApplication;

public class Goal {
    public Team theTeam;
    public Player thePlayer;
    public double theTime;

    public Goal() {
    }

    public Goal(Team theTeam, Player thePlayer, double theTime) {
        this.theTeam = theTeam;
        this.thePlayer = thePlayer;
        this.theTime = theTime;
    }

    public Team getTheTeam() {
        return theTeam;
    }

    public void setTheTeam(Team theTeam) {
        this.theTeam = theTeam;
    }

    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }

    public double getTheTime() {
        return theTime;
    }

    public void setTheTime(double theTime) {
        this.theTime = theTime;
    }
}

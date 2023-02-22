package FootballApplication;

public class League {
    public static void main(String[]args){
        //ToDo code app logic here

        //1. Instantiate a number of Player objects to play games

        Player player1 = new Player();                               //Empty constructor
        player1.playerName = "George Eliot";

        Player player2 = new Player("Grahan Greene");      //Regular constructor

        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";


        //1.1 Create a Player array called thePlayers that comprises the three Player objects.

        Player[] thePlayers = { player1, player2, player3};

        //1.2 Declare and instantiate a Team object;

        Team team1 = new Team();

        //1.3 Set the teamName attribute of the Team object to "The Greens"

        team1.teamName = "The Greens";

        //1.4 Set the playerArray attribute of the Team object to the Player array thePlayers

        team1.playerArray = thePlayers;

        //1.5 Print out the players in the team "The Greens"

        for(Player thePlayer: team1.playerArray) {
            System.out.println(thePlayer.playerName);
        }

        //1.6 Now create a second team with the reference team2

        Team team2 = new Team();
        team2.teamName = "The Reds";

        //1.7 Create a three-element Player array and assign it to the playerArray reference of
        //the Team object that you just created.

        team2.playerArray = new Player[3];

        //1.8 Add a player named "Robert Service" to the first element of playerArray

        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";

        //1.9 Add two new Player objects with playerName attributes and add them to the 2º and 3º elements of the array

        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";

        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";

        //1.10 Copy the first loop to get the names of the players on team2

        for(Player thePlayer: team1.playerArray) {
            System.out.println(thePlayer.playerName);
        }

        //2. Create a Game and populate the homeTeam and awayTeam attributes

        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;

        //2.1 Create a Goal object to give the home team a 1–0 lead. Then, a 2-0.

        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[2];          //player3 is who scored the goal
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 55;

        Goal goal2 = new Goal(currGame.homeTeam,currGame.homeTeam.playerArray[0], 77);

        //2.2 Put this Goal object in a Goal array, and then assign this Goal array to the goals
        //attribute of the Game object.

        Goal[] theGoals = {goal1, goal2};
        currGame.goals = theGoals;

        //2.3 Print out the score of the game (if there was more than one goal, you would need to
        //use a loop)

        System.out.println("Goal scored after " +
                currGame.goals[0].theTime + " mins by " +
                currGame.goals[0].thePlayer.playerName + " of " +
                currGame.goals[0].theTeam.teamName);

        //Loop

        for(Goal MatchGoals : currGame.goals) {
            System.out.println("Goal scored after " +
                    MatchGoals.theTime + " mins by " +
                    MatchGoals.thePlayer.playerName + " of " +
                    MatchGoals.theTeam.teamName);;
        }
    }
}

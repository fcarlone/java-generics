public class Main {

    public static void main(String[] args) {
        System.out.println("Sports League Generics Challenge\n");

        League<Team<FootballPlayer>> footballLeague = new League<>("NFL");
        Team<FootballPlayer> giants = new Team<>("Giants");
        Team<FootballPlayer> eagles = new Team<>("Eagles");
        Team<FootballPlayer> washington = new Team<>("Washington");
        Team<FootballPlayer> dallas = new Team<>("Dallas");

        footballLeague.addTeam(giants);
        footballLeague.addTeam(eagles);
        footballLeague.addTeam(washington);
        footballLeague.addTeam(dallas);

        giants.matchResult(eagles, 20, 3);
        giants.matchResult(washington, 30, 9);
        eagles.matchResult(dallas, 20, 9);
        dallas.matchResult(washington, 30, 2);

        footballLeague.showLeagueTable();
    }
}

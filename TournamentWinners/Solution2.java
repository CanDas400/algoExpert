import java.util.*;

class Program {

  public String tournamentWinner(
    ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
		String currentBestTeam = "";
    Hashtable<String, Integer> winners = new Hashtable<>();
		winners.put(currentBestTeam, 0);
	
		for(int i = 0; i < competitions.size(); i++){
			  ArrayList<String> competiton = competitions.get(i);
			  String homeTeam =  competiton.get(0);
			  String awayTeam = competiton.get(1);
			
		    int result = results.get(i);
			  String winningTeam = (result == 0) ? awayTeam : homeTeam;
			 
			  if(!winners.containsKey(winningTeam)){
					winners.put(winningTeam, 0);
				}
			  winners.put(winningTeam, winners.get(winningTeam) + 3);
			  
			  if(winners.get(winningTeam) > winners.get(currentBestTeam)){
					 currentBestTeam= winningTeam;
				}
		}
		
     return currentBestTeam;
  }
}

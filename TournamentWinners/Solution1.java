import java.util.*;

class Program {

  public String tournamentWinner(
    ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    TreeMap<String, Integer> winners = new TreeMap<>();
		int counter = 0;
		for(ArrayList<String> array: competitions){
			  String homeTeam =  array.get(0);
			  String awayTeam = array.get(1);
				Integer currentResult = null;
			  if(results.get(counter)  == 0){
					 currentResult = winners.get(awayTeam);
					 if(currentResult == null){
						 currentResult = 0;
					 }
					 winners.put(awayTeam, currentResult + 3);
				} else {
					 currentResult = winners.get(homeTeam);
					 if(currentResult == null){
						 currentResult = 0;
					 }
					 winners.put(homeTeam, currentResult + 3);
				}
			  counter++;
		}
		
		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
     winners.entrySet()
      .stream()
      .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

		 System.out.println(sortedMap);
     return sortedMap.keySet().stream().findFirst().get();
  }
}

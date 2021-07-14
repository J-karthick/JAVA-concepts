 import java.util.regex.Pattern;
 import java.util.regex.Matcher;
 import java.util.*;
 
 class movie{
	 
	 void mname() throws MovieFormatException, MovieDataIncompleteException{
		 Scanner s = new Scanner(System.in);
		 String input;
		 String regex ="[A-Z][a-z]*\\s*[A-Z a-z]*[0-9]*:\\d{1,4}+";
		 String regexYear = "[A-Z][a-z]*\\s*[A-Z a-z]*";
		 String regexCap = "[a-z]*\\s*[A-Z a-z]*[0-9]*:\\d{1,4}+";

		 
		 String temp="";

		 
		 String[] movies = new String[5];
		 
		 System.out.println("\nEnter the Movie name in the given format : Jurassic Park1:1993\n");
		 
		 for(int i=0; i<5; i++){
			System.out.println("Movie " + (i+1) +" : " );
			input = s.nextLine();
			movies[i] = input;
					 
			boolean matchesName = false;
			boolean matchesYear = false;
			boolean matchesCap = false;
				 
			matchesName = Pattern.matches(regex, input);
			matchesYear = Pattern.matches(regexYear, input);
			matchesCap = Pattern.matches(regexCap, input);

			if(matchesName){
				System.out.println("");
			}
			else if(matchesYear){
				throw new MovieDataIncompleteException("Error....Movie Year Missing");
			}
			else if(matchesCap){	
				throw new MovieFormatException("Error....Enter the Movie Name in the given format(Capitalize the First Letter)");
			}
			else{
				System.out.println("Enter the valid detail...");
			}	 
		 }
		 		System.out.println("\nunsorted" + Arrays.toString(movies));  
				
				System.out.println("\nSorting the String in Ascending Order...");  
				Arrays.sort(movies);
				for(int a=0; a<5; a++){
					System.out.println("Movie "+(a+1)+" : "+movies[a]);
				}
	 }
			 public static void main(String[] arg){
				 System.out.println("\n17MIS0207 - J.KARTHICK"); 
			 try{
				 movie mo = new movie();
				 mo.mname();
				 }
			 catch(MovieFormatException m){
				 System.out.println(m);
				 }
				 catch(MovieDataIncompleteException y){
					 System.out.println(y);
				 }
		 }
		 }
		 
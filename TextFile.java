import java.io.*;
class TextFile{

public static void main(String[] arg) throws Exception{

System.out.println("\n 17MIS0207 - J.KARTHICK \n");
//FileReader f= new FileReader("C:\\Users\\HP\\Desktop\\TextFile.txt");

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

String s=" The domestic and the international terminals are named after former chief ministers of Tamil Nadu K. Kamaraj and C. N. Annadurai, respectively. It was the first airport in India to have international and domestic terminals located adjacent to each other. The airport serves as the regional headquarters of the Airports Authority of India (AAI) for South India comprising the states of Tamil Nadu, Andhra Pradesh, Telangana, Karnataka, and Kerala and the union territories of Puducherry and Lakshadweep.\n";


System.out.println(s);


String p1= s.replace("\s" ,"1");
System.out.println(p1);

//String p2=s.replace("A" to "Z" ,"1");
//System.out.println(p2);


System.out.println("Inserting (I a replacement for space) on every occurrence of space \n");

//String p3= s.insert("\s" , "I a replacement for space");
//System.out.println(p3);
}
}







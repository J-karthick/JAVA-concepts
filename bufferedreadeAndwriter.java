import java.io.*;
class bufferedreadeAndwriter{
public static void main(String[] arg)throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	String s;
	s=br.readLine();
	
	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	
	bw.write(s);
	flush();




}
}
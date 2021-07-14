import java.lang.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="Movie.class" width="900" height="600">
</applet>
*/
public class Movie extends Applet implements ActionListener{
List year,movie;
String cast="";
String image="";
Image poster;
public void init(){
year=new List(5,false);
movie=new List(5,false);
year.add("2018");
year.add("2019");
year.add("2020");
add(year);
add(movie);
year.addActionListener(this);
}
public void paint(Graphics g){
int yindex=year.getSelectedIndex();
int mindex=movie.getSelectedIndex();
//String msg="Current :"+yindex;
//g.drawString(msg,100,100);
switch (yindex) {
case 0:
movie.removeAll();
movie.add("Avenger:Infinity War");
movie.add("Bohemian Rhapsody");
movie.add("Venom");
break;
case 1:
movie.removeAll();
movie.add("Avengers:Endgame",0);
movie.add("Joker",1);
movie.add("Knives Out",2);
break;
case 2:
movie.removeAll();
movie.add("Tenet",0);
movie.add("The Devil All the Time",1);
movie.add("The Trial of the Chicago 7",2);
break;
}
if(yindex==0){
switch (mindex) {
case 0:
cast="Cast: Chris Evans, Robert Downeyjr.,Chris Hemsorth";
image="infinitywar.jpg";
break;
case 1:
cast="Cast: Rami Malek, Gwilym Lee, BenHardy";
image="bohemian.jpg";
break;
case 2:
cast="Cast: Tom Hardy, Michelle Williams,Riz Ahmed";
image="venom.jpg";
break;
}
}
if(yindex==1){
switch (mindex) {
case 0:
cast="Cast: Chris Evans, Robert Downey jr.,Chris Hemsorth";
image="endgame.jpg";
break;
case 1:
cast="Cast: Joaquin Phoenix, Robert DeNiro, Zazie Beetz";
image="joker.jpg";
break;
case 2:
cast="Cast: Daniel Craig, Chris Evans, Ana deArmas";
image="knives.jpg";
break;
}
}if(yindex==2){
switch (mindex) {
case 0:
cast="Cast: John David Washington, Robert Pattinson, Kenneth Branagh";
image="tenet.jpg";
break;
case 1:
cast="Cast: Tom Holland, Sebastian Stan, Robert Pattinson";
image="devil.jpg";
break;
case 2:
cast="Cast: Sacha Baron Cohen, Eddie Redmayne, Jeremy Strong";
image="chicago.jpg";
break;
}
}
g.setFont(new Font("TimesRoman",Font.BOLD,20));
g.drawString(cast,100,120);
poster=getImage(getDocumentBase(),image);
g.drawImage(poster,100,130,this);
}
public void actionPerformed(ActionEvent ae){
repaint();
}
}

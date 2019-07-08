public class Block{
public static void main(String args[]){
int a,b,c;
int volume;
Block(int i;int j;int k){
a=i;
b=j;
c=k;
volume=a*b*c;
}
boolean SameBlock(Block ob){
if((ob.a==a)&(ob.b==b)&(ob.c==c)) return true;
else return false;
}
boolean SameVolume(Block ob){
if(ob.volume==volume)return true;
else return false;
}
}

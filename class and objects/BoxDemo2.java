class Box1{
double width;
double height;
double depth;
}
class BoxDemo2{
public static void main(String args[]){
Box1 myBox1=new Box1();
Box1 myBox2=new Box2();
double vol;
myBox1.width=10;
myBox1.height=12;
myBox1.depth=15;
vol=myBox1.width*myBox1.height*myBox1.depth;
System.out.println("volume of first object is:"+vol);
myBox2.width=8;
myBox2.height=15;
myBox2.depth=6;
vol=myBox2.width*myBox2.heights*myBox2.depth;
System.out.println("volume of second object is:"+vol);
}
}
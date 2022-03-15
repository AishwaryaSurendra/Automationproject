package simple;

public class car {
	String colour;
    String model;
    float mileage;
    
     void setdata(string c1,string m2){
colour=c1;
model=m2;
     }
   void setdata(float m3) {
	   mileage=m3;
	   
   }
  void print(){
        System.out.println("colour:" +colour + "model:" +model + "mileage:" +model);
    }
   
    public static void main (String args[]){
        Car ob = new Car();
        ob.setdata("red","swift");
        ob.setdata(5);
        ob.print();
     
    }
}

package week1.day1;

public class TwoWheeler {
	int noOfWheels = 2;
   	short noOfMirrors = 2;
	long chassisNumber = 3253463565423542l;
	boolean isPunctured = false;
	String bikeName = "Activa" ;
	double runningKM = 88.12 ; 
public static void main(String[] args) {
	TwoWheeler twowhe = new TwoWheeler();
    System.out.println(twowhe.noOfWheels);
    System.out.println(twowhe.noOfMirrors);
    System.out.println(twowhe.chassisNumber);
    System.out.println(twowhe.isPunctured);
    System.out.println(twowhe.bikeName);
    System.out.println(twowhe.runningKM);
}
}

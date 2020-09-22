import java.util.Scanner ;
public class Housepainting {

public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		System.out.println("Please enter building width:"); 
		int buildingWidth = in.nextInt();
		System.out.println("Please enter building height:"); 
		
		int buildingHeight= in.nextInt();
		System.out.println ("Please enter building length");
		
		int buildingLength= in.nextInt();
		int buildingHW=(buildingHeight-buildingWidth);
		int buildingAHW=(buildingLength*buildingHW);
		int buildinghalfAHW=(buildingAHW/2);
		
		int peaksqft=(buildingLength*buildingWidth+buildinghalfAHW);
		int totalpeaksqft=(2*peaksqft) ;
		
		System.out.println("the total SqFt of the peak walls is" +totalpeaksqft);
		int normalsqft=(2*buildingLength*buildingWidth);
		
		System.out.println("the total sqft of normal walls are" + normalsqft);
		int wallsqft=(totalpeaksqft+normalsqft); 
	
		System.out.println("the total sqft of the walls are" + wallsqft); 
		
		System.out.println("please enter the amount of windows");
		int windowamount= in.nextInt ();
	  
		System.out.println("please enter the height of the windows");
		int windowswidth= in.nextInt ();
		
		System.out.println("please enter length of the windows");
		int windowslength= in.nextInt (); 
		
		int windowsqft=(windowswidth*windowslength*windowamount); 
		
		System.out.println("please enter number of doors");
		int dooramount= in.nextInt (); 
		
		System.out.println("please enter length of doors");
		int doorlength= in.nextInt ();
		
		System.out.println("please enter width of doors");
		int doorwidth= in.nextInt (); 
		int doorsqft= (doorwidth*doorlength*dooramount);
		
		System.out.println("please enter sqft to paint");
		int sqfttopaint= (wallsqft-doorsqft-windowsqft);
		
		System.out.println("please enter cost per sqft");
		int costsqft=in.nextInt ();
		System.out.println ("The cost to paint the house is" +sqfttopaint*costsqft);
	
	
		in.close(); }}
	
		
		
				
				
		
			
		
				
		
		
	

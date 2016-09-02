import java.util.Scanner;

public class MyListDriver {

	public static void main(String[] args) {
		
		boolean quit = false;
		MySortedList myList = new MySortedList();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu of operations:");
		System.out.println("   - add........(enter the letter a)");
		System.out.println("   - delete.......(enter the letter d)");
    	System.out.println("   - max......(enter the letter x)");
    	System.out.println("   - min........(enter the letter m)");
    	System.out.println("   - isEmpty......(enter the letter e)");
    	System.out.println("   - quit.......(enter the letter q)");
    	
    	while(!quit){
    		System.out.println("Choose an option");
    		String input =  sc.nextLine();
    		
    		switch(input){
    		
    		case"a":
    			System.out.println("please enter a numerical value to add");
    			int store = Integer.parseInt(sc.nextLine());
        		myList.add(store);
    			System.out.println(store + " added");
    			break;
    			
    		case"d":
    			System.out.println("please enter a numerical value to delete");
    			int store2 = Integer.parseInt(sc.nextLine());
    			myList.delete(store2);
    			break;
    			
    		case"x":
    			if(myList.isEmpty()){
    				System.out.println("list is empty");
    				break;
    			}
    			System.out.println(myList.max());
    			break;
    			
    		case"m":
    			if(myList.isEmpty()){
    				System.out.println("list is empty");
    				break;
    			}
    			System.out.println(myList.min());
    			break;
    			
    		case"p":
    			myList.print();
    			break;
    			
    		case"e":
    			if(myList.isEmpty()){
        			System.out.println("empty");
        			break;
    			}else{
        			System.out.println("not empty");
    			}
    			break;
    			
    		case"q":
    			System.out.println("quitting");
    			quit = true;
    			break;
    			
			default:
    			System.out.println("invalid choice");
    			break;
    		}
    	}
	}
}

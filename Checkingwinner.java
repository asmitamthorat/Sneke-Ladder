package snakeLadder;

import java.util.ArrayList;

public class Checkingwinner {
	 	ArrayList<Integer> list=new ArrayList<Integer>();
	 
	 
	    public void checkForWin(int newPosition){

	        int Position = newPosition;
	        //System.out.println(Position);
	        list.add(Position);
	        if (Position == 100){

	            System.out.println("congratulation you won the game");
	            System.out.println("your moves are following:");

	            for(int i=0;i<list.size();i++){
	                System.out.print(list.get(i)+" ");
	            }
	            System.out.println(" ");
	            System.out.println("total number of moves : "+list.size());

	        }

	    }

}

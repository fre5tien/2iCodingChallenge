
public class MultipleOf_A_Plus1_until_2X {
	static void findMultiples(int x, int a){
	    int x2 = 2*x;
	    int a1 = a+1;
	    for(int i = 1; i <= x2; i++){
	        
	    
	      if(i % a1 == 0){
	        
	System.out.println(a + "+1 in 2X = " + i);
	      }
	        
	  }
	  }
	  public static void main(String[] args){
	    findMultiples(15,3);
	  }

}

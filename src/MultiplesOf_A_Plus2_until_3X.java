
public class MultiplesOf_A_Plus2_until_3X {

	  static void findMultiples(int x, int a){
		    int x3 = 3*x;
		    int a2 = a+2;
		    for(int i = 1; i <= x3; i++){
		        
		    
		      if(i % a2 == 0){
		        
		System.out.println(a + "+2 in 3X = " + i);
		      }
		        
		  }
		  }
		  public static void main(String[] args){
		    findMultiples(15,3);
		  }
}

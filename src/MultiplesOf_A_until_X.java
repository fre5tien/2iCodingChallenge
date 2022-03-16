
public class MultiplesOf_A_until_X {

	  static void findMultiples(int x, int a){
	    for(int i = 0; i <= x; i++)
	      if(i % a == 0)
	        System.out.println(i);
	  }

	  public static void main(String[] args){
	    findMultiples(120,3);
	  }

}

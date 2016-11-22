import java.util.*;

class AbsComparator implements Comparator {
    @Override
    public int compare(Value x, Value y) {
      return Math.abs(x.val) - Math.abs(y.val);
   }
}

class Value  {
   public int val;
   Value(int x) {
	   val=x;
   }
}
public class TestSort {

   public static void main(String args[]) {
      // Takes a list of Value objects
		List<Value> list = new ArrayList<Value>();
		int n,i;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			list.add(new Value(sc.nextInt()));
		}
      Collections.sort(list, new AgeComparator());
      System.out.println(" ");
      for(Value a: list)   // printing the sorted list of ages
         System.out.print(a.val+" ");
   }
}
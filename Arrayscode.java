import java.util.*;
class Arrayscode{
    public static void main(String args[])
    {
     // boolean a=  Arrayscode.celebrity();
     // System.out.print(a);
	  System.out.print(Arrays.toString(Arrayscode.countThreeSum()));
    }
public static int[]  countThreeSum() {
		//two pointer approach in count that array in THREE elements
		
		int arr[]= {2,3,4,5,6,7,9,10};
		int target=9;
		for(int i=0;i<arr.length-2;i++)
		{
			int left=i+1; int right=arr.length-1;
			int val=target-arr[i];
			while(left<right)
			{
		
			if (val==arr[left]+arr[right]) {
				return new int[] {i,left,right};
				
			} if(val>arr[left]+arr[right]) {
				left++;
			}
			else
			{
				right--;
			}
			}
			
		}
		return new int[] {-1,-1};
	}
public  static boolean celebrity() {
	int arr[][]= {
			{0,1,0},
			{0,0,0},
			{0,1,0}};
	int left=0,right=arr.length-1;
	while(left<right) {
		if (arr[left][right]==1) {
			left++;
		}
			else {
				right--;
			}
	}
	int check=left;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[check][i]==0 && arr[i][check]==1)
		{
			return true;
		}
		else
			return false;
		}
	return false;
	}
}
class Arrayscode{
    public static void main(String args[])
    {
      boolean a=  Arrayscode.celebrity();
      System.out.print(a);
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
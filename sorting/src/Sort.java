
public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {4,3,2,1};
for(int i=0;i<arr.length;i++)
{
	for(int j=i+1;i<arr.length;j++)
	{
		int temp=0;
		if (arr[j]<arr[i])
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	System.out.println(arr[i]+ " " );
}
	}

}

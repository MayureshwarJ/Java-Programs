public class ShuffelArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr ={1,2,3,4,5,6,7};

		for(int i=0; i<arr.length; i++)
		{
		int index =(int)(Math.random() * arr.length);
		int temp =arr[i];
		arr[i] = arr[index];
		arr[index] =temp;
		}

		for(Integer u: arr)
		{
		System.out.println(u);
		}

	}

}
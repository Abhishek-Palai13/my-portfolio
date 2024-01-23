public class LargestElementArray {
    public static void main(String[] args) {
        int[] arr={23,18,19,500,700};
        System.out.println(large(arr));
    }
    public static int large(int[] arr)
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}

 public class Sellection
{
    public static void main(String a[])
    {
        int nums[]={5,6,3,2,4,8,8};
        int maxIn=-1;
        int temp;
        int size=nums.length;
        System.out.println("Array before sorting");
        for(int num:nums)
        {
            System.out.print(num+" ");
        }
        System.out.println();

        for(int i=0;i<size;i++)
        {
            maxIn=i;
            for(int j=i+1;j<size;j++)
            {

                if(nums[j]<nums[maxIn])
                {
                   maxIn=j;
                }
               // System.out.println(nums[maxIn]);
            }
            
            temp=nums[maxIn];
            nums[maxIn]=nums[i];
            nums[i]=temp;


        }
        System.out.println();
        System.out.println("Array after sorting");
        for(int num:nums)
        {
            System.out.print(num+" ");
        }
    }
}
import java.sql.Array;
import java.util.Arrays;
public class findStartAndEndIndex {
    public static void main(String[] args) {
       int[] nums={5,7,7,8,10};
       int target=8;
      System.out.println(Arrays.toString(searchRange(nums,target)));  
    }

    static int[] searchRange(int[] nums,int target){
        int[] ans={-1,-1};

      ans[0]=search(nums,target,true);
      ans[1]=search(nums,target,false);
        return ans;
    }

  static int search(int[] nums,int target,boolean startIndex){
int ans=-1;

int start=0;
int end=nums.length-1;

while(start<=end){
    int mid=start+(end-start)/2;
    if(target>nums[mid]){
        start=mid+1;
    }
    else if(target<nums[mid]){
        end=mid-1;
    }
    else{

        ans=mid;
        if(startIndex){
             end=mid-1;
        }
        else{
           start=mid+1;
        }
    }

}
return ans;

  }


}

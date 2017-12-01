package objects;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


/**
 * 最大子序列的和
 * @author ant
 * @date 创建时间：2017年8月28日 上午10:07:53
 */
public class Solution {

	public static int maxSubSum1(int [] integers) {

		int maxSum = 0;

		for (int i = 0; i < integers.length; i++) {// 1

			for (int j = i; j < integers.length; j++) {// 2

				int thisSum = 0;// 3

				for (int k = i; k <= j; k++) {// 4

					thisSum += integers[k];// 5
				}
				if (thisSum > maxSum) {// 6

					maxSum = thisSum;// 7
				}
			}
		}
		return maxSum;
	}

	public static int maxSubSum2(int [] integers) {

		int maxSum = 0;

		for (int i = 0; i < integers.length; i++) {
			int thisSum = 0;
			for (int j = i; j < integers.length; j++) {
				thisSum += integers[j];
				if (thisSum > maxSum) {
					maxSum = thisSum;
				}
			}
		}
		return maxSum;
	}

	private static int maxSunRec(int[] nums,int left,int right) {
		if (left == right) {
			if (nums[left] >= 0) {
				return nums[left];
			}else {
				return 0;
			}
		}
		int center = (left + right) /2;
		int maxLeftSum = maxSunRec(nums, left, center);
		int maxRightSum = maxSunRec(nums, center + 1, right);
		int maxLeftBorderSum = 0,leftBorderSum = 0;
		for (int i = center; i >= left; i--) {
			leftBorderSum += nums[i];
			if (leftBorderSum > maxLeftBorderSum) {
				maxLeftBorderSum = leftBorderSum;
			}
		}
		int maxRightBorderSum = 0,rightBorderSum = 0;
		for (int i = center+1; i <= right; i++) {
			rightBorderSum += nums[i];
			if (rightBorderSum > maxRightBorderSum) {
				maxRightBorderSum = rightBorderSum;
			}
		}
		int maxSum = 0;
		if (maxLeftSum > maxSum) {
			maxSum = maxLeftSum;
		}
		if (maxRightSum > maxSum) {
			maxSum = maxRightSum;
		}
		if (maxLeftBorderSum + maxRightBorderSum > maxSum) {
			maxSum = maxLeftBorderSum + maxRightBorderSum;
		}
		return maxSum;
	
    }

	public static int maxSubSum3(int [] nums) {
		return maxSunRec(nums, 0, nums.length - 1);           
	}
	
	public static int maxSubSum4(int [] nums) {
		int maxSun = 0,thisSun = 0;
		for (int i = 0; i < nums.length; i++) {
			thisSun += nums[i];
			if (thisSun > maxSun) {
				maxSun = thisSun;
			} else if(thisSun < 0){
                thisSun = 0;
			}
		}
		return maxSun;           
	}

	/**
	 * @Description: Given a string, find the length of the longest substring without repeating characters. 
	 * @param s
	 * @return int
	 * @throws
	 * 思路：截取最长，说明有边界，用[i,j]便是边界i和j小于字符串的长度
	 * 核心：怎样确定最长的边界，如果边界确定了，那么最长的长度就是j-i。
	 * 方案：一旦出现重复的元素，那么重复元素一定是出现在首尾上，此时把i向前推进一位，则没有重复元素。
	 */
    public static int lengthOfLongestSubstring(String s) {
    	 int n = s.length();
         Set<Character> set = new HashSet<Character>();
         int ans = 0, i = 0, j = 0;
         while (i < n && j < n) {
             // try to extend the range [i, j]
             if (!set.contains(s.charAt(j))){
                 set.add(s.charAt(j++));
                 ans = Math.max(ans, j - i);
             }
             else {
                 set.remove(s.charAt(i++));
             }
         }
         return ans;      
    }
    
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Random random = new Random(47);
		int [] ra = new int[100000];
		for (int i = 0; i < 100000; i++) {
			int r = random.nextInt(1000) - 500;
			ra[i] = r;
		}
		String string= "ff";
		string.toUpperCase();
		string.contains("");
		
		int maxSun = maxSubSum4(new int []{-2,4,-3,5,-4,19,-15,3});
		long end = System.currentTimeMillis();
		//System.out.println(end - start);
		//System.out.println(lengthOfLongestSubstring("abacdfa"));
	}
}

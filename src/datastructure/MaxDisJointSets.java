package datastructure;

import java.util.Arrays;
import java.util.Comparator;

public class MaxDisJointSets {

	
	public static void main(String[] args) {
		int[][] ranges = {{1,2},{3,4},{5,8},{4,6}};
		System.out.println(max_non_overlapping(ranges, 4));
	}
	    static int max_non_overlapping(int ranges[][], int n){
	        if (n <= 1)
	            return n;
	        
	        // Sort by minimum starting point
	        Arrays.sort(ranges, new Comparator<int[]>() {

				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[0] - o2[0];
				}
			});
	        
	        int end = ranges[0][1], max=1;
	        
		    for (int i = 1; i < n; i++)
	        {
	            if (ranges[i][0] < end)
	            {
	                // this condition suggests overlap
	                // Remove the interval
	                // with the higher ending point
	                if( ranges[i][1] < end )
	                    end = ranges[i][1];
	            }
	            else
	            {
	                // if no collision, we simply pick the next range
	                // and adjust end variable
	                max++;
	                end = ranges[i][1];
	            }
	        }
		
		return max;
	    }
	}



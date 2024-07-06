/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    //int[] arr1 = {0,1,0,2,1,0,1,3,2,1,2,1};
		int [] arr1 = {4,2,0,3,2,5};
		List<Integer> left_max = new ArrayList<Integer>();
		List<Integer> right_max = new ArrayList<Integer>();
		for(int i= 0; i < arr1.length ; i++){
		    //left_max
		    int lmax = arr1[i];
		    for(int l =i ; l>=0 ;l--){
		            lmax = Math.max(lmax,arr1[l]);
		    }
		    //right_max
		    int rmax = arr1[i];
		    
		    for(int l =i ; l<arr1.length ;l++){
		            rmax = Math.max(rmax,arr1[l]);
		    }
		  left_max.add(lmax == arr1[i] ? -1 : lmax);
		  right_max.add(rmax == arr1[i] ? -1 : rmax);
		    
		}
		int res =0;
		for(int i =0 ; i < left_max.size();i++){
		    int x = left_max.get(i);
		    int y = right_max.get(i);
		    if(x!= -1 && y!=-1){
		        res += Math.min(x,y) - arr1[i];
		    }
		}
		System.out.println(res);
		// System.out.println(left_max);
		// System.out.println(right_max);
	}
}

package com.pratiksha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        int minDist = findMinimumDistance(A , n);
        System.out.println(minDist);
    }
    public static int findMinimumDistance(int A[],int n){
        Map<Integer , LinkedList<Integer>> mp = new HashMap<Integer , LinkedList<Integer>>();
        int minDist = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(mp.containsKey(A[i])){
                LinkedList<Integer> al = mp.get(A[i]);
                al.add(i);
                mp.put(A[i],al);
            }
            else{
            	LinkedList<Integer> al = new LinkedList<Integer> ();
                al.add(i);
                mp.put(A[i],al);
            }             
        }
        for(int i=0;i<n;i++){
            if(mp.containsKey(A[i])){
                LinkedList<Integer> al = mp.get(A[i]);
                Iterator<Integer> itr = al.listIterator();
                int prev = -1;
                int x=0;
                while(itr.hasNext()){
                	if(prev==-1)
                		prev = itr.next();
                	if(itr.hasNext())
                	  x = itr.next();
                	else break;
                	if((x-prev) < minDist){
                		minDist = x-prev;
                	}
                	prev = x;
                }
                mp.remove(A[i]);
            }
        }
        return minDist;
    }
}

package medium;
/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

import java.util.ArrayList;
import java.util.*;
import java.util.LinkedList;
import java.util.List;
import java.lang.Object;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class AddTwoNumbers {


    public static void main(String[] args) {
        LinkedList<Integer> linkedList1=new LinkedList<>();
        LinkedList<Integer> linkedList2=new LinkedList<>();
        boolean b = Collections.addAll(linkedList1,2,4,3);
        boolean bb = Collections.addAll(linkedList2,5,6,4);
//        System.out.println("addTwoNum(linkedList1,linkedList2) = " + addTwoNum(linkedList1, linkedList2));
        System.out.println("addTwoNum1(linkedList1,linkedList2) = " + addTwoNum1(linkedList1, linkedList2));
    }

    static LinkedList addTwoNum(LinkedList<Integer>l1,LinkedList<Integer>l2){
        LinkedList<Integer> result=new LinkedList<>();
        int n1=0;
        int n2=0;
        StringBuilder s1 =new StringBuilder();
        StringBuilder s2 =new StringBuilder();
        l1.stream().forEach(t-> s1.append(""+t));
        l2.stream().forEach(t-> s2.append(""+t));
//        System.out.println("s1 = " + s1);
//        System.out.println("s2 = " + s2);
        StringBuilder str = new StringBuilder("" + (Integer.parseInt(s1.toString()) + Integer.parseInt(s2.toString())));
//        System.out.println(str);
        str.reverse();
        Integer[] arr =Arrays.stream(str.toString().split("")).map(t -> Integer.parseInt(t)).toArray(Integer[]::new);
        boolean b = Collections.addAll(result, arr);
//        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        return result;
    }

    static LinkedList addTwoNum1(LinkedList<Integer>l1,LinkedList<Integer>l2){
        LinkedList<Integer> result=new LinkedList<>();
        String str1 ="";
        String str2 ="";
        for (int i = 0; i < l1.size(); i++) {
            str1 +=l1.get(i);
        }
        for (int i = 0; i < l2.size(); i++) {
            str2 +=l2.get(i);
        }
//        for (int w:l1 ) {
//            str1 +=w;
//        }
//        for (int w:l2 ) {
//            str2 +=w;
//        }
        String sum =""+ (Integer.parseInt(str1) + Integer.parseInt(str2));

        for (int i = sum.length()-1; i >=0; i--) {
            result.add(Character.digit(sum.charAt(i),10));
            Character.digit(sum.charAt(i),10);
        }


        return result;
    }
}


















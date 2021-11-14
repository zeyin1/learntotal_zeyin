package com.example.demo.method;

import com.example.demo.pojo.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
     * @Description: 用一句话描述
     * @Author: zeyin
     * @Date: 2021年03月01日 9:20
     * @Modify:
     */
    public class Test1 {

        public static ListNode method(ListNode head) {
            return null;
        }

        private  List<List<Integer>> res=new ArrayList<>();
        public List<List<Integer>> mehtod(int[] nums,int target){
            if (nums.length<=0){
                return res;
            }

            for (int i=0;i<nums.length;i++){
                List<Integer> list=new ArrayList<>();
                method1(nums,i,target,list);
            }
            return null;
        }

        public void method1(int[] nums,int index,int target,List<Integer> list){



            if (index==nums.length){
                return;
            }

            int k=0;
            while ((nums[index]*k<=target)){
                list.add(nums[index]);
                //method(nums,index+1,target-nums[index]*k,list);
                k++;
            }

        }


}

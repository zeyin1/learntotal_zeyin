package algorithm.other;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Huawei_01 {
    public static final Map<Integer,String> map=new HashMap<>();

    static {
        map.put(0,"a");
        map.put(1,"b");
        map.put(2,"c");
        map.put(3,"d");
        map.put(4,"e");
        map.put(5,"f");
        map.put(6,"g");
        map.put(7,"h");
        map.put(8,"i");
        map.put(9,"j");
        map.put(10,"k");
        map.put(11,"l");
        map.put(12,"m");
        map.put(13,"n");
        map.put(14,"o");
        map.put(15,"p");
        map.put(16,"q");
        map.put(17,"r");
        map.put(18,"s");
        map.put(19,"t");
        map.put(20,"u");
        map.put(21,"v");
        map.put(22,"w");
        map.put(23,"x");
        map.put(24,"y");
        map.put(25,"z");
    }


    public static String method(int val){
        StringBuilder sb=new StringBuilder();
        while (val>0){
            int cost=(val-1)%26;
            sb.append(map.get(cost));
            val=val/26;
        }
        return   sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.print("请输入：");
        Scanner in = new Scanner(System.in);
        int val=in.nextInt();
        System.out.println("输出："+method(val));
    }

}

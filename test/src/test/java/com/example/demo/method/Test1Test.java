package com.example.demo.method;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年03月01日 9:21
 * @Modify:
 */
@SpringBootTest
public class Test1Test {

    @Test
    public void test1() {
        String str = "- -I am a *@ -stu-dent--rr-";

       // String res = Test1.method(str);

        System.out.println("皇后位置：" + str);
        System.out.print("可以互相攻击的皇后对数：" + null);
    }
}

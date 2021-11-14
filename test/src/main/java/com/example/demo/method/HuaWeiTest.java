package com.example.demo.method;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class HuaWeiTest {

    public static Integer maxValue(List<Product> products, int money) {
        products.sort(Comparator.comparing(Product::getInput));
        boolean flg = true;
        while (flg) {
            if (products.isEmpty()) {
                flg = false;
            }
            for (int i = 0; i < products.size(); i++) {
                Product product = products.get(i);
                if (product.getInput() <= money) {
                    money += product.getVal();
                    products.remove(i);
                } else {
                    flg = false;
                }
            }
        }
        return money;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        int value = in.nextInt();
        String[] num1 = str1.split(",");
        String[] num2 = str2.split(",");
        if (num1.length > 0 || num1.length == num2.length) {
            List<Product> products = new ArrayList<>();
            for (int i = 0; i < num1.length; i++) {
                Product product = new Product();
                product.setInput(Integer.parseInt(num1[i]));
                product.setOutput(Integer.parseInt(num2[i]));
                product.setVal(product.getOutput() - product.getInput());
                if (product.getVal() > 0) {
                    product.setPercent(product.getVal() / product.getInput());
                    products.add(product);
                }
            }
            int result = maxValue(products, value);
            System.out.println(result);
        }

    }

    public static class Product {
        public double getPercent() {
            return percent;
        }

        public void setPercent(double percent) {
            this.percent = percent;
        }

        private double percent; //性价比
        private int input; //成本
        private int output; //卖出价格
        private int val; //利润

        public int getInput() {
            return input;
        }

        public void setInput(int input) {
            this.input = input;
        }

        public int getOutput() {
            return output;
        }

        public void setOutput(int output) {
            this.output = output;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }
    }

}

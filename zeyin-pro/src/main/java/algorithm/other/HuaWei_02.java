package algorithm.other;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class HuaWei_02 {

    public static Integer maxValue(List<Product> products, int value) {
        //升序
        products.sort(Comparator.comparing(Product::getInput));
        // 降序
        // products.sort(Comparator.comparing(Product::getInput).reversed());
        boolean flg = true;
        while (flg) {
            flg=false;
            for (int i = 0; i < products.size(); i++) {
                Product product = products.get(i);
                if (product.getInput() <= value) {
                    value += product.getOutput()-product.getInput();
                    products.remove(i);
                    flg=true;
                }
            }
        }
        return value;
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
                if (product.getOutput()-product.getInput() > 0) {
                    products.add(product);
                }
            }
            int result = maxValue(products, value);
            System.out.println(result);
        }}

    /**
     * 产品
     */
    public static class Product {

        private int input; //成本
        private int output; //卖出价格

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
    }
}

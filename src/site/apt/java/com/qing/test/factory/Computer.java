package com.qing.test.factory;

import cn.hutool.core.util.ObjUtil;
import cn.hutool.core.util.StrUtil;

import java.util.Scanner;

public class Computer {

    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());

        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StrUtil.isNotBlank(ipt)) {
                return ipt;
            }
        }
        throw new RuntimeException("没有输入");
    }

    public static void main(String[] args) {
        String numA = scanner("第一个数字");
        String symbol = scanner("入运算符");
        String numB = scanner("第二个数字");

        OperationFactory factory = new OperationFactory();
        Operation method = factory.createMethod(symbol);
        if (ObjUtil.isNotEmpty(method)){
            Double result = method.getResult(Double.parseDouble(numA),Double.parseDouble(numB));
            System.out.println("计算结果:"+result);
        }
    }
}

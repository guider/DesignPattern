package com.coder.guider.桥接_装饰者_策略_对比学习.strategy;

/**
 * Created by apple on 16/9/23.
 */
public class Test {

    public static void main(String arg []){
        Client client =new Client(new Add());

        client.calculate(1,2);

    }
}

package com.xuexiang.xupdatedemo;

import java.util.Arrays;
import java.util.Random;

public class WeightRandom {

    private Pair[] options;

    private double[] cumulativeProbabilities;

    private Random rnd;

    public WeightRandom(Pair[] options) {
        this.options = options;
        this.rnd = new Random();
        prepare();
    }

    private void prepare(){
        int weights = 0;
        for(Pair pair : options){
            weights += pair.getWeight();
        }

        cumulativeProbabilities = new double[options.length];
        int sum = 0;

        for(int i = 0; i < options.length; i++){
            sum += options[i].getWeight();
            cumulativeProbabilities[i] = sum / (double)weights;
        }
    }

    public Object nextItem(){
        double randomValue = rnd.nextDouble();
        //Arrays.binarySearch 查找排序好
        int index = Arrays.binarySearch(cumulativeProbabilities,randomValue);
        //Arrays.binarySearch 查找返回值，小于0.7的是 -1；小于 0.9大于 0.7，-2；小于0.9，大于1，-2
        if(index < 0){
            index = -index - 1;
        }
        return options[index].getItem();
    }
}
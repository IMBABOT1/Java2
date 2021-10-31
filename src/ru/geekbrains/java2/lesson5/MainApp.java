package ru.geekbrains.java2.lesson5;

import java.util.Arrays;

public class MainApp {

    private static final int SIZE = 10000000;
    private static final int HALF = SIZE / 2;

    private static float[] first(){
        float[] arr = new float[SIZE];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = 1;
        }

        long time = System.currentTimeMillis();

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        long result = System.currentTimeMillis() - time;

        System.out.println(result);

        return arr;
    }

    private static float[] second(){
        float[] arr = new float[SIZE];

        float[] firstArr = new float[HALF];
        float[] secondArr = new float[HALF];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = 1;
        }

        long time = System.currentTimeMillis();

        System.arraycopy(arr, 0, firstArr, 0, HALF);
        System.arraycopy(arr, HALF, secondArr, 0, HALF);

       Thread thread = new Thread(new MyThread(firstArr, 0));
       Thread thread1 = new Thread(new MyThread(secondArr, HALF));

       thread.start();
       thread1.start();

       try {
           thread.join();
           thread1.join();
       }catch (InterruptedException e){
           e.printStackTrace();
       }


        System.arraycopy(firstArr,0, arr, 0, HALF);
        System.arraycopy(secondArr, 0, arr, HALF, HALF);


        long result = System.currentTimeMillis() - time;

        System.out.println(result);

        return arr;
    }


    public static void main(String[] args) {
        float[] firstMethod =  first();
        float[] secondMethod = second();


        System.out.println(Arrays.equals(firstMethod, secondMethod));
    }
}

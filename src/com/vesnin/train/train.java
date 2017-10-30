package com.vesnin.train;

import java.util.Random;

public class train {

    private static TrainCar[] trainArr;
    private static int CurCarNumber =0;

    public static void  newTrain()
    {
        int TrainMinLenght =4;
        int TrainMaxLenght =50;

        Random rn = new Random();
        Random rnLight = new Random();
        int TrainCarCount;
        TrainCarCount=TrainMinLenght+rn.nextInt(TrainMaxLenght);
        int i=0;

        trainArr = new TrainCar[TrainCarCount];
        while (i<TrainCarCount) {
            trainArr[i] = new TrainCar();
            trainArr[i].carNumber = i;
            trainArr[i].light = rnLight.nextInt(2); // 1-on 0-off

            if (i!=TrainCarCount-1) {
                trainArr[i].nextCar = i + 1;
            } else {
                trainArr[i].nextCar=trainArr[0].carNumber;
            }
            if (i==0)
            {
                trainArr[i].prevCar=TrainCarCount-1;
            }
            else
            {
                trainArr[i].prevCar=trainArr[i-1].carNumber;
            }
            i++;
        }
        System.out.println("Train created of "+TrainCarCount+" Cars");

    }
    public static int GetCurCarLight() {
        if (CurCarNumber ==0) {
            System.out.println("GetCurCarLight car:"+ CurCarNumber +" light is "+trainArr[CurCarNumber].light);
            return trainArr[0].light;
        }
        else {
            System.out.println("car:"+ CurCarNumber);
            return trainArr[CurCarNumber].light;}
    }
    public static int GetNextCarLight() {
        CurCarNumber =trainArr[CurCarNumber].nextCar;
        System.out.println("next car:"+ CurCarNumber+" light is "+trainArr[CurCarNumber].light);
        return trainArr[CurCarNumber].light;

    }
    public static int GetPrevCarLight() {
        CurCarNumber=trainArr[CurCarNumber].prevCar;
        System.out.println("GetPrevCarLight car:"+ CurCarNumber);
        return trainArr[CurCarNumber].light;

    }
    public static int SetOffCarLight() {
        if (CurCarNumber ==0) {
            trainArr[0].light = 0;
        } else
            trainArr[CurCarNumber].light = 0;
         return trainArr[CurCarNumber].light;

    }
    public static int SetOnCarLight() {
        if (CurCarNumber ==0) {
            trainArr[0].light = 1;
            System.out.println("curr car:"+CurCarNumber+" SetOnCarLight:"+ CurCarNumber);
        } else {
            trainArr[CurCarNumber].light = 1;
            System.out.println("curr car:"+CurCarNumber+" SetOnCarLight:"+ CurCarNumber);
        }
        return trainArr[CurCarNumber].light;

    }




    }

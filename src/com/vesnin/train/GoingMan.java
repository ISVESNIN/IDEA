package com.vesnin.train;

public class GoingMan {
    public static void main(String[] args) {
        int step=0;
        train CurTrain;
        CurTrain = new train();
        CurTrain.newTrain();


        while (step<=100) {
            CurTrain.SetOnCarLight();
            CurTrain.GetNextCarLight();
            step++;
        }

    }
}

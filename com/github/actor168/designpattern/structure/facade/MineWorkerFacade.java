package com.github.actor168.designpattern.structure.facade;

public class MineWorkerFacade {

    private MineWoker[] workers;

    void startNewDay(){
        workers = new MineWoker[]{
            new GoldMineOperator(), 
            new MineDiggerWorker(), 
            new MeasureWorker()
        };
    }

    void work() {
        for (int i = 0; i < workers.length; i++) {
            workers[i].work();
        }
    }

    void endTheDay() {
        
    }
}

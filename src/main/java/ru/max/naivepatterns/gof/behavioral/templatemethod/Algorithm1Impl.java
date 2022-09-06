package ru.max.naivepatterns.gof.behavioral.templatemethod;

public class Algorithm1Impl extends AlgorithmSkeleton {
    @Override
    public void stepTwo(){
        System.out.println("Algorithm1Impl: Step 2 performed");
    }
    @Override
    public void stepThree(){
        System.out.println("Algorithm1Impl: Step 3 performed");
    }
}

package jp.ac.uryukyu.ie.e205745;

public class Main {
    public static void main(String[] args){
        String firstimput = "a";
        String secondimput = "e";
        double kyori = Solver.distanceCalc(firstimput, secondimput);
        System.out.println("指定された駅までの距離:" + kyori + "km");
    }
}

package jp.ac.uryukyu.ie.e205745;

public class Main {
    public static void main(String[] args){
        String firstimput = "a";
        String secondimput = "e";
        double kyori = Solver.distanceCalc(firstimput, secondimput);
        int unchin = Solver.feeCalc(kyori);
        System.out.println("指定された駅までの距離:" + kyori + "km");
        System.out.println("運賃:" + unchin + "円");
    }
}

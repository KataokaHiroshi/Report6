package jp.ac.uryukyu.ie.e205745;

public class Solver {
    public static double distanceCalc(String origin, String end){
        double ab = 1.2;
        double bc = 1.7;
        double cd = 3.1;
        double de = 2.6;
        double ef = 2.2;
        double cg = 2.4;
        double distance = 0.;   
        if(origin == "a"){
            if(end == "b"){
                distance = ab;
            }else if(end == "c"){
                distance = ab + bc;
            }else if(end == "d"){
                distance = ab + bc + cd;
            }else if(end == "e"){
                distance = ab + bc + cd + de;
            }else if(end == "f"){
                distance = ab + bc + cd + de + ef;
            }else if(end == "g"){
                distance = ab + bc + cg;
            }else{
                System.out.println("この値は無効です。");
            }
        }else{
            System.out.println("この値は無効です。");
        }
        return distance;
    }
    public static int feeCalc(double dist) {
        int fee = 0;
        if(dist >= 0.0 && dist <= 3.0){
            fee = 230;
        }else if(dist >= 3.0 && dist <= 6.0){
            fee = 280;
        }else if(dist >= 6.0 && dist <= 9.0){
            fee = 330;
        }else if(dist >= 9.0){
            fee = 380;
        }
        return fee;
    }
}

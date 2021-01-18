package jp.ac.uryukyu.ie.e205745;

public class Solver {
    public static double distanceCalc(String origin, String end){
        double ab = 1.2;
        double bc = 1.7;
        double cd = 3.1;
        double ce = 2.4;
        double distance = 0.;
        if(origin == "a"){
            if(end == "b"){
                distance = ab;
            }else if(end == "c"){
                distance = ab + bc;
            }else if(end == "d"){
                distance = ab + bc + cd;
            }else if(end == "e"){
                distance = ab + bc + ce;
            }else{
                System.out.println("ERROR この値は無効です。");
            }
        }else{
            System.out.println("ERROR この値は無効です。");
        }
        return distance;
    }

}

package jp.ac.uryukyu.ie.e205745;

public class Client {
    private String name;
    private int fee = 240;
    private boolean adult = true;
    
    public Client(String _name){
        this.name = _name;
        System.out.printf("あなたは%sです。\n",_name);
    }

    public int getFee(){
        return this.fee;
    }

    public String getName(){
        return this.name;
    }

    public boolean judgeAdult(){
        if(name == "こども"){
            this.adult = false;
        }
        return this.adult;
    }

    public int isFee(){
        judgeAdult();
        if(adult == false){
            this.fee = this.fee / 2;
        }
        return this.fee;
    }
}

package Ejer2;

import Ejer1.Formato;

public class Actor{

    protected String actor;

    public Actor(String actor){
        this.actor = actor;
    }

    public String getActor() {
        return actor;
    }

    @Override
    public String toString(){
        return actor;
    }
}

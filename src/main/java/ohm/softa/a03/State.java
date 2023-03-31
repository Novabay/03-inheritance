package ohm.softa.a03;

import java.util.logging.Logger;

public abstract class State {

    protected Logger logger;
    private int t;

    private final int duration;

    State(int duration){
        this.duration = duration;
    }

    State tick(Cat cat){
        return null;
    }

    abstract State successor(Cat cat);

    public int getTime(){
        return t;
    }

    public int getDuration(){
        return duration;
    }








}

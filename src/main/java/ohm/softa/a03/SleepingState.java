package ohm.softa.a03;

public class SleepingState extends State{
    SleepingState(int duration) {
        super(duration);
    }

    @Override
    State successor(Cat cat) {
        return this;
    }

}

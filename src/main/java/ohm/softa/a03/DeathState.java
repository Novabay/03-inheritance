package ohm.softa.a03;

public class DeathState extends State{
    DeathState(int duration) {
        super(duration);
    }

    @Override
    State successor(Cat cat) {
        return this;
    }
}

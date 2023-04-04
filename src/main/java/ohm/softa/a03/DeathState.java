package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DeathState extends State{
    private static final Logger logger = LogManager.getLogger();
    DeathState() {
        super(1);
    }

    @Override
    public State successor(Cat cat) {
        // no lives left...
        return this;
    }
}

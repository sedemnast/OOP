package HW2.task2;

import HW2.task1.Actor;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private final List<Actor> actors = new ArrayList<>();
    // TODO сделать список в конструкторе

    @Override
    public void acceptToMarket(Actor actor) {

    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {

    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Actor actor) {

    }

    @Override
    public void takeOrders() {

    }

    @Override
    public void giveOrders() {

    }

    @Override
    public void releaseFromQueue() {

    }
}

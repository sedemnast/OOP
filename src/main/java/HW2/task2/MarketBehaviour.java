package HW2.task2;

import HW2.task1.Actor;

import java.util.List;

public interface MarketBehaviour {

    void acceptToMarket(Actor actor); // доступ к маркет-плейсу

    void releaseFromMarket(List<Actor> actors);

    void update();

}

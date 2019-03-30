package cn.edu.bupt.opensource.strategy.sample;

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}

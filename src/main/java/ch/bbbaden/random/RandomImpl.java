package ch.bbbaden.random;

public class RandomImpl implements Random {

    private static final java.util.Random RANDOM = new java.util.Random();
    private static RandomImpl instance = null;

    public static RandomImpl getInstance() {
        if (instance == null) {
            instance = new RandomImpl();
        }
        return instance;
    }

    /**
     * {@inheritDoc}
     */
    public int nextInt(int bound) {
        return RANDOM.nextInt(bound);
    }

    /**
     * {@inheritDoc}
     */
    public double nextDouble(double bound) {
        return RANDOM.nextDouble(bound);
    }

}

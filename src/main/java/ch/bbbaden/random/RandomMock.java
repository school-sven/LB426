package ch.bbbaden.random;

public class RandomMock implements Random {

    private static final int STATIC_RANDOM_NUMBER = 5;
    private static final double STATIC_RANDOM_NUMBER_DOUBLE = 0.3242345;

    /**
     * {@inheritDoc}
     */
    public int nextInt(int bound) {
        return STATIC_RANDOM_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    public double nextDouble(double bound) {
        return STATIC_RANDOM_NUMBER_DOUBLE;
    }

}

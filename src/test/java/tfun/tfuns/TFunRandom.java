package tfun.tfuns;

import java.io.InvalidObjectException;
import java.util.Random;

public interface TFunRandom {

    /**
     * Generates a random integer number.
     *
     * @param bounds Optional parameter which sets inclusive lower and  upper bound of generated number.
     * @return Integer number within bounds.
     */
    public default Integer randomInteger(Integer... bounds) throws InvalidObjectException {
        if (bounds.length == 1) {
            throw new InvalidObjectException("Wrong number of bounds. Lower and Upper bounds needs to be initialized. @see javaDoc ");
        } else if (bounds.length == 0) {
            return Math.abs(new Random().nextInt());
        } else {
            int min = bounds[0];
            int max = bounds[1];
            return (int) Math.floor(Math.random() * (max - min + 1) + min);
        }
    }

    public default String randomString() {

        return null;
    }


}

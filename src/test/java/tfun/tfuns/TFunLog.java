package tfun.tfuns;

import com.github.javaparser.utils.Log;
import com.thoughtworks.gauge.Gauge;

public interface TFunLog {

    public default void logInfo(String message) {
        Log.info(message);
        Gauge.writeMessage(message);
    }


    public default void logWarning(String message) {
        Log.error(message);
    }

}

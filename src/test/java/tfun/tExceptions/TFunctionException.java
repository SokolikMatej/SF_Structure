package tfun.tExceptions;

public class TFunctionException extends Exception {

    public TFunctionException(String function, Throwable err, String... text) {
        super("Error in function: " + function + "\n"
                + (text.length > 0 ? "Action: " + text[0] : "") + "\n"
                + "Error message: " + err.getMessage());
    }

}

package tfun.tfuns;

import com.github.javaparser.utils.Log;
import com.sun.xml.bind.v2.TODO;

public interface TFunAssert {

    public enum Relation {
        EQ,
        LT,
        LE,
        GT,
        GE;
    }

    public default void assertRelation(Object left, Relation relation, Object right) {
        switch (relation) {
            case EQ -> {
                //TODO: Error handling - Asserts
                if (left instanceof String) {
                    if (left.toString().equals(right.toString())) {
                        Log.info("Assert EQ is correct: " + left + " == " + right);
                    } else {
                        Log.error("Assert EQ is NOTcorrect " + left + " != " + right);
                    }
                }
            }

            case LT -> {

            }

            case LE -> {

            }


        }

    }

    public default void assertEqual(Object left, Object right) {
        assertRelation(left, Relation.EQ, right);
    }

    public default void assertLessThen(Object left, Object right) {
        assertRelation(left, Relation.LT, left);
    }


}

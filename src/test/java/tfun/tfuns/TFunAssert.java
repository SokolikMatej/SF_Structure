package tfun.tfuns;

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

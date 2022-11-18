package tfun;

public abstract class TSteps<S extends Enum<S>, D, EF extends TElementFactory<?>, F> {

    public D d;

    public EF e;

    public F f;



    public abstract void prepareInitialData(S scenario);

    public abstract void initiateTest(S scenario);

    public abstract void executeTestActions(S scenario) throws Exception;

    public abstract void captureResultData(S scenario);

    public abstract void assertResults(S scenario);





}

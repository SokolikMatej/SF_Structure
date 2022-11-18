package salesforce;

import tfun.TSteps;

public abstract class SF_Steps<S extends Enum<S>, D extends SF_Data>
        extends TSteps<S, D, SF_ElementFactory, SF_Functions> {

    public SF_Steps() {
        this.e = new SF_ElementFactory();
        this.f = new SF_Functions();
    }
}

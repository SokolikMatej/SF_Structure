package usecases.sample_usecase1;

import com.thoughtworks.gauge.Step;
import salesforce.SF_Steps;

public class Steps extends SF_Steps<Scenarios, Data> {

    public Steps() {
        this.d = new Data();
    }

    @Override
    public void prepareInitialData(Scenarios scenario) {

        switch (scenario) {
            case BASIC -> {
                d.userName = "tralalala";
            }

            case COMPLEX -> {

            }

        }
    }

    @Override
    public void initiateTest(Scenarios scenario) {

    }

    @Step("Navigate to screen <scenario>")
    @Override
    public void executeTestActions(Scenarios scenario) throws Exception {
        switch (scenario) {
            case BASIC -> {
                f.navigationToUrl("https://greysonconsultingsro.my.salesforce.com");
                e.inputField("Username").setText(d.userName);
                e.xpathElement("//input[@id='password']").setText(d.userPass);
                e.button("Log In").click();
            }

            case COMPLEX -> {
                e.inputField("Eur").setText("bla");
            }

        }

    }


    @Override
    public void captureResultData(Scenarios scenario) {

    }

    @Override
    public void assertResults(Scenarios scenario) {

    }
}

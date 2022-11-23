package usecases.sample_usecase1;

import com.thoughtworks.gauge.Step;
import salesforce.SF_Steps;
import tfun.tExceptions.TElementNotFoundException;

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

    @Step("Navigate to opportunity screen <scenario>")
    @Override
    public void initiateTest(Scenarios scenario) throws TElementNotFoundException {
        System.out.println("Som tu");
        switch (scenario) {
            case BASIC -> {
                System.out.println("Item hodit exception");
                throw new TElementNotFoundException("//test");
//                f.navigationToUrl("https://greysonconsultingsro.my.salesforce.com");
//                e.inputField("Username").setText(d.userName);
//                e.xpathElement("//input[@id='password']").setText(d.userPass);
//                e.button("Log In").click();
//                e.menuIcon().click();
//                e.menuItem("Sales").click().waitForLoading();
//                e.navigationMenuItem("Opportunities").click();
            }

            case COMPLEX -> {

            }
        }
    }
    @Step("Navigate to screen <scenario>")
    @Override
    public void executeTestActions(Scenarios scenario) throws TElementNotFoundException {
        switch (scenario) {
            case BASIC -> {
                e.inputField("Opportunity Name").setText(f.randomString());
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

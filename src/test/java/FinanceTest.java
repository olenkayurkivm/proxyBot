import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriverException;
import org.testng.ITestResult;
import org.testng.annotations.*;



/**
 * Created by OYurkiv on 10/1/2018.
 */
@Listeners(MyListener.class)
public class FinanceTest {
    final static Logger LOG = Logger.getLogger(FinanceTest.class);
    //private static WebDriver driver;
    FinanceBO financeBO;
    public static final String CHROME = "chrome";
    public static final String FIREFOX = "firefox";
    //private static final int invocationCountR = 5 + (int)(Math.random()*9) ;



//    @BeforeMethod
//    public static void setUp(){
//
//    }


    //@Parameters("ip")
    @Test
    public void testFinance1() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, CHROME);
        //page1.testMinuteEmail();
//        String targetEmail = page1.registerTrustMinuteEmail();
//        //page1.rate1();
//        page1.fillTrustRatingForm(targetEmail);
//        page1.confirmTrustRateUsingMinuteEmail();
//        page1.createTrustPassword();
        page1.goToTrustPilot();
        //page1.getUserAgent();
        Thread.sleep(10*1000);
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance2() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, FIREFOX);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance3() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, CHROME);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance4() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, FIREFOX);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance5() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, CHROME);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance6() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, FIREFOX);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance7() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, CHROME);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance8() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, FIREFOX);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance9() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, CHROME);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance10() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, FIREFOX);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance11() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, CHROME);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance12() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, FIREFOX);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance13() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, CHROME);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance14() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, FIREFOX);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance15() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, CHROME);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance16() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, FIREFOX);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance17() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, CHROME);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance18() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, FIREFOX);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance19() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, CHROME);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance20() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, FIREFOX);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance21() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, CHROME);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance22() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, FIREFOX);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance23() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, CHROME);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance24() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, FIREFOX);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance25() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, CHROME);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance26() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, FIREFOX);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance27() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, CHROME);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance28() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, FIREFOX);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance29() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, CHROME);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }

    @Test(retryAnalyzer = SimpleRetryer.class)
    public void testFinance30() throws Exception{
        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
        TrustAbstractPage page1 = new TrustAbstractPage(proxy, FIREFOX);
        String targetEmail = page1.registerTrustMinuteEmail();
        page1.fillTrustRatingForm(targetEmail);
        page1.confirmTrustRateUsingMinuteEmail();
        page1.createTrustPassword();
    }




//
//    @Test(retryAnalyzer = SimpleRetryer.class)
//    public void testFinance11() throws Exception{
//        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
//        String targetProxy = String.format("%s:%s", proxy.getProxyIp(), proxy.getProxyPort());
//        AbstractPage page1 = new AbstractPage(targetProxy, CHROME);
//        throw new WebDriverException("Custom error");
//    }
//
//    @Test(retryAnalyzer = SimpleRetryer.class)
//    public void testFinance12() throws Exception{
//        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
//        String targetProxy = String.format("%s:%s", proxy.getProxyIp(), proxy.getProxyPort());
//        AbstractPage page1 = new AbstractPage(targetProxy, CHROME);
//        throw new WebDriverException("Standard error");
//    }
//
//    @Test
//    public void testFinance13() throws Exception{
//        ProxyObject proxy = MyCSVParser.parseCSVToProxy();
//        AbstractPage page1 = new AbstractPage(proxy, CHROME);
//        String stateForProxy = page1.findStateForProxy(proxy.getProxyIp());
//        System.out.println("Trust Hello!!!");
//    }



    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult result) throws Exception {
        DriverFactory.closeDriver();
//        if (result.getStatus() == ITestResult.SUCCESS) {
//            int sleepTime = (int) (Math.random() * 600000) + 1200000;
//            //int sleepTime = (int)(Math.random()*3000)+5000;
//            LOG.warn(String.format("Waiting for another bot session : %d", sleepTime));
//            Thread.sleep(sleepTime);
//        }
    }
}

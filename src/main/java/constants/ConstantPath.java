package constants;

public class ConstantPath {

	public final static String SRC_MAIN_RESOURCE = ".//src/main/resources";
	public final static String SRC_TEST_RESOURCE = ".//src/test/resources";

	public final static String EVN_FILEPATH = SRC_MAIN_RESOURCE + ".//configproperty/env.properties";
	
	public final static String CHROME_DRIVER_KEY = "webdriver.chrome.driver";
	public final static String CHROME_DRIVER_VALUE = SRC_TEST_RESOURCE + ".//chromeDriver/chromedriver.exe";
	
	public final static String EDGE_DRIVER_KEY = "webdriver.edge.driver";
	public final static String EDGE_DRIVER_VALUE = SRC_TEST_RESOURCE + ".//edgeDriver/msedgedriver.exe";
	
	public final static int WAIT = 30;
	public final static int FASTWAIT = 3;

	public final static String LOGIN_WORKBOOK_PATH = SRC_TEST_RESOURCE + ".//testData/LoginData.xlsx";

}

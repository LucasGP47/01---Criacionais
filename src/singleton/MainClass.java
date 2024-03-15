package singleton;

public class MainClass {

	public static void main(String[] args) {

        Logger logger = Logger.getInstance();

        logger.logMessage("Status code 504");
        logger.logMessage("Status code 402");

        Logger outroLogger = Logger.getInstance();
        outroLogger.logMessage("Status code 103");

        System.out.println(logger == outroLogger); 

        AppConfig appConfig = AppConfig.getInstance();

        System.out.println("Database URL: " + appConfig.getDatabaseUrl());
        System.out.println("API Key: " + appConfig.getApiKey());

        AppConfig outraConfig = AppConfig.getInstance();

        System.out.println(appConfig == outraConfig); 
    }

}

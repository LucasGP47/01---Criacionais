package singleton;

public class AppConfig {
    private static AppConfig instance;

    private String databaseUrl;
    private String apiKey;

    private AppConfig() {
        this.databaseUrl = "jdbc:mysql://localhost:3306/baseDeDados";
        this.apiKey = "myApiKey";
    }

    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }
}

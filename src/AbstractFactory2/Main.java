package AbstractFactory2;

public class Main {
	 public static void main(String[] args) {

	     DatabaseFactory dbFactory;

	     dbFactory = new MySQLDatabaseFactory();
	     Conexao mySQLConnection = dbFactory.createConnection();
	     Query mySQLQuery = dbFactory.createQuery();

	     mySQLConnection.connect();
	     mySQLQuery.execute();

	     dbFactory = new PostgreSQLDatabaseFactory();
	     Conexao postgreSQLConnection = dbFactory.createConnection();
	     Query postgreSQLQuery = dbFactory.createQuery();

	     postgreSQLConnection.connect();
	     postgreSQLQuery.execute();
	}
}

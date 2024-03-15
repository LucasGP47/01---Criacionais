package AbstractFactory2;

interface Conexao {
 void connect();
}

interface Query {
 void execute();
}

interface DatabaseFactory {
 Conexao createConnection();
 Query createQuery();
}

class MySQLConnection implements Conexao {
 @Override
 public void connect() {
     System.out.println("Conectando com o banco de dados MYSQL");
 }
}

class MySQLQuery implements Query {
 @Override
 public void execute() {
     System.out.println("Executando MYSQL Query");
 }
}

class PostgreSQLConnection implements Conexao {
 @Override
 public void connect() {
     System.out.println("Conectando com o banco de dados PostgreSQL");
 }
}

class PostgreSQLQuery implements Query {
 @Override
 public void execute() {
     System.out.println("Executando PostgreSQL query");
 }
}

class MySQLDatabaseFactory implements DatabaseFactory {
 @Override
 public Conexao createConnection() {
     return new MySQLConnection();
 }

 @Override
 public Query createQuery() {
     return new MySQLQuery();
 }
}

class PostgreSQLDatabaseFactory implements DatabaseFactory {
 @Override
 public Conexao createConnection() {
     return new PostgreSQLConnection();
 }

 @Override
 public Query createQuery() {
     return new PostgreSQLQuery();
 }
}

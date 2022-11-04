public class MySQLAdapter implements DbAdapter {

  // private MySQLCommands mysql;
  private MySQLCommands mysql = new MySQLCommands();

  public void insert() {
    mysql.insertMySQL();
  }

  public void update() {
    mysql.updateMySQL();
  }

  public void delete() {
    mysql.deleteMySQL();
  }

}

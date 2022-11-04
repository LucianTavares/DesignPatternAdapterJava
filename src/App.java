public class App {
    
    public static void main(String[] args) throws Exception {

        DbAdapter db = new MySQLAdapter();
        db.insert();
        db.update();
        db.delete();
        
    }
}

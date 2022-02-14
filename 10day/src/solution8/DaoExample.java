package solution8;

public class DaoExample {

	public static void main(String[] args) {
		dbWork(new OracleDao());
		System.out.println();
		dbWork(new MySqlDao());

	}

	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
}

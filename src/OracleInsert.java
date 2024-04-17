
import java.sql.*;

public class OracleInsert {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "C##GREEN";		//아이디
		String password = "GREEN1234";

		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.\n");

			Statement stmt = conn.createStatement();

			String sql = "SELECT * FROM EMP";  //emp 테이블 내용 조회
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.print(rs.getString("EMPNO") + " ");
				System.out.print(rs.getString("ENAME") + " ");
				System.out.print(rs.getString("JOB") + " ");
				System.out.print(rs.getString("MGR") + " ");
				System.out.print(rs.getString("HIREDATE") + " ");
				System.out.print(rs.getString("SAL") + " ");
				System.out.print(rs.getString("COMM") + " ");
				System.out.println(rs.getString("DEPTNO") + " ");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("jdbc driver loading fail.");
		} catch (SQLException e) {
			System.out.println("oracle connection fail.");
		}

	}

}

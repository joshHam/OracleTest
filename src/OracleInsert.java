import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleInsert {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "C##GREEN";
		String password = "GREEN1234";
		
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			Connection conn = DriverManager.getConnection(url, user,password);
			System.out.println("oracale connection success.\n");
			Statement stmt = conn.createStatement();
//--------------------------------------------------------------------------------
																//(Quiz)인서트 여러번 사용 가능
			String sql1 = "SELECT max(deptno) FROM dept";		//SELECT max() 최댓값 찾기
			ResultSet rs = stmt.executeQuery(sql1);
			int newnum = 0;
			while(rs.next()) {
				newnum = rs.getInt("max(deptno)");
			System.out.println(rs.getInt("max(deptno)"));
			}
			newnum+=1;
			
//			while(rs.next()) {
//				System.out.print(rs.getString("deptno")+"\t");
//				System.out.print(rs.getString("dname")+"\t");
//				System.out.println(rs.getString("loc")+" ");
//			}
			
			
			

			
			
			
			String ideptno = Integer.toString(newnum), sdname = "IT", sloc="SEOUL";
			String sql = "INSERT INTO dept VALUES ('"+ideptno+"','"+sdname+"','"+sloc+"')";

			boolean b = stmt.execute(sql);
			if(!b) {
				System.out.println("Insert success.\n");
			}else {
				System.out.println("Insert fail.\n");
			}
			

			
			
			String sql2 = "SELECT deptno, dname, loc FROM dept";
			ResultSet rs2 = stmt.executeQuery(sql2);
			while(rs2.next()) {
				System.out.print(rs2.getString("deptno")+"\t");
				System.out.print(rs2.getString("dname")+"\t");
				System.out.println(rs2.getString("loc")+" ");
			}
			
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e) {
//			System.out.println(e);
//			java.sql.SQLIntegrityConstraintViolationException: ORA-00001: 무결성 제약 조건(C##GREEN.PK_DEPT)에 위배됩니다
			e.printStackTrace();
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}


public class MemberVo {
	private String empno;
	private String ename;
	private int sal;
//	private int comm;
//	private int salComm;

	public MemberVo() {

	}

	public MemberVo(String empno, String ename, int sal) {
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
//		this.comm = comm;
//		this.salComm = salComm;
	}

//	public int getComm() {
//		return comm;
//	}

//	public int getSalComm() {
//		return salComm;
//	}

	public String getEmpno() {
		return empno;
	}

	public String getEname() {
		return ename;
	}

	public int getSal() {
		return sal;
	}

}

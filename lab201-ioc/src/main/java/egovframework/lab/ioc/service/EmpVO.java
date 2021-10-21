package egovframework.lab.ioc.service;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class EmpVO implements Serializable, Comparable<EmpVO> {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2136423284978691217L;//자동생성..권고사항, 설정하지 않아도 JVM에서 자동으로 만든다.

	// TODO [Step 1-2, 2-2] EmpVO 작성
	private int empNo;

    private String empName;

    private String job;

    private BigDecimal mgr;

    private Date hireDate;

    private BigDecimal sal;

    private BigDecimal comm;

    private BigDecimal deptNo;

	
	
	public int getEmpNo() {
		return empNo;
	}



	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public String getJob() {
		return job;
	}



	public void setJob(String job) {
		this.job = job;
	}



	public BigDecimal getMgr() {
		return mgr;
	}



	public void setMgr(BigDecimal mgr) {
		this.mgr = mgr;
	}



	public Date getHireDate() {
		return hireDate;
	}



	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}



	public BigDecimal getSal() {
		return sal;
	}



	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}



	public BigDecimal getComm() {
		return comm;
	}



	public void setComm(BigDecimal comm) {
		this.comm = comm;
	}



	public BigDecimal getDeptNo() {
		return deptNo;
	}



	public void setDeptNo(BigDecimal deptNo) {
		this.deptNo = deptNo;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	//EmpVO 의 empNo 속성의 크기를 비교하기 위한 메소드
	public int compareTo(EmpVO o) {
		if (empNo > o.getEmpNo()) {
			return 1;
		} else if (empNo < o.getEmpNo()) {
			return -1;
		} else {
			return 0;
		}
	}

	
}

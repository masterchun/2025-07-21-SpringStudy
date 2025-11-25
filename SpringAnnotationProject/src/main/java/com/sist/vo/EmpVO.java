package com.sist.vo;

import java.util.Date;

import lombok.Data;

@Data
public class EmpVO {
	private int empno, deptno, sal, comm, mgr;
	private Date hiredate;
	private String ename, job, dbday;
	private DeptVO dvo = new DeptVO();
}

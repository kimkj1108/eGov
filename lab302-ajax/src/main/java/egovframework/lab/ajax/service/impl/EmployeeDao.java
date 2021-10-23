package egovframework.lab.ajax.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository("employeeDao")
@SuppressWarnings("deprecation")
public class EmployeeDao extends EgovAbstractMapper {
		
	//DAO에서는 DB에 접근해서 가져온다.
	@SuppressWarnings("unchecked")
	public List<String> getNameListForSuggest(String namePrefix){
		return (List<String>)list("Employee.getNameListForSuggest",namePrefix);
	}



}

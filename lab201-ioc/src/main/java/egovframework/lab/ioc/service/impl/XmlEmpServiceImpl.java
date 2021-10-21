package egovframework.lab.ioc.service.impl;

import java.util.List;

import egovframework.lab.ioc.service.EmpService;
import egovframework.lab.ioc.service.EmpVO;

public class XmlEmpServiceImpl implements EmpService {

    // TODO [Step 1-3] XmlEmpServiceImpl 작성
	
	private XmlEmpDAO empDAO;

	//empDAO를 해당 객체를 통해 컨테이너로 부터 주입받아 동작받는다.
    public void setEmpDAO(XmlEmpDAO empDAO) {
        this.empDAO = empDAO;
    }

    //----
    //EmpService에 복잡한 비지니스로직이 필요하지 않는 경우로 DAO에 단순 CRUD 기능을 위임해 처리하고 있다.
    
    public void insertEmp(EmpVO empVO) throws Exception {
        empDAO.insertEmp(empVO);
    }

    public void updateEmp(EmpVO empVO) throws Exception {
        empDAO.updateEmp(empVO);
    }

    public void deleteEmp(EmpVO empVO) throws Exception {
        empDAO.deleteEmp(empVO);
    }

    public EmpVO selectEmp(EmpVO empVO) throws Exception {
        return empDAO.selectEmp(empVO);
    }

    public List<EmpVO> selectEmpList() throws Exception {
        return empDAO.selectEmpList();
    }

}

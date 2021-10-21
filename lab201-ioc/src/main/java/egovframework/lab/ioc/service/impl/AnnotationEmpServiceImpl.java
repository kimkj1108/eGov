package egovframework.lab.ioc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import egovframework.lab.ioc.postprocess.Debug;
import egovframework.lab.ioc.service.EmpService;
import egovframework.lab.ioc.service.EmpVO;

public class AnnotationEmpServiceImpl implements EmpService {

    // TODO [Step 2-3] AnnotationEmpServiceImpl 작성
	
	 @Resource(name = "annotationEmpDAO")//해당 어노테이션을 사용하여 annotationEmpDAO 인젝션함
	    private AnnotationEmpDAO empDAO;

	    public void insertEmp(EmpVO empVO) throws Exception {
	        empDAO.insertEmp(empVO);
	    }

	    public void updateEmp(EmpVO empVO) throws Exception {
	        empDAO.updateEmp(empVO);
	    }

	    @Debug
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

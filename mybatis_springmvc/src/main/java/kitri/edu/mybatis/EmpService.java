package kitri.edu.mybatis;

import java.util.List;

public interface EmpService {
	
	
	
	List<EmpVO>getAllEmp();

	
	
	EmpVO getOneEmp(int id);
	
	
		
	int insertEmp(EmpVO vo);
	
	
	
	int updateEmp(EmpVO vo);
	
	

	
	int deleteEmp(int id);
	
	
	
	
	
}

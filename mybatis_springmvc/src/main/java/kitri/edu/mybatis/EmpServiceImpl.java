package kitri.edu.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpDAO empDAO;
	
	@Override
	public List<EmpVO> getAllEmp() {
		
		
		
		return empDAO.getAllEmp();
	}


	@Override
	public EmpVO getOneEmp(int id) {
		
		return empDAO.getOneEmp(id);
	}

	@Override
	public int insertEmp(EmpVO vo) {
	
		return empDAO.insertEmp(vo);
	}

	@Override
	public int updateEmp(EmpVO vo) {
	
		return empDAO.updateEmp(vo);
	}

	@Override
	public int deleteEmp(int id) {
	
		return empDAO.deleteEmp(id);
	}
	
	
	public List<EmpVO> getpagingEmp(int page){
		
		return empDAO.getPagingEmp(page);
	}

	public List<EmpVO> getSearchEmp(EmpVO vo){
		
		return empDAO.getSearchEmp(vo);
	}
}

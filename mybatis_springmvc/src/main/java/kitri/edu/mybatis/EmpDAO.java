package kitri.edu.mybatis;




import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class EmpDAO  {
	
		@Autowired
		SqlSession session;
		
		public void setSession(SqlSession ss){
			
			session = ss;
			
		}
	
		
		//전체조회
		List<EmpVO>getAllEmp(){
			
		List<EmpVO> list = session.selectList("emp.all");
		
		return list;
		
		}
		//전체조회
		
		//조회
		EmpVO getOneEmp(int id){
			
		EmpVO vo1 = session.selectOne("emp.one", id);
		
		return vo1;
		
		}
		//조회
				
		//삽입
		public int insertEmp(EmpVO vo){
		
		
		return session.insert("emp.createWithSelectKey", vo);
		}
		//삽입
		
		//업데이트
		public int updateEmp(EmpVO vo){
			
			return session.update("emp.update", vo);
		}
		//업데이트
		
		//삭제
		public int deleteEmp(int id){
		
		return session.delete("emp.delete", id);
			
		}
		//삭제
		
		
		//페이징
		public List<EmpVO> getPagingEmp(int page){
			
			int start = (page-1)*10 + 1;
			int end = page*10;
			
			int rownum[] = new int [2];
			rownum[0] = start;
			rownum[1] = end;
			
			return session.selectList("emp.pagingemp", rownum);
			
			
		}
		//페이징
		
		//조건검색
		
		public List<EmpVO> getSearchEmp(EmpVO vo){
			
			System.out.println(vo);
			
		return	session.selectList("emp.searchemp", vo);
			
		
		}
}
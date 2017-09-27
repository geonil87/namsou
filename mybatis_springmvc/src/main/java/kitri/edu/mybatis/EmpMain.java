package kitri.edu.mybatis;




import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class EmpMain  {
	
	public static void main(String args[]) throws Exception{
	/*	
		//=======================================================================================
		ApplicationContext factory = new ClassPathXmlApplicationContext("mybatis/spring/spring-mybatis.xml");
		EmpServiceImpl service = factory.getBean("service", mybatis.spring.EmpServiceImpl.class);
		//=======================================================================================
		*/
				
		/*//=======================================================================================
		List<EmpVO> list = service.getAllEmp();
		for(EmpVO vo : list){
			System.out.println("전체조회 : " +vo.getEmployee_id()+":"+vo.getFirst_name()+":"+vo.getPhone());
		}
		//=======================================================================================
		
	
		//=======================================================================================
		EmpVO vo1 = service.getOneEmp(1001);
		System.out.println("일부조회 : " +vo1.getEmployee_id()+":"+vo1.getFirst_name()+":"+vo1.getHire_date());
		//=======================================================================================
	
		
		//=======================================================================================
		EmpVO vo2 = new EmpVO();
		vo2.setFirst_name("민아");
		vo2.setLast_name("AOA");
		vo2.setEmail("maybe1332@naver.com");
		vo2.setPhone("010.9799.5319");
		vo2.setJob_id("IT_PROG");
		System.out.println("삽입 : " +service.insertEmp(vo2));
		//=======================================================================================
		
		
		//=======================================================================================
		EmpVO vo3 = new EmpVO();
		vo3.setEmployee_id(1104);
		vo3.setFirst_name("김");
		vo3.setLast_name("설현");
		vo3.setSalary(20000);
		vo3.setJob_id("SH_CLERK");
		vo3.setDepartment_id(50);
		System.out.println("수정 : " +service.updateEmp(vo3));
		//=======================================================================================
		
	
		//=======================================================================================
		System.out.println("삭제 : " + service.deleteEmp(1107));
		//=======================================================================================
	*/
	}

}

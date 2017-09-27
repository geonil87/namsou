package kitri.edu.mybatis;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {
	@Autowired
	EmpServiceImpl service;
	
	
	@RequestMapping("allemp.mybatis")
	public ModelAndView getAllEmp(){
		
		List<EmpVO> list = service.getAllEmp();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("allemplist", list);
		
		mav.setViewName("allemp");
		
		return mav;
		
		}
	
	@RequestMapping("pagingemp.mybatis")
    public ModelAndView getPagingEmp(int page) {
	List<EmpVO> list = service.getpagingEmp(page);
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("allemplist", list);
		
		mav.setViewName("allemp");
		
		return mav;
    }

	@RequestMapping(value="searchemp.mybatis", method=RequestMethod.GET)
    public String getSearchFrom() {

		
		return "serachempfrom";
    }
	@RequestMapping(value="searchemp.mybatis", method=RequestMethod.POST)
    public ModelAndView getSearchFrom(String searchname, String word, EmpVO vo) {

		System.out.println(searchname + ":" +word);
		if(searchname.equals("employee_id")){
		vo.setEmployee_id(Integer.parseInt(word));
		}
		else if(searchname.equals("first_name")){
		vo.setFirst_name("%"+word+"%");
		vo.setLast_name("%"+word+"%");
		}
		else if(searchname.equals("phone")){
		vo.setPhone("%"+word+"%");
		}
		List<EmpVO> list = service.getSearchEmp(vo);
		
	ModelAndView mav = new ModelAndView();
		
		mav.addObject("allemplist", list);
		
		mav.setViewName("allemp");
		
		return mav;
    }

	
		
	}

package test;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.test.context.*;
import org.springframework.test.context.junit4.*;

import com.moyda.www.dao.*;
import com.moyda.www.entity.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/**/*-context.xml")
public class ProgramTest {
	
	@Autowired
	private ProgramDao proDao;

//	@Test
	public void makeProgramTest() {
		for(int i=1; i<51; i++) {
			Program pro = Program.builder().hostNo(i).name(i+"번 프로그램").content(i+"번 프로그램내용").fee(i*10000)
					.note(i+"번 소개글").build();
			proDao.makeProgram(pro);
		}
	}
	
//	@Test
	public void makeCourseTest() {
		for(int i=1; i<51; i++) {
			Course cou = Course.builder().courseNo(i).userNo(i).openNo(i).programNo(i).hostNo(i).build();
			proDao.makeCourse(cou);
		}
	}

}

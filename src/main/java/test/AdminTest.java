package test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.test.context.*;
import org.springframework.test.context.junit4.*;

import com.moyda.www.dao.*;
import com.moyda.www.entity.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/**/*-context.xml")
public class AdminTest {

	@Autowired
	private AdminDao dao;
	@Autowired
	private UserDao userDao;
	@Autowired
	private ProgramDao proDao;
	
	
//	@Test
	public void initTest() {
		assertThat(dao, is(notNullValue()));
	}

//	@Test
	public void hostJoinTest() {
		for(int i=1; i<51; i++) {
			Host host = Host.builder().email(i+"naver.com").nickname("host"+i).profile("default.jpg").phone("01000000000")
					.area("한국").account("0000"+i+"0000").password("1234").reportCnt(3).checkCode(null).build();
			userDao.hostJoin(host);
		}
	}
	
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
	
//	@Test
	public void userJoinTest() {
		for(int i=1; i<51; i++) {
			User user = User.builder().email(i+"user@naver.com").irum(i+"이름").nickname(i+"닉네임").phone("01000000000").age(i)
					.sex("f").area("한국").profile("default.jpg").password("1234").cash(i*10000).build();
			userDao.userJoin(user);
		}
	}
	
//	@Test
//	@Transactional
	public void updateTest() {
		User u = User.builder().userNo(4).enabled(false).build();
		System.out.println(u);
		assertThat(dao.updateUser(u), is(1));
		System.out.println("b");
	}
	
//	@Test
	public void findTest() {
		assertThat(dao.findUserById(2), is(1));
	}
	
//	@Test
	public void findHostDetailTest() {
		System.out.println(dao.findHostDetailById(1));
		assertThat(dao.findHostDetailById(1), is(1));
	}
	
}

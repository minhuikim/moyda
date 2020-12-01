Admin Check

1. db
	-> sqldb.txt update

2. AdminTest
	-> hostJoinTest, makeProgramTest, makeCourseTest, userJoinTest
	-> Test

3. Tomcat Server
	-> <Context docBase="d:/stsproject/moyda_/src/main/webapp/img/profile" path="/profile" reloadable="true"/>
	
4. http://localhost:8081/www/admin/main
	-> list, pagination, link, button
	-> User management - User ID check / User Account suspension
	-> application program - Host ID check / information
	-> report program - Host ID check / User ID check / Host Account suspension and Program delete

5. AdminCode (BACK)
	- adminController package
	- adminService package
	- Controller package
	- AdminDao Class
	- ProgramDao Class - makeProgram method, makeCourse method
	- UserDao Class - userJoin method, hostJoin method
	- AdminPage Dto, AdminProgramHostDto, AdminProgramUserDto, AdminProHostUserDto
	- AdminTest
	- AdminMapper
	- UserMapper - userJoin, hostJoin
	- ProgramMapper - makeProgram, makeCourse

6. AdminCode (FRONT)
	- views - main.jsp, adminMain.jsp
	- include - aside.jsp, footer.jsp, nav.jsp
	- admin folder
	- mainpage - notImplemented.jsp
	
7. 기술 사용 정보
- 회원가입시 test의 for문을 통해 dao, mapper를 거쳐 db로 값을 넘겨 저장
- inner join과 outer join을 통해 회원, 호스트, 프로그램, 코스 테이블을 join하여
	resultMap을 사용해 원하는 정보(신고된 경우 등) 불러오기
- 불러온 정보를 list와 pagination을 사용해 출력
- 출력된 정보를 삭제, 정지, 활성화 할 수 있도록 버튼 활성화 및 html로 만든 테이블 모두에서 버튼 활성화 될 수 있도록
	jQuery 정규식(id^[])을 사용해 버튼 활성화
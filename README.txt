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
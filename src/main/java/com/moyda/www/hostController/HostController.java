package com.moyda.www.hostController;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import com.moyda.www.dto.HostDto.*;
import com.moyda.www.entity.*;
import com.moyda.www.hostService.*;

@Controller
public class HostController {
	
	@Autowired
	private HostService service;
	
	//	留덉씠 �럹�씠吏�, �궡 �젙蹂� 蹂닿린
//	@GetMapping({"/host/myPage"})
//	public ModelAndView hostMyPage() {
//		return new ModelAndView("main").addObject("viewname", "hostMain.jsp").addObject("my", "host/hostInfoMain.jsp").addObject("infoMain", "hostInfo.jsp").addObject("host", service.hostMyPage(36));
//	}
//	
//	//	�궡 �젙蹂� �닔�젙
//	@GetMapping({"/host/infoUpdate"})
//	public ModelAndView hostInfoUpdate() {
//		return new ModelAndView("main").addObject("viewname", "hostMain.jsp").addObject("my", "host/hostInfoMain.jsp").addObject("infoMain", "infoUpdate.jsp").addObject("host", service.hostInfoUpdate(36));
//	}
	
	//	�궡 �젙蹂� �닔�젙
	@PostMapping({"/host/update"})
	public ResponseEntity<?> hostUpdate(UpdateRequestDto dto) {
		dto.setHostNo(36);
		
		if(service.update(dto)==true) {
			return ResponseEntity.ok(null);
		}
		return ResponseEntity.status(HttpStatus.CONFLICT).body(null);
	} 

	//	�쉶�썝 �깉�눜 �솗�씤
	@GetMapping({"/host/out"})
	public ModelAndView hostOut() {
		return new ModelAndView("main").addObject("viewname", "hostMain.jsp").addObject("my", "host/hostInfoMain.jsp").addObject("infoMain", "hostOut.jsp").addObject("host", service.hostOutCheck(36));
	}
	
	//	�깉�눜=怨꾩젙 �젙吏� 泥섎━
	@PostMapping({"/host/out"})
	public String hostOut(OutCheckDto dto) {
		service.hostOut(dto);
		return "redirect:/";
	}

	//	�궡 �봽濡쒓렇�옩 蹂닿린
//	@GetMapping({"/host/myProgram"})
//	public ModelAndView hostMyProgram() {
//		return new ModelAndView("main").addObject("viewname", "hostMain.jsp").addObject("my", "host/myProgramMain.jsp").addObject("proMain", "myProgram.jsp").addObject("pro", service.myProgram(36));
//	}
//
//	//	�궡 �봽濡쒓렇�옩 �닔�젙
//	@GetMapping({"/host/myProgramUpdate"})
//	public ModelAndView hostMyProgramUpdate() {
//		return new ModelAndView("main").addObject("viewname", "hostMain.jsp").addObject("my", "host/myProgramMain.jsp").addObject("proMain", "programUpdate.jsp").addObject("pro", service.myProgram(36));
//	}
	
	@PostMapping({"/host/programUpdate"})
	public ResponseEntity<?> hostMyProgramUpdate(MyProgramDto dto) {
		dto.setHostNo(36);
		
		if(service.programUpdate(dto)==true) {
			System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
			return ResponseEntity.ok(null);
		}
		System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
		return ResponseEntity.status(HttpStatus.CONFLICT).body(null);
	}
	
	//	�봽濡쒓렇�옩 �벑濡�
	@GetMapping({"/host/programRegistration"})
	public ModelAndView hostProgramRegistration() {
		return new ModelAndView("main").addObject("viewname", "hostMain.jsp").addObject("my", "host/myProgramMain.jsp").addObject("proMain", "programRegistration.jsp");		
	}
	
	//	�봽濡쒓렇�옩 �벑濡�
	@PostMapping({"/host/programRegistration"})
	public ModelAndView hostProgramRegistration(ProgramRegiDto dto) {
		//	�궗吏꾪뙆�씪 varchar2 50�옄 �옄�룞 �깮�꽦
		dto.setProfile("00000000001111111111222222222233333333334444444444");
		//	濡쒓렇�씤�븳 �븘�씠�뵒 hostNo諛쏆븘�삤湲�
		dto.setHostNo(36);
		//	�떆���뒪 or Max媛� �씫�뼱�꽌 +1 
		dto.setProNo(4);
		Integer proNo = service.programRegistration(dto);
		return new ModelAndView("redirect:/host/myProgram");
	}
	
	//	�봽濡쒓렇�옩 �궘�젣	
	@GetMapping({"/host/programDelete"})
	public ModelAndView hostProgramDelete() {
		return new ModelAndView("main").addObject("viewname", "hostMain.jsp").addObject("my", "host/myProgramMain.jsp").addObject("proMain", "programDelete.jsp");
	}

	//	�봽濡쒓렇�옩 �궘�젣
	@PostMapping({"/host/programDelete"})
	public String programDelete() {
		//	�꽌鍮꾩뒪 異붽��븷 寃�
		return "redirect:/";
	}
	
	//	李멸�鍮� 吏�湲됱슂泥�
//	@GetMapping({"/host/pay"})
//	public ModelAndView hostPay() {
//		return new ModelAndView("main").addObject("viewname", "hostMain.jsp").addObject("my", "host/hostPay.jsp").addObject("pro", service.myProgram(36));
//	}
//	
//	//	李멸�鍮� 吏�湲됱슂泥�
////	@PostMapping({"/host/pay"})
////	public ModelAndView hostPayRequest() {
////		Integer proNo = 1;
////		Integer openNo = 1;
////		Integer usersNo = 11;
////		Integer hostNo = 36;
////		Program programSignUp = service.programSignUp(proNo, openNo, usersNo, hostNo);
////		return new ModelAndView("redirect:/host/pay");
////	}
//	
//	//	李멸�鍮� 吏�湲됱셿猷�
//	@PostMapping({"/host/pay"})
//	public ModelAndView hostPayComplete() {
//		Integer hostNo = 36;
//		return new ModelAndView("main").addObject("viewname", "hostMain.jsp").addObject("my", "host/hostPayComplete.jsp").addObject("host", service.hostMyPage(hostNo)).addObject("pro", service.myProgram(hostNo));
//	}
}


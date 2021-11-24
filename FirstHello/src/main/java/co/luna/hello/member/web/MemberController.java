package co.luna.hello.member.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
	
	@GetMapping("/memberList.do") // 1 호출명
	public String memberList(Model model) { // 2 메소드명
		model.addAttribute("message", "멤버리스트입니다."); // request.setAttribute("members", memberDao.memberSelectList());와 같은 역할
		return "member/memberList"; // 3 jsp명을 일치시킨다.
	}

}

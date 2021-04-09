package controller;

import dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/home")
    public String home(){

        return "homepage";
    }

    @RequestMapping("/index")
    public String index(){

        return "index";
    }

    @RequestMapping("/loginForm")
    public String loginForm(){

        return "loginForm";
    }

    //해당 url/id 값으로 요청이 들어오면 loginResultView 메소드 실행
    @RequestMapping("/loginResultView/{id}")
    public String loginTestResult(@PathVariable String id, Model model){

        MemberDto dto = memberService.selectMember(id);

        model.addAttribute("member", dto);

        return "loginResultView";
    }

}

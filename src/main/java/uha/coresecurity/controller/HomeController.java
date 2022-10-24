package uha.coresecurity.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@Controller
//public class UserController {
////
////    @GetMapping("/loginpage")
////    public String index(){
////        return "/loginpage";
////    }
//
//    @GetMapping("/")
//    public String index(){
//        return "/main";
//    }
//}

@Controller
public class HomeController {

    @GetMapping(value="/")
    public String home() throws Exception {
        return "/main";
    }

    @PostMapping(value="/")
    public String postHome() throws Exception {
        return "home";
    }
    @PostMapping(value = "/loginpage")
    public void simpletest(String us, String pw) throws Exception{
        System.out.println(us);
        System.out.println(pw);


        System.out.println("post 탄다");
        //response.sendRedirect("/"+request.getRequestURL().toString());
    }
    @GetMapping(value = "/loginpage")
    public void simpletest2(HttpServletRequest request, HttpServletResponse response) throws Exception{
        System.out.println(request.getParameterNames());
        System.out.println(request.getContextPath());
        System.out.println(request.getRequestURI());

        System.out.println("get 탄다");
        //response.sendRedirect("/"+request.getRequestURL().toString());
    }

    //아예 안탄다.

}

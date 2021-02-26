package feb21.f14.Controller;

import feb21.f14.Repository.UserRepository;
import feb21.f14.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    public String home() {

        return "add";
    }

    @RequestMapping("addNumber")
    public String addUser(User ob) {
        System.out.println(ob);
        userRepository.save(ob);
        return "success";
    }
    @RequestMapping("addMore")
    public String addMore() {

        return "add";
    }


}
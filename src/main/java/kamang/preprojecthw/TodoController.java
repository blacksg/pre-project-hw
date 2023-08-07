package kamang.preprojecthw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/")
    public String greeting() {
        return "To-do Application!";
    }
}

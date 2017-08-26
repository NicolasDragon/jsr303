package hello;

import hello.annotation.CheckExistence;
import hello.annotation.CheckStock;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Validated
public class FruitsController {

    /**
     * two custom annotations to check good parameter and stock
     */
    @RequestMapping("/fruits/{name}")
    @ResponseBody
    @CheckExistence
    public String fruits(@CheckStock @PathVariable  String name) {
        return "I know there are fruits left";
    }

}
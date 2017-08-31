package hello;

import hello.annotation.CheckExistence;
import hello.annotation.CheckStock;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;

@Controller
@Validated //this is annotation is needed to force spring to validate the parameters
public class FruitsController {

    /**
     * two custom annotations to check good parameter and stock
     * if any violation a ConstraintViolationException is thrown
     */
    @RequestMapping(value = "/fruits/{name}", method = RequestMethod.GET)
    @ResponseBody
    @CheckExistence
    public String fruits(@CheckStock @PathVariable String name) {
        return "I know there are fruits left";
    }


    @ExceptionHandler(value = ConstraintViolationException.class)
    @ResponseBody
    public String exceptionHandler(ConstraintViolationException e) {
        return e.getConstraintViolations().iterator().next().getMessage();
    }
}
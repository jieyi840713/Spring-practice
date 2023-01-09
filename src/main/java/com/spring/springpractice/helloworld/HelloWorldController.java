package com.spring.springpractice.helloworld;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
import org.springframework.context.MessageSource;

@RestController
public class HelloWorldController {

//    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World Beans");
    }



        private MessageSource messageSource;

        public HelloWorldController(MessageSource messageSource) {
            this.messageSource = messageSource;
        }

        @GetMapping(path = "/hello-world-internationalized")
        public String helloWorldInternationalized() {
            Locale locale = LocaleContextHolder.getLocale();
            return messageSource.getMessage("good.morning.message", null, "Default Message", locale );
            //1:
            //2:
//		- Example: `en` - English (Good Morning)
//		- Example: `nl` - Dutch (Goedemorgen)
//		- Example: `fr` - French (Bonjour)
//		- Example: `de` - Deutsch (Guten Morgen)

        }
}

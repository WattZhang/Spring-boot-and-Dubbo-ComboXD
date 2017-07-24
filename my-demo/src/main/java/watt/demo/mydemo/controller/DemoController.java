package watt.demo.mydemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import watt.demo.api.MyService;


@Controller
public class DemoController {
    @Autowired
    private MyService myService;
    @GetMapping(path="/add")
    public @ResponseBody String testUser (@RequestParam String url)
    {
        myService.run(url);
        return "finished";
    }

}

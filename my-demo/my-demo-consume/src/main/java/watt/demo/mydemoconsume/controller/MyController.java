package watt.demo.mydemoconsume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import watt.demo.api.MyService;

@Controller
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping(path="/add")
    public @ResponseBody String DemoSpider(@RequestParam String url)
    {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:dubbo/*.xml"});
//        context.start();
//        MyService myService = (MyService)context.getBean("myService"); // 获取远程服务代理

        String hello = myService.run("world"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果
        return "finished" + hello;
    }

}

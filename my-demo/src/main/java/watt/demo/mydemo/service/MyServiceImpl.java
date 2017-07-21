package watt.demo.mydemo.service;

import org.springframework.stereotype.Service;
import watt.demo.api.MyService;

@Service
public class MyServiceImpl implements MyService {
    public String run(String url){

        return "test";
    }
}

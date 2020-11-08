package io.alauda.demo.controller;

import io.alauda.demo.vo.Demo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/demo")
public class DemoController {


    /**
     * 查询列表
     */
    @GetMapping
    public List<Demo> demo(){
        List<Demo> demos = new ArrayList<>();
        demos.add(new Demo("卢布",12));
        demos.add(new Demo("秋闱",22));
        demos.add(new Demo("飞雁",30));
        return demos;
    }

}

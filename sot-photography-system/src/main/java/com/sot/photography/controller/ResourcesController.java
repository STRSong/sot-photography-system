package com.sot.photography.controller;

import com.sot.photography.bean.Resources;
import com.sot.photography.service.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 宋佳敏STRSong
 * @Date 2020/4/10 9:10
 * @Version 1.0
 **/

@Controller
public class ResourcesController {

    @Autowired
    ResourcesService resourcesService;

    @ResponseBody
    @GetMapping("/getResources")
    public List<Resources> getResources(@RequestParam("resourcesClass") String resourcesClass){
        Map<String,Object> json = new HashMap<String, Object>();
        List<Resources> resources = resourcesService.getrResourcesByResourcesClass(resourcesClass);

        json.put("resources",resources);
        return resources;
    }

    @GetMapping("/toCommodity")
    public String toCommodity(@RequestParam("commodityId") Integer commodityId){

        return "commodity";
    }

}

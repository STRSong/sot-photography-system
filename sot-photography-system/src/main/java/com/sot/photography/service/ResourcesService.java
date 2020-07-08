package com.sot.photography.service;

import com.sot.photography.bean.Resources;
import com.sot.photography.mapper.ResourcesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 宋佳敏STRSong
 * @Date 2020/4/9 16:04
 * @Version 1.0
 **/
@Service
public class ResourcesService {

    @Autowired
    ResourcesMapper resourcesMapper;

    //查询所有资源
    public List<Resources> getAllResources(){
        List<Resources> allResources = resourcesMapper.getAllResources();
        return allResources;
    }

    //根据资源ID查询
    public Resources getResourcesByResourcesId(Integer id){
        Resources resources = resourcesMapper.getResourcesByResourcesId(id);
        return resources;
    }

    //根据种类查询资源
    public List<Resources> getrResourcesByResourcesClass(String resourcesClass){
        List<Resources> resources = resourcesMapper.getrResourcesByResourcesClass(resourcesClass);
        return resources;
    }

    //插入资源信息
    public int insertResources(Resources resources){
        resourcesMapper.insertResources(resources);
        Integer resourcesId = resources.getResourcesId();
        return resourcesId;
    }

    //更新资源信息
    public void updateResources(Resources resources){
        resourcesMapper.updateResources(resources);
    }

    //软删除
    public void updateDesoft(Integer id ,Integer desoft){
        resourcesMapper.updateDesoft(id,desoft);
    }

    //根据id删除资源
    public int deleteResources(Integer id){
        int deleteResources = resourcesMapper.deleteResources(id);
        return deleteResources;
    }


}

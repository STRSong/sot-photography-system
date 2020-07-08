package com.sot.photography.util;

import com.github.pagehelper.PageInfo;
import com.sot.photography.bean.User;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 宋佳敏
 * @apiNote ：2020-2-27
 * @apiNote ：2020-3-13 第二次修改，优化分页按键外形，增加泛型，增加转至
 * 实现功能：
 * 首页 上一页 1 2 3 下一页 末页
 */

public class PageUtil<T> {

//    public <T> T getObject(Class<T> c) throws IllegalAccessException, InstantiationException {
//        T t = c.newInstance();
//        return t;
//    }

    public String getPageInfo(PageInfo<T> pageInfo, HttpServletRequest request){

        //获取当前请求路径
        //String path = request.getContextPath();
        StringBuffer path = request.getRequestURL();
        //System.out.println(path);
        //System.out.println(request.getRequestURL());
        StringBuilder builder = new StringBuilder();
        //拼接首页
        builder.append("<nav aria-label='Page navigation example'>");
        builder.append("<ul class='pagination justify-content-end'>");
        builder.append("<li class='page-item'><form class='form-inline my-lg-0' action='"+path+"' method='get'>");
        builder.append("<button class='btn btn-primary my-2 my-sm-0' type='submit'>转至</button><input name='pageNum' type='number' class='form-control mr-sm-2 ml-1' min='1' max='"+pageInfo.getPages()+"'>页</form></li>");
        builder.append("<li class='page-item disabled'><span class='page-link ml-1 mr-1 rounded-pill'>共"+pageInfo.getPages()+"页，"+pageInfo.getTotal()+"条数据</span></li>");
        builder.append("<li class='page-item'><a href='"+path+"?pageNum=1' class='text-decoration-none'><span class='page-link mr-1 ml-1 rounded-pill'>首页</span></a></li>");
        //拼接上一页th:href="@{/emp/}+${emp.id}"
        if(pageInfo.isHasPreviousPage()){
            builder.append("<li class='page-item'><a href='"+path+"?pageNum="+pageInfo.getPrePage()+"' class='text-decoration-none'><span class='page-link ml-1 mr-1 rounded-pill'>上一页</span></a></li>");
        }else{
            builder.append("<li class='page-item disabled'><span class='page-link ml-1 mr-1 rounded-pill'>上一页</span></li>");
        }

        //拼接页码
        int[] nums = pageInfo.getNavigatepageNums();
        for(int i : nums){
            if (i == pageInfo.getPageNum()){
                builder.append("<li class='page-item active'><a class='page-link ml-1 mr-1 rounded-circle' href='"+path+"?pageNum="+i+"'>"+i+"</a></li>");
            }else{
                builder.append("<li class='page-item'><a class='page-link ml-1 mr-1 rounded-circle' href='"+path+"?pageNum="+i+"'>"+i+"</a></li>");
            }
        }

        //拼接下一页
        if(pageInfo.isHasNextPage()){
            builder.append("<li class='page-item'><a href='"+path+"?pageNum="+pageInfo.getNextPage()+"' class='text-decoration-none'><span class='page-link ml-1 mr-1 rounded-pill'>下一页</span></a></li>");
        }else{
            builder.append("<li class='page-item disabled'><span class='page-link ml-1 mr-1 rounded-pill'>下一页</span></li>");
        }

        //拼接尾页
        builder.append("<li class='page-item'><a href='"+path+"?pageNum="+pageInfo.getPages()+"' class='text-decoration-none'><span class='page-link ml-1 rounded-pill'>尾页</span></a></li>");


        return builder.toString();
    }

}

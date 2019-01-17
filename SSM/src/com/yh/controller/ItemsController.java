package com.yh.controller;

import com.yh.exception.CustomException;
import com.yh.pojo.Items;
import com.yh.service.ItemsService;
import com.yh.utils.Upload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("/items/")//窄化
@Controller
public class ItemsController {


    @Autowired
    private ItemsService itemsService;

    /*三种方法  ModelAndView和String用的较多*/
    @RequestMapping("list")
    public ModelAndView getItemsByQuery() {
        List<Items> list = itemsService.getItemsByQuery(null);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemsList", list);
        /*跳转视图*/
        modelAndView.setViewName("itemsList");
        return modelAndView;
    }

    @RequestMapping("editItem")
    public void findItemsById(@RequestParam(value = "id") Long itemsid, HttpServletRequest request, HttpServletResponse response) throws Exception {
        //调用service方法
        Items items = itemsService.findItemsById(itemsid);

        if (items == null) {
            throw new CustomException("您要获取的商品信息不存在");
        }
        request.setAttribute("item", items);
        request.getRequestDispatcher("/jsp/editItem.jsp").forward(request, response);
    }

    @Value("${PIC_PATH}")//定义全局变量上传位置
    private String pic_path;

    @RequestMapping(value = "edit/submit", method = {RequestMethod.GET, RequestMethod.POST})
    public String updateItem(Items items, MultipartFile pictureFile) throws Exception {
        //调用文件上传工具类方法进行文件上传
        String s = Upload.fileUpload(pictureFile, pic_path);
        items.setPic(s);
        itemsService.updateItems(items);
        //转发
        return "redirect:/items/list.action";

        /*//数据回显
        try{
           // int i=1/0;
            itemsService.updateItems(items);
            //转发
            return "redirect:/items/list.action";
        }catch (Exception ex){
            return  "forward:/items/editItem.action";
        }*/

    }

    @RequestMapping(value = "batchDelete", method = {RequestMethod.GET, RequestMethod.POST})
    public String batchDelete(Integer[] itemsId) {
        //调用service方法
        itemsService.batchDelete(itemsId);
        //重定向
        return "redirect:/items/list.action";
    }
    /*@RequestMapping(value = "login", method = {RequestMethod.GET, RequestMethod.POST})
    public String login(String name, Model model) {
        model.addAttribute("name",name);
        System.out.println("************");

        return "login";
    }*/
    /*前台传来json数据*/
    @RequestMapping(value = "reqJson")
    @ResponseBody
    public  Items reqJson(@RequestBody Items items) {
        System.out.println("…………………………");
        items.setName("小米手机");

        return items;
    }
    /*后台响应给前端JSON数据*/
    @RequestMapping(value = "resJson")
    @ResponseBody
    public  Items resJson(Items items) {
        System.out.println("￥￥￥￥￥￥￥￥￥");
        items.setName("小米手机6");

        return items;
    }

    @RequestMapping(value = "restful/{name}/{price}")
    @ResponseBody
    public  Items restful(@PathVariable("name") String name,Float price) {
        System.out.println("############");
        System.out.println(name+price);

        return new Items();
    }
    @RequestMapping(value = "login")
    @ResponseBody
    public  String restful(@PathVariable String name, String passworde, HttpSession session) {
        session.setAttribute("username" ,name);
        System.out.println(name+passworde);

        return "redirect:list.action";
    }
}

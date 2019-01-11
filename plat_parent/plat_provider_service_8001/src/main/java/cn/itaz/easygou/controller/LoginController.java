package cn.itaz.easygou.controller;

import cn.itaz.easygou.domain.Employee;
import cn.itaz.easygou.util.AjaxResult;
import org.springframework.web.bind.annotation.*;

/**
 * 登录验证测试
 * 登录应该是前台传递用户的 用户名和密码 然后再到 数据库中查询用户名，判断是否存在，若存在再去判断匹配密码
 * 这里还没有连接数据库 模拟数据 用户名: xsyzb 密码 xszb123
 */
@RestController
public class LoginController {
    public static void main(String[] args) {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.getAjax();
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    //以后传递对象前太都要用json对象{},[],后台通过(@RequestBody
    public AjaxResult login(@RequestBody Employee employee){
        if ("xsyzb".equals(employee.getUsername()) && "xszb123".equals(employee.getPassword())){
            return AjaxResult.getAjax(); //一致返回默认值
        }
        return AjaxResult.getAjax().setSucceed(false).setMessage("操作失败"); //不一致 自己设置值
    }
}

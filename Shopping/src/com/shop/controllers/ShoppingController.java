package com.shop.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shop.dao.ShoppingDao;
import com.shop.pojo.AdminPojo;
import com.shop.pojo.ShoppingPojo;

@Controller
public class ShoppingController {

	@Autowired
	ShoppingDao shoppingdao;
	
	@RequestMapping(value="/admin", method=RequestMethod.GET)
	public ModelAndView admin(){
		
		ModelAndView m=new ModelAndView("alogin");
		return m;	
	}
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public ModelAndView user(){
		
		ModelAndView m=new ModelAndView("login");
		return m;	
	}
	@RequestMapping(value="/Register", method=RequestMethod.GET)
	public ModelAndView register(){
		
		ModelAndView m=new ModelAndView("Register");
		return m;	
	}
	@RequestMapping(value="/registeruser", method=RequestMethod.POST)
	public ModelAndView registeruser( @Valid @ModelAttribute("userdata") ShoppingPojo sp, BindingResult result){
		if(result.hasErrors()) {
            return new ModelAndView("Register");
        }
		
		shoppingdao.save(sp);
		return new ModelAndView("login", "message","successfully registered, You can login now");
		
	}
	
	@RequestMapping(value="/adminlogin", method=RequestMethod.POST)
    public String submit(Model model, @ModelAttribute("loginB") AdminPojo loginBean) {
		System.out.println("ADMIN LOGIN");
        if (loginBean.getAdminname() != null && loginBean.getAdminpass() != null) {
            if (loginBean.getAdminname().equals("chinna") && loginBean.getAdminpass().equals("Reddy2337")) {
                model.addAttribute("msg", "welcome" + loginBean.getAdminname());
                return "adminhomepage";
            } else {
                model.addAttribute("error", "Invalid Details");
                return "alogin";
            }
        } else {
            model.addAttribute("error", "Please enter Details");
            return "alogin";
        }
    }
	@RequestMapping(value="/loginuser", method= RequestMethod.POST)
	public ModelAndView loginUser(@ModelAttribute("loginuser") ShoppingPojo sp){
		
		List<ShoppingPojo> sp1=shoppingdao.loginuser(sp.getEmail(),sp.getPass());
		//System.out.println(sp1.isEmpty());
		if(sp1.isEmpty())
		
			return new ModelAndView("login", "message","wrong details Please enter valid details");
			
		else
			return new ModelAndView("home", "message","  " +sp1.get(0).getFname());
		
	}
	@RequestMapping("/shop")
	public String shop(){
		return "shop";
	}
	@RequestMapping("/viewCart")
	public String viewCart(){
		return "viewCart";
	}
	@RequestMapping("/follow")
	public String follow(){
		return "follow";
	}
	@RequestMapping("/contactUs")
	public String contactUs(){
		return "contactus";
	}
	
}

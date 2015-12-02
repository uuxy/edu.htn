package edu.htn.controller;

import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.List;  
import java.util.Map;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestParam;  
import org.springframework.web.servlet.ModelAndView;

import edu.htn.pojo.User;
import edu.htn.services.UserService;  
  
@Controller  
public class HomePageController {  
  
 @Autowired  
 UserService userService;  
  
 @RequestMapping("/register")  
 public ModelAndView registerUser(@ModelAttribute User user) {  
  
  List<String> genderList = new ArrayList<String>();  
  genderList.add("male");  
  genderList.add("female");  
  
  List<String> cityList = new ArrayList<String>();  
  cityList.add("Salt Lake City, UT");  
  cityList.add("Pingdingshan, HN");  
  cityList.add("Shanghai, CN");  
  cityList.add("East Lansing, MI");
  cityList.add("Los Angeles, CA");
  cityList.add("New York, NY");
  
  
  Map<String, List> map = new HashMap<String, List>();  
  map.put("genderList", genderList);  
  map.put("cityList", cityList);  
  return new ModelAndView("register", "map", map);  
 }  
  
 @RequestMapping("/insert")  
 public String inserData(@ModelAttribute User user) {  
  if (user != null)  
   userService.insertData(user);  
  return "redirect:/getList";  
 }  
  
 @RequestMapping("/getList")  
 public ModelAndView getUserLIst() {  
  List<User> userList = userService.getUserList();  
  return new ModelAndView("userList", "userList", userList);  
 }  
  
 @RequestMapping("/edit")  
 public ModelAndView editUser(@RequestParam String id,  
   @ModelAttribute User user) {  
  
  user = userService.getUser(id);  
  
  List<String> genderList = new ArrayList<String>();  
  genderList.add("male");  
  genderList.add("female");  
  
  List<String> cityList = new ArrayList<String>();  
  cityList.add("Salt Lake City, UT");  
  cityList.add("Pingdingshan, HN");  
  cityList.add("Shanghai, CN");  
  cityList.add("East Lansing, MI");
  cityList.add("Los Angeles, CA");
  cityList.add("New York, NY");
  
  
  Map<String, Object> map = new HashMap<String, Object>();  
  map.put("genderList", genderList);  
  map.put("cityList", cityList);  
  map.put("user", user);  
  
  return new ModelAndView("edit", "map", map);  
  
 }  
  
 @RequestMapping("/update")  
 public String updateUser(@ModelAttribute User user) {  
  userService.updateData(user);  
  return "redirect:/getList";  
  
 }  
  
 @RequestMapping("/delete")  
 public String deleteUser(@RequestParam String id) {  
  System.out.println("id = " + id);  
  userService.deleteData(id);  
  return "redirect:/getList";  
 }  
}  
package peaksoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
   public String getAllStudent(){
       return "all_students";
   }

   @GetMapping("/hr_info")
   public String getInfoForHR(){
        return "view_hr";
   }

   @GetMapping("/student")
   public String getStudentPage(){
        return "student";
   }

   @GetMapping("manager_info")
   public String getInfoForManager(){
        return "view_manager";
   }
}

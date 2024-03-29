package springmvcupload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	 @RequestMapping("/upload")
	 public String showuploadfrom()
	 {
		 return "uploadfrom";
	 }
	 
	 @RequestMapping(path = "/uploadimage" , method = RequestMethod.POST)
	 public String fileupload(@RequestParam("profile") CommonsMultipartFile file , HttpSession s , Model model)
	 {
		 System.out.println("file upload handler");
//		 System.out.println(file.getSize());
//		 System.out.println(file.getContentType());
//		 System.out.println(file.getName());
//		 System.out.println(file.getOriginalFilename());
//		 System.out.println(file.getStorageDescription());
		 
		 byte[] data = file.getBytes();
		 // we have to save the file to server and this line help to place the file on server paath
		 //String path = s.getServletContext().getRealPath("/") + file.getOriginalFilename();
		 
		 //this line help place the file in a specific path where you want to place
		 String path = s.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources" 
		 + File.separator + file.getOriginalFilename();
		 System.out.println(path);
		 try {
			 FileOutputStream fos = new FileOutputStream(path);
			 fos.write(data);
			 fos.close();
			 System.out.println("file uploaded successfully");
			 model.addAttribute("msg", "uploaded successfully");
			 model.addAttribute("filename", file.getOriginalFilename());
		 }catch(IOException e)
		 {
			 e.printStackTrace();
			 System.out.println("file not uploaded successfully");
			 model.addAttribute("msg", "Not uploaded successfully");
		 }
		 return "filesuccess";
	 }
}

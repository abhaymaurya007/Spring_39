package com.nt.runners;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.Reader;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.JobSeeker;
import com.nt.service.IJobSeekerMgmtService;

@Component
public class LOBTestRunner1 implements CommandLineRunner {
	@Autowired
	private IJobSeekerMgmtService  jsService;

	@Override
	public void run(String... args) throws Exception {
		//read the inputs
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter JobSeeker id::");
		int id=sc.nextInt();
		
		try {
			//invoke  the service method
			JobSeeker  js=jsService.showJobSeekerById(id);
			System.out.println(js.getJsid()+"  "+js.getJsname()+"  "+js.getIndian());
			
			//convert  entity obj's  byte[]  content to new image file
			byte[]  photoContent=js.getPhoto();
			FileOutputStream fos=new FileOutputStream("new_photo.jfif");
			fos.write(photoContent);
			fos.flush(); fos.close();
			//convert  entity obj's  char[]  content to new   text file
			char[] resumeContent= js.getResume();
			FileWriter  writer=new FileWriter("new_resume.txt");
			writer.write(resumeContent);
			 writer.flush(); writer.close();
			
			System.out.println(" Files  are retrieved from DB tables");
			
		}
		catch(Exception  e) {
			e.printStackTrace();
		}
		
		
			

	}

}

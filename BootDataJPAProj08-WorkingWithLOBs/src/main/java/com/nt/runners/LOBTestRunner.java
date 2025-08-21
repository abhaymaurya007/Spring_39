package com.nt.runners;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.JobSeeker;
import com.nt.service.IJobSeekerMgmtService;

//@Component
public class LOBTestRunner implements CommandLineRunner {
	@Autowired
	private IJobSeekerMgmtService  jsService;

	@Override
	public void run(String... args) throws Exception {
		//read the inputs
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter JobSeeker name::");
		String name=sc.next();
		System.out.println("Enter JobSeeker address::");
		String addrs=sc.next();
		System.out.println("Is JobSeeker indian?::");
		boolean flag=sc.nextBoolean();
		System.out.println("Enter jobseeker photo file path::");
		String photopath=sc.next().trim();
		System.out.println("Etner Jobseeker resume path::");
		String  resumepath=sc.next().trim();
		
		//  convert  photo file content to byte[]
		InputStream is=new FileInputStream(photopath);
		byte[] photoBytes=is.readAllBytes();
		//convert  resumet file content to  char[]
		File file=new File(resumepath);
		long length=file.length();
		Reader  reader=new  FileReader(file);
		char[]  resumeText=new char[(int) length];
		reader.read(resumeText);
		
		//prepare entity  object having data
		JobSeeker js=new JobSeeker(name,addrs,flag,photoBytes,resumeText);
		
		try {
			String msg=jsService.registerJobSeeker(js);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

		

	}

}

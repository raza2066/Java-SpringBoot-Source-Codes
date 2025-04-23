package com.raza;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class FileUploadServlet
 */
@SuppressWarnings("serial")
@WebServlet("/upload")
public class FileUploadServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
		List<FileItem> multifiles = sf.parseRequest(request);
		
		for(FileItem item:multifiles) {
			item.write(new File("D:/PROGRAMMING/01_Java_Full_Stack/Workspaces/Servlet_Workspace/s19FileUpload/uploadedFile"+item.getName())); 
		}
		
	}
}

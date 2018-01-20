package com.librarymap.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.librarymap.common.utils.JsonUtils;
import com.librarymap.pojo.Book;
import com.librarymap.pojo.BookExample;
import com.librarymap.service.IbookService;

@Controller
public class BookController {
	@Autowired
	private IbookService bookService;
	
	@RequestMapping("/book/{id}")
	@ResponseBody
	public Book getBookById(@PathVariable int id){
		Book book = bookService.selectById(id);
		return book;
	}
	
	@RequestMapping("/title/list")
	@ResponseBody
	public String getBookByLikeTitle(String title,HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		int page = Integer.parseInt(request.getParameter("page"));
		int size = Integer.parseInt(request.getParameter("size"));
		BookExample example = new BookExample();
		PageHelper.startPage(page, size);
		List<Book> books = bookService.selectByLikeTitle(title);
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i).getTitle());
		}
		String json = JsonUtils.objectToJson(books);
		return json;
	}
	/**
	 * 获取书本详情
	 * @param title
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/title/detail")
	@ResponseBody
	public String getBookDetail(String title,HttpServletRequest request,HttpServletResponse response) throws IOException{
		//https://www.douban.com/search?q=
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		title = title.replace(" ", "");    //去掉字符串里面的空格
		try {
			URL url =new URL("https://www.douban.com/search?q="+title);   //获取网络对象
			URLConnection uc=url.openConnection();   //建立网络链接  
			uc.setRequestProperty("User-Agent", "java");   //伪装
			InputStream inputStream=uc.getInputStream();  //获取文件输入流
			InputStreamReader in=new InputStreamReader(inputStream,"UTF-8"); //建立io流缓冲
			BufferedReader reader=new BufferedReader(in);   //下载代码缓冲区
			
			//开始下载源码
			//创建一个临时文件 
			String line=null;
			String datilUrl = "";
			//循环
			while((line=reader.readLine())!=null){
				//https://img3.doubanio.com/spic/s29089240.jpg
				//获取图片链接
				
				String jpgAddr = "https://img3.doubanio.com/spic/";
				
				if(line.contains(jpgAddr)){
					jpgAddr = line.substring(line.indexOf(jpgAddr), line.lastIndexOf(".jpg")) + ".jpg";
					System.out.println(jpgAddr);
					break;
				}
			}
			while((line=reader.readLine())!=null){
				//<span>[书籍]</span>&nbsp;<a href="https://www.douban.com/link2/?url=https%3A%2F%2Fbook.douban.com%2Fsubj
				//ect%2F2173574%2F&amp;query=%B5%CB%D0%A1%C6%BD%CE%C4%BC%AF%A3%BA%D2%BB%BE%C5%CB%C4%BE%C5%A1%AA%D2%BB%BE%C5%C6%DF%CB%C4%C4%EA%A3%AE%C9%CF%BE%ED&amp;cat_id=1001&amp;type=search&amp;pos=16"
				datilUrl = "https://www.douban.com/link2/?url=";
				if(line.contains(datilUrl)){
					datilUrl = line.substring(line.indexOf(datilUrl), line.lastIndexOf("target=")-2);
					System.out.println(datilUrl);
					break;
				}
			}
			//关闭
			reader.close();
			in.close();
			getDetail(datilUrl);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//System.out.println(stringBuilder.toString());
		
		return "";
	}
	/**
	 * 获取书本详情信息
	 * @param datilUrl
	 */
	private void getDetail(String datilUrl) {
		try {
			System.out.println(datilUrl);
			URL url =new URL(datilUrl);   //获取网络对象
			URLConnection uc=url.openConnection();   //建立网络链接  
			uc.setRequestProperty("User-Agent", "java");   //伪装
			InputStream inputStream=uc.getInputStream();  //获取文件输入流
			InputStreamReader in=new InputStreamReader(inputStream,"UTF-8"); //建立io流缓冲
			BufferedReader reader=new BufferedReader(in);   //下载代码缓冲区
			
			String line=null;
			while((line=reader.readLine())!=null){
				System.out.println(line);
			}
			//关闭
			reader.close();
			in.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.librarymap.mapper.BookMapper;
import com.librarymap.pojo.Book;
import com.librarymap.pojo.BookExample;

public class JunitTest {
	@Test
	public void testPageHelper() {
		//创建一个spring容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		//获取Mapper代理对象
		BookMapper mapper = applicationContext.getBean(BookMapper.class);
		BookExample example = new BookExample();
		PageHelper.startPage(1, 10);
		List<Book> list = mapper.selectByExample(example);
		
		for (Book book : list) {
			System.out.println(book.getTitle());
		}
		PageInfo<Book> pageInfo = new PageInfo<>(list);
	}
	@Test
	public void testStringCut(){
		String st = "abcdefg.jpg";
		if(st.contains("cdesf")){
			System.out.println("包含");
		}else{
			System.out.println("不包含");
		}
		
		System.out.println(st.substring(st.indexOf("cde"), st.lastIndexOf(".jpg")));
		
	}
}

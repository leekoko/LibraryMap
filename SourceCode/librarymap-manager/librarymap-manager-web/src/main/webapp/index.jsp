<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
	<script type="text/javascript" src="/js/jQuery/jquery.min.1.7.1.js"></script>
<script type="text/javascript">
$(function() {
	$('#keyword').keyup(function initList(){
		var input = $.trim($("#keyword").val());
        if(input!=""){//检测键盘输入的内容是否为空，为空就不发出请求  
			$.ajax({
				type:'post',
				data:{
					title:input
				},
				url:'${pageContext.request.contextPath}/title/list',
				cache:false,//不从浏览器缓存中加载请求信息 
				dataType: 'json',//返回数据  
				success: function (data) {
					if(data.length > 0){
	                    var lists = "<ul id='list'>";  
						$.each(data, function () { 
							shelfno = changeShelf(this.shelfno);
		                 	lists += "<li onclick='initTest(this)' value='"+this.bookid+"' lang='"+this.title+"'>"+ this.title +":"+ this.author +":"+ this.callno +":"+ shelfno +"</li>";
						});
						lists+="</ul>";
						$("#searchBox").html(lists).show();//将搜索到的结果展示出来  
					}
				}
			});
        }else{  
        	$("#searchBox").hide();//没有查询结果就隐藏搜索框
        }
	});	
});

/* function searchBook(){
	var bookId = $.trim($("#bookId").val());
	if(bookId != null || bookId != 0 ||bookId != ""){
		$.ajax({
			type:'post',
			data:{
				title:input
			},
			url:'${pageContext.request.contextPath}/title/list',
			cache:false,//不从浏览器缓存中加载请求信息 
			dataType: 'json',//返回数据  
			success: function (data) {
				if(data.length > 0){
                    var lists  = "<ul id='list'>";  
					$.each(data, function () { 
	                 	lists += "<li onclick='initTest(this)' value='"+this.bookid+"'>"+ this.title +"</li>";
					});
					lists+="</ul>";
					$("#searchBox").html(lists).show();//将搜索到的结果展示出来  
				}
			}
		});
	}else{
		$("#searchBox").html("对不起，找不到信息").show();//将搜索到的结果展示出来 
	}
	
	alert(bookId);
}
 */


//填入内容框
function initTest(obj){
	$("#keyword").val(obj.lang);
	$("#bookId").val(obj.value);
	
	$("#searchBox").hide();  //没有查询结果就隐藏搜索框
}

//转化书架位置
function changeShelf(shelfno){
	var str = "";
	debugger;
	if(shelfno.substring(0,1)!=null && shelfno.substring(0,1) !="" && shelfno.substring(0,1) !="空"){
		if(shelfno.substring(0,1)=='N'){
			str += "北"; 
		}
		str += shelfno.substring(2,3)+"楼";
		str += shelfno.substring(5,7)+"列";
		str += shelfno.substring(7,8)+"面";
		str += shelfno.substring(8,10)+"架";
	}else{
		str = "无"
	}
	return str;
}

</script>

</head>
<body>
显示首页

<div class="header_search">
	<i class="icon-user"></i>
	<input type="text" name="keyword" id="keyword" class="search" placeholder="搜索从这里开始..." />
	<button onclick="searchBook()">搜索</button>
	<div id="searchBox" name="searchBox"></div>
	<input type="hidden" name="bookId" id="bookId"/> 
</div>



</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
<!-- UC强制全屏 -->
<meta name="full-screen" content="yes">
<!-- QQ强制全屏 -->
<meta name="x5-fullscreen" content="true">

    <style>
    *{
        margin: 0;
        padding:0;
        -webkit-tap-highlight-color:rgba(0,0,0,0);
        -webkit-text-size-adjust:none;
    }
    html{
        font-size:10px;
    }
    body{
        background-color: #f5f5f5;
        font-size: 1.2em;
    }
    .header{
        height: 44px;
        line-height: 44px;
        border-bottom: 1px solid #ccc;
        background-color: #eee;
    }
    .header h1{
        text-align: center;
        font-size: 2rem;
        font-weight: normal;
    }
    .content{
        max-width: 640px;
        margin: 0 auto;
        background-color: #fff;
    }
    .content .item{
        display: -webkit-box;
        display: -webkit-flex;
        display: -ms-flexbox;
        display: flex;
        -ms-flex-align:center;
        -webkit-box-align:center;
        box-align:center;
        -webkit-align-items:center;
        align-items:center;
        padding:3.125%;
        border-bottom: 1px solid #ddd;
        color: #333;
        text-decoration: none;
    }
    .content .item img{
        display: block;
        width: 40px;
        height: 40px;
        border:1px solid #ddd;
    }
    .content .item h3{
        display: block;
        -webkit-box-flex: 1;
        -webkit-flex: 1;
        -ms-flex: 1;
        flex: 1;
        width: 100%;
        max-height: 40px;
        overflow: hidden;
        line-height: 20px;
        margin: 0 10px;
        font-size: 1.2rem;
    }
    .content .item .date{
        display: block;
        height: 20px;
        line-height: 20px;
        color: #999;
    }
    .opacity{
        -webkit-animation: opacity 0.3s linear;
        animation: opacity 0.3s linear;
    }
    @-webkit-keyframes opacity {
        0% {
            opacity:0;
        }
        100% {
            opacity:1;
        }
    }
    @keyframes opacity {
        0% {
            opacity:0;
        }
        100% {
            opacity:1;
        }
    }
    </style>
<link rel="stylesheet" href="/css/dropload.css">  
<script type="text/javascript" src="/js/jQuery/jquery.min.1.7.1.js"></script>
<script src="/js/dropload.min.js"></script>    
<script type="text/javascript">
//获取输入的内容
var input = '';
//页数    只显示第一页
var page = 2;
// 每页展示5个
var size = 10;
var result = '';
var lastTime;

$(function() {
	$('#keyword').keyup(function initList(event){
	    setInterval(checkInput,"3000");     //合理刷新时间3s
	});
	// dropload下拉刷新方法
	$('.content').dropload({
	    scrollArea : window,
	    // 初始化
 	    initFn : function(me){
	        me.opts.initFnBefore();//必须执行
	        // some code ...
	        me.opts.initFnAfter();//必须执行
	    }, 
	    loadDownFn : function(me){
	    	if($.trim($("#keyword").val())!=null && $.trim($("#keyword").val())!=""){
	    		console.log("111");
		        page++;
		        input = $.trim($("#keyword").val());
		        // 拼接HTML
		        var result = '';
		        $.ajax({
		            type: 'post',
					data:{
						title:input
					},
		            url: '${pageContext.request.contextPath}/title/list?page='+page+'&size='+size,
		            dataType: 'json',
		            success: function(data){
		                var arrLen = data.length;
		                if(arrLen > 0){
		                    for(var i=0; i<arrLen; i++){
		                    	shelfno = changeShelf(data[i].shelfno);
		                        result += "<a class='item opacity' href='#' lang='"+data[i].title+"' onclick='selectIt(this)'>";
		                        result += "<img src='#' alt=''>"
		                        result += "<h3>"+data[i].title+"</h3>"
		                        result += "<span class='date'>"+data[i].author+"</div>"
		                        result += "<span class='date'>"+data[i].callno+"</div>"
		                        result += "<span class='date'>"+shelfno+"</div>"
		                        result += "</a>";
		                    }
		                // 如果没有数据
		                    // 如果没有数据
		                }else{
		                    // 锁定
		                    me.lock();
		                    // 无数据
		                    me.noData();
		                }
	                    // 插入数据到页面，放到最后面
	                    $('.lists').append(result);
/* 	                	$("a[class='opacity']").click(function(){
	                		alert(1);
	                	}); */
	                    me.resetload();  
		            },
		            error: function(xhr, type){
		                alert('Ajax error!');
		                // 即使加载出错，也得重置
		                me.resetload();
		            }
		        });
	    	}
	    } 
	}); 

});
//检查输入框是否变化
function checkInput(){
	if($.trim($("#keyword").val()) != input){    //输入内容变化，就进行请求
		input = $.trim($("#keyword").val());
	    if(input!=""){//检测键盘输入的内容是否为空，为空就不发出请求  
			$.ajax({
				type:'post',
				data:{
					title:input
				},
				url:'${pageContext.request.contextPath}/title/list?page=1&size=10',
				cache:false,//不从浏览器缓存中加载请求信息 
				dataType: 'json',//返回数据  
				success: function (data) {
	                var arrLen = data.length;
	                if(arrLen > 0){
	                	result = '';
	                    for(var i=0; i<arrLen; i++){
	                    	shelfno = changeShelf(data[i].shelfno);
	                        result += "<a class='item opacity' href='#' lang='"+data[i].title+"' onclick='selectIt(this)'>";
	                        result += "<img src='#' alt=''>"
	                        result += "<h3>"+data[i].title+"</h3>"
	                        result += "<div class='date'>"+data[i].author+"</div>"
	                        result += "<div class='date'>"+data[i].callno+"</div>"
	                        result += "<div class='date'>"+shelfno+"</div>"
	                        result += "</a>";
	                    }
						$('.lists').html('');
						$('.lists').append(result);
	                }
				}
	        });
	    }
	}
};

//填入内容框
function initTest(obj){
	$("#keyword").val(obj.lang);
	$("#bookId").val(obj.value);
	
	$("#searchBox").hide();  //没有查询结果就隐藏搜索框
}

//转化书架位置
function changeShelf(shelfno){
	var str = "";
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
//根据选中的信息去查询书籍相关
function selectIt(obj){
	var title = $(obj).attr("lang");
	$.ajax({
		type:'post',
		data:{
			title:title
		},
		url:'${pageContext.request.contextPath}/title/detail',
		cache:false,//不从浏览器缓存中加载请求信息 
		dataType: 'json',//返回数据  
		success: function (data) {
			alert("获取到了数据");
			alert(data);
		}
	});
	
}


</script>

</head>
<body>
<div class="header">
    <h1>
		<div class="header_search">
			<i class="icon-user"></i>
			<input type="text" name="keyword" id="keyword" class="search" placeholder="搜索从这里开始..." />
			<button onclick="searchBook()">搜索</button>
			<input type="hidden" name="bookId" id="bookId"/> 
		</div>
	</h1>
</div>
<div class="content">
    <div class="lists"></div>
</div>

</body>
</html>



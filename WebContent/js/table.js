/*确认删除，防止误操作！*/
function ConfirmDel(){
	if (confirm("真的要删除吗？")){
		return true;
}else{
	return false;
}
}
/*这部分代码起到翻转器的作用:当鼠标移动到某一行上时,触发 tr 的 mouseover。这让 jQuery 在
此行中添加"over"类,而 CSS 文件告诉浏览器应该以另一种颜色显示此行*/
$(document).ready(function() {
	$("tr").mouseover(function() {
		$(this).addClass("over");
		});
	$("tr").mouseout(function() {
		$(this).removeClass("over");
		});
	//$("tr:even").addClass("even");
	$("table").tablesorter({
		widgets: ["zebra"],
		cssAsc: "sortUp",
		cssDesc: "sortDown"
		}); 

});
//table对应的css中的样式  
//table.t,tr.t,td.t{
//border-collapse: collapse;
//border:1px solid #C2C8D4;
//}
//tr.even {			
//$("tr:even").addClass("even");
//实际上,这就是添加斑马纹所需的所有代码。因为 jQuery 理解奇数行和偶数行的概念,所以可以
//让它把所有偶数行的类属性设置为"even"。又因为 CSS 中包含应用于 tr.even 的规则,所以会自动设
//置偶数行的颜色,我们根本不需要修改 HTML。
//					
//background-color: #C2C8D4;
//}
//tr.over {
//background-color: #8797B7;
//}
//td.t {
//border-bottom: 1px solid #C2C8D4;
//padding: 5px;
//}
//th.t {
//border-right: 2px solid #FFF;
//color: #FFF;
//padding-right: 40px;
//padding-left: 20px;
//background-color: #626975;
//}
//$(document).ready(function()
//		{ 
////分页效果
//var currentPage = 0;  //当前页
//var pageSize = 2;  //每页行数（不包括表头）
////绑定分页事件
//$table.bind('repaginate', function()
//{
//    $table.find('tbody tr').hide()
//        .slice(currentPage * pageSize, (currentPage + 1) * pageSize).show();
//});
//
//var numRows = $table.find('tbody tr').length;  //记录宗条数
//var numPages = Math.ceil(numRows/pageSize);    //总页数
//
//var $pager = $('<div class="page"></div>');  //分页div
//for( var page = 0; page < numPages; page++ )
//{
//    //为分页标签加上链接
//    $('<a href="#" ><span>'+ (page+1) +'</span></a>')
//        .bind("click", { "newPage": page }, function(event) 
//        {           
//            currentPage = event.data["newPage"];                  
//            $table.trigger("repaginate");             
//        })
//       .appendTo($pager); 
//     
//    $pager.append("  ");
//}
//$pager.insertAfter($table);    //分页div插入table
//
//$table.trigger("repaginate");  //初始化    
//
//});

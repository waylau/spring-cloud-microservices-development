/*!
 * report.html 页面脚本.
 * 
 * @since: 1.0.0 2017-10-26
 * @author Way Lau <https://waylau.com>
 */
"use strict";
//# sourceURL=report.js

// DOM 加载完再执行
$(function() {
	$("#selectCityId").change(function(){
		var cityId=$("#selectCityId").val();  //获取Select选择的Value
		var url = '/report/cityId/' + cityId;
		window.location.href= url;
	});
});
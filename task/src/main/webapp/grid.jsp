<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Client Side Pagination in DataGrid - jQuery EasyUI Demo</title>
<link rel="stylesheet" type="text/css"
	href="../js/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../js/themes/icon.css">
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>

</head>
<body>
	<div class="easyui-tabs">
		<div title="First Tab" style="padding: 10px;">
			<button type="button" onclick="alert('Welcome!')">点击这里</button>
			<h2>Client Side Pagination in DataGrid</h2>
			<p>This sample shows how to implement client side pagination in
				DataGrid.</p>
			<div style="margin: 20px 0;"></div>

			<table class="easyui-datagrid" id="dg" title="Client Side Pagination"
				style="width: 100%; height: 100%"
				data-options="
				rownumbers:true,
				singleSelect:true,
				autoRowHeight:false,
				pagination:true,
				pageSize:10,
				url:'/income'">
				<thead>
					<tr>
						<th field="id" width="80">Inv No</th>
						<th field="incomeDate" width="100">Date</th>
						<th field="cbdlcode" width="80">Name</th>
						<th field="itaxunitprice" width="80" align="right">Amount</th>
						<th field="inatmoney" width="80" align="right">Price</th>
						<th field="iaoutprice" width="100" align="right">Cost</th>
						<th field="invname" width="110">Note</th>
					</tr>
				</thead>
			</table>
			<div>
				<div title="Second Tab" closable="true" style="padding: 10px;">Second
					Tab</div>
				<div title="Third Tab" iconCls="icon-reload" closable="true"
					style="padding: 10px;">Third Tab</div>

			</div>
</body>
</html>
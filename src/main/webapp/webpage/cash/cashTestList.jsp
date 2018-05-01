<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="table-scrollable">
	<table class="table table-striped table-hover table-success">
		<thead>
			<tr>
				<th>#</th>
								<th>name</th>
				<th>age</th>
				<th>birthday</th>
				<th>deptId</th>
				<th>sex</th>
				<th>hobby</th>
				<th>remark</th>
				<th>remark2</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.result}" var="cashTest" varStatus="vs">
			<tr>
				<td>${vs.count + page.offset}</td>
					<td>${cashTest.name}</td>
					<td>${cashTest.age}</td>
					<td>${cashTest.birthday}</td>
					<td>${cashTest.deptId}</td>
					<td>${cashTest.sex}</td>
					<td>${cashTest.hobby}</td>
					<td>${cashTest.remark}</td>
					<td>${cashTest.remark2}</td>
				<td>
					<a href="javascript:;" class="btn btn-sm blue" onclick="update('/cashTest/cashTest?id=${cashTest.id}')">
						<i class="fa fa-edit"></i>编辑
					</a>
					<a href="javascript:;" class="btn btn-sm red" onclick="del('/cashTest/delete?id=${cashTest.id}')">
						<i class="fa fa-trash"></i>删除
					</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div class="pageination-panel">${page}</div>
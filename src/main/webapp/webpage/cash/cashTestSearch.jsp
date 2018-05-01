<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="col-md-12">
	<div class="panel-search">
	  <form class="form-inline" action="/cashTest/list">
      <div class="form-group">
          <label for="name" class="control-label">name：</label>
          <input type="text" name="name" class="form-control" />
      </div>
      <div class="form-group">
          <label for="age" class="control-label">age：</label>
          <input type="text" name="ageStart" class="form-control" style="width:100px;"/> -
          <input type="text" name="ageEnd" class="form-control" style="width:100px;"/>
      </div>
      <div class="form-group">
          <label for="birthday" class="control-label">birthday：</label>
          <input type="text" name="birthdayStart" class="form-control" style="width:100px;"/> -
          <input type="text" name="birthdayEnd" class="form-control" style="width:100px;"/>
      </div>
      <div class="form-group">
          <label for="deptId" class="control-label">deptId：</label>
          <input type="text" name="deptId" class="form-control" />
      </div>
	  </form>
	  <div class="btn-div">
			<div class="div-left">
				<button type="button" class="btn btn-warning" onclick="add('/cashTest/cashTest')">
					<i class="fa fa-plus"></i> <spring:message code="btn.add"></spring:message>
				</button>
			</div>
			<div class="div-right">
				<button type="button" class="btn btn-primary" onclick="search()">
					<i class="fa fa-search"></i> <spring:message code="btn.search"></spring:message>
				</button>
		    <button type="button" class="btn btn-default" onclick="reset()">
		    	<i class="fa fa-repeat"></i> <spring:message code="btn.reset"></spring:message>	
		    </button>
			</div>
		</div>
	</div>
	<div class="panel-content"></div>
</div>
<script type="text/javascript" src="<c:url value="/static/custom/datepicker-util.js"></c:url>"></script>
<script type="text/javascript">
	$(function(){
		search();
	});
</script>
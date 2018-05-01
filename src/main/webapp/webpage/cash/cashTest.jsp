<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="portlet box green">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-gift"></i>cash
		</div>
  </div>
  <div class="portlet-body form">
  	<form id="cashTestForm" class="form-horizontal form-bordered" action="/cashTest/save" method="post">
  		<div class="form-group">
        <label class="col-md-3 control-label">name:</label>
        <div class="col-md-4">
	          <input type="text" name="name" class="form-control" value="${cashTest.name}"  maxlength="100"/>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">age:</label>
        <div class="col-md-4">
	          <input type="text" name="age" class="form-control" value="${cashTest.age}"  maxlength="10"/>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">birthday:</label>
        <div class="col-md-4">
	          <input type="text" name="birthday" class="form-control" value="${cashTest.birthday}"  maxlength=""/>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">deptId:</label>
        <div class="col-md-4">
	          <input type="text" name="deptId" class="form-control" value="${cashTest.deptId}"  maxlength="32"/>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">sex:</label>
        <div class="col-md-4">
	          <input type="text" name="sex" class="form-control" value="${cashTest.sex}"  maxlength="1"/>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">hobby:</label>
        <div class="col-md-4">
	          <input type="text" name="hobby" class="form-control" value="${cashTest.hobby}"  maxlength="100"/>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">remark:</label>
        <div class="col-md-4">
	          <input type="text" name="remark" class="form-control" value="${cashTest.remark}"  maxlength="65,535"/>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">remark2:</label>
        <div class="col-md-4">
	          <input type="text" name="remark2" class="form-control" value="${cashTest.remark2}"  maxlength="65,535"/>
        </div>
      </div>
      <div class="form-actions">
        <div class="col-md-9 col-md-offset-3">
          <button type="button" class="btn btn-primary" onclick="save(this)">
          	<spring:message code="btn.save"></spring:message>
          </button>
          <button type="reset" class="btn btn-default" onclick="cancel()">
          	<spring:message code="btn.return"></spring:message>
          </button>
        </div>
      </div>
      <input type="hidden" name="id" value="${cashTest.id}">
  	</form>
  </div>
</div>
<script type="text/javascript" src="<c:url value="/static/custom/datepicker-util.js"></c:url>"></script>
<script type="text/javascript">
	$(function(){
		$('#cashTestForm').validate();
	});
</script>
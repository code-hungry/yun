<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
    <TITLE>添加客户</TITLE>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <LINK href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
    <LINK href="${pageContext.request.contextPath }/css/Manage.css" type=text/css
          rel=stylesheet>
    <META content="MSHTML 6.00.2900.3492" name=GENERATOR>
    <script type="text/javascript">
        /* $(function(){
                loadDicData("006","level","level.id");
                loadDicData("002","source","source.id");
                loadDicData("001","industry","industry.id");
            });
        function loadDicData(typeCode,positionId,selectName){
            //创建select对象
            var $select = $("<select name="+selectName+"></select>");
            var $option = $("<option value=''>---请选择---</option>");
            $select.append($option);

            $.ajax({
                   type: "POST",
                   url: "DictionaryAction_findDictionarysByTypeCode",
                   data: "typeCode="+typeCode,
                   success: function(msg){
                       $.each(msg,function(i,data){
                           //alert(data);
                           $option = $("<option value="+data.id+">"+data.itemName+"</option>");
                           $select.append($option);
                       });
                    // alert( msg);
                   }
                });

            $("#"+positionId).append($select);
        } */
    </script>
</HEAD>
<BODY>
<FORM
        action="${pageContext.request.contextPath}/CustomerAction_addCustomer"
        method="post">


    <TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
        <TBODY>
        <TR>
            <TD width=15><IMG src="${pageContext.request.contextPath }/images/new_019.jpg"
                              border=0></TD>
            <TD width="100%" background="${pageContext.request.contextPath }/images/new_020.jpg"
                height=20></TD>
            <TD width=15><IMG src="${pageContext.request.contextPath }/images/new_021.jpg"
                              border=0></TD>
        </TR>
        </TBODY>
    </TABLE>
    <TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
        <TBODY>
        <TR>
            <TD width=15 background="${pageContext.request.contextPath }/images/new_022.jpg"><IMG
                    src="${pageContext.request.contextPath }/images/new_022.jpg" border=0></TD>
            <TD vAlign=top width="100%" bgColor=#fffffe>
                <TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
                    <TR>
                        <TD class=manageHead>当前位置：客户管理 &gt; 添加客户</TD>
                    </TR>
                    <TR>
                        <TD height=2></TD>
                    </TR>
                </TABLE>

                <TABLE cellSpacing=0 cellPadding=5 border=0>


                    <TR>
                        <td>客户名称：</td>
                        <td>
                            <INPUT class=textbox id=sChannel2
                                   style="WIDTH: 180px" maxLength=50 name="name">
                        </td>
                        <td>客户级别 ：</td>
                        <td id="level">
                            <%-- <select name="level.id">
                                <c:forEach items="${levels}" var="dic">
                                    <option value="${dic.id}">${dic.item_name}</option>
                                </c:forEach>
                            </select> --%>
                            <INPUT class=textbox id=sChannel2
                                   style="WIDTH: 180px" maxLength=50 name="level">
                        </td>
                    </TR>

                    <TR>

                        <td>信息来源 ：</td>
                        <td id="source">
                            <%-- <select name="source.id">
                                <c:forEach items="${sources}" var="dic">
                                    <option value="${dic.id}">${dic.item_name}</option>
                                </c:forEach>
                            </select> --%>
                            <INPUT class=textbox id=sChannel2
                                   style="WIDTH: 180px" maxLength=50 name="source">
                        </td>
                        <td>所属行业：</td>
                        <td id="industry">
                            <INPUT class=textbox id=sChannel2
                                   style="WIDTH: 180px" maxLength=50 name="industry">
                            <%-- <select name="industry.id">
                                <c:forEach items="${industrys}" var="dic">
                                    <option value="${dic.id}">${dic.item_name}</option>
                                </c:forEach>
                            </select> --%>
                        </td>
                    </TR>

                    <TR>


                        <td>固定电话 ：</td>
                        <td>
                            <INPUT class=textbox id=sChannel2
                                   style="WIDTH: 180px" maxLength=50 name="phone">
                        </td>
                        <td>移动电话 ：</td>
                        <td>
                            <INPUT class=textbox id=sChannel2
                                   style="WIDTH: 180px" maxLength=50 name="mobile">
                        </td>
                    </TR>


                    <tr>
                        <td rowspan=2>
                            <INPUT class="button" id="sButton2" type="submit"
                                   value="保存 ">
                        </td>
                    </tr>
                </TABLE>


            </TD>
            <TD width=15 background="${pageContext.request.contextPath }/images/new_023.jpg">
                <IMG src="${pageContext.request.contextPath }/images/new_023.jpg" border=0></TD>
        </TR>
        </TBODY>
    </TABLE>
    <TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
        <TBODY>
        <TR>
            <TD width=15><IMG src="${pageContext.request.contextPath }/images/new_024.jpg"
                              border=0></TD>
            <TD align=middle width="100%"
                background="${pageContext.request.contextPath }/images/new_025.jpg" height=15></TD>
            <TD width=15><IMG src="${pageContext.request.contextPath }/images/new_026.jpg"
                              border=0></TD>
        </TR>
        </TBODY>
    </TABLE>
</FORM>
</BODY>
</HTML>

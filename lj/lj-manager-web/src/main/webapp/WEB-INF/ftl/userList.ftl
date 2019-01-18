<html>
	<table>
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>手机号</td>
		</tr>
		<#list users as user>
			<#if user_index%2==0 >
				<tr bgcolor="pink">
			<#else>
				<tr bgcolor="blue">
			</#if>
					<td>${user.id!}</td>
					<td>${user.name!"我是无名"}</td>
					<td>${user.age!}</td>
				</tr>
		</#list>
	</table>
</html>
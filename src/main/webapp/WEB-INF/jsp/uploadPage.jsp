<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%--
1. method="post" 是必须的
2. enctype="multipart/form-data" 是必须的，表示提交二进制文件
3. name="file" 是必须的，和后续服务端对应
4. accept="image/*" 表示只选择图片--%>
<form action="upload" method="post" enctype="multipart/form-data">
    选择图片:<input type="file" name="file" accept="image/*" /> <br>
    <input type="submit" value="上传">
</form>

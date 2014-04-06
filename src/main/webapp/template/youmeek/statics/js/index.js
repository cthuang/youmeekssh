$(document).ready(function () {
	alert("Orz");
	var userIdValue = $('#userId').val();
	var userNameValue = $('#userName').val();

    $("#btnSubmit").click(function () {
		alert("userIdValue=" + userIdValue);
        $.ajax({
            type:"POST",
            url: "http://127.0.0.1:8080/front/userController/"+userIdValue+"/getUser.do",
            data: {
	            //userId:userIdValue,
	            userName:userNameValue
            },
            dataType: "json",
            success: function (data) {
                alert("成功");
            },
            error: function (XMLHttpRequest, textStatus) {
                alert("报错");
            }
        })
    });
})

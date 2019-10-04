function check(){
	if(document.getElementById("inputPassword").value!=
		document.getElementById("checkPassword").value)
	{
		document.getElementById("warning").innerHTML="   两次密码的输入不一致";
	}else{
		document.getElementById("warning").innerHTML="   ";
	}
}
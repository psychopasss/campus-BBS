	/*用与判断两次输入新密码是否相同*/
          function validate() {
              var pw1 = document.getElementById("pw1").value;
              var pw2 = document.getElementById("pw2").value;
              if(pw1 == pw2) {
                  document.getElementById("tishi").innerHTML="<font color='green'>两次密码相同</font>";
                  document.getElementById("submit").disabled = false;
              }
              else {
                  document.getElementById("tishi").innerHTML="<font color='red'>两次密码不相同</font>";
                document.getElementById("submit").disabled = true;
              }
          }
          /*确认修改密码，防止误操作！*/
      function confirmXgmm() {
			  if(confirm("确认修改吗？")){
				  return true ;
				  }else{
					  return false ;
					  }
			  }
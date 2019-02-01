function Login() {
	// body...
	var username = $("#input1").val();
	var password = $("#input2").val();

	var miUsuario = "Deyvi";
	var miContra = "123";

	if(username === miUsuario && password === miContra){
		window.location.href = "Principal.html";
	}

	var misUsuarios=[
		{
			usuario : "A",
			contrasena : "1"
		},
		{
			usuario : "B",
			contrasena : "2"
		}
	]

	var exists = false;
	$.each(misUsuarios,function(index, element){
		if (element.usuario === username && element.contrasena === password) {
			exists = true;
		}
	});

	if (exists) {
		window.location.href = "Principal.html";
	}else{
		alert("El usuario no existe")
	}
};
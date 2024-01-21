function enviarDatosContratarEmpleado() {
    var nombre = document.getElementById('nombre').value;
    var apellidos = document.getElementById('apellidos').value;
    var dni = document.getElementById('dni').value;
    var edad = document.getElementById('edad').value;
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;
    var correo = document.getElementById('correo').value;
    var numeroTlf = document.getElementById('numeroTlf').value;
    var fechaFinContrato = document.getElementById('fechaFinContrato').value;
    var numeroSeguridadSocial = document.getElementById('numeroSeguridadSocial').value;
    var salario = document.getElementById('salario').value;


    var data = JSON.stringify({
        "nombre": username,
        "apellidos": password,
        "dni": dni,
        "edad": edad,
        "username": username,
        "password": password,
        "correo": correo,
        "numeroTlf": numeroTlf,
        "fechaFinContrato": fechaFinContrato,
        "numeroSeguridadSocial": numeroSeguridadSocial,
        "salario": salario
    });

    var xhr = new XMLHttpRequest();
    xhr.open("POST", "/empleado/contratar", true);
    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.onreadystatechange = function() {
        if (this.readyState == 4) {
            if (this.status == 200) {
                // Si la respuesta del servidor es una URL, redireccionar a esa URL
                window.location.href = this.responseText;
            } else {
                // Manejar los errores como sea apropiado para tu aplicación
                console.error('Error en la solicitud', this.statusText);
            }
        }
    };
    xhr.send(data);
}

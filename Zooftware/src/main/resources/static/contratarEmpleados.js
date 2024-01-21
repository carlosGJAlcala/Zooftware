function enviarDatosContratarEmpleado() {
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;

    var data = JSON.stringify({
        "username": username,
        "password": password
    });

    var xhr = new XMLHttpRequest();
    xhr.open("POST", "/validarInicioSesion", true);
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

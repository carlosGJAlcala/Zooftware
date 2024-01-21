function enviarDatosComprarAnimal() {
    var nombre = document.getElementById('nombre').value;
    var estadoAnimal = document.getElementById('estadoAnimal').value;
    var tipo = document.getElementById('tipo').value;
    var numExtremidades = document.getElementById('numExtremidades').value;
    var salud = document.getElementById('salud').value;
    var sed = document.getElementById('sed').value;
    var suenio = document.getElementById('suenio').value;
    var hambre = document.getElementById('hambre').value;
    var id_habita = document.getElementById('id_habita').value;


    var data = JSON.stringify({
        "nombre": nombre,
        "estadoAnimal": estadoAnimal,
        "tipo": tipo,
        "numExtremidades": numExtremidades,
        "salud": salud,
        "sed": sed,
        "suenio": suenio,
        "hambre": hambre,
        "id_habita": id_habita
    });

    var xhr = new XMLHttpRequest();
    xhr.open("POST", "/comprarAnimal", true);
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

function factorial (){

var numero = Number(prompt('Ingresa un número para calcular su factorial: '));
var tituloNumero = document.createElement('h3');
var tituloFactorialNumero = document.createElement('h3');

function calcularFactorial(){
    let factorial = 1;
    for (let indice = 1; numero >= indice; indice++ ){
        factorial = factorial * indice;
    }
    return factorial;
}

if (!isNaN(numero)){
tituloNumero.innerHTML = 'El número ingresado es: ' + numero;
tituloFactorialNumero.innerHTML = 'El factorial del número es: ' + calcularFactorial();

document.body.appendChild(tituloNumero);
document.body.appendChild(tituloFactorialNumero);
}else{
    alert('No has ingresado un número válido. Intenta nuevamente.');
    factorial();
}

}

factorial();
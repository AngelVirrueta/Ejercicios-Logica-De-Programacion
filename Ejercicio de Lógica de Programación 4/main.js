

function serieDeFibonacci(){
var numero = Number(prompt('Ingresa un número de elementos para la serie Fibonacci: '));
var tituloNumero = document.createElement('h3');
var tituloSerie = document.createElement('h3');


function crearSerie(){
    var serieFibonacci = [0, 1];
    if (numero == 1){
        serieFibonacci.pop();
    }else{
        for (let indice = 2; numero > indice; indice++){
            serieFibonacci.push(serieFibonacci[indice-2] + serieFibonacci[indice-1]);
        }
    }
    return serieFibonacci;
}

if (!isNaN(numero) && numero > 0){
tituloNumero.innerHTML = 'El número de elementos de la serie es: ' + numero;
tituloSerie.innerHTML = 'Serie Fibonacci: ' + crearSerie().join(", ") + ".";
document.body.appendChild(tituloNumero);
document.body.appendChild(tituloSerie);
}
else {
    alert('Ingresa un número válido. Intenta de nuevo.');
    serieDeFibonacci();
}
}

serieDeFibonacci();

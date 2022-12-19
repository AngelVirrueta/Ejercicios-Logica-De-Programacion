
function coonversor(){
var celsius = Number(prompt('Ingresa la temperatura en grados Celsius (°C): '));
var titulo = document.createElement('h3');
var tituloF = document.createElement('h3');
var tituloK = document.createElement('h3');


function aFarenheit() {
    return (celsius * 9 / 5) + 32;
}

function aKelvin() {
    return celsius + 273.15;
}

if(!isNaN(celsius)){
    
titulo.innerHTML = 'La temperatura en Celsius es: ' + celsius + ' °C';
tituloF.innerHTML = 'La temperatura en Farenheit es: ' + aFarenheit() + ' °F';
tituloK.innerHTML = 'La temperatura en Kelvin es: ' + aKelvin() + ' °K';

document.body.appendChild(titulo);
document.body.appendChild(tituloF);
document.body.appendChild(tituloK);

} else {
    alert('No has ingresado un número válido, intenta de nuevo.');
    coonversor();
}
}
coonversor();
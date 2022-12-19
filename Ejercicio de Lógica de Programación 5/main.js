let numeroSecreto = Math.floor((Math.random() * 100) + 1);
let numero = Number(prompt('Adivina el número secreto (1-100): '));
let numeros = [];

function adivinaNumeroSecreto (){

    numeros.push(numero);
    let tituloNumero = document.createElement('h2');
    let tituloNumeroSecreto = document.createElement('h2');
    let tituloResultado = document.createElement('h2');
    document.body.textContent = '';
    if (!isNaN(numero) && numero >=1 && numero <=100){

        if ( numero === numeroSecreto){
            tituloNumero.innerHTML = 'Tu(s) intento(s): ' + numeros.join(", ") + ".";
            tituloNumeroSecreto.innerHTML = 'Número Secreto: ' + numeroSecreto + ".";
            tituloResultado.innerHTML = '¡Felicidades! Adivinaste el número secreto.';
            document.body.appendChild(tituloNumero);
            document.body.appendChild(tituloNumeroSecreto);
            document.body.appendChild(tituloResultado);
         }else {
            tituloNumero.innerHTML = 'Tu(s) número(s): ' + numeros.join(", ")  + ".";
            document.body.appendChild(tituloNumero);
            document.body.appendChild(tituloNumeroSecreto);
            document.body.appendChild(tituloResultado);
            numero = Number(prompt('No advinaste el número secreto. Intentos: ' + numeros.join(', ') + ". Intenta de nuevo: "));
            adivinaNumeroSecreto();
        }
    }else{
        numero = prompt('El número ingresado no es un número válido. Intenta nuevamente: ');
        numeros.pop();
        adivinaNumeroSecreto();
    }

}

adivinaNumeroSecreto();

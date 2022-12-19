

var numeros = [Number(prompt("Ingresa el primer numero")), Number(prompt("Ingresa el segundo número")), Number(prompt("Ingresa el tercer número"))];

switch (numeros[0]){
    case numeros[1]: 
    if (numeros[1] == numeros[2]){
    console.log("Los tres números son iguales.");
    break;}

    case numeros[1]: console.log("El primer y segundo números son iguales.");
    break;

    case numeros[2]: console.log("El primer y tercer números son iguales.");
    break;

    case numeros[0]: if (numeros[1] == numeros[2]){
    console.log("El segundo y el tercer numero son iguales.")
    break;}

    default: break;
}


console.log("Los números ingresados son:", numeros[0], numeros[1], numeros[2]);
numeros.sort((a, b) => b-a);
console.log("Los números ordenados de mayor a menor son: ", numeros[0], numeros[1], numeros[2]);
numeros.reverse(numeros);
console.log("Los números ordenados de menor a mayor son:", numeros[0], numeros[1], numeros[2]);
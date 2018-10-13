/**
 * 
 */

function realizaSuma() {
	
	var param1 = document.getElementById("num1").value;
	var param2 = document.getElementById("num2").value;
	
	document.getElementById("resultado").value = suma(param1, param2);
	
}

function suma(sumando1, sumando2) {

	//int parseInt(string)
	var resultado = parseFloat(sumando1) + parseFloat(sumando2);

	console.log("Suma: " + resultado);

	return resultado;

}

function realizaResta() {
	
	var minuendo = document.getElementById("num1").value;
	var sustraendo = document.getElementById("num2").value;
	
	document.getElementById("resultado").value = resta(minuendo, sustraendo);
	
}

function resta(minuendo, sustraendo) {

	var resultado = parseFloat(minuendo) - parseFloat(sustraendo);

	console.log("Resta: " + resultado);

	return resultado;

}

function realizaMultiplicacion() {
	
	var factor1 = document.getElementById("num1").value;
	var factor2 = document.getElementById("num2").value;
	
	document.getElementById("resultado").value = multiplica(factor1, factor2);
	
}

function multiplica(factor1, factor2) {

	//De qué tipo será "resultado"??
	var resultado = parseFloat(factor1) * parseInt(factor2);

	console.log("Multiplicación: " + resultado);

	return resultado;

}

function realizaDivision() {
	
	var dividendo = document.getElementById("num1").value;
	var divisor = document.getElementById("num2").value;
	
	document.getElementById("resultado").value = divide(dividendo, divisor)
	
}

function divide(dividendo, divisor) {

	
	if(divisor == "0"){
		
		alert("El divisor no puede ser cero!");
		return false;
		
	}
	
	//De qué tipo será "resultado"?
	var resultado = parseInt(dividendo) / parseFloat(divisor);

	console.log("División: " + resultado);

	return resultado;

}
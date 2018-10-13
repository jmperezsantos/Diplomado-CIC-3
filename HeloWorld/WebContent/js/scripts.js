/**
 * 
 */

//function saludar() {
//
//	alert("Hola desde función en Javascript");
//
//}
//
//function saludar() {
//
//	alert("Hola desde función en Javascript 2");
//
//}

// document.getElementById("boton").addEventListener("click", saludar);

document.getElementById("boton").addEventListener(
		"click", 
		function() {
			//alert("Hola desde función Lambda");
			saludar();
		}
		);

// saludar();

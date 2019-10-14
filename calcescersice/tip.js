window.onload=function calcTip() {
	//var subtotalElem = 
	//var tipElem = 
	let first = document.getElementById('total');
	let tipp = document.getElementById('tip');
	
	let result=first*(tipp/100);
	//var subtotal = 
	//var tip = 
	let total = result+first;
	total.innerHTML = '$' + total;
}
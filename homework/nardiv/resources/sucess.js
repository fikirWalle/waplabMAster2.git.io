window.onload = function(){

    var submitbtn = document.getElementById('clckme');
    var mytext=document.getElementById('text');
	
	

    submitbtn.onclick = function(){
		
        
     var a = document.createElement('a'); 
	var p = document.createElement('h2');
		var w=document.createElement('p');
		var s=document.createElement('p');
                  
    
             
		 
		  var thank = document.createTextNode("Thank you !"); 
		 var link = document.createTextNode("login in to see your muches"); 
		var welcome= document.createTextNode("Welcome to Nerd liv mettStep"); 
		var space= document.createTextNode("     "); 
                  
                  
               // p.appendChild(thank);
		        p.append(thank);
                a.appendChild(link);  
		 a.appendChild(space);
		   w.appendChild(welcome);
		
                p.title="thank you";
                a.foot = "This is Link";  
		        
                  
                
                a.href = "muches.html";  
                   document.body.prepend(a); 
                document.body.prepend(thank);
		document.body.prepend(space);
		 document.body.prepend(welcome);
                
		
		
    }
}
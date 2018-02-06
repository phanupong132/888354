<html>
<head>
<script>

 function search() {
	document.getElementById("result").innerHTML= "";
	document.getElementById("result2").innerHTML= "";
  	var text = document.getElementById("text").value; // get massage
  	var search = document.getElementById("search").value; // get search
  	var sensitive = document.getElementsByName("sensitive"); // get radio value
  	var value=9;

  	for (var i = 0; i < sensitive.length; i++) {
    	if (sensitive[i].type === 'radio' && sensitive[i].checked) {
        	value = sensitive[i].value;     
    	}
  	}

	if(text != "" && search !="" && value !="9"){ //top
		console.log(value);
		if(value=="N") { //if No choose
			var count = new RegExp(search, "gi");
			var test = text.match(count);
			if(test == null){
				document.getElementById("result").innerHTML= "0";
			}else{
				var num = test.length;	
				document.getElementById("result").innerHTML= num;
			}
		}
		else if(value=="Y") { // if Yes choose
			var count = new RegExp(search, "g");
			var test =  text.match(count);
			if(test == null) {
				document.getElementById("result").innerHTML= "0";
			}else {
				var num = test.length;
				document.getElementById("result").innerHTML= num;
			}	
		}
	}else { // down
		document.getElementById("result2").innerHTML= "Please enter a value Complte";
	}		
 }

</script>
	<center><h2>Ex2 Search String Non Sensitive Case</h2></center>
<head>
<body>
	<center>
	<div>
		Text Input : <textarea id="text"></textarea> 
	</div>
	</center>
	<br>

	<center>
	<div>
         Sensitive Case : <input type="radio" id="Y" name="sensitive" value="Y"> Yes 
						  <input type="radio" id="N" name="sensitive" value="N"> No
	</div>
	</center>
	<br>

	<center>
	<div>
		Search : <input type="text" name="search" id="search"> 
	</div>
	</center>
	<br>

	<center>
	<div>
		<button name="submit" id="submit" onclick="search()"> Search </button>	
	</div>
	</center>
	<br>

	<center>
	<div>
		<p id="result"> </p>
		<p id="result2"> </p>
	</div>
 	</center>
</body>

</html>
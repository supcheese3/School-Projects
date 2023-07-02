function clicked() {
	
	var average = document.querySelector('average').value;
	var grade = "";
		
	if(average.value <= 100 && average.value >= 89.6){
		grade = "A";
	} else if (average.value <= 89.5 && average.value>= 79.6){
		grade = "B";
	} else if (average.value <= 79.5 && average.value >= 69.6){
		grade = "C";
	} else if (average.value <= 69.5 && average.value >= 60){
		grade = "D";
	} else{
		grade = "F";
	}
	window.alert("Your letter grade is: " + grade);
	
}	
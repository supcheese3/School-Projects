/*
	Student Name: Nathan Williamson
	File Name: donationScript.js
	Date: 04/24/2022
*/

/*
 * getCurrentDateFormatted gets the format of the date and
 * returns formattedDate in the format "yy-mm"
 */
 function getCurrentDateFormatted() {
    const date = new Date();
    const month = date.getMonth() + 1;
    const year = date.getFullYear() % 100;
  
    const formattedDate =
	  (("" + month).length < 2 ? "0" : "") +
      month +
	  "/" +
	  year;
	  
    return formattedDate;
  }

/*
validateEmail which passes the inputted email and checks if it is a valid email
it then returns true if it is valid or returns false if it is invalid and alerts
the user that they have entered an invalid email address.
*/
function validateEmail(mail) 
{
 if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(mail))
  {
    return (true)
  }
    alert("You have entered an invalid email address!")
    return (false)
}

/*
 * checkDonationForm checks if the inputted values are correct.
 * If the element is an invalid value, it will alert the user and return false.
 * Otherwise, if they are all valid, it will return true
 */
function checkDonationForm(){
	var firstName = document.getElementById("firstName").value;
	var lastName = document.getElementById("lastName").value;
	var email = document.getElementById("emailInput").value;
	var zipCode = document.getElementById("zipCode").value;
	var cardNumber = document.getElementById("cardNumber").value;
	var expDate = document.getElementById("expDate").value;
	var cvc = document.getElementById("cvc").value;
	var amount = document.getElementById("amount").value;
	var expDateMM = expDate.substring(0,2);
	var expDateYY = expDate.substring(3);
	const checkEmail = validateEmail(email);
	
	if(firstName == ""){
		alert("First name must be filled out");
		return false;
	} else if (lastName == ""){
		alert("Last name must be filled out");
		return false;
	} else if (email == ""){
		alert("Email cannot be empty");
		return false;
	} else if(checkEmail != true){
		return false;
	}else if (zipCode == "" || zipCode.length !=5){
		alert("Please provide zip code in format #####");
		return false;
	} else if (cardNumber == ""){
		alert("Card number cannot be empty");
		return false;
	} else if (cardNumber.length < 16){
		alert("Card number is too short (16 digits). Try again!");
		return false;
	} else if (expDate == ""){
		alert("Expiration date must be filled out");
		return false;
	} else if (expDateYY < getCurrentDateFormatted().substring(3) ||
		(expDateYY == getCurrentDateFormatted().substring(3) && expDateMM < getCurrentDateFormatted().substring(0,2))){
		alert("Your credit card is expired. Please try again");
		return false;
	} else if (cvc == ""){
		alert("CVC must be filled out");
		return false;
	} else if (cvc.length < 3 ){
		alert("CVC is too short. Try again!");
		return false;
	} else if (cvc.length > 4 ){
		alert("CVC is too long. Try again!");
		return false;
	} else if (amount == ""){
		alert("Please enter an amount");
		return false; 
	} else if (amount < 0.01){
		alert("Amount cannot be 0");
		return false;
	} else 
	alert("Thank you for the donation, "+ firstName +" "+ lastName+"! " +"You donated: " + "$" + amount + "!");
	window.location = "index.html"
	return true;
}

/*
formatExpDate takes in a key event which automatically types in the "/" for
the exp. date input box.
*/
function formatExpDate(e) {
  var inputChar = String.fromCharCode(event.keyCode);
  var code = event.keyCode;
  var allowedKeys = [8];
  if (allowedKeys.indexOf(code) !== -1) {
    return;
  }

  event.target.value = event.target.value.replace(
    /^([1-9]\/|[2-9])$/g, '0$1/' // 3 > 03/
  ).replace(
    /^(0[1-9]|1[0-2])$/g, '$1/' // 11 > 11/
  ).replace(
    /^([0-1])([3-9])$/g, '0$1/$2' // 13 > 01/3
  ).replace(
    /^(0?[1-9]|1[0-2])([0-9]{2})$/g, '$1/$2' // 141 > 01/41
  ).replace(
    /^([0]+)\/|[0]+$/g, '0' // 0/ > 0 and 00 > 0
  ).replace(
    /[^\d\/]|^[\/]*$/g, '' // To allow only digits and `/`
  ).replace(
    /\/\//g, '/' // Prevent entering more than 1 `/`
  );
}
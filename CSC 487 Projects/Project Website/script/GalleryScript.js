/*
	Student Name: Nathan Williamson
	File Name: GalleryScript.js
	Date: 04/24/2022
*/

// Opens the Modal
function openModal() {
  document.getElementById("galleryModal").style.display = "block";
}

// Closes the Modal
function closeModal() {
  document.getElementById("galleryModal").style.display = "none";
}

var slideIndex = 1;
showSlides(slideIndex);

// Next/previous controls
function plusSlides(n) {
  showSlides(slideIndex += n);
}

// Thumbnail image controls
function currentSlide(n) {
  showSlides(slideIndex = n);
}


//showSlides function takes in a number and uses it to go through the gallery slides.
function showSlides(n) {
  var i;
  var slides = document.getElementsByClassName("gallerySlides");
  var dots = document.getElementsByClassName("demo");
  var captionText = document.getElementById("caption");
  if (n > slides.length) {slideIndex = 1}
  if (n < 1) {slideIndex = slides.length}
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";
  }
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";
  dots[slideIndex-1].className += " active";
  captionText.innerHTML = dots[slideIndex-1].alt;
}
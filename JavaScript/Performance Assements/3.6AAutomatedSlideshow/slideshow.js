// Author: Brian Taylor
// Date: 06/01/2026
// Purpose: This script creates an automated slideshow by changing
// the image source and caption text at timed intervals.

// Array of image file paths
var images = [
   "slide0.jpg",
   "slide1.jpg",
   "slide2.jpg",
   "slide3.jpg",
   "slide4.jpg",
   "slide5.jpg",
   "slide6.jpg",
   "slide7.jpg",
   "slide8.jpg",
   "slide9.jpg",
   "slide10.jpg",
   "slide11.jpg",
   "slide12.jpg",
   "slide13.jpg"
];

// Parallel array of captions
var captions = [
   "International Space Station fourth expansion [2009]",
   "Assembling the International Space Station [1998]",
   "The Atlantis docks with the ISS [2001]",
   "The Atlantis approaches the ISS [2000]",
   "The Soyuz departs from the ISS [2001]",
   "International Space Station over Earth [2002]",
   "The International Space Station first expansion [2002]",
   "Hurricane Ivan from the ISS [2008]",
   "The Soyuz spacecraft approaches the ISS [2005]",
   "The International Space Station from above [2006]",
   "Maneuvering in space with the Canadarm2 [2006]",
   "The International Space Station second expansion [2006]",
   "The International Space Station third expansion [2007]",
   "The ISS over the Ionian Sea [2007]"
];

// Starting slide index
var currentSlide = 0;

// Get the image and caption elements from the HTML page
var slideshowImg = document.getElementById("slideshow-img");
var captionText = document.getElementById("caption");

// Function to update the slideshow
function updateSlideshow() {
   currentSlide++;

   // Wrap around to the first slide after the last slide
   if (currentSlide >= images.length) {
      currentSlide = 0;
   }

   // Update image source and caption text
   slideshowImg.src = images[currentSlide];
   captionText.textContent = captions[currentSlide];
}

// Change slide every 3 seconds
setInterval(updateSlideshow, 3000);
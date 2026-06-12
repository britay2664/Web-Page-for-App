/*
    Author: Brian Taylor
    Date: June 10, 2026
    Purpose: Validate email, phone number, and postal code input using regular expressions.
*/

"use strict";

// Grab input elements
const email = document.getElementById("email");
const phone = document.getElementById("phone");
const postal = document.getElementById("postal");
const checkBtn = document.getElementById("checkBtn");

// Grab feedback elements
const emailFeedback = document.getElementById("emailFeedback");
const phoneFeedback = document.getElementById("phoneFeedback");
const postalFeedback = document.getElementById("postalFeedback");

// Regular expressions
const emailRegex = /^[\w.-]+@[\w.-]+\.[A-Za-z]{2,}$/;
const phoneRegex = /^\d{3}-\d{3}-\d{4}$/;
const postalRegex = /^\d{5}$/;

// Helper function to validate inputs
function validateField(input, regex, feedbackElement) {
    if (regex.test(input.value.trim())) {
        feedbackElement.textContent = "Valid";
        feedbackElement.className = "feedback valid";
    } else {
        feedbackElement.textContent = "Invalid";
        feedbackElement.className = "feedback invalid";
    }
}

// Attach live validation
email.addEventListener("keyup", function () {
    validateField(email, emailRegex, emailFeedback);
});

phone.addEventListener("keyup", function () {
    validateField(phone, phoneRegex, phoneFeedback);
});

postal.addEventListener("keyup", function () {
    validateField(postal, postalRegex, postalFeedback);
});

// Validate all inputs when button is clicked
checkBtn.addEventListener("click", function () {
    validateField(email, emailRegex, emailFeedback);
    validateField(phone, phoneRegex, phoneFeedback);
    validateField(postal, postalRegex, postalFeedback);
});
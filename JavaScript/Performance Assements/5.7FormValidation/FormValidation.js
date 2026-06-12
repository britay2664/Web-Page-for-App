/*
    Author: Brian Taylor
    Date: June 12, 2026
    Purpose: Use jQuery and validator.js to give live feedback on a
             sign-up form and validate name, email, password, website,
             and age before submission.
*/

"use strict";

$(function () {

    // Validate full name
    function validateName() {
        var fullName = $("#fullName").val().trim();

        if (fullName === "") {
            $("#nameError").text("Full name is required.");
            return false;
        } else {
            $("#nameError").text("");
            return true;
        }
    }

    // Validate email:
    // Must contain @ and end with .com or .edu
    function validateEmail() {
        var email = $("#email").val().trim();

        if (
            !validator.isEmail(email) ||
            !(validator.endsWith(email, ".com") || validator.endsWith(email, ".edu"))
        ) {
            $("#emailError").text("Email must contain @ and end in .com or .edu.");
            return false;
        } else {
            $("#emailError").text("");
            return true;
        }
    }

    // Validate password:
    // At least 8 characters, 1 uppercase, 1 lowercase, and 1 number
    function validatePassword() {
        var password = $("#password").val();

        if (
            !validator.isStrongPassword(password, {
                minLength: 8,
                minLowercase: 1,
                minUppercase: 1,
                minNumbers: 1,
                minSymbols: 0
            })
        ) {
            $("#passwordError").text("Password needs 8 characters, 1 uppercase, 1 lowercase, and 1 number.");
            return false;
        } else {
            $("#passwordError").text("");
            return true;
        }
    }

    // Validate website URL:
    // Must be a valid http:// or https:// URL
    function validateWebsite() {
        var website = $("#website").val().trim();

        if (
            !validator.isURL(website, {
                protocols: ["http", "https"],
                require_protocol: true
            })
        ) {
            $("#websiteError").text("Website must be a valid http:// or https:// URL.");
            return false;
        } else {
            $("#websiteError").text("");
            return true;
        }
    }

    // Validate age:
    // Must be greater than 0
    function validateAge() {
        var age = $("#age").val();

        if (!validator.isInt(age, { min: 1 })) {
            $("#ageError").text("Age must be greater than 0.");
            return false;
        } else {
            $("#ageError").text("");
            return true;
        }
    }

    // Live validation feedback
    $("#fullName").on("keyup blur", validateName);
    $("#email").on("keyup blur", validateEmail);
    $("#password").on("keyup blur", validatePassword);
    $("#website").on("keyup blur", validateWebsite);
    $("#age").on("keyup blur", validateAge);

    // Use jQuery to handle form submission
    $("#signupForm").on("submit", function (event) {
        event.preventDefault();

        var nameIsValid = validateName();
        var emailIsValid = validateEmail();
        var passwordIsValid = validatePassword();
        var websiteIsValid = validateWebsite();
        var ageIsValid = validateAge();

        if (nameIsValid && emailIsValid && passwordIsValid && websiteIsValid && ageIsValid) {
            alert("Form submitted successfully!");

            $("#signupForm")[0].reset();

            $("#nameError, #emailError, #passwordError, #websiteError, #ageError").text("");
        }
    });

});
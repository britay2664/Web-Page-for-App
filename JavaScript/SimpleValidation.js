```javascript
/*
    Author: Brian Taylor
    Date: June 12, 2026
    Purpose: Uses jQuery and validator.js to perform live validation
             on email and age fields before form submission.
*/

$(function () {

    // Select the form
    const $form = $("#simpleForm");

    // Live Email Validation
    $("#email").on("keyup blur", function () {

        const value = $(this).val();

        if (!validator.isEmail(value)) {
            $("#emailError").text("Please enter a valid email address.");
        } else {
            $("#emailError").text("");
        }

    });

    // Live Age Validation
    $("#age").on("keyup blur", function () {

        const value = $(this).val();

        if (!validator.isInt(value, { min: 18 })) {
            $("#ageError").text("You must be 18 or older.");
        } else {
            $("#ageError").text("");
        }

    });

    // Form Submission
    $form.on("submit", function (e) {

        e.preventDefault();

        const email = $("#email").val();
        const age = $("#age").val();

        const validEmail = validator.isEmail(email);
        const validAge = validator.isInt(age, { min: 18 });

        if (validEmail && validAge) {

            alert("Form submitted successfully!");

            $form[0].reset();

            $("#emailError, #ageError").text("");

        } else {

            if (!validEmail) {
                $("#emailError").text("Please enter a valid email address.");
            }

            if (!validAge) {
                $("#ageError").text("You must be 18 or older.");
            }

        }

    });

});
```

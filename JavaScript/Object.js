/*
    Author: Brian Taylor
    Date: June 12, 2026
    Purpose: Use custom objects to collect delivery and pizza order information,
             then display an order summary on the webpage.
*/

"use strict";

var delivInfo = {};
var foodInfo = {};

var delivSummary = document.getElementById("deliverTo");
var foodSummary = document.getElementById("order");

// Collect delivery information and display it in the summary panel
function processDeliveryInfo() {
    delivInfo = {
        name: document.getElementById("nameinput").value,
        address: document.getElementById("addrinput").value,
        city: document.getElementById("cityinput").value,
        email: document.getElementById("emailinput").value,
        phone: document.getElementById("phoneinput").value
    };

    delivSummary.innerHTML = "";

    for (var prop in delivInfo) {
        delivSummary.innerHTML += "<p>" + delivInfo[prop] + "</p>";
    }

    delivSummary.style.display = "block";
}

// Collect food information and display it in the summary panel
function processFood() {
    var crustOpt = document.getElementsByName("crust");
    var toppingBoxes = document.getElementsByName("toppings");
    var instr = document.getElementById("instructions");

    foodInfo = {
        crust: "",
        size: document.getElementById("size").value,
        toppings: [],
        instructions: instr.value || "None"
    };

    for (var i = 0; i < crustOpt.length; i++) {
        if (crustOpt[i].checked) {
            foodInfo.crust = crustOpt[i].value;
            break;
        }
    }

    for (var j = 0; j < toppingBoxes.length; j++) {
        if (toppingBoxes[j].checked) {
            foodInfo.toppings.push(toppingBoxes[j].value);
        }
    }

    foodSummary.innerHTML = "";
    foodSummary.innerHTML += "<p><span>Crust</span>: " + foodInfo.crust + "</p>";
    foodSummary.innerHTML += "<p><span>Size</span>: " + foodInfo.size + "</p>";
    foodSummary.innerHTML += "<p><span>Topping(s)</span>:</p>";

    if (foodInfo.toppings.length > 0) {
        foodSummary.innerHTML += "<ul>";

        for (var k = 0; k < foodInfo.toppings.length; k++) {
            foodSummary.innerHTML += "<li>" + foodInfo.toppings[k] + "</li>";
        }

        foodSummary.innerHTML += "</ul>";
    } else {
        foodSummary.innerHTML += "<p>None</p>";
    }

    foodSummary.innerHTML += "<p><span>Instructions</span>: " + foodInfo.instructions + "</p>";

    foodSummary.style.display = "block";
}

// Show the order summary section
function previewOrder() {
    document.getElementsByTagName("section")[0].style.display = "block";

    processDeliveryInfo();
    processFood();
}

// Add event listener to the Preview Order button
function createEventListener() {
    var previewBtn = document.getElementById("previewBtn");

    if (previewBtn.addEventListener) {
        previewBtn.addEventListener("click", previewOrder, false);
    } else if (previewBtn.attachEvent) {
        previewBtn.attachEvent("onclick", previewOrder);
    }
}

// Run createEventListener when the page loads
if (window.addEventListener) {
    window.addEventListener("load", createEventListener, false);
} else if (window.attachEvent) {
    window.attachEvent("onload", createEventListener);
}
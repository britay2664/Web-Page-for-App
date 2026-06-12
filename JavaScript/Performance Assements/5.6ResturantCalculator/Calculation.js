/*
    Author: Brian Taylor
    Date: June 12, 2026
    Purpose: Validate bill splitter input, calculate the tip amount,
             calculate the total bill, and divide the total evenly
             between the number of people entered.
*/

"use strict";

// Select page elements
var billAmountInput = document.getElementById("billAmount");
var tipPercentageInput = document.getElementById("tipPercentage");
var peopleCountInput = document.getElementById("peopleCount");
var calculateBtn = document.getElementById("calculateBtn");

var tipError = document.getElementById("tipError");
var tipAmountOutput = document.getElementById("tipAmount");
var totalBillOutput = document.getElementById("totalBill");
var splitAmountOutput = document.getElementById("splitAmount");

// Validate tip percentage with live feedback
function validateTip() {
    var tipPercentage = Number(tipPercentageInput.value);

    if (tipPercentageInput.value === "") {
        tipError.textContent = "Please enter a tip percentage.";
        return false;
    } else if (tipPercentage < 0 || tipPercentage > 100) {
        tipError.textContent = "Tip percentage must be between 0 and 100.";
        return false;
    } else {
        tipError.textContent = "";
        return true;
    }
}

// Calculate and display the bill summary
function calculateBill() {
    var billAmount = Number(billAmountInput.value);
    var tipPercentage = Number(tipPercentageInput.value);
    var peopleCount = Number(peopleCountInput.value);

    var validTip = validateTip();

    if (billAmount <= 0 || peopleCount <= 0 || !validTip) {
        alert("Please enter valid bill information.");
        return;
    }

    var tipAmount = billAmount * (tipPercentage / 100);
    var totalBill = billAmount + tipAmount;
    var splitAmount = totalBill / peopleCount;

    tipAmountOutput.textContent = "Tip Amount: $" + tipAmount.toFixed(2);
    totalBillOutput.textContent = "Total Bill with Tip: $" + totalBill.toFixed(2);
    splitAmountOutput.textContent = "Each Person Owes: $" + splitAmount.toFixed(2);
}

// Add event listeners
tipPercentageInput.addEventListener("keyup", validateTip);
tipPercentageInput.addEventListener("blur", validateTip);
calculateBtn.addEventListener("click", calculateBill);
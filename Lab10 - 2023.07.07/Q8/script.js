function getYearOfBirth() {
    const nicNumber = prompt("Enter the Student's NIC number (e.g., YYMMDDXXXXX):");

    if (!nicNumber || nicNumber.length !== 10 || isNaN(nicNumber)) {
        alert("Invalid NIC number. Please enter a valid NIC number in the format YYMMDDXXXXX.");
        return;
    }

    const year = "19" + nicNumber.substr(0, 2); // Assuming 1900s birth year
    alert("Year of Birth: " + year);
}

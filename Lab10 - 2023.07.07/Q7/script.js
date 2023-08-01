function performOperations() {
    const num1 = parseFloat(prompt("Enter the first number:"));
    const num2 = parseFloat(prompt("Enter the second number:"));

    if (isNaN(num1) || isNaN(num2)) {
        alert("Invalid input. Please enter valid numbers.");
        return;
    }

    const addition = num1 + num2;
    const subtraction = num1 - num2;
    const multiplication = num1 * num2;
    const division = num1 / num2;

    const resultMessage = `
        Addition: ${addition}
        Subtraction: ${subtraction}
        Multiplication: ${multiplication}
        Division: ${division}
    `;

    alert(resultMessage);
}

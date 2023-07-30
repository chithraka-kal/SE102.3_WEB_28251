function calculateArea() {
    const pi = 22/7;
    const radius = prompt("Enter the radius of the circle:");
    
    if (radius === null || isNaN(radius)) {
        alert("Invalid input. Please enter a valid number.");
        return;
    }

    const area = pi * Math.pow(radius, 2);
    alert("The area of the circle is: " + area.toFixed(2));
}

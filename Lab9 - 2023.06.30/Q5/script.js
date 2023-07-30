function getDay() {
    const dayNumber = prompt("Enter a number from 1 to 7:");

    if (dayNumber === null || isNaN(dayNumber)) {
        alert("Invalid input. Please enter a valid number.");
        return;
    }

    const dayOfWeek = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];
    const dayIndex = parseInt(dayNumber) - 1;

    if (dayIndex >= 0 && dayIndex < dayOfWeek.length) {
        alert("The day is: " + dayOfWeek[dayIndex]);
    } else {
        alert("Invalid input. Please enter a number between 1 and 7.");
    }
}

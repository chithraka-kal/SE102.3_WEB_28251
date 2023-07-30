function redirectToGoogle() {
    const result = confirm("Do you want to visit Google?");

    if (result) {
        window.location.href = "https://www.google.com";
    } else {
        alert("You decided to stay.");
    }
}

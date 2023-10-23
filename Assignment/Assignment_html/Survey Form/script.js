function submitForm() {
    const form = document.getElementById("survey-form");
    if (form.checkValidity()) {
        const popup = document.getElementById("popup");
        const popupData = document.getElementById("popup-data");
        const firstName = document.getElementById("first-name").value;
        const lastName = document.getElementById("last-name").value;
        const dob = document.getElementById("dob").value;
        const country = document.getElementById("country").value;
        const genderElements = document.getElementsByName("gender");
        const gender = Array.from(genderElements)
            .filter((el) => el.checked)
            .map((el) => el.value)
            .join(", ");
        const profession = document.getElementById("profession").value;
        const email = document.getElementById("email").value;
        const mobile = document.getElementById("mobile").value;

        const popupContent = `
            <p>First Name: ${firstName}</p>
            <p>Last Name: ${lastName}</p>
            <p>Date of Birth: ${dob}</p>
            <p>Country: ${country}</p>
            <p>Gender: ${gender}</p>
            <p>Profession: ${profession}</p>
            <p>Email: ${email}</p>
            <p>Mobile Number: ${mobile}</p>
        `;

        popupData.innerHTML = popupContent;
        popup.style.display = "block";
        form.reset();
    }
}

function closePopup() {
    const popup = document.getElementById("popup");
    popup.style.display = "none";
}

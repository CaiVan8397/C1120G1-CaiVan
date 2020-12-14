function accept() {
    let fullname = document.getElementById("fullname").value;
    let cmnd = document.getElementById("cmnd").value;
    let dayofbirth = document.getElementById("dayofbirth").value;
    let email = document.getElementById("email").value;
    let address = document.getElementById("address").value;
    let type_of_customer = document.getElementById("type-of-customer").value;
    let discount = parseFloat(document.getElementById("discount").value);
    let number_people = parseInt(document.getElementById("number-peoplepeople").value);
    let number_day = parseInt(document.getElementById("number-day").value);
    let type_of_service = document.getElementById("type-of-service").value;
    let type_of_room = document.getElementById("type-of-room").value;
    let price_type_of_service;
    let money = 0;

    if (type_of_service === "villa") {
        price_type_of_service = 500;
    } else if (type_of_service === "house") {
        price_type_of_service= 300;
    } else {
        price_type_of_service = 100;
    }
    pay = price_type_of_service * number_day * (1 - (discount / 100));

    document.getElementById("rp-fullname").innerHTML = fullname;
    document.getElementById("rp-cmnd").innerText = cmnd;
    document.getElementById("rp-dayofbirth").innerText = dayofbirth;
    document.getElementById("rp-address").innerText = address;
    document.getElementById("rp-type-of-customer").innerText = type_of_customer;
    document.getElementById("rp-discount").innerText = discount;
    document.getElementById("rp-number-people").innerText = number_people;
    document.getElementById("rp-number-day").innerText = number_day;
    document.getElementById("rp-type-of-service").innerText = type_of_service;
    document.getElementById("rp-type-of-room").innerText = type_of_room;
    document.getElementById("rp-pay").innerText = pay + "$";
}

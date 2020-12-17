function confirm() {
    let full_name = document.getElementById("full_name").value;
    let id_number = document.getElementById("id_number").value;
    let day_of_birth = document.getElementById("day_of_birth").value;
    let email = document.getElementById("email").value;
    let address = document.getElementById("address").value;
    let province = document.getElementById("province").value;
    let type_of_customer = document.getElementById("type_of_customer").value;
    let discount = document.getElementById("discount").value;
    let number_people = parseInt(document.getElementById("number_people").value);
    let rent_day = document.getElementById("rent_day").value;
    let service = document.getElementById("service").value;
    let room_type = document.getElementById("room_type").value;
    let payout;
    let sv;


    document.getElementById("full_name1").innerText = full_name;
    document.getElementById("id_number1").innerText = id_number;
    document.getElementById("day_of_birth1").innerText = day_of_birth;
    document.getElementById("email1").innerText = email;
    document.getElementById("address1").innerText = address;
    document.getElementById("type_of_customer1").innerText = type_of_customer;
    document.getElementById("discount1").innerText = discount + " %";
    document.getElementById("number_people1").innerText = number_people + " người";
    document.getElementById("rent_days1").innerText = rent_day + " ngày";
    document.getElementById("service1").innerText = service;
    document.getElementById("room_type1").innerText = room_type;


    switch (service) {
        case "Villa (500$/day)": sv = 500;
            break;
        case "House (300$/day)": sv = 300;
            break;
        case "Room (100$/day)": sv = 100;
            break;
    }

    payout = (sv * rent_days * (1 - discount/100)).toFixed(2);

    document.getElementById("payout").innerText = payout + " $";
}

function agree() {
    alert('Thank you');
}


function addNewCustomer() {
    let arrnameCustomers=[];
    full_name = prompt("New customer name: \n");
    arrnameCustomers.push(full_name);

    id_number = prompt("Your id number: \n");
    arrnameCustomers.push(id_number);

    day_of_birth = prompt("Your birthday: \n");
    arrnameCustomers.push(day_of_birth);

    email = prompt("Your email: \n");
    arrnameCustomers.push(email);

    address = prompt("Your address: \n");
    arrnameCustomers.push(address);

    province = prompt("Your province");
    arrnameCustomers.push(province);

    type_of_customer = prompt("Choose type of customer (Diamond, Platinum, Gold, Silver, Member): \n");
    arrnameCustomers.push(type_of_customer);

    number_people = prompt("How many people go with you? \n");
    arrnameCustomers.push(number_people);

    rent_days = prompt("How many days you want to rent? \n");
    arrnameCustomers.push(rent_days);

    service = prompt("Choose service (Villa, House, Room): \n");
    arrnameCustomers.push(service);

    room_type = prompt("Choose type of room (Vip, Business, Normal): \n");
    arrnameCustomers.push(room_type);

    alert("Add new customer succesful");
    arrLisCustomer[arrnameCustomers.length]= arrnameCustomers;

}
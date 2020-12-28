

function editCustomer() {
    let customerwantedit = prompt("Who is customer you want to edit ? ");
    for (let i = 0; i < arrListCustomer.length; i++) {
        for (let j = 0; j < arrListCustomer[i].length; j++) {
            if (customerwantedit === arrListCustomer[i][j]) {
                index = i;
            }
        }
    }
    let choose = parseInt(prompt("1. Customer name: " + arrListCustomer[index][0] + "\n" +
        "2. ID number: " + arrListCustomer[index][1] + "\n" +
        "3. Day of birth: " + arrListCustomer[index][2] + "\n" +
        "4. Email: " + arrListCustomer[index][3] + "\n" +
        "5. Address: " + arrListCustomer[index][4] + "\n" +
        "6. Province: " + arrListCustomer[index][5] + "\n" +
        "7. Type of customer: " + arrListCustomer[index][6] + "\n" +
        "8. People number " + arrListCustomer[index][7] + "\n" +
        "9. Rent day: " + arrListCustomer[index][8] + "\n" +
        "10. Type of service: " + arrListCustomer[index][9] + "\n" +
        "11. Type of room: " + arrListCustomer [index][10] + "\n"));

    switch (choose) {
        case 1:
            let new_fullname = prompt("Old customer name: " + arrListCustomer[index][0]);
            arrListCustomer[index][0] = new_fullname ;
            break;
        case 2:
            let new_idnumber = prompt(("Old id number: " + arrListCustomer[index][1]));
            arrListCustomer[index][1] = new_idnumber;
            break;
        case 3:
            let new_dayofbirth = prompt("Old date of birth: " + arrListCustomer[index][2]);
            arrListCustomer[index][2] = new_dayofbirth;
            break;
        case 4:
            let new_email = prompt("Old email: " + arrListCustomer[index][3]);
            arrListCustomer[index][3] = new_email;
            break;
        case 5:
            let new_address = prompt("Old address: " + arrListCustomer[index][4]);
            arrListCustomer[index][4] = new_address;
            break;
        case 6:
            let new_provice = prompt("Old provice: " + arrListCustomer[index][5]);
            arrListCustomer[index][5] = new_provice;
            break;
        case 7:
            let new_typeofcustomer = prompt("Old type  of customer: " + arrListCustomer[index][6]);
            arrListCustomer[index][6] = new_typeofcustomer;
            break;
        case 8:
            let new_peoplenumber = prompt("Old people number: " + arrListCustomer[index][7]);
            arrListCustomer[index][7] = new_peoplenumber;
            break;
        case 9:
            let new_rentday = prompt("Old rent days: " + arrListCustomer[index][8]);
            arrListCustomer[index][8] = new_rentday;
            break;
        case 10:
            let new_typeofservice = prompt("Old type of service: " + arrListCustomer[index][9]);
            arrListCustomer[index][9] = new_typeofservice;
            break;
        case 11:
            let new_typeofroom = prompt("Old type of room: " + arrListCustomer[index][10]);
            arrListCustomer[index][10] = new_typeofroom;
            break;
    }
    displayCustomers();
}


function displayOne(i) {
    let info = "Infomation of customer " + "0" + (i+1) + "\n" +
        "1. Customer name: " + arrListCustomer[i][0] + "\n" +
        "2. ID number: " + arrListCustomer[i][1] + "\n" +
        "3. Day of birth: " + arrListCustomer[i][2] + "\n" +
        "4. Email: " + arrListCustomer[i][3] + "\n" +
        "5. Address: " + arrListCustomer[i][4] + "\n" +
        "6. Province: " + arrListCustomer[i][5] + "\n" +
        "7. Type of customer: " + arrListCustomer[i][6] + "\n" +
        "8. People number " + arrListCustomer[i][7] + "\n" +
        "9. Rent day: " + arrListCustomer[i][8] + "\n" +
        "10. Type of service: " + arrListCustomer[i][9] + "\n" +
        "11. Type of room: " + arrListCustomer [i][10] + "\n";
    return info;
}
function displayCustomers() {
    for (let i=0; i < arrListCustomer.length; i++){
        alert(displayOne(i));
    }
}

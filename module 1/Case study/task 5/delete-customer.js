function deleteCustomer() {
    let check_customer = false;
    let customerwantdelete = prompt("Who is customer you want to edit ? ");
    for (let i = 0; i < arrListCustomer.length; i++) {
        for (let j = 0; j < arrListCustomer[i].length; j++) {
            if (customerwantdelete === arrListCustomer[i][j]) {
                index = i;
                check_customer = true
            }
        }
    }
    if (check_customer===true){
        arrListCustomer.splice(index,1);
        alert("Delete customer suscesful !!!");
    } else {
        alert("Check customer name again, Its not right !!!");
    }
}
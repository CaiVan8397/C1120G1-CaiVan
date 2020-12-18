let check = false;
function checkidnumber() {
    do {
        if (!isNaN(id_number)){
            id_number = Number.parseFloat(id_number)
        }
        if (Number.isInteger(id_number)){
            alert('cmnd k dung dinh dang');
            continue;
        }
        if (id_number>99999999 && id_number<10000000){
            alert('cmnd k dung dinh dang');
            continue;
        }
        check=true;
    } while (!check)
}
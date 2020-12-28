
function checkIdNumber(idNumber) {
    if (idNumber.length !== 9) {
        return false;
    }
    for (let i = 0; i < idNumber.length; i++) {
        if (isNaN(idNumber[i])) {
            return false;
        }
    }
    return true;
}
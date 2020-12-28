

function checkNumber(number) {
    if (!Number.isInteger(number) && parseInt(number) <= 0) {
        return false;
    } else {
        return true;
    }
}

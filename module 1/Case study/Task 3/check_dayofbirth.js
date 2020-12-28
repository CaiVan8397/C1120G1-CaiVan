
function checkBirthday(birthDay) {
        if (birthDay.length !==10){
            return false
        }
        if (birthDay.charAt(2) === "/" && birthDay.charAt(5) === "/" && birthDay.substring(0,1) <= 31 && birthDay.substring(3,4) <= 12 && birthDay.substring(6,10) <= 2020 && birthDay.substring(6,10)>=1900) {
           return true;
        } else {
            return false;
        }
}
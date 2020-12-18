let check = false;
function checkemail() {
    do {
        let countAt = 0;
        let countDoc = 0;
        for (let i = 0; i <= email.length; i++) {
            if (email.charAt(i) === '@') {
                countAt++;
                for (let j = i + 1; j < email.length; j++) {
                    if (email.charAt(j) === ".") {
                        countDoc++;
                    }
                }
            }
        }
        if (countAt === 1 || countDoc > 1) {
            alert('email ban nhap k dung');
        } else {
            check = true;
        }
    } while (!check)
}
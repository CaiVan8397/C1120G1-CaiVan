function checkName(fullName) {
    let name = fullName.trim().toLowerCase().split("");
    for (let i = name.length - 2; i > 0; i--) {
        if (name[i] === " " && name[i - 1] === " ") {
            name.splice(i, 1);
        }
    }
    name[0] = name[0].toUpperCase();
    for (let i = 1; i < name.length - 1; i++) {
        if (name[i] === " ") {
            name[i + 1] = name[i + 1].toUpperCase();
        }
    }
    return name.join("");
}
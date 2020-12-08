function dientich() {
    let width =document.getElementById("chieudai");
    let height =document.getElementById("chieurong");
    let a=parseInt(width.value);
    let b=parseInt(height.value);
    let S=a*b;
    document.getElementById("dt").innerText = "Dientich la " +S;
}
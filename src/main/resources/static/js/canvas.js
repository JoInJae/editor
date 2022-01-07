const canvas = document.getElementById("canvas");
const ctx = canvas.getContext("2d");

canvas.width = 1000;
canvas.height = 600;
class Rect {
    constructor(color, x, y, width, height) {
        this.color = color;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    draw(){
      ctx.fillStyle = this.color;
      //ctx.strokeStyle = "black";
      //ctx.strokeRect(this.x, this.y, this.width, this.height);
      ctx.fillRect(this.x, this.y, this.width, this.height);
    }

}
function createRect(){
    const x = document.getElementById("x").value;
    const y = document.getElementById("y").value;
    const width = document.getElementById("width").value;
    const height =  document.getElementById("height").value;
    const color = "green";
    const rect = new Rect(color, x, y, width, height);
    rect.draw();
}






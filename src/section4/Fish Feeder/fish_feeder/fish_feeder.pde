int width = 800;
int foodX = (int) random(width-20);
int foodY = 20;
int height = 800;
int score = 0;
int FontSize = 11;
String winningMessage = "Yay! you won!";
int x = 400;
int y = 400;
void setup () {
  size(800,800);
}
void draw () {
 background (141,233,237);
 drawFish();
 fill(#FC0000);
 noStroke();
 ellipse(foodX, foodY, 10, 10); 
 foodY+=5;
 if (foodY > height) {
  foodY = 20; 
 foodX =  (int) random(width-20);
 fill(0,0,0);
 textSize(16);
 text("Score: " + score, 20, 20);
 textSize(fontSize)
 text(winningMessage, x, y);
 }
}
void checkCatch(int x, int y){
   if(x>mouseX && x<mouseX+70){
     if(y>mouseY-17 && y < mouseY+30){
       score++;
       foodY=20;
       foodX = (int) random(width-20);
     }
   }
   else if (foodY > height && score > 0) {
     score--;
   }
}
void drawFish(){
 noStroke();
 fill(255,255,255);
 ellipse(mouseX-17,mouseY-17,20,20);
 fill(255,200,88);
 ellipse(mouseX,mouseY,90,50);
 triangle(mouseX+30,mouseY,mouseX+70,mouseY+30,mouseX+70,mouseY-30);
 stroke(0);
 triangle(mouseX,mouseY,mouseX+15,mouseY+10,mouseX+15,mouseY-10);
 noStroke();
 fill(255,200,88);
 ellipse(mouseX,mouseY,15,15);
 noStroke();
 fill(255,255,255);
 ellipse(mouseX-25,mouseY-15,20,20);
 fill(0,0,0);
 ellipse(mouseX-25,mouseY-15,5,5);
 fill(141,233,237);
 ellipse(mouseX-45,mouseY,25,25);

}
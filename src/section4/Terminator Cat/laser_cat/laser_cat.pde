int y = 0;
int Rightx = 348;
int Righty = 272;
int Leftx = 269;
int Lefty = 274;
int acceleration = 5;
int width = 800;
PImage catPic;
void setup(){
 size (800,800);
 catPic = loadImage("cat.jpg");
   catPic.resize(width,height);
   background(catPic);
}
void draw(){
  if(mousePressed) {
   println("Mouse's x-position: " + mouseX + "\n" +
   "Mouse's y-position: " + mouseY + "\n");}
   fill (#08FF26);
   noStroke();
   ellipse(Rightx, Righty, 25, 25);
   ellipse(Leftx, Lefty, 25, 25);
if(keyPressed) {
               Righty +=2*acceleration;
               Rightx +=2*acceleration;
               Leftx +=2*acceleration;
               Lefty +=2*acceleration;
}
if(Rightx > 800){
 background(catPic);
 fill (#08FF26);
 Rightx = 348;
 Righty = 272;
 Leftx = 269;
 Lefty = 274;
 acceleration = 5;
}
}
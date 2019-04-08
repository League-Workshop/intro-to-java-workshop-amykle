PImage mustache;
  PImage friend;
void setup(){
  size (800,800);
  mustache = 
loadImage("mustache 4.png");
  friend =
loadImage("rilakkuma.jpg");
          friend.resize(width,height);
}
void draw (){
  background(friend);
if (mousePressed) {
  image(mustache, mouseX - 200, mouseY - 100);
}
}
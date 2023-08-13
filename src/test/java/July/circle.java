package July;



 class circle extends Shapes1{

  float pi = 3.14f;
  float radius = 0.0f;

  circle(float rad){
   radius = rad;
  }

  circle(){

  }

  public void setRadius(float rad){
   radius = rad;
  }

  public void area(){
   System.out.println("Area of Circle = " + pi * radius);
  }

}

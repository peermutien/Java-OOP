package com.oop;

public class T20Match extends Match{
	
	@Override
    public int calculateBalls() {
       return (int)(20*6 - this.getCurrentOver()*6);
    }  
	
	@Override
	public float calculateRunrate()
  {
      int score = this.getTargetScore() - this.getCurrentScore();
      int over = (int)(20 - this.getCurrentOver());
      return (float)score/over;
  }
   
}